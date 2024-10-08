package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

import Excptions.InvalidParametersException;

public class App {
    public static void main(String[] args) throws InvalidParametersException {
       Scanner sc =new Scanner (System.in);

       try{
            do {
                System.out.println("Digite o Primeiro numero : ");
                int parameterOne = sc.nextInt();
                System.out.println("Digite o Segundo numero :");
                int parameterTwo = sc.nextInt();
                
            } while (condition);        
       }catch(InputMismatchException e){
        System.out.println("Deve informar apenas numeros");
       }

       sc.close();
    }
    
}