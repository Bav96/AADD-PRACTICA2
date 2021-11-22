package Xml;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class info {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{
	            // crea el fichero si no existe
	            FileWriter fw=new FileWriter("C:\\xampp\\htdocs\\aadd\\recursos\\info-temporal.txt ");
	           
	            
	            //Escribimos en el fichero un String y un caracter 
	            fw.write("NOMBRE, APELLIDOS, CURSO  \n");
	           AñadirInformacion(fw);
	            //Cierro el stream
	            fw.close(); 
	           
	                //Abro el stream, el fichero debe existir
	            FileReader fr=new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\info-temporal.txt ");
	            //Leemos el fichero y lo mostramos por pantalla
	            int valor=fr.read();
	            while(valor!=-1){
	                System.out.print((char)valor);
	                valor=fr.read();
	            }
	            
	        }catch(IOException e){
	            System.out.println("Error E/S: "+e);
	
	        }
		 
	
		  		
		  
	}
			public static void AñadirInformacion (FileWriter fw) throws IOException{
				
				try {
					
		           
		            
		            //Escribimos en el fichero un String y un caracter 
		            fw.write("Borja,Argibay Vázquez,DAM2  \n");
		            
		            
				
				}catch(IOException e){
		            System.out.println("Error E/S: "+e);
		        	
		       
		        }
	}

}
