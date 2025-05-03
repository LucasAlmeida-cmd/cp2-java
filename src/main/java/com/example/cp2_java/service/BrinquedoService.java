package com.example.cp2_java.service;

import com.example.cp2_java.exception.BrinquedoNotFoundException;
import com.example.cp2_java.model.Brinquedo;
import com.example.cp2_java.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    BrinquedoRepository brinquedoRepository;


    public Brinquedo adicionarBrinquedo(Brinquedo brinquedo){
        return brinquedoRepository.save(brinquedo);
    }

    public Optional<Brinquedo> retornarPorId(Long id){
        return brinquedoRepository.findById(id);
    }

    public List<Brinquedo> retornarTodos(){
        return brinquedoRepository.findAll();
    }

    public Brinquedo atualizarBrinquedoPorId(Long id, Brinquedo brinquedo) throws BrinquedoNotFoundException {
        Optional<Brinquedo> brinquedo1 = brinquedoRepository.findById(id);
        if (brinquedo1 == null) throw new BrinquedoNotFoundException(id);




    }
}
