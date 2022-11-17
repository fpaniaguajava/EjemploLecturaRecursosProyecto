package com.fernandopaniagua.ejemplo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class App {

	public static void main(String[] args) throws Exception {
		new App().obtenerDatos();
	}
	public void obtenerDatos() throws Exception {
		//Accediendo a un fichero contenido en el propio proyecto
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("assets/datos.dat");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		is.close();
	}

}
