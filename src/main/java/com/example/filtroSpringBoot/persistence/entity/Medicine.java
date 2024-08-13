package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String proceedings;

    @Column(name = "name_medicine")
    private String nameMedicine;

    @Column(name = "health_register")
    private String healthRegister;

    private String description;

    @Column(name = "description_short")
    private String descriptionShort;

    @Column(name = "name_rol")
    private String nameRol;

    @ManyToOne
    @JoinColumn(name = "code_mode_admin")
    private ModeAdministration codeModeAdmn;

    @ManyToOne
    @JoinColumn(name = "code_ap")
    private ActivePrinciple codeAp;

    @ManyToOne
    @JoinColumn(name = "code_um")
    private UnitMeasurement codeUm;

    @ManyToOne
    @JoinColumn(name = "code_lab")
    private Labatory codeLab;


    public Medicine() {
    }

    public Medicine(String proceedings, String nameMedicine, String healthRegister, String description, String descriptionShort, String nameRol) {
        this.proceedings = proceedings;
        this.nameMedicine = nameMedicine;
        this.healthRegister = healthRegister;
        this.description = description;
        this.descriptionShort = descriptionShort;
        this.nameRol = nameRol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public String getHealthRegister() {
        return healthRegister;
    }

    public void setHealthRegister(String healthRegister) {
        this.healthRegister = healthRegister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public ModeAdministration getCodeModeAdmn() {
        return codeModeAdmn;
    }

    public void setCodeModeAdmn(ModeAdministration codeModeAdmn) {
        this.codeModeAdmn = codeModeAdmn;
    }

    public ActivePrinciple getCodeAp() {
        return codeAp;
    }

    public void setCodeAp(ActivePrinciple codeAp) {
        this.codeAp = codeAp;
    }

    public UnitMeasurement getCodeUm() {
        return codeUm;
    }

    public void setCodeUm(UnitMeasurement codeUm) {
        this.codeUm = codeUm;
    }

    public Labatory getCodeLab() {
        return codeLab;
    }

    public void setCodeLab(Labatory codeLab) {
        this.codeLab = codeLab;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", proceedings='" + proceedings + '\'' +
                ", nameMedicine='" + nameMedicine + '\'' +
                ", healthRegister='" + healthRegister + '\'' +
                ", description='" + description + '\'' +
                ", descriptionShort='" + descriptionShort + '\'' +
                ", nameRol='" + nameRol + '\'' +
                ", codeModeAdmn=" + codeModeAdmn +
                ", codeAp=" + codeAp +
                ", codeUm=" + codeUm +
                ", codeLab=" + codeLab +
                '}';
    }
}
