package Repaso;

import java.util.Scanner;

public class Main {

    public static void triangulo(int l1, int l2, int l3){
    
        if(l1==90 || l2==90 || l3==90){
            System.out.println("Triangulo rectangulo");
        }
        
        if(l1>90 || l2>90 || l3>90){
            System.out.println("Triangulo obstangulo");
        }
        
        else{
            System.out.println("Triangulo acutangulo");
        }
    }
    
    public static int operacion(){
    
        Scanner scan=new Scanner(System.in);
        int x=0,y=0,resultado=0;
        String op;
        
        System.out.println("Elige el primer numero:");
            x=scan.nextInt();
        System.out.println("Elige el segundo numero:");
            y=scan.nextInt();
        System.out.println("Elige la operacion:");
            op=scan.nextLine();
        
            switch(op){
            
                case "+":
                    resultado=x+y;
                    break;
                    
                case "-":
                    resultado=x-y;
                    break;
                    
                case "*":
                    resultado=x*y;
                    break;
                    
                case "/":
                    resultado=x/y;
                    break;
            }
        return resultado;
    }
    
    public static void elecciones(){
    
        int x=10,y=20,z=10;
        
        if(x>0 || y>0 || z>0){
            if((x+y)>z || (x+z)>y || (y+z)>x){
                System.out.print("Es un triangulo ");
            }
        }
        
        if(x==y && x==z && z==y){
            System.out.println("equilatero.");
        }
        
        if(x!=y && x!=z && z!=y){
            System.out.println("escaleno.");
        }
        
        if((x==y && x==z && z!=y)||(x==y && x!=z && z==y)||(x!=y && x==z && z==y)){
            System.out.println("equilatero.");
        }
    }
    
    public static int bonus(){
    
        Scanner scan=new Scanner(System.in);
        int n_hijos;
        int bonus=0;
        
        System.out.println("¿Cuantos hijos tiene? :");
        n_hijos=scan.nextInt();
        
        if(n_hijos==0){
            bonus=0;
        }
        
        if(n_hijos==1){
            bonus=50;
        }
        
        if(n_hijos==2){
            bonus=75;
        }
        
        if(n_hijos>2){
            bonus=100;
        }
        return bonus;
    }
    
    public static double areas(){
    
        Scanner scan=new Scanner(System.in);
        double base, altura, lado, radio, resultado=0;
        String area;
        
        System.out.println("Elige: Area del triangulo/ Area del cuadrado/ Area del circulo/ Area del rectaangulo");
        area=scan.nextLine();
        
        switch(area){
        
            case "Area del triangulo":
                System.out.println("Introduce la base: ");
                base=scan.nextDouble();
                System.out.println("Introduce la altura: ");
                altura=scan.nextDouble();
                resultado=(base*altura)/2;
                break;
                
            case "Area del cuadrado":
                System.out.println("Introduce un lado: ");
                lado=scan.nextDouble();
                resultado=lado*lado;
                break;
                
            case "Area del circulo":
                System.out.println("Introduce el radio: ");
                radio=scan.nextDouble();
                resultado=3.14*(radio*radio);
                break;
                
            case "Area del rectangulo":
                System.out.println("Introduce la base: ");
                base=scan.nextDouble();
                System.out.println("Introduce la altura: ");
                altura=scan.nextDouble();
                resultado=base*altura;
                break;
        }
        return resultado;
    }
    
    public static int fraseLetra(){
    
        Scanner scan=new Scanner(System.in);
        String frase, letra; 
        char comparador;
        int contador=0;
        
        System.out.println("Escribe una frase: ");
        frase=scan.nextLine();
        System.out.println("Escribe una letra: ");
        letra=scan.nextLine();
        
        for(int i=0; i<frase.length(); i++){
        comparador=frase.charAt(i);
        
            if(comparador==letra.charAt(0)){
            contador++;
            }
        }
        return contador;
    }
    
    public static int primos(){
    
        int contador=2, seguimiento;
        
        while(contador<100){
            for(int i=2; i<contador; i++){
            
                seguimiento=contador%i;
                
                if(seguimiento==0){
                    System.err.println(contador + " no es primo.");
                    contador++;
                }
            }
            
            System.out.println(contador + " es primo.");
            contador++;
        }
        return contador;
    }
    
    public static void main(String[] args) {
        
        //triangulo(5,90,12);
        //operacion();
        //elecciones();
        //System.out.println(areas());
        //System.out.println(fraseLetra()); 
        //primos();
        
    }
    
}
