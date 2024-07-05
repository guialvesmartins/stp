package com.stp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stp.model.UnidadeHospitalar;
import com.stp.repository.UnidadeHospitalarRepository;

import java.util.List;

@Service
public class UnidadeHospitalarService {
    @Autowired
    private UnidadeHospitalarRepository unidadeHospitalarRepository;

    public List<UnidadeHospitalar> getAllUnidades() {
        return unidadeHospitalarRepository.findAll();
    }

    public UnidadeHospitalar getUnidadeById(Long id) {
        return unidadeHospitalarRepository.findById(id).orElse(null);
    }

    public UnidadeHospitalar saveUnidade(UnidadeHospitalar unidade) {
        return unidadeHospitalarRepository.save(unidade);
    }

    public void deleteUnidade(Long id) {
        unidadeHospitalarRepository.deleteById(id);
    }
}
