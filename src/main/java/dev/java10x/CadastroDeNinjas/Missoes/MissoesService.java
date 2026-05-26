package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissoesService {

    private MissoesRepository missoesRepository;

    public List<MissoesModel> listarMissao(){
        return missoesRepository.findAll();
    }
}
