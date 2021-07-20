package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.personasRepository;
import com.example.demo.model.personasModel;

 

@Service
@Transactional
public class personasService {

	@Autowired
	private personasRepository personaRepo;
	
	public List<personasModel> listarTodos(){
		return (List<personasModel>) personaRepo.findAll();
	}
	
	public personasModel guardar(personasModel persona) {
			return personaRepo.save(persona);					
	}
	
	public boolean eliminar(Integer id) {
		try {
			personaRepo.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

	 
}
