package com.stp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stp.model.Transferencia;
import com.stp.service.TransferenciaService;

import java.util.List;

@RestController
@RequestMapping("/api/transferencias")
public class TransferenciaController {
    @Autowired
    private TransferenciaService transferenciaService;

    @GetMapping
    public List<Transferencia> getAllTransferencias() {
        return transferenciaService.getAllTransferencias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transferencia> getTransferenciaById(@PathVariable Long id) {
        Transferencia transferencia = transferenciaService.getTransferenciaById(id);
        if (transferencia != null) {
            return ResponseEntity.ok(transferencia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Transferencia createTransferencia(@RequestBody Transferencia transferencia) {
        return transferenciaService.saveTransferencia(transferencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransferencia(@PathVariable Long id) {
        transferenciaService.deleteTransferencia(id);
        return ResponseEntity.noContent().build();
    }
}
