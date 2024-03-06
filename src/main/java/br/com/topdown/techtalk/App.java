package br.com.topdown.techtalk;

import br.com.topdown.techtalk.model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    private static String CABECALHO = "id\tfirst_name\temail\tip_address";

    public static void main(String[] args) {

        System.out.println("args = " + args[0]);

        Scanner scanner = new Scanner(System.in);
        transformarInput(scanner);

    }

    private static String transformarInput(Scanner scanner) {
        List<Pessoa> pessoas = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty() || input.equals(CABECALHO)) continue;
            System.out.println("input = " + input);
        }
        return null;
    }
}
