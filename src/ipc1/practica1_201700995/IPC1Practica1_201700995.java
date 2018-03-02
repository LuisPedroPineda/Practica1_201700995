package ipc1.practica1_201700995;
import java.util.Scanner;
import java.util.Random;
public class IPC1Practica1_201700995 {
    public static String facil, dificil;
    public static String matriz1[][]=new String[5][8];
    public static String matriz2[][]=new String[20][10];
    public static int subidas, bajadas;            
    public static char jugador1, jugador2,jugador3,jugador4;
    public static void main(String[] args) {
         facil="null";
         dificil="null";
         menu();
    }
    public static void menu()
    {
     Scanner leer = new Scanner(System.in);
     int opcion;
     int m; //m sirve para repetir el ciclo si en caso el número ingresado es incorrecto.
     //Escribimos el menú principal
     System.out.println("MENÚ PRINCIPAL"
             + "\nSeleccione una opción");
     System.out.println("1.Dificultad del juego"
             + "\n2.Parámetros iniciales"
             + "\n3.Iniciar Juego"
             + "\n4.Salir");
     System.out.println("Ingrese un número");
     do{
         m=0;         
     opcion = leer.nextInt();//Se lee el número a evaluar en el switch
     switch(opcion){
             case 1:
                 dificultad();//Se llama el método Usuarios()
                 break;
             case 2:
                 parametros();//Se llama el método Contador()
                 break;
             case 3:
                matriz();
                 break;
             case 4:
                 System.exit(0);//Se termina la ejecución del programa
                 break;
             default:
                 m=1;// Si en caso el número ingresado fuera incorrecto m sera igual a 1 y el ciclo se repetirá.
                 System.out.println("Intente de nuevo");
         }
     }
     while(m==1);  
    } 
    public static void dificultad()
    {
     Scanner leer = new Scanner(System.in);
     int opcion;
     int m; //m sirve para repetir el ciclo si en caso el número ingresado es incorrecto.
     //Escribimos el menú principal
     System.out.println("\n"
             + "\nDIFICULTAD DEL JUEGO"
             + "\nSeleccione una opción");
     System.out.println("1.Fácil"
             + "\n2.Difícil"
             + "\n3.Regresar");
     System.out.println("Ingrese un número");
     do{
         m=0;         
     opcion = leer.nextInt();//Se lee el número a evaluar en el switch
     switch(opcion){
             case 1:
                 facil="facil";
                 System.out.println("\n"
                         + "\nDificultad fácil seleccionada"
                         + "\nJugadores de 2 a 3"
                         + "\nSubidas 5 a 10."
                         + "\nBajones 5 a 10.");
                 dificultad();
                 break;
             case 2:                 
                    dificil="dificil";
                    System.out.println("\n"
                            + "\nDificultad difícil seleccionada"
                         + "\nJugadores de 2 a 4"
                         + "\nSubidas 20 a 40."
                         + "\nBajones 20 a 40.");                        
                 dificultad();                
                 break;
             case 3:
                 System.out.println(" ");
                 menu();
                 break;
             default:
                 m=1;// Si en caso el número ingresado fuera incorrecto m sera igual a 1 y el ciclo se repetirá.
                 System.out.println("Intente de nuevo");
         }
     }
     while(m==1);
     }
    public static void parametros()
    {
     //Declaramos las variables a utilizar
     Scanner leer = new Scanner(System.in);
     int opcion,llave;
     int m; //m sirve para repetir el ciclo si en caso el número ingresado es incorrecto.
     //Escribimos el menú principal
     System.out.println("\n"
             + "\nPARÁMETROS INICIALES"
             + "\nSeleccione una opción");
     System.out.println("1.Jugadores"
             + "\n2.Subidas y bajones"
             + "\n3.Regresar");
     System.out.println("Ingrese un número");
     do{
         m=0;         
     opcion = leer.nextInt();//Se lee el número a evaluar en el switch
     switch(opcion){
             case 1:
                 if(facil.equals("facil"))
                 {
                     System.out.println("Modo fácil: Ingrese el numero de jugadores pueden ser de 2-3");
                     int a;
                     a=leer.nextInt();
                     if(a==2){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                         
                     }else if(a==3){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                          System.out.println("Ingrese el simbolo para el jugador 3");
                          jugador3=leer.next().charAt(0);                         
                     }
                     
                 }else  if(dificil.equals("dificil")){
                      System.out.println("Modo dificil: Ingrese el numero de jugadores pueden ser de 2-4");
                     int a;
                     a=leer.nextInt();
                     if(a==2){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                         
                     }else if(a==3){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                          System.out.println("Ingrese el simbolo para el jugador 3");
                          jugador3=leer.next().charAt(0);
                         
                     }else if(a==4){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 3");
                         jugador3=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 4");
                         jugador4=leer.next().charAt(0);
                         
                     }
                     
                 }
                 System.out.println("Gracias");
                 System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 parametros(); //Se llama método del Usuarios()
                 }
                 break;
             case 2: 
                  if(facil.equals("facil"))
                 {
                     System.out.println("Modo fácil: Ingrese el numero de bajadas pueden ser de 5-10");
                     bajadas=leer.nextInt();
                     System.out.println("Ingrese el numero de subidas debe ser de 5-10");
                     subidas=leer.nextInt();
                     
                 }else if(dificil.equals("dificil")){
                    System.out.println("Modo dificil: Ingrese el numero de bajadas pueden ser de 20-40");
                     bajadas=leer.nextInt();
                     System.out.println("Ingrese el numero de subidas debe ser de 20-40");
                     subidas=leer.nextInt();                                       
                 }
                 System.out.println("Gracias");
                 System.out.println("");
                 System.out.println("1. Regresar");
                 llave=leer.nextInt();//Se lee la variable llave
                 System.out.println("");
                 if(llave==1)//La variable llave sirve para leer el numero si el usuario desea regresar al menú anterior
                 {                    
                 parametros(); //Se llama método del Usuarios()
                 }
                 break;
             case 3:
                 System.out.println(" ");
                 menu();
                 break;
             default:
                 m=1;// Si en caso el número ingresado fuera incorrecto m sera igual a 1 y el ciclo se repetirá.
                 System.out.println("Intente de nuevo");
         }
     }
     while(m==1);
    }
    public static void matriz()
    {
        Random dado=new Random();
        int aleatorio,aleatorio2;
        
        if (facil.equals("facil")){
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                matriz1[i][j]=".";                
            }
        }
        
        for(int k=1;k<=subidas;k++){
            aleatorio=dado.nextInt(4);
            aleatorio2=dado.nextInt(7);
           
                if(aleatorio==0 && aleatorio2==7 || aleatorio==4 && aleatorio2==7)
                {
                    k=k-1;
                }else if(aleatorio2 !=0 && matriz1[aleatorio][aleatorio2-1].equals("+")){
                    k=k-1;
                }else if(matriz1[aleatorio][aleatorio2].equals("+"))
                {
                    k=k-1;
                }else if(matriz1[aleatorio][aleatorio2+1].equals("+"))
                {  
                    k=k-1;
                }else
                {
                    matriz1[aleatorio][aleatorio2]="+";
                }
            
           
        }
        
      for(int k=1;k<=bajadas;k++){
            aleatorio=dado.nextInt(4);
            aleatorio2=dado.nextInt(7);
           
            if(aleatorio==0 && aleatorio2==7 ||  aleatorio==4 && aleatorio2==7)
                {
                    k=k-1;
                }else if(matriz1[aleatorio][aleatorio2].equals("+"))
                {
                    k=k-1;
                }else if(aleatorio2 !=0 && matriz1[aleatorio][aleatorio2-1].equals("-")){
                    k=k-1;
                }else if(matriz1[aleatorio][aleatorio2+1].equals("-"))
                {  
                    k=k-1;
                }else if(matriz1[aleatorio][aleatorio2].equals("-")){
                    k=k-1;
                } 
                else
                {
                    matriz1[aleatorio][aleatorio2]="-";
                }   
        }
        matriz1[0][7]="$";
 
        for(int i=0;i<5;i++){
                for(int j=0;j<8;j++){
                System.out.print(matriz1[i][j]);
                System.out.print("   ");
            }
           System.out.println("   ");     
        }
        
        
        
        
        }else if (dificil.equals("dificil")){
        for(int i=0;i<20;i++){
            for(int j=0;j<10;j++){
                matriz2[i][j]=".";                
            }
        }
        
        for(int k=1;k<=subidas;k++){
            aleatorio=dado.nextInt(19);
            aleatorio2=dado.nextInt(9);
           
                if(aleatorio==0 && aleatorio2==9 || aleatorio==19 && aleatorio2==9)
                {
                    k=k-1;
                }else if(aleatorio2 !=0 && matriz2[aleatorio][aleatorio2-1].equals("+")){
                    k=k-1;
                }else if(matriz2[aleatorio][aleatorio2].equals("+"))
                {
                    k=k-1;
                }else if(matriz2[aleatorio][aleatorio2+1].equals("+"))
                {  
                    k=k-1;
                }else
                {
                    matriz2[aleatorio][aleatorio2]="+";
                }
            
           
        }
        
      for(int k=1;k<=bajadas;k++){
            aleatorio=dado.nextInt(19);
            aleatorio2=dado.nextInt(9);
           
            if(aleatorio==0 && aleatorio2==9 ||  aleatorio==19 && aleatorio2==9)
                {
                    k=k-1;
                }else if(matriz2[aleatorio][aleatorio2].equals("+"))
                {
                    k=k-1;
                }else if(aleatorio2 !=0 && matriz2[aleatorio][aleatorio2-1].equals("-")){
                    k=k-1;
                }else if(matriz2[aleatorio][aleatorio2+1].equals("-"))
                {  
                    k=k-1;
                }else if(matriz2[aleatorio][aleatorio2].equals("-")){
                    k=k-1;
                } 
                else
                {
                    matriz2[aleatorio][aleatorio2]="-";
                }   
        }
        matriz2[0][9]="$";
 
        for(int i=0;i<20;i++){
                for(int j=0;j<10;j++){
                System.out.print(matriz2[i][j]);
                System.out.print("   ");
            }
           System.out.println("   ");     
        }
        
        
        
        
        }
        
        
        
        
        
        
        
        }
                
    
}
