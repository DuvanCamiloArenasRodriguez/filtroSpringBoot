package com.example.filtroSpringBoot.domain.repository;

import com.example.filtroSpringBoot.persistence.entity.Medicine;
import org.springframework.data.repository.CrudRepository;

public interface MedicineRepository extends CrudRepository<Medicine, Long> {

}
