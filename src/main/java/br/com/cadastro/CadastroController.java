package br.com.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="salvar",method= RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,Model model) {
		Contato novoContato = new Contato(nome,email);
		repository.save(novoContato);
		
		Iterable<Contato> contatos = repository.findAll();
		model.addAttribute("contatos", contatos);
		
		return "listausuarios";
	}
	
	@RequestMapping(value="apagar",method= RequestMethod.POST)
	public String apagar(@RequestParam("id") Long id, Model model) {
		Contato contato = repository.findOne(id);
		repository.delete(contato);	
		
		
		
		return "redirect:listausuarios";
	}
	

}
