package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.entity.Ucitel;
import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import cz.czechitas.java2webapps.lekce10.repository.StudentRepository;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import cz.czechitas.java2webapps.lekce10.repository.UcitelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkolaService {

    private final StudentRepository studentRepository;
    private final TridaRepository tridaRepository;


    @Autowired
    public SkolaService(RodicRepository rodicRepository, StudentRepository studentRepository, TridaRepository tridaRepository, UcitelRepository ucitelRepository) {
        this.studentRepository = studentRepository;
        this.tridaRepository = tridaRepository;
    }

    public List<Trida> seznamTrid() {
        return tridaRepository.findAll();
    }
    public Trida detailJedneTridy(short trida) {
        return tridaRepository.getOne(trida);
    }

    public Student detailJednohoStudenta(Integer id) {
        return studentRepository.getOne(id);
    }

}
