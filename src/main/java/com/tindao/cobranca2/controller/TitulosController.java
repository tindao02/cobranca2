package com.tindao.cobranca2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tindao.cobranca2.model.StatusTitulo;
import com.tindao.cobranca2.model.Titulo;
import com.tindao.cobranca2.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TitulosController 
{
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")
	public ModelAndView novo()
	{
		ModelAndView mv = new ModelAndView("CadastroTitulos");
		return (mv);
	}
	
	@RequestMapping
	public ModelAndView pesquisar() {
		List<Titulo> todosTitulos = titulos.findAll();
		ModelAndView mv = new ModelAndView("PesquisaTitulos");
		mv.addObject("titulos", todosTitulos);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo)
	{
		titulos.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulos");
		mv.addObject("mensagem", "Título salvo com sucesso!");
		return (mv);
	}
	
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo()
	{
		return (Arrays.asList(StatusTitulo.values()));
	}
}
