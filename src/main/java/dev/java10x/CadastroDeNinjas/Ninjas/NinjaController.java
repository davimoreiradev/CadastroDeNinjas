package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
    @GetMapping("/todos")
    public String mostrarTodosOsNinja(){
        return "Mostrar Ninja";
    }

    //Mostrar Ninja por ID (READ)
    @GetMapping("/todosId")
    public String mostrarTodosPorId(){
        return "Mostrar Ninja por id";
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
