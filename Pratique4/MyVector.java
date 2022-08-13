package Practica4;

/**
 * @author George.
 * This is MyVector class, which inizialice a int array with a int variable named size.
 * @version 2.0.
 */

public class MyVector {
    
    private int size;
    private int [] integers;

//Ejercicio 1

/**
 * Is a default constructor which initialize the size to 0 of integer's array. 
 */    
    public MyVector(){
        size=0;
        integers=new int [size];
    }

/**
 * Is a second constructor with one parameter which initialize the integer's array with a int named si.
 * @param si Is the attribute that initializes the int attribute named size. 
 */    
    public MyVector(int si){
        size=si;
        integers= new int[size];
    }
   
/**
 * This is a third constructor or clone constructor, which initializes the object by matching object's attributes by parameter.
 * @param other Is a object of MyVector class, which will initialize this constructor matching this attributes.
 */    
    public MyVector(MyVector other){
        this.size=other.size;
        this.integers= new int[size];
        
        for(int i=0; i<other.size; i++){
            other.integers[i]=this.integers[i];
        }
    }
    
//Ejercicio 2    
   
/**
 * This method receive a integer by parameter and add a new element in array wiht this size.
 * @param n1 Is a integer by parameter which have the size of a new element on this array. 
 */    
    public void add(int n1){
        int [] copia = new int [size];
        
        for(int i=0; i<size; i++){
            copia[i]=integers[i];
        }
        size++;
        
        integers = new int [size];
        
        for(int i=0; i<size-1;i++){
            integers[i]=copia[i];
        }
        integers[size-1]=n1;
    }

/**
 * This method receive a integer by parameter and add a new element in the position of second parameter in array with the size of first parameter.
 * @param n1 Will be the value of the position to implement's.
 * @param n2 Will be the position to implement a value.
 */    
    public void add(int n1, int n2){
        
        for(int i=0; i<size; i++){
            if(i==n2){
                integers[i]=n1;
            }
        }
    }

//Ejercicio 3
  
/**
 * This method check if the array is empty or no.
 * @return Return's the comprobation in true or false.
 */    
    public boolean isEmpty(){
        int count=0;
        
        for(int i=0; i<size; i++){
            if(integers[i]!=0){
                count++;
            }
        }
        
        if(count==0){
            return true;
        }else{
            return false;
        }
    }

/**
 * This method empty the array, having zero in all elements.
 */    
    public void empty(){
        
        for(int i=0; i<size; i++){
            integers[i]=0;
        }
    }

/**
 * This method reset the array size to zero.
 */    
    public void reset(){
        size=0;
        integers=new int [size];
    }
    
//Ejercicio 4
 
/**
 * This method do call's the element at a position using parameter in a integer's array. 
 * @param p1 Of integer type will be the position to chose.
 * @return Return's the element at a specific position.
 */    
    public int rescueElement(int p1){
        return integers[p1];
    }
   
/**
 * This method check's if the element in the parameter is contents in the array. 
 * @param n1 Of integer type will be the element to check.
 * @return Return's true if element is content in the array.
 */    
    public boolean findElement(int n1){
        boolean comp=false;
        
        for(int i=0; i<size; i++){
            if(integers[i]==n1){
                comp=true;
            }
        }
        return comp;
    }
    
//Ejercicio 5
    
/**
 * This method delete the element in the parameter from the array and rebuild's the array.
 * @param n1 Of integer type will be the element to delete in array.
 */   
    public void deleteElement(int n1){
        int [] copia=new int [size-1];
        
        int j=0;
        //enteros = 4 7 2 1 5
        //copia =   4 7 2 5
        for(int i=0; i<size; i++){
            if(integers[i]!=n1){
                copia[j]=integers[i];
                j++;
            }
        }
        
        size--;
        
        integers=new int [size];
        for(int i=0; i<size; i++){
            integers[i]=copia[i];
        }
    }

/**
 * This method delete the element in a position obtents in the parameter.
 * @param n1 Of integer type will be the position where will is the element to delete
 */    
    public void deletePosition(int n1){
        int [] copy=new int [size-1];
        
        int j=0;
        
        for(int i=0; i<size; i++){
            if(integers[i]!=integers[n1]){
                copy[j]=integers[i];
                j++;
            }
        }
        
        size--;
        
        integers=new int [size];
        
        for(int i=0; i<size; i++){
            integers[i]=copy[i];
        }
    }
    
//Ejercicio 6

/**
 * This method toString is a modify version of original method, that allow do a list of all the class attributes.
 * @return Return's a String whit a list of all elements in the array.
 */    
    public String toString(){
        String Array=("The array with size " + this.size + " tiene los siguientes elementos: " );
        
        for(int i=0; i<size; i++){
            Array+=this.integers[i] + ", ";
        }
        
        return Array;
    }
   
/**
 * This clone method is a modify version of original method, which makes a deep copy in a new class object, one per one.
 * @return Return's a new initialized class object.
 */    
    public MyVector clone(){
        MyVector v=new MyVector();
        v.size=this.size;
        
        for(int i=0; i<size; i++){
            v.integers[i]=integers[i];
        }
        
        return v;
    }
   
/**
 * This method equals is a modify version of original method, which compare if a object is equal to other object, comprobe attributes one per one.
 * @param other Is an object of class which will comprobe if is equals then original object.
 * @return Return's true if one object is equals to other object deep.
 */    
    public boolean equals(MyVector other){
        boolean comp=false;
        
        if(other.size==this.size){
            for(int i=0; i<size; i++){
                if(other.integers[i]!=integers[i]){
                    return false;
                }
            }
            
            return true;
        }
        return comp;
    }
    
//Ejercicio 7
    
/**
 * This method is used to order the elements of the array.
 */
    
    public void buble(){
        boolean ordenado=false;
        while(!ordenado){
            ordenado=true;
            for (int i = 0; i < size-1; i++) {
                if (integers[i] > integers[i+1]) {
                    permuta(i,i+1);
                    ordenado=false;
                }
            }
        }
    }
    
/**
 * This method change the elements in position of the array to other position.
 * @param i this integer is a position of the array. 
 * @param i0 this integer is a position of the array for change with the i position.
 */    
    private void permuta(int i, int i0) {
        int backup = integers[i];
        integers[i] = integers[i0];
        integers[i0] = backup;    
    }
    
//Ejercicio 8
    
/**
 * This method order the array with recursively.
 * @param beginning will be the integer at the beginning of the array.
 * @param end will be the integer at the end of the array.
 */    
    
    public void quickSort(int beginning, int end){
        if(beginning<=end){
            return;
        }
        
        int pivot = partition(beginning, end);
        quickSort(beginning, pivot-1);
        quickSort(pivot+1, end);
    }
    
/**
 * This method compare if a element is lower than other element, and order the elements with permuta.
 * @param beginning will be the integer at the beginning of the array.
 * @param end will be the integer at the end of the array.
 * @return Return the accountant what contain a position.
 */    
    
    private int partition(int beginning, int end){
        int pivot = end;

        int accountant = beginning;
        for (int i = beginning; i < end; i++) {
            if (integers[i] < integers[pivot]) {
                permuta2(accountant, i);
                accountant++;
            }
        }
        int temp = integers[pivot];
        integers[pivot] = integers[accountant];
        integers[accountant] = temp;

        return accountant;
        
    }
    
/**
 * This method change the elements in position of the array to other position.
 * @param i this integer is a position of the array. 
 * @param i0 this integer is a position of the array for change with the i position.
 */    
    private void permuta2(int i, int i0) {
        int backup = integers[i];
        integers[i] = integers[i0];
        integers[i0] = backup;    
    }
    
/**
 * This method print the position's of the array one by one.
 */
    public void printArray(){
        for(int i=0; i<size; i++){
            System.out.println(integers[i]);
        }
    }
}
