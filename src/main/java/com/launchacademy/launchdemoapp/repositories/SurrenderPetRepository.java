package com.launchacademy.launchdemoapp.repositories;

import com.launchacademy.launchdemoapp.models.SurrenderPet;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SurrenderPetRepository extends PagingAndSortingRepository<SurrenderPet, Integer> {

}
