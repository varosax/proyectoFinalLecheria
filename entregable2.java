package ejercicio7;
import java.io.*;
public class entregable2 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static PrintStream out = System.out;
	// rutinas
	public static int montoPagar(int monto,int sumBotellas,int preciobotella){
    	monto=sumBotellas*preciobotella;
    	return monto;
    }
	
	public static void main(String[] args) throws IOException {
		// Variables Locales
		int cantidad=0, contador=0;
        int productorId, preciobotella=1500, entregas,botellas=0,sumBotellas=0;
        int  monto=0;
        
        
        System.out.println("Digite la cantidad de Productores");
		cantidad=Integer.parseInt(in.readLine());
        // Entradas
        while (contador<cantidad) {
        	
        out.println("Digite el ID del productor");

        productorId = Integer.parseInt(in.readLine());

        out.println("Digite la cantidad de Entrega realizadas por: "+productorId);

        entregas = Integer.parseInt(in.readLine());
        int cont=0;
        while(cont < entregas ) {
        	out.println("Digite la cantidad de Botellas por Entrega");
            botellas = Integer.parseInt(in.readLine());
            sumBotellas=sumBotellas+botellas;
        	cont++;
        }//end while
        
        int mayor=0, menor=0;
        if(sumBotellas > mayor) {
        	mayor=sumBotellas;
        }else if(sumBotellas < menor) {
        	menor=sumBotellas;
        }else {
        	System.out.println("n/a");
        }
        
       
        
        String[] productor= {"\nid Productor: "+productorId,"Entregas: "+entregas,"Botellas \n"+sumBotellas+"\nMonto que se le debe pagar es: "+montoPagar(monto,sumBotellas,preciobotella)+"\n"};
		//For me muestra todos los datos del array
		for(int i=0; i<productor.length;i++) {
            System.out.println("----------------\n");
			System.out.println(productor[i]);
        }
       
       contador++;
        }//while end   
	}//fin main

}
