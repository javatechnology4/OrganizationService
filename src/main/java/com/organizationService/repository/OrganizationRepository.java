package com.organizationService.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.organizationService.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String>  {
    Optional<Organization> findById(String id); 
}