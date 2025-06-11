/*Seu projeto deverá conter:

        1. Organização em Pacotes (MVC)

Separação lógica das classes nas pastas: model, view e controller.
Uso de pacotes e importações corretas.
        2. Criação e uso de classes e objetos

Múltiplas classes bem estruturadas, com atributos e métodos.
Instanciação de objetos em diferentes contextos do programa.
3. Encapsulamento

Modificadores private, public e protected aplicados corretamente.
Uso adequado de getters e setters.
        4. Herança e Polimorfismo

Pelo menos uma classe herdando de outra.
Métodos sobrescritos com @Override.
5. Classes Abstratas e/ou Interfaces

Utilizar pelo menos uma classe abstrata ou uma interface com implementação em classes concretas.
        6. Tratamento de Exceções

Uso de try, catch e finally.
Criação e uso de uma exceção personalizada.
7. Coleções Java (List, Set, ou Map)

Utilização de pelo menos uma coleção para armazenar objetos.
8. Manipulação de Arquivos

Gravar e/ou ler dados de um arquivo .txt ou .dat.
9. Menu de opções (via terminal)

Interface textual com menu simples, possibilitando realizar as operações do sistema.
10. Boas práticas de programação

Comentários explicativos no código.
Nomes de variáveis e classes significativos.
        Código organizado, identado e funcional.*/

import controller.ControllerToDoList;
import model.Dia;
import view.ViewToDoList;

public class Main {

    public static void main(String[] args){

        ControllerToDoList controller = new ControllerToDoList();
        Dia dia = new Dia();
        ViewToDoList view = new ViewToDoList();

        controller.iniciar();
    }
}
