package com.stp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stp.model.Transferencia;
import com.stp.repository.TransferenciaRepository;

import java.util.List;

@Service
public class TransferenciaService {
    @Autowired
    private TransferenciaRepository transferenciaRepository;

    public List<Transferencia> getAllTransferencias() {
        return transferenciaRepository.findAll();
    }

    public Transferencia getTransferenciaById(Long id) {
        return transferenciaRepository.findById(id).orElse(null);
    }

    public Transferencia saveTransferencia(Transferencia transferencia) {
        return transferenciaRepository.save(transferencia);
    }

    public void deleteTransferencia(Long id) {
        transferenciaRepository.deleteById(id);
    }
}
