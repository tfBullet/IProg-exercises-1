package Aufgaben04;
import java.io.*;

/**
 * Created by Markus on 02.11.15.
 */

class InteractiveIO {
    private BufferedReader br;

    public InteractiveIO() {
        br =  new BufferedReader(new InputStreamReader(System.in));
    }

    
    public void write(String s) {
        this.writeAndFlush(s);
    }

    public String promptAndRead(String s) throws Exception {
        this.writeAndFlush(s);

        return br.readLine();
    }



    private void writeAndFlush(string s){
        System.out.println(s);
        System.out.flush();
    }
}