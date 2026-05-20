package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Olá essa é minha primeira mensagem!!";
    }


    //Criar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //Mostrar todos os Ninja (READ)
    @GetMapping("/listar")
    public String listarTodosOsNinja(){
        return "Listar ninja";
    }

    //Mostrar Ninja por ID (READ)
    @GetMapping("/listarId")
    public String listarTodosPorId(){
        return "Listar ninja por id";
    }

    //Alterar dados do ninja (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por id";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarNinjaId")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }


}
