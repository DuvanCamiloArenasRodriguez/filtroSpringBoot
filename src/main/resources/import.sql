INSERT INTO country( name_country) VALUES ("Colombia")
INSERT INTO country( name_country) VALUES ("Ecuador")
INSERT INTO country( name_country) VALUES ("Peru")


INSERT INTO region( name_reg, code_country) VALUES ("Amazonas", 1)
INSERT INTO region( name_reg, code_country) VALUES ("Boyaca", 1)
INSERT INTO region( name_reg, code_country) VALUES ("Santander", 1)


INSERT INTO city(name_city, code_region) VALUES ("Leticia", 1)
INSERT INTO city(name_city, code_region) VALUES ("Tunja", 2)
INSERT INTO city(name_city, code_region) VALUES ("Bucaramanga", 3)


INSERT INTO labatory(name_lab, code_city_reg) VALUES ("LabLeticia", 1)
INSERT INTO labatory(name_lab, code_city_reg) VALUES ("LabTunja", 2)
INSERT INTO labatory(name_lab, code_city_reg) VALUES ("LabBcrmg", 3)


INSERT INTO activeprinciple(name_ap) VALUES ("Torina")
INSERT INTO activeprinciple(name_ap) VALUES ("Morfina")


INSERT INTO modeadministration(description_mode) VALUES ("Subcutaneo")
INSERT INTO modeadministration(description_mode) VALUES ("Intravenoso")
INSERT INTO modeadministration(description_mode) VALUES ("Intramuscular")


INSERT INTO unitmeasurement(name_um) VALUES ("mL")
INSERT INTO unitmeasurement(name_um) VALUES ("cm3")
INSERT INTO unitmeasurement(name_um) VALUES ("mg")


INSERT INTO medicine(proceedings, name_medicine, health_register, description, description_short, name_rol, code_mode_admin, code_ap, code_um, code_lab) VALUES ("Inyeccion", "Diclofenaco", "Nueva EPS", "Mdicina inyectada", "MI", "Enfermero", 1, 2, 1, 2)