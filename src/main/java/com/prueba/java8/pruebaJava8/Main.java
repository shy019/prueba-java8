package com.prueba.java8.pruebaJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class containing the "main" method prints Hello world! by default - replace
 * with your code
 *
 */
public class Main {

	public void ordenar() {
		List<String> lista = new ArrayList<String>();
		lista.add("cristian");
		lista.add("andres");
		lista.add("carlos");
		/*
		 * Collections.sort(lista, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
		 * } });
		 */

		for (String element : lista) {
			System.out.println(element);
		}

		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.ordenar();
	}
}
