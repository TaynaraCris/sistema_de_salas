package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.CampoPreenchidoIncorretamenteException;

public class Main {

  static Scanner scan = new Scanner(System.in);
  
  public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }

    return true;
  }

   public static void main(String[] args) {
    List <TipoAula> tiposDeAula = new ArrayList<>();
    TipoAula graduacao = new TipoAula(true, false, false);
    TipoAula posGraduacao = new TipoAula(false, true, false);
    TipoAula extensao = new TipoAula(false, false, true);
    tiposDeAula.add(graduacao);
    tiposDeAula.add(posGraduacao);
    tiposDeAula.add(extensao);

	Universidade universidade = new Universidade();
	Predio predio = new Predio();
	Turma turma = new Turma();
	Disciplina disciplina = new Disciplina();
	
	System.out.println("Seja bem vindo Sistema de Cadastro de Salas!!");

	System.out.println("Primeiro, vamos cadastrar os dados universidade!");

    System.out.println("Informe o nome da universidade:");
	String nome = scan.next();
    universidade.setNome(nome);

    String temCentroOlimpico;
	boolean possuiCentroOlimpico = false;

    do{
    	System.out.println("Informe se a universidade possui centro olímpico? (sim ou nao)");
    	temCentroOlimpico = scan.next();
		
		if(temCentroOlimpico.equalsIgnoreCase("sim")) {
			possuiCentroOlimpico = true;
		}else if(temCentroOlimpico.equalsIgnoreCase("nao")) {
			possuiCentroOlimpico = false;
		}
	
	}while(!temCentroOlimpico.equalsIgnoreCase("sim") && !temCentroOlimpico.equalsIgnoreCase("nao"));

    universidade.setPossuiCentroOlimpico(possuiCentroOlimpico);

    String temBiblioteca;
	boolean possuiBiblioteca = false;

    do{
    	System.out.println("Informe se a universidade possui biblioteca? (sim ou nao)");
    	temBiblioteca = scan.next();
		
		if(temBiblioteca.equalsIgnoreCase("sim")) {
			possuiBiblioteca = true;
		}else if(temBiblioteca.equalsIgnoreCase("nao")) {
			possuiBiblioteca = false;
		}
	
	}while(!temBiblioteca.equalsIgnoreCase("sim") && !temBiblioteca.equalsIgnoreCase("nao"));

    universidade.setPossuiBiblioteca(possuiBiblioteca);


    String opcao;
    String deNovo = "sim";
   
    do {
    	do {
		  System.out.println("O que voce deseja fazer?");
		  System.out.println("Escolha uma das opcoes abaixo digitando um numero de 1 a 6:");
	      System.out.println("1 - Cadastrar prédio");
	      System.out.println("2 - Cadastrar disciplina");
	      System.out.println("3 - Cadastrar sala");
	      System.out.println("4 - Cadastrar turma");
	      System.out.println("5 - Cadastrar aluno");
	      System.out.println("6 - Cadastrar professor");
	      opcao = scan.next();
    	} while(!(isInteger(opcao) && Integer.parseInt(opcao) >= 1 && Integer.parseInt(opcao) <= 6));

	    int escolha = Integer.parseInt(opcao);
	
	    if(escolha == 1){
	    	universidade.cadastrarPredio();
	    }
	    else if(escolha == 2) {
	    	universidade.cadastrarDisciplina();
	    }
	    else if(escolha == 3) {
	    	predio.cadastrarSala();
	    }
	    else if(escolha == 4) {
	    	disciplina.cadastrarTurma();
	    }
	    
	    else if(escolha == 5) {
	    	turma.cadastrarAluno();
	    }

	    else if(escolha == 6) {
	    	universidade.criarProfessor();
	    }
	    
	    System.out.println("Deseja realizar a operação novamente? (sim ou nao)");
	
	    deNovo = scan.next();

    }while(deNovo.equalsIgnoreCase("sim"));
		
	}

}