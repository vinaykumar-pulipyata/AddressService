package com.microservice.AddressService.repository;


import com.microservice.AddressService.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(nativeQuery = true, value = "SELECT  ea.id, ea.lane1, ea.lane2, ea.state, ea.zip FROM vinaydb.address ea JOIN vinaydb.employee e ON e.id = ea.employeeid WHERE ea.employeeid = :employeeId")
    Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
