package com.example.filtroSpringBoot.domain.service.modeadministration;

import com.example.filtroSpringBoot.domain.repository.ModeAdministrationRepository;
import com.example.filtroSpringBoot.persistence.entity.ModeAdministration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//@Service
public class ModeAdministrationImpl {
//    @Autowired
//    private ModeAdministrationRepository repository;
//
//    @Transactional(readOnly = true)
//    @Override
//    public List<ModeAdministration> findAll() {
//        return (List<ModeAdministration>) repository.findAll();
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Optional<ModeAdministration> findById(Long id) {
//        return repository.findById(id);
//    }
//
//    @Transactional
//    @Override
//    public ModeAdministration save(ModeAdministration modeAdministration) {
//        return repository.save(modeAdministration);
//    }
//
//    @Override
//    public Optional<ModeAdministration> update(Long id, ModeAdministration modeAdministration) {
//        Optional<ModeAdministration> getModeAdministration = repository.findById(id);
//        if (getModeAdministration.isPresent()) {
//            ModeAdministration newModeAdministration = getModeAdministration.orElseThrow();
//            newModeAdministration.setDescriptionMode(modeAdministration.getDescriptionMode());
//            return Optional.of(repository.save(newModeAdministration));
//        }
//
//        return getModeAdministration;
//    }
//
//    @Override
//    public Optional<ModeAdministration> delete(Long id) {
//        Optional<ModeAdministration> getModeAdministration = repository.findById(id);
//        getModeAdministration.ifPresent(repository::delete);
//        return getModeAdministration;
//    }
}
