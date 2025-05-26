package controller;
import model.Tarefa;
import model.exceptions.CalendarioException;

import java.util.HashMap;
import java.util.Map;

public class TarefaController {
    Map<Integer, Tarefa> tarefas = new HashMap<>();

    public String exibirCalendario(){
        StringBuilder calendario = new StringBuilder();

        for(int i = 1; i < 32; i++){
            if(i < 10){
                calendario.append("0" + i);
            }else {
                calendario.append(i);
            }
            for (Map.Entry<Integer, Tarefa> entry : tarefas.entrySet()) {
                Tarefa tarefa = entry.getValue();
                if (i == entry.getKey()){
                    calendario.append("*");
                }
            }
            calendario.append(" ");
            if (i % 7 == 0) {
                calendario.append("\n");
            }
        }

        return calendario.toString();
    }



    public void adicionarTarefa(int dia, Tarefa tarefa){

        if(dia > 31 || dia < 1){
            throw new CalendarioException("Dia inválido!");
        }

        tarefas.put(dia, tarefa);

    }
}
