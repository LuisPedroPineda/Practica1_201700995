package ipc1.practica1_201700995;
import java.util.Scanner;
import java.util.Random;
public class IPC1Practica1_201700995 {
    public static String facil, dificil,con;
    public static String matriz1[][]=new String[5][8];
    public static String matriz2[][]=new String[20][10];
     public static String matriz1a[][]=new String[5][8];
    public static String matriz2a[][]=new String[20][10];
     public static String matriz1b[][]=new String[5][8];
     public static String matriz2b[][]=new String[20][10];
    public static char turno1[]=new char[2];
    public static char turno2[]=new char[3];
    public static char turno3[]=new char[4];
    public static int numjugadores,bb,cc,x1,y1,x2,y2,x3,y3;
    public static int subidas, bajadas,turno;            
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
                juego();
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
     int opcion;
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
                         numjugadores=2;
                     }else if(a==3){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                          System.out.println("Ingrese el simbolo para el jugador 3");
                          jugador3=leer.next().charAt(0);  
                          numjugadores=3;
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
                         numjugadores=2;
                     }else if(a==3){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                          System.out.println("Ingrese el simbolo para el jugador 3");
                          jugador3=leer.next().charAt(0);
                         numjugadores=3;
                     }else if(a==4){
                         System.out.println("Ingrese el simbolo para el jugador 1");
                         jugador1=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 2");
                         jugador2=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 3");
                         jugador3=leer.next().charAt(0);
                         System.out.println("Ingrese el simbolo para el jugador 4");
                         jugador4=leer.next().charAt(0);
                         numjugadores=4;
                     }
                     
                 }
                 System.out.println("Gracias");
                
                 parametros(); //Se llama método del Usuarios()
                
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
                               
                 parametros(); //Se llama método del Usuarios()
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
           
            if(aleatorio==0 && aleatorio2==7 ||  aleatorio==4 && aleatorio2==0)
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
           matriz1a[i][j]=matriz1[i][j];
           matriz1b[i][j]=matriz1[i][j];
       }
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
           
                if(aleatorio==0 && aleatorio2==9 || aleatorio==19 && aleatorio2==0)
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
           matriz2a[i][j]=matriz2[i][j];
       }
       }
        
        
        }
        
        
        
        
        
        
        
        }
    public static void movturno(int b, int c)
    {
        Scanner waitForKeypress = new Scanner(System.in);
        System.out.println("Presione enter para tirar el dado"); 
        waitForKeypress.nextLine();
        Random dado=new Random();
                int aleatorio,j,m;
                do{
                     m=0;
                     aleatorio=dado.nextInt(6);
                     if(aleatorio>=1 && aleatorio<=6){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Se moverá "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        int d;
        int cont=0;
  
        if(b % 2==0){
        do{         
                 if(c==7){
                 }else{
                   c=c+1; 
                 }
                    
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==7 && d>0){
                        b=b-1;
                          for(int i=1;i<=d;i++){
                          c=c-1; 
                          cont=cont+1;
                        }
                     } else if(d<=0){
                        d=0;
                    }
          }while(d!=0);
        
        
        int n;
            
                n=0;
        if(matriz1a[b][c].equals("+")){
                     do{
                     m=0;
                     aleatorio=dado.nextInt(6);
                     if(aleatorio>=1 && aleatorio<=6){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial subiras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        cont=0;
        
        do{         
                 if(c==7){
                 }else{
                   c=c+1; 
                 }
                    
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==7 && d>0){
                        b=b-1;
                          for(int i=1;i<=d;i++){
                          c=c-1; 
                          cont=cont+1;
                        }
                     } else if(d<=0){
                        d=0;
                    }
          }while(d!=0);
        }else if (matriz1a[b][c].equals("-")){
             do{
                     m=0;
                     aleatorio=dado.nextInt(6);
                     if(aleatorio>=1 && aleatorio<=6){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial bajaras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        cont=0;
            do{         
                if(c==0){
                 
                }else{
                c=c-1;
            }
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==0 && d>0){
                        b=b+1;
                        for(int i=0;i<d;i++){
                          c=c+1; 
                          cont=cont+1;
                        }
                        
                    } else if(d<=0){
                        d=0;
                    }
         }while(d!=0);
        }
           
        
          matrizjuego1(b,c); 
           switch(turno){
            case 1:
                 bb=b;
                 cc=c; 
                break;
            case 2:
                x1=b;
                y1=c;
                break;
            case 3:
                x2=b;
                y2=c;
                break;
        }
            
        }else if (b % 2 !=0){
            do{         
                if(c==0){
                 
                }else{
                c=c-1;
            }
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==0 && d>0){
                        b=b-1;
                        for(int i=0;i<d;i++){
                          c=c+1; 
                          cont=cont+1;
                        }
                        
                    } else if(d<=0){
                        d=0;
                    }
         }while(d!=0);
            int n;
           
         if(matriz1a[b][c].equals("+")){
                     do{
                     m=0;
                     aleatorio=dado.nextInt(6);
                     if(aleatorio>=1 && aleatorio<=6){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial subiras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
          n=0;
             do{         
                if(c==0){
                 
                }else{
                c=c-1;
            }
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==0 && d>0){
                        b=b-1;
                        for(int i=0;i<d;i++){
                          c=c+1; 
                          cont=cont+1;
                        }
                        
                    } else if(d<=0){
                        d=0;
                    }
         }while(d!=0);
        }else if(matriz1a[b][c].equals("-")){
            do{
                     m=0;
                     aleatorio=dado.nextInt(6);
                     if(aleatorio>=1 && aleatorio<=6){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial bajaras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        cont=0;
         do{     
              
                 if(c==7){
                 }else{
                   c=c+1; 
                 }
                    
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==7 && d>0){
                        b=b+1;
                          for(int i=1;i<=d;i++){
                          c=c-1; 
                          cont=cont+1;
                        }
                     } else if(d<=0){
                        d=0;
                    }
          }while(d!=0);
         }
                 
         
           
         matrizjuego1(b,c);
        switch(turno){
            case 1:
                 bb=b;
                 cc=c; 
                break;
            case 2:
                x1=b;
                y1=c;
                break;
            case 3:
                x2=b;
                y2=c;
                break;
        }
         }
        
    }
    public static void juego ()
    {   
             
       
       if(facil.equals("facil")){
          
            System.out.println(numjugadores);
           switch(numjugadores){
               case 2:
                   int l;
                   
                    turnos();
       matriz();
       bb=4;
       cc=0;
       x1=4;
       y1=0;
        x2=4;
       y2=0;
                   do{
                       l=0;
          System.out.println("Primer Turno");
          turno=1;
          matrizjuego1(bb,cc);
          if(turno==1){
               movturno(bb,cc);
          }
          System.out.println("Segundo Turno");
           turno=2; 
           matrizjuego1(x1,y1);
          if(turno==2){
               movturno(x1,y1);
          }
        
       if(bb==0 && cc==7 || x1==0 && y1==7 ){
              l=1;
          }
      } while(l!= 1);
                   break;
               case 3:
                    
                 
                    turnos();
       matriz();
       bb=4;
       cc=0;
       x1=4;
       y1=0;
        x2=4;
       y2=0;
                   do{
                         l=0;
          System.out.println("Primer Turno");
          turno=1;
          matrizjuego1(bb,cc);
          if(turno==1){
               movturno(bb,cc);
          }
          System.out.println("Segundo Turno");
           turno=2; 
           matrizjuego1(x1,y1);
          if(turno==2){
               movturno(x1,y1);
          }
          System.out.println("Tercer Turno");
           turno=3; 
           matrizjuego1(x2,y2);
          if(turno==3){
               movturno(x2,y2);
          }
          if(bb==0 && cc==7 || x1==0 && y1==7 || x2==0 && y2==7){
              l=1;
          }
        
       
      } while(l != 1);
                   break;
               
           }
           
           
            
                
                
       
         
        
       }else if(dificil.equals("dificil")){
           
           
           
            System.out.println(numjugadores);
           switch(numjugadores){
               case 2:
                   int l;
                   
                    turnos();
       matriz();
       bb=19;
       cc=0;
       x1=19;
       y1=0;
        x2=19;
       y2=0;
                   do{
                       l=0;
          System.out.println("Primer Turno");
          turno=1;
          matrizjuego1(bb,cc);
          if(turno==1){
               movturno1(bb,cc);
          }
          System.out.println("Segundo Turno");
           turno=2; 
           matrizjuego1(x1,y1);
          if(turno==2){
               movturno1(x1,y1);
          }
        
       if(bb==0 && cc==7 || x1==0 && y1==7 ){
              l=1;
          }
      } while(l!= 1);
                   break;
               case 3:
                    
                 
                    turnos();
       matriz();
       bb=19;
       cc=0;
       x1=19;
       y1=0;
        x2=19;
       y2=0;
                   do{
                         l=0;
          System.out.println("Primer Turno");
          turno=1;
          matrizjuego1(bb,cc);
          if(turno==1){
               movturno1(bb,cc);
          }
          System.out.println("Segundo Turno");
           turno=2; 
           matrizjuego1(x1,y1);
          if(turno==2){
               movturno1(x1,y1);
          }
          System.out.println("Tercer Turno");
           turno=3; 
           matrizjuego1(x2,y2);
          if(turno==3){
               movturno1(x2,y2);
          }
          if(bb==0 && cc==7 || x1==0 && y1==7 || x2==0 && y2==7){
              l=1;
          }
        
       
      } while(l != 1);
                   break;
               
           }
           
           
            
                
                
           
           
           
           
           
           
           
           
           
       }
               
             
    }                        
   public static void turnos ()
    { 
        int m;
        if(facil.equals("facil")){
            if(numjugadores==2)
            {   
               do{
                   m=0;
                 Random dado=new Random();
                 int aleatorio,aleatorio2;
                 aleatorio=dado.nextInt(2); 
                 aleatorio2=dado.nextInt(2);
                 if(aleatorio==aleatorio2){
                    m=1;
                 }else{
                     turno1[aleatorio]=jugador1;
                     turno1[aleatorio2]=jugador2;
                 }                
                    
                }while(m==1);
                          
                for(int i=0;i<2;i++){
                    System.out.println("Turno"+(i+1)+" "+turno1[i]);
                }
               
            } else if(numjugadores==3)
            {   
               do{
                   m=0;
                 Random dado=new Random();
                 int aleatorio,aleatorio2,aleatorio3;
                 aleatorio=dado.nextInt(3); 
                 aleatorio2=dado.nextInt(3);
                 aleatorio3=dado.nextInt(3);
                 if(aleatorio!= aleatorio2 && aleatorio != aleatorio3 && aleatorio2 != aleatorio3){
                    turno2[aleatorio]=jugador1;
                     turno2[aleatorio2]=jugador2;
                     turno2[aleatorio3]=jugador3;
                 }else{
                    m=1; 
                 }                
                    
                }while(m==1);
                          
                for(int i=0;i<3;i++){
                    System.out.println("Turno"+(i+1)+" "+turno2[i]);
                }
               
            }
          
        } else if(dificil.equals("dificil")){
            if(numjugadores==2)
            {   
               do{
                   m=0;
                 Random dado=new Random();
                 int aleatorio,aleatorio2;
                 aleatorio=dado.nextInt(2); 
                 aleatorio2=dado.nextInt(2);
                 if(aleatorio==aleatorio2){
                    m=1;
                 }else{
                     turno1[aleatorio]=jugador1;
                     turno1[aleatorio2]=jugador2;
                 }                
                    
                }while(m==1);
                          
                for(int i=0;i<2;i++){
                    System.out.println("Turno"+(i+1)+" "+turno1[i]);
                }
               
            } else if(numjugadores==3)
            {   
               do{
                   m=0;
                 Random dado=new Random();
                 int aleatorio,aleatorio2,aleatorio3;
                 aleatorio=dado.nextInt(3); 
                 aleatorio2=dado.nextInt(3);
                 aleatorio3=dado.nextInt(3);
                 if(aleatorio!= aleatorio2 && aleatorio != aleatorio3 && aleatorio2 != aleatorio3){
                    turno2[aleatorio]=jugador1;
                     turno2[aleatorio2]=jugador2;
                     turno2[aleatorio3]=jugador3;
                 }else{
                    m=1; 
                 }                
                    
                }while(m==1);
                          
                for(int i=0;i<3;i++){
                    System.out.println("Turno"+(i+1)+" "+turno2[i]);
                }
               
            } else if(numjugadores==4)
            {   
               do{
                   m=0;
                 Random dado=new Random();
                 int aleatorio,aleatorio2,aleatorio3,aleatorio4;
                 aleatorio=dado.nextInt(4); 
                 aleatorio2=dado.nextInt(4);
                 aleatorio3=dado.nextInt(4);
                  aleatorio4=dado.nextInt(4);
                 if(aleatorio!= aleatorio2 && aleatorio != aleatorio3 && aleatorio != aleatorio4 && aleatorio2!= aleatorio3  && aleatorio2!= aleatorio4  && aleatorio3!= aleatorio4){
                     turno3[aleatorio]=jugador1;
                     turno3[aleatorio2]=jugador2;
                     turno3[aleatorio3]=jugador3;
                     turno3[aleatorio4]=jugador4;
                 }else{
                    m=1; 
                 }                
                    
                }while(m==1);
                          
                for(int i=0;i<4;i++){
                    System.out.println("Turno"+(i+1)+" "+turno3[i]);
                }
               
            }
          
        }
        
    }  
   public static void matrizjuego1(int pos, int pos2)
   {
      if(facil.equals("facil")){         
          
          switch(turno){
              case 1:
                   for(int i=0;i<5;i++){
           for(int j=0;j<8;j++){          
           matriz1b[i][j]=matriz1a[i][j];
           
       }
       }       if(numjugadores==2){
                matriz1b[x1][y1]=Character.toString(turno1[1]);
                matriz1b[pos][pos2]=Character.toString(turno1[0]);  
                } else if(numjugadores==3){
                matriz1b[x2][y2]=Character.toString(turno2[2]);
                matriz1b[x1][y1]=Character.toString(turno2[1]);
                matriz1b[pos][pos2]=Character.toString(turno2[0]);  
                }               
               
                for(int i=0;i<5;i++){
                for(int j=0;j<8;j++){
                System.out.print(matriz1b[i][j]);
                System.out.print("   ");
                
            }
           System.out.println("   ");     
        }
                  break;
              case 2:
                   for(int i=0;i<5;i++){
           for(int j=0;j<8;j++){          
           matriz1b[i][j]=matriz1a[i][j];
       }
       }
                   if(numjugadores==2){
                matriz1b[bb][cc]=Character.toString(turno1[0]); 
                matriz1b[pos][pos2]=Character.toString(turno1[1]);
                } else if(numjugadores==3){
                matriz1b[bb][cc]=Character.toString(turno2[0]); 
                matriz1b[x2][y2]=Character.toString(turno2[2]);
                matriz1b[pos][pos2]=Character.toString(turno2[1]);
                
                }
                
               
                for(int i=0;i<5;i++){
                for(int j=0;j<8;j++){
                System.out.print(matriz1b[i][j]);
                System.out.print("   ");
                
            }
           System.out.println("   ");     
        }
                  break;
              case 3:
                   for(int i=0;i<5;i++){
           for(int j=0;j<8;j++){          
           matriz1b[i][j]=matriz1a[i][j];
       }
       }       
                               
                matriz1b[bb][cc]=Character.toString(turno2[0]);
                matriz1b[x1][y1]=Character.toString(turno2[1]);
                matriz1b[pos][pos2]=Character.toString(turno2[2]);
                for(int i=0;i<5;i++){
                for(int j=0;j<8;j++){
                System.out.print(matriz1b[i][j]);
                System.out.print("   ");
                
            }
           System.out.println("   ");     
        }
                  break;
                  
              
          }
          
         
                  
                
     
   }else if(dificil.equals("dificil")){
       
       switch(turno){
              case 1:
                   for(int i=0;i<20;i++){
           for(int j=0;j<10;j++){          
           matriz2b[i][j]=matriz2a[i][j];
           
       }
       }       if(numjugadores==2){
                matriz2b[x1][y1]=Character.toString(turno1[1]);
                matriz2b[pos][pos2]=Character.toString(turno1[0]);  
                } else if(numjugadores==3){
                matriz2b[x2][y2]=Character.toString(turno2[2]);
                matriz2b[x1][y1]=Character.toString(turno2[1]);
                matriz2b[pos][pos2]=Character.toString(turno2[0]);  
                }               
               
                for(int i=0;i<20;i++){
                for(int j=0;j<10;j++){
                System.out.print(matriz2b[i][j]);
                System.out.print("   ");
                
            }
           System.out.println("   ");     
        }
                  break;
              case 2:
                   for(int i=0;i<20;i++){
           for(int j=0;j<10;j++){          
           matriz2b[i][j]=matriz2a[i][j];
       }
       }
                   if(numjugadores==2){
                matriz2b[bb][cc]=Character.toString(turno1[0]); 
                matriz2b[pos][pos2]=Character.toString(turno1[1]);
                } else if(numjugadores==3){
                matriz2b[bb][cc]=Character.toString(turno2[0]); 
                matriz2b[x2][y2]=Character.toString(turno2[2]);
                matriz2b[pos][pos2]=Character.toString(turno2[1]);
                
                }
                
               
                for(int i=0;i<20;i++){
                for(int j=0;j<10;j++){
                System.out.print(matriz2b[i][j]);
                System.out.print("   ");
                
            }
           System.out.println("   ");     
        }
                  break;
              case 3:
                   for(int i=0;i<20;i++){
           for(int j=0;j<10;j++){          
           matriz2b[i][j]=matriz2a[i][j];
       }
       }       
                               
                matriz2b[bb][cc]=Character.toString(turno2[0]);
                matriz2b[x1][y1]=Character.toString(turno2[1]);
                matriz2b[pos][pos2]=Character.toString(turno2[2]);
                for(int i=0;i<20;i++){
                for(int j=0;j<10;j++){
                System.out.print(matriz2b[i][j]);
                System.out.print("   ");
                
            }
           System.out.println("   ");     
        }
                  break;
                  
              
          }
          
        
   }  
       
   }
   public static void movturno1(int b, int c)
    {
        Scanner waitForKeypress = new Scanner(System.in);
        System.out.println("Presione enter para tirar el dado"); 
        waitForKeypress.nextLine();
        Random dado=new Random();
                int aleatorio,j,m;
                do{
                     m=0;
                     aleatorio=dado.nextInt(12);
                     if(aleatorio>=1 && aleatorio<=12){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Se moverá "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        int d;
        int cont=0;
  
        if(b % 2==0){
        do{         
                 if(c==9){
                 }else{
                   c=c+1; 
                 }
                    
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==9 && d>0){
                        b=b-1;
                          for(int i=1;i<=d;i++){
                          c=c-1; 
                          cont=cont+1;
                        }
                     } else if(d<=0){
                        d=0;
                    }
          }while(d!=0);
        
        
        int n;
            
                n=0;
        if(matriz2a[b][c].equals("+")){
                     do{
                     m=0;
                     aleatorio=dado.nextInt(12);
                     if(aleatorio>=1 && aleatorio<=12){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial subiras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        cont=0;
        
        do{         
                 if(c==9){
                 }else{
                   c=c+1; 
                 }
                    
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==9 && d>0){
                        b=b-1;
                          for(int i=1;i<=d;i++){
                          c=c-1; 
                          cont=cont+1;
                        }
                     } else if(d<=0){
                        d=0;
                    }
          }while(d!=0);
        }else if (matriz2a[b][c].equals("-")){
             do{
                     m=0;
                     aleatorio=dado.nextInt(12);
                     if(aleatorio>=1 && aleatorio<=12){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial bajaras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        cont=0;
            do{         
                if(c==0){
                 
                }else{
                c=c-1;
            }
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==0 && d>0){
                        b=b+1;
                        for(int i=0;i<d;i++){
                          c=c+1; 
                          cont=cont+1;
                        }
                        
                    } else if(d<=0){
                        d=0;
                    }
         }while(d!=0);
        }
           
        
          matrizjuego1(b,c); 
           switch(turno){
            case 1:
                 bb=b;
                 cc=c; 
                break;
            case 2:
                x1=b;
                y1=c;
                break;
            case 3:
                x2=b;
                y2=c;
                break;
        }
            
        }else if (b % 2 !=0){
            do{         
                if(c==0){
                 
                }else{
                c=c-1;
            }
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==0 && d>0){
                        b=b-1;
                        for(int i=0;i<d;i++){
                          c=c+1; 
                          cont=cont+1;
                        }
                        
                    } else if(d<=0){
                        d=0;
                    }
         }while(d!=0);
            int n;
           
         if(matriz2a[b][c].equals("+")){
                     do{
                     m=0;
                     aleatorio=dado.nextInt(12);
                     if(aleatorio>=1 && aleatorio<=12){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial subiras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
          n=0;
             do{         
                if(c==0){
                 
                }else{
                c=c-1;
            }
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==0 && d>0){
                        b=b-1;
                        for(int i=0;i<d;i++){
                          c=c+1; 
                          cont=cont+1;
                        }
                        
                    } else if(d<=0){
                        d=0;
                    }
         }while(d!=0);
        }else if(matriz2a[b][c].equals("-")){
            do{
                     m=0;
                     aleatorio=dado.nextInt(12);
                     if(aleatorio>=1 && aleatorio<=12){
                          
                     }else
                     {
                         m=1;
                     }                
                 }while(m==1);
        System.out.println("Caiste en una casilla especial bajaras "+aleatorio+" casillas presione enter para moverse"); 
        waitForKeypress.nextLine();
        cont=0;
         do{     
              
                 if(c==9){
                 }else{
                   c=c+1; 
                 }
                    
                    cont=cont+1;   
                    d=aleatorio-cont; 
                    if(c==9 && d>0){
                        b=b+1;
                          for(int i=1;i<=d;i++){
                          c=c-1; 
                          cont=cont+1;
                        }
                     } else if(d<=0){
                        d=0;
                    }
          }while(d!=0);
         }
                 
         
           
         matrizjuego1(b,c);
        switch(turno){
            case 1:
                 bb=b;
                 cc=c; 
                break;
            case 2:
                x1=b;
                y1=c;
                break;
            case 3:
                x2=b;
                y2=c;
                break;
        }
         }
        
    }
}
