package br.com.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cadastro.models.Contato;
import br.com.cadastro.repository.CadastroRepository;

@Controller
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;
	
	 @RequestMapping("/")
	 public String index(){
		 return "index";
	 }
	
	@RequestMapping("listausuarios")
	public String listaUsuarios(Model model){
		Iterable<Contato> contatos = repository.findAll();
		
		model.addAttribute("contatos",contatos);
		
	    return "listausuarios";
	}
	
	

}
