package controller;


import java.util.ArrayList;
import java.util.List;

import dto.Dto;
import model.Tarefa;
import view.ViewToDoList;


public class ControllerToDoList {

    public void iniciar(){
        
        List<Tarefa> calendario = new ArrayList<>();

        for (int dia = 1; dia < 32; dia++)
        {
            calendario.add(new Tarefa(dia, "", "", false));
        }

        ViewToDoList view = new ViewToDoList();
        
        do{
            view.exibirMenu();
            
            switch (view.exibirMenu()){
                case 1:
                    Dto dto = view.cadastrarTarefa();

                    if(dto.dia > 0 && dto.dia < 32)
                    {  
                        for (Tarefa diaAtual : calendario) {
                            if(dto.dia == diaAtual.getDia())
                            {
                                diaAtual.setTitulo(dto.titulo);
                                diaAtual.setDescricao(dto.descricao);
                                view.exibirMensagem(1);
                            }
                        } 
                    }else{
                        view.exibirMensagem(2);
                    }
                    break;
                

                default:
                    System.out.println("opa opa");
                    break;
            }  
            
            
        }while(view.exibirMenu() !=  0); 

    }

}
