package com.bits.pilani.userservice.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.bits.pilani.userservice.entity.VehicleTypeEntity;

public interface VehicleTypeDao extends ListCrudRepository<VehicleTypeEntity, Integer>  {

}
