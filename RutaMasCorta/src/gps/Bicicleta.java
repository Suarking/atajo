package gps;
/**
 * Bicicleta class
 * @author Suar PL
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i=0; i<camino1.length; i++)
        {
            sum1 += camino1[i];
            sum2 += camino2[i];
            sum3 += camino3[i];
        }
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }
    //suma de tramos para conseguir la mejor ruta
    public static int Ruta (int tramo []) {
    	int total=0, i=0;
    	for (i=0;i<tramo.length;i++) {
    		total = total + tramo[i];
    	}
    	return total;
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {1,3,4,5,6};
        int[] camino2 = {2,1,5,6,4};
        int[] camino3 = {1,5,6,3,4};
        System.out.println("El camino m�s corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
  
}