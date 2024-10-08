package Program;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Entity.Clear;
import Entity.Count;
import Excptions.InvalidParametersException;

public class App {
    public static void main(String[] args) throws InvalidParametersException, InterruptedException, IOException {
       Scanner sc =new Scanner (System.in);
       int parameterTwo;
       int parameterOne;

       try{
            do {
                System.out.println("Digite o Primeiro numero : ");
                parameterOne = sc.nextInt();
                System.out.println("Digite o Segundo numero :");
                parameterTwo = sc.nextInt();
                if(parameterOne < parameterTwo){
                    System.out.println("Erro: o primeiro numero deve ser maior que o segundo");
                    Clear.terminalClear();
                }
            } while (parameterOne < parameterTwo);
            Count.count(parameterOne, parameterTwo);       
       }catch(InputMismatchException e){
        System.out.println("Erro:Deve informar apenas numeros");
       }

       sc.close();
    }
    
}