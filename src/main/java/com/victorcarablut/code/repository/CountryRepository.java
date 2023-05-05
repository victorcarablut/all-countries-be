package com.victorcarablut.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.victorcarablut.code.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {


}
