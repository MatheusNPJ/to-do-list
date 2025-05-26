package view;

import controller.TarefaController;
import model.Tarefa;

public class Main {

    public static void main (String[] args){

        TarefaController tarefaController = new TarefaController();

        tarefaController.adicionarTarefa(1, new Tarefa(121, "iaushaius", "aoisjaoisj"));
        tarefaController.adicionarTarefa(2, new Tarefa(121, "iaushaius", "aoisjaoisj"));
        tarefaController.adicionarTarefa(3, new Tarefa(121, "iaushaius", "aoisjaoisj"));


        System.out.println(tarefaController.exibirCalendario());

    }
}
