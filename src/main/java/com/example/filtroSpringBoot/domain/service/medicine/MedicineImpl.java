package com.example.filtroSpringBoot.domain.service.medicine;

import com.example.filtroSpringBoot.domain.repository.MedicineRepository;
import com.example.filtroSpringBoot.persistence.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineImpl implements  IMedicine{

    @Autowired
    private MedicineRepository repository;

    @Transactional(readOnly = true)
    @Override
    public List<Medicine> findAll() {
        return (List<Medicine>) repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Medicine> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Medicine save(Medicine medicine) {
        return repository.save(medicine);
    }

    @Transactional
    @Override
    public Optional<Medicine> update(Long id, Medicine medicine) {
        Optional<Medicine> getMedicine = repository.findById(id);
        if (getMedicine.isPresent()) {
            Medicine newMedicine = getMedicine.orElseThrow();
            newMedicine.setProceedings(medicine.getProceedings());
            newMedicine.setNameMedicine(medicine.getNameMedicine());
            newMedicine.setHealthRegister(medicine.getHealthRegister());
            newMedicine.setDescription(medicine.getDescription());
            newMedicine.setDescriptionShort(medicine.getDescriptionShort());
            newMedicine.setCodeModeAdmn(medicine.getCodeModeAdmn());
            newMedicine.setCodeAp(medicine.getCodeAp());
            newMedicine.setCodeUm(medicine.getCodeUm());
            newMedicine.setNameRol(medicine.getNameRol());
            newMedicine.setCodeLab(medicine.getCodeLab());
            return Optional.of(repository.save(newMedicine));
        }
        return getMedicine;
    }

    @Transactional
    @Override
    public Optional<Medicine> delete(Long id) {
        Optional<Medicine> getMedicine = repository.findById(id);
        getMedicine.ifPresent(repository::delete);
        return getMedicine;
    }
}
