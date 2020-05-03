package com.tindao.cobranca2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/titulos")
public class TitulosController 
{
	@RequestMapping("/novo")
	public String novo()
	{
		return ("CadastroTitulos");
	}
	
	@RequestMapping
	public String Pesquisar()
	{
		return ("PesquisaTitulos");
	}
}
