package com.microservice.AddressService.service;


import com.microservice.AddressService.entity.Address;
import com.microservice.AddressService.repository.AddressRepo;
import com.microservice.AddressService.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements  AddressService{

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AddressResponse getAddressByEmployeeId(int employeeId) {

        Address address = addressRepo.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);

        return addressResponse;
    }
}
