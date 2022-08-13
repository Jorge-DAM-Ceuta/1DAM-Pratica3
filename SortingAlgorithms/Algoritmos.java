package AlgoritmosOrdenacion;


public class Algoritmos {
    
    private int [] v;
    private int tam;
    
    //constructor por defecto preparado para inicializar un array de pruebas
    //el array sin ordenar es 5 2 7 9 3 0 4 1 8 6
    //el array ordenado es 0 1 2 3 4 5 6 7 8 9
    public Algoritmos(){
        tam = 10;
        v = new int [tam];
        v[0]=5;
        v[1]=2;
        v[2]=7;
        v[3]=9;
        v[4]=3;
        v[5]=0;
        v[6]=4;
        v[7]=1;
        v[8]=8;
        v[9]=6;
    }
    
    public int [] getArray(){
        return v;
    }
    
    public int getTam(){
        return tam;
    }
    
    //Algoritmos recursivos
    public void burbuja(int [] v, int tam){
        boolean ordenado=false;
        while(!ordenado){
            ordenado=true;
            for (int i = 0; i < tam-1; i++) {
                if (v[i] > v[i+1]) {
                    permuta(v, i,i+1);
                    ordenado=false;
                }

            }
        }
    }
    
    public void seleccion(int [] v, int tam){
        for (int i = 0; i < tam; i++) {
            int min = v[i];
            int minId = i;
            for (int j = i+1; j < tam; j++) {
                if (v[j] < min) {
                    min = v[j];
                    minId = j;
                }
            }
            int temp = v[i];
            v[i] = min;
            v[minId] = temp;
        }
    }
    
    public void insercion(int [] v, int tam){
        for (int i = 1; i < tam; i++) {
            int actual = v[i];
            int j = i - 1;
            while(j >= 0 && actual<v[j]){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = actual;
        }
    }
    
    //Algoritmos recursivos
    public void mergeSort(int [] v, int izquierda, int derecha){
        if(derecha<=izquierda){
            return;
        }
        int medio=(izquierda+derecha)/2;
        mergeSort(v, izquierda, medio);
        mergeSort(v, medio, derecha);
        merge(v, izquierda, medio+1, derecha);
    }
    
    public void merge(int [] v, int izquierda, int medio, int derecha){
        int tamIzq = medio-izquierda+1;
        int tamDer = derecha-medio;
        
        int [] vIzq = new int [tamIzq];
        int [] vDer = new int [tamDer];
        
        for(int i=0; i<tamIzq; i++){
            vIzq[i] = v[izquierda+i];
        }

        for(int i=0; i<tamDer; i++){
            vDer[i] = v[medio+i];
        }
        
        int indiceIzq = 0;
        int indiceDer = 0;
        
        for(int i=izquierda; i<derecha; i++){
            if (indiceIzq < tamIzq && indiceDer < tamDer) {
                if (vIzq[indiceIzq] < vDer[indiceDer]) {
                    v[i] = vIzq[indiceIzq];
                    indiceIzq++;
                }
                else {
                    v[i] = vDer[indiceDer];
                    indiceDer++;
                }
            }else if(indiceIzq < tamIzq){
                v[i] = vIzq[indiceIzq];
                indiceIzq++;
            }else if(indiceDer < tamDer){
                v[i] = vDer[indiceDer];
                indiceDer++;
            }
        }
    }
    
    public void quickSort(int [] v, int inicio, int fin){
        if(inicio<=fin){
            return;
        }
        
        int pivot = particion(v, inicio, fin);
        quickSort(v, inicio, pivot-1);
        quickSort(v, pivot+1, fin);
    }
    
    private int particion(int [] v, int inicio, int fin){
        int pivot = fin;

        int contador = inicio;
        for (int i = inicio; i < fin; i++) {
            if (v[i] < v[pivot]) {
                permuta(v, contador, i);
                contador++;
            }
        }
        int temp = v[pivot];
        v[pivot] = v[contador];
        v[contador] = temp;

        return contador;
        
    }
    
    private void permuta(int [] v, int a, int b){
        int backup = v[a];
        v[a] = v[b];
        v[b] = backup;
    }
    
    
}
