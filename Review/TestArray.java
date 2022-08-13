package Repaso;


public class TestArray {

    private int tamaño=5;
    private int[] enteros;
    
    public TestArray(int t){
        tamaño=t;
        enteros=new int[tamaño];
    }
    
    public void rellenaArray(){      
        enteros[0]=1;
        enteros[1]=2;
        enteros[2]=3;
        enteros[3]=4;
        enteros[4]=5;
    }
    
    public void printArray(int elemento){
        int [] copia = new int [tamaño];
        for(int i=0; i<tamaño; i++){
            copia[i]=enteros[i];
        }
        tamaño++;
        enteros = new int [tamaño];
        for(int i=0; i<tamaño-1;i++){
            enteros[i]=copia[i];
        }
        enteros[tamaño-1]=elemento;
        
    }
    
    public void 
    
}
