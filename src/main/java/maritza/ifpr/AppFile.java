package maritza.ifpr;

import java.io.File;
import java.util.Scanner;


public class AppFile {
    public static void main(String[] args){
        File arq = new File("arth");
        Scanner ler = new Scanner(System.in);
        String pergunta;
        String respostaCorreta;
        String respostaErrada1;
        String respostaErrada2;
        String respostaErrada3;
        String respostaErrada4;

        
        System.out.println("Digite sua pergunta");
        pergunta = ler.nextLine();

        System.out.println("Digite a resposta correta");
        respostaCorreta = ler.nextLine();
        System.out.println("Agora digite as respostas erradas");
        respostaErrada1 = ler.nextLine();
        System.out.println("A segunda resposta");
        respostaErrada2 = ler.nextLine();
        System.out.println("A terceira resposta");
        respostaErrada3 = ler.nextLine();
        System.out.println("E a quarta resposta");
        respostaErrada4 = ler.nextLine();

        System.out.println("Essas sao as respostas: ");
        System.out.printf("%s ",respostaCorreta);
        System.out.printf("\n%s ",respostaErrada1);
        System.out.printf("\n%s ",respostaErrada2);
        System.out.printf("\n%s ",respostaErrada3);
        System.out.printf("\n%s ",respostaErrada4);





    


    //Digite a pergunta
    //Digite a resposta correta
    //Digite 4 respostas erradas
    //salve essas informaçoes em arquivos.
    // Bonus: Pergunte ao usuário quantas perguntas ele quer cadastrar,
    //e coloque a opção de digitar 0 para encerrar o caastro
    }
    
}
