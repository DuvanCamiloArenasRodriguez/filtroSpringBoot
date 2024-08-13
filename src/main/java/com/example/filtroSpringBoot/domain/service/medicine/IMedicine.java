package com.example.filtroSpringBoot.domain.service.medicine;

import com.example.filtroSpringBoot.persistence.entity.Medicine;

import java.util.List;
import java.util.Optional;

public interface IMedicine {
    List<Medicine> findAll();
    Optional<Medicine> findById(Long id);
    Medicine save(Medicine medicine);
    Optional<Medicine> update(Long id, Medicine medicine);
    Optional<Medicine> delete(Long id);
}
