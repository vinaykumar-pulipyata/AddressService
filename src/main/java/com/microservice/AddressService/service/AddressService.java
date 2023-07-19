package com.microservice.AddressService.service;


import com.microservice.AddressService.response.AddressResponse;

public interface AddressService {

    AddressResponse getAddressByEmployeeId(int employeeId);
}
