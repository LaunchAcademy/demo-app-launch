package com.launchacademy.launchdemoapp.repositories;

import com.launchacademy.launchdemoapp.models.PetType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PetTypeRepository extends PagingAndSortingRepository<PetType, Integer> {

}
