public class Main {
    public static void main(String[] args) {

        int ideal=0, sobre=0, bajo=0, mayor=0, cantPers=2;
        double imc=0;

        Persona [] PPP= new Persona[cantPers];

        ServicioPersona servicioPersona = new ServicioPersona();

        for (int i = 0; i < cantPers ; i++) {
            PPP [i] =servicioPersona.crearPersona();
            imc=servicioPersona.calculoIMC();

            if (servicioPersona.esMayor()){
                mayor++;
                System.out.println("es adulto");
            }

            if (imc==1){
                sobre++;
                System.out.println("tiene sobre peso");
            } else if (imc==0) {
                ideal++;
                System.out.println("ideal");

            } else {
                bajo++;
                System.out.println("tiene BAJO peso");
            }

        }

        System.out.println("hay "+ mayor++ + "cantidad de personas mayor de edad");
        double r = sobre/cantPers;
        System.out.println("Hay "+ sobre+ " cantidad de personas con sobrepeso");
        r= ideal/cantPers;
        System.out.println("Hay "+ ideal+ " cantidad de personas peso ideal");
        r= bajo/cantPers;
        System.out.println("Hay "+ bajo+ " cantidad de personas debajo de su peso ideal");











    }
}