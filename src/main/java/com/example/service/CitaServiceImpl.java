package com.example.service;
import com.example.entities.Cita;
import com.example.repository.CitaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CitaServiceImpl implements CitaService {

    @Override
    public List<Cita> findAll() {
        return null;
    }
}
