package com.zipcodewilmington.bakery.repositories;
import com.zipcodewilmington.bakery.models.Baker;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BakerRepository extends CrudRepository<Baker, Long> {
}