package br.com.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comparacao {

	DateFormat df = new SimpleDateFormat("ddMMyyyy");
	Date r = null;
	
	public void Comparar(Date n, Date a) {
		if (n.after(a)) {
			System.out.println("Você não pode ter nascido!");
		}else {
			System.out.println("Você nasceu!");
		}
	}
	
	public Date nascimento(int diaNasc, int mesNasc, int anoNasc) {
		Date nascimento = converter(diaNasc, mesNasc, anoNasc);
		return nascimento;
	}
	public Date nascimento(String dataNasc) {
		Date nascimento = converter(dataNasc);
		return nascimento;
	}
	public Date atual(int diaAtual, int mesAtual, int anoAtual) {
		Date atual = converter(diaAtual,mesAtual,anoAtual);
		return atual;
	}
	public Date atual(String dataAtual) {
		Date atual = converter(dataAtual);
		return atual;
	}
	//Convertendo int para Date
	public Date converter(int a, int b, int c) {
		try {
			r = df.parse(a+""+b+""+c);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	//Convertendo String para Date
	public Date converter(String data) {
		try {
			r = df.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return r;
	}
}