package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.model.personasModel;
import com.example.demo.service.personasService;


@RestController
@RequestMapping("/persona")
public class personaController {
	
	@Autowired
	private personasService personaService;
	
	@GetMapping("")
	public List<personasModel> listar(){
		return personaService.listarTodos();
	}
	
	
	@PostMapping("")
	public personasModel guardar(@RequestBody personasModel persona) {
		return this.personaService.guardar(persona);		
	}
	
	@DeleteMapping(path = "/{id}")
	private String eliminarXId(@PathVariable("id") Integer id) {
		boolean status = this.personaService.eliminar(id);
		System.out.println("el estado es ::::" +status);
		try {
			if (status) {
				return "Persona Eliminada Exitosamente";
			} else {
				return "No se pudo Eliminar persona";
			}
		
		} catch (Exception e) {
			return e.getMessage();
			// new ResponseEntity<>(HttpStatus.OK);
		}
		
	}
	
	//metodo para validar si el servicio esta arriba
	@GetMapping("/test")
	private String saludar() {
		return "Hola desde servicio personas";				
	}
	

}
