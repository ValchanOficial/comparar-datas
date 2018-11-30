package br.com.data;

public class Data {

	public static void main(String[] args) {
		
		Comparacao c = new Comparacao();
		
		//Recebendo valores int
		c.Comparar(c.nascimento(16, 07, 1994), c.atual(17, 06, 1993));
		c.Comparar(c.nascimento(16, 07, 1994), c.atual(17, 07, 1994));
		
		System.out.println("----------------------------------");
		
		//Recebendo valores String
		c.Comparar(c.nascimento("16071994"), c.atual("17061993"));
		c.Comparar(c.nascimento("16071994"), c.atual("17071994"));		
	}
}