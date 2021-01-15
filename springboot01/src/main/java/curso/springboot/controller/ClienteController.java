package curso.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import curso.springboot.model.Pessoa;
import curso.springboot.repository.PessoaRepository;

//Contoller MVC - interceptar requisições da URL(View)
@Controller 
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//Método de Redirecionamento para a página cadastropessoa.html
	@RequestMapping(method = RequestMethod.GET, value = "/cadastrocliente")
	public String inicio() {
		return "cadastro/cadastrocliente";
		
	}
	//Método Salvar no Banco de Dados
	@RequestMapping(method = RequestMethod.POST, value = "/salvarcliente")
	public ModelAndView salvar(Cliente cliente) {
		clienteRepository.save(cliente);
		
		ModelAndView andView = new ModelAndView("cadastro/cadastrocliente");
		Iterable<cliente> clientesIt = clienteRepository.findAll();
		andView.addObject("clientes", clientesIt);
		
		return andView;
	}
	 
	@RequestMapping(method = RequestMethod.GET, value = "/listaclientes")
	public ModelAndView clintes() {
		ModelAndView andView = new ModelAndView("cadastro/cadastrocliente");
		Iterable<Pessoa> pessoasIt = pessoaRepository.findAll();
		andView.addObject("clientes", clientesIt);
		return andView;
    }
    
    @GetMapping("/removercliente/{idcliente}")
	public ModelAndView excluir(@PathVariable("idcliene") Long idpessoa) {
		
		pessoaRepository.deleteById(idcliente);	
		
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastropessoa");
		modelAndView.addObject("cliente", pessoaRepository.findAll());
		modelAndView.addObject("clientebj", new cliente());
		return modelAndView;
		
    }
     	@PostMapping("**/pesquisarnome")
	public ModelAndView pesquisar(@RequestParam("nomepesquisa") String nomepesquisa, 
			@RequestParam("pesqcpf") String pesqcpf) {
		
		List<Cliente> pessoas = new ArrayList<Cliente>();
		
		if (pesqcpf != null && !pesqcpf.isEmpty()) {
			cliente = clienteRepository.findClienteByNameCpf(nomepesquisa, pesqcpf);
		}else {
			clientes = clienteRepository.findClienteByName(nomepesquisa);
		}
	
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrocliente");
		modelAndView.addObject("clientes", clientes);
		modelAndView.addObject("clienteobj", new Cliente());
		return modelAndView;
            }

}
