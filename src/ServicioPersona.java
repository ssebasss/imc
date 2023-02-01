import java.util.Scanner;

public class ServicioPersona {

double peso, altura;
int edad;
char sexo;

public Persona crearPersona(){
    Scanner sc = new Scanner(System.in);
    System.out.println("ingrese nombre");
    String nombre= sc.next();
    System.out.println("");
    System.out.println("ingrese su edad");
    edad= sc.nextInt();
    System.out.println("");
    System.out.println("ingrese sexo");
    sexo= sc.next().charAt(0);
    while (sexo != 'F' && sexo != 'M' && sexo != 'O' ){
        System.out.println("ingrese nuevamente");
        sexo= sc.next().charAt(0);
    }
    System.out.println("Ud ingresó "+sexo);
    System.out.println("");
    System.out.println("ingrese su peso");
    peso= sc.nextDouble();
    System.out.println("");
    System.out.println("ingrese su altura");
    altura= sc.nextDouble();


    return new Persona();
}

public int calculoIMC(){
    double imc= (peso/(altura*altura))*10000;
    if (imc<20){
    return -1;
    } else if (imc>=20 && imc<=25) {
        return 0;
    }
    return 1;
}

public boolean esMayor(){
    return edad>=18;
    }
}









