package PruebaDos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba {

	public static void main(String[] args) throws IOException {
		FileWriter fw;
		String miFichero = "C:\\Users\\CARLITOS\\Desktop\\fichero\\TablaMultiplicar.txt";
		BufferedWriter bw;
		String linea = "";
	

		try {
			fw = new FileWriter(miFichero);
			bw = new BufferedWriter(fw);

			for (int i = 1; i <= 10; i++) {
				linea = "";
				bw.write("tabla del :" + i);
				bw.newLine();
				for (int j = 1; j <= 10; j++) {
					linea += j + "x" + i + "=" + (i * j) + "\n";
					
				}
				System.out.println(linea);
				bw.write(linea);
				bw.newLine();
			}
			
			
			
			bw.close();

			
		} catch (IOException e) {
			System.out.println("Error al escribir");
		}

	}

}
