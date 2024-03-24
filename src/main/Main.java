package main;

import second.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa[] pessoas = {
            new Pessoa("Kauã", 16, "programador"),
            new Pessoa("Junior", 19, "programador"),
            new Pessoa("Carlos", 12, "programador"),
            new Pessoa("Enzo", 9, "estudante"),
            new Pessoa("João", 32, "pedreiro"),
            new Pessoa("Nazário", 14, "artista")
        };

        Programador[] programadores = new Programador[pessoas.length];

        String caminhoDesktop = System.getProperty("user.home") + File.separator + "Desktop\\Dados";

        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < pessoas.length; i++) {
                File arquivoDeDadosPessoais = new File(caminhoDesktop + File.separator + "DadosIndex" + i + ".txt");
                FileWriter escrevendoArquivoDeDadosPessoais = new FileWriter(arquivoDeDadosPessoais);

                switch(pessoas[i].getProfissao().toLowerCase()) {
                    case "programador":
                        programadores[i] = new Programador(pessoas[i].getNome(), pessoas[i].getIdade(), pessoas[i].getProfissao(), "0", "0", 0);
                        escrevendoArquivoDeDadosPessoais.write("* Dados *\n" + "Nome: " + pessoas[i].getNome() +"\nIdade: " + pessoas[i].getIdade() + "\nProfissão: " + pessoas[i].getProfissao() + "\nLinguagem de programação: " + programadores[i].getLinguagem() + "\nNível hierárquico: " + programadores[i].getNivel() + "\nAnos de experiência: " + programadores[i].getExperiencia());
                        escrevendoArquivoDeDadosPessoais.close();
                        break;
                    default:
                        escrevendoArquivoDeDadosPessoais.write("* Dados *\n" + "Nome: " + pessoas[i].getNome() + "\nIdade: " + pessoas[i].getIdade() + "\nProfissão: " + pessoas[i].getProfissao());
                        escrevendoArquivoDeDadosPessoais.close();
                        break;
                }
                System.out.println("Arquivo de index (i+1) " + (i + 1) + " de " + pessoas.length + " criado e escrito com sucesso!");
            }
        } catch(IOException e) {
            System.out.println("Um erro ocorreu!");
            e.printStackTrace();
        }
    }
}