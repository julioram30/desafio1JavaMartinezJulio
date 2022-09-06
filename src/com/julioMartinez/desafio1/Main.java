/**
 * 
 */
package com.julioMartinez.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * @author Julio
 *
 */
public class Main {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>()  ;	
		
		listaPersonas.add(new Persona("Maini", "Matias"));
		listaPersonas.add(new Persona("Raspo", "Pablo"));
		listaPersonas.add(new Persona("Fabucci", "Nicolas"));
		listaPersonas.add(new Persona("Raspo", "Franco"));
		listaPersonas.add(new Persona("Martinez", "Julio"));
		
		// imprimo la lista desordenada por consola
		System.out.println("\r DESORDENADA \r");
		imprimir(listaPersonas);
		System.out.println("\r");
	
		// llamada al metodo ordenar por apellido
		ordenaApellidoAsc(listaPersonas); 
	
		// imprimo la lista ordenada por consola
		System.out.println("\r ORDENADA POR APELLIDO \r");
		imprimir(listaPersonas);
		
		// llamada al metodo ordenar por nombre
		ordenaNombreAsc(listaPersonas); 
			
		// imprimo la lista ordenada por consola
		System.out.println("\r ORDENADA POR NOMBRE \r");
		imprimir(listaPersonas);
		
		// llamada al metodo ordenar por apellido
		ordenaApellidoDes(listaPersonas);
		
		// imprimo la lista ordenada por consola	
		System.out.println("\r ORDENADA POR APELLIDO DESCENDENTE \r");
		imprimir(listaPersonas);
 }
	/***
	 * 	Metodo para ordenar la ista 
	 ***/
//	private static void ordenar(List<Persona> listaPersonas, String campoOrden) {
//	
//	Collections.sort(listaPersonas, new Comparator<Persona>() {
//			@Override
//			public int compare(Persona o1, Persona o2) {
//				int retorno = 0;
//				 switch (campoOrden.toLowerCase()){
//				 
//				 case "apellido":
//					 retorno = new String(o1.getApellido()).compareTo(new String(o2.getApellido()));
//					 
//				 case "nombre":
//					  retorno = new String(o1.getNombre()).compareTo(new String(o2.getNombre()));
//					 
//				 }
//				 return retorno;
//				
//			}});	
//
//}	
 
 private static void imprimir(List<Persona> listaPersonas) {
	 for (Persona persona : listaPersonas) {
			System.out.println(persona.getApellido() + " - " + persona.getNombre());
		}
 }

 private static void ordenaApellidoAsc(List<Persona> listaPersonas) {
	 Collections.sort(listaPersonas, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return  new String(o1.getApellido()).compareTo(new String(o2.getApellido()));
			 }});
			}
 
 private static void ordenaNombreAsc(List<Persona> listaPersonas) {
	 Collections.sort(listaPersonas, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return  new String(o1.getNombre()).compareTo(new String(o2.getNombre()));
			 }});
			}

 private static void ordenaApellidoDes(List<Persona> listaPersonas) {
	 Comparator<Persona> comparador = Collections.reverseOrder();
		Collections.sort(listaPersonas, comparador);
	 //Collections.sort(listaPersonas, Collections.reverseOrder());
			}
 

}
