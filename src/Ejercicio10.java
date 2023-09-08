import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el número de inscripción: ");
        int num_inscripcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingrese los nombres: ");
        String nombre = entrada.nextLine();
        System.out.println("ingrese el patrimonio: ");
        double patrimonio = entrada.nextDouble();
        System.out.println("ingrese el estrato social: ");
        int estrato = entrada.nextInt();
        double pago_matricula = 50000;
        if(patrimonio > 2000000 && estrato >3){
            pago_matricula += patrimonio*0.03;
        }
        System.out.println("El estudiante con numero de inscripcion "+num_inscripcion+" y" +
                " nombre "+nombre+" debe de pagar "+pago_matricula);
    }
}