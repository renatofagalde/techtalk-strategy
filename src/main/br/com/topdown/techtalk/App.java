package br.com.topdown.techtalk;

import br.com.topdown.techtalk.model.Pessoa;
import br.com.topdown.techtalk.service.RelatorioService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static final String PONTO_VIRGULA = ";";
    public static final int ID = 0;
    public static final int NOME = 1;
    public static final int EMAIL = 2;
    public static final int PESSOA = 3;

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = transformarInput(scanner);
        Boolean isGerado = new RelatorioService().gerar(args[0], pessoas);
        System.out.println("isGerado = " + isGerado);

    }

    private static List<Pessoa> transformarInput(Scanner scanner) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            String[] pessoaArray = input.split(PONTO_VIRGULA);
            Pessoa pessoa = Pessoa.builder()
                    .id(pessoaArray[ID])
                    .name(pessoaArray[NOME])
                    .email(pessoaArray[EMAIL])
                    .ip(pessoaArray[PESSOA])
                    .build();

            pessoas.add(pessoa);
        }
        return pessoas;



    }
}
