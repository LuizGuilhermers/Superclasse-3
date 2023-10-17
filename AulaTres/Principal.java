package AulaTres;

import AtividadeDois.Funcionario;

public class Principal {
	public static void main(String[] args) {
		
		 Produto produto = new Produto (1, "Mouse", 80.00);
		 System.out.println("PRODUTO: ");
		 System.out.println(produto.getNome());
		 System.out.println(produto.getPreco());
		 System.out.println(produto.getId());
		 

		 Sorvete sorvete = new Sorvete (1, "Baunilha", 8.00, -5);
		 System.out.println("SORVETE: ");
		 System.out.println(sorvete.getNome());
		 System.out.println(sorvete.getPreco());
		 System.out.println(sorvete.getId());
		 System.out.println(sorvete.getTempAdequada());
		 
		 Camisa camisa = new Camisa (1, "Polo", 50.00, "Azul", "Algodão", "M");
		 System.out.println("CAMISA: ");
		 System.out.println(camisa.getNome());
		 System.out.println(camisa.getPreco());
		 System.out.println(camisa.getId());
		 System.out.println(camisa.getCor());
		 System.out.println(camisa.getTecido());
		 System.out.println(camisa.getTamanho());
		 
		 
		 
	}

}
