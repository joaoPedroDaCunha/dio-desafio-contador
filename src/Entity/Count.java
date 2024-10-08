package Entity;

public class Count {
    
    public static void count(int parameterOne,int parameterTwo){

        int count = parameterOne - parameterTwo;

        for(int i =0;i<count;i++){
            System.out.println("Imprimindo o número "+(i+1));
        }

    }
    
}