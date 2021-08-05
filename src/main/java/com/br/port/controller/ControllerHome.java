package com.br.port.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.port.model.Pedido;

@Controller
public class ControllerHome {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Query query = entityManager.createQuery("select p from pedido p", Pedido.class);
		List<Pedido> listPedido = query.getResultList();
		
		model.addAttribute("pedidos", listPedido);
		
		return "Home";
	}
}
