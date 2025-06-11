package view;

import java.util.Scanner;
import controller.ControllerToDoList;
import dto.Dto;

public class ViewToDoList {

    int op;
    Scanner scanner = new Scanner(System.in);


    public int exibirMenu(){

        System.out.println("Planeje sua semana!");
        System.out.println("");
        System.out.println("===MENU===");
        System.out.println("");
        System.out.println("1 - Cadastre uma tarefa");
        System.out.println("2 - Listar as tarefas da semana");
        System.out.println("3 - Editar tarefa");
        System.out.println("4 - Excluir tarefa");
        System.out.println("");
        System.out.println("0 - Sair");

        op = scanner.nextInt(); //Captar a ação desejada
        scanner.nextLine();

        return op;
    }

    public Dto cadastrarTarefa(){

        Dto dto = new Dto();

        System.out.println("Qual o dia que deseja salvar a tarefa? ");
        dto.dia = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Qual o título da sua tarefa? ");
        dto.titulo = scanner.nextLine();

        System.out.println("Qual a descrição da sua tarefa: ");
        dto.descricao = scanner.nextLine();

        return dto;
    }

}
