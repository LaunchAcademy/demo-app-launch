package com.launchacademy.launchdemoapp.repositories;

import com.launchacademy.launchdemoapp.models.AdoptionApplication;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdoptionApplicationRepository extends PagingAndSortingRepository<AdoptionApplication, Integer> {

}
