package com.organizationService.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organizationService.model.Organization;
import com.organizationService.repository.OrganizationRepository;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository orgRepository;

    public Organization getOrg(String organizationId) {
         Optional<Organization> findById = orgRepository.findById(organizationId);
         if(findById.isPresent())
        	 return findById.get();
		return null;
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());

        orgRepository.save(org);

    }

    public void updateOrg(Organization org){
        orgRepository.save(org);
    }

    public void deleteOrg(Organization org){
        orgRepository.deleteById( org.getId());
    }
}
