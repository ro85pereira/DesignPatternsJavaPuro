package Facade;

import SubSistemaFacade.CrmService;
import SubSistemaFacade2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        CrmService.gravarCliente(nome,cep,cidade);
    }
}
