package com.example.service;
import com.example.entities.Address;

import com.example.repository.AddressRepository;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;


    @Override
    public List<Address> findAll() {
        return null;
    }
}
