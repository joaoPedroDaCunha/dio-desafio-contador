package Entity;

import java.io.IOException;

public class Clear {
    public static void terminalClear() throws InterruptedException, IOException{
        if(System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }else{
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }
}
