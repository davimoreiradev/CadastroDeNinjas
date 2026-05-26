package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class NinjaService {

    private NinjaRepository ninjaRepository;


    public List<NinjaModel> listarNinja(){
        return ninjaRepository.findAll();

    }

}
