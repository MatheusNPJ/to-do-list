package controller;


import dto.Dto;
import view.ViewToDoList;
import model.Dia;
import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ControllerToDoList {

    public void iniciar(){
        
        List<Dia> dias = new ArrayList<Dia>();
        ViewToDoList view = new ViewToDoList();

        switch (view.exibirMenu()){
            case 1:
                Dto dto = view.cadastrarTarefa();
                if(dto.dia > 31 || dto.dia < 1){
                    System.out.println("não deveria ter entrado aqui");
                    System.out.println("");
                    break;
                }

            default:
                System.out.println("opa opa");
                break;
        }



    }

}
