package Practica4;

public class App {
    
    public static void main(String[] args) {
    
        MyVector v=new MyVector();
        
        v.add(3);
        v.add(10);
        v.add(6);
        
        System.out.println("Original Array:");
        v.printArray();
        
        v.quickSort(0, 2);
        
        System.out.println("Order Array:");
        v.printArray();
        
    }
}
