package com.stp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stp.model.UnidadeHospitalar;
import com.stp.service.UnidadeHospitalarService;

import java.util.List;

@RestController
@RequestMapping("/api/unidades")
public class UnidadeHospitalarController {
    @Autowired
    private UnidadeHospitalarService unidadeHospitalarService;

    @GetMapping
    public List<UnidadeHospitalar> getAllUnidades() {
        return unidadeHospitalarService.getAllUnidades();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UnidadeHospitalar> getUnidadeById(@PathVariable Long id) {
        UnidadeHospitalar unidade = unidadeHospitalarService.getUnidadeById(id);
        if (unidade != null) {
            return ResponseEntity.ok(unidade);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public UnidadeHospitalar createUnidade(@RequestBody UnidadeHospitalar unidade) {
        return unidadeHospitalarService.saveUnidade(unidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUnidade(@PathVariable Long id) {
        unidadeHospitalarService.deleteUnidade(id);
        return ResponseEntity.noContent().build();
    }
}
