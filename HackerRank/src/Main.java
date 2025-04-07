import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayCompleto= new ArrayList<>();
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese cantidad variables: ");
        int n = lectura.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            Scanner valores = new Scanner (System.in);
            System.out.println("Ingrese valores: ");
            int val = valores.nextInt();
            myArray[i] = val;
            arrayCompleto.add(val);
            System.out.println("Se agrego: " + val + " a tu matriz");
        }
        System.out.println("Valores del Array");
        System.out.println(arrayCompleto);
    }}