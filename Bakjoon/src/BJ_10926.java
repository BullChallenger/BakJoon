import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10926 {
    public static void BJ_10926Test(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println(br.readLine()+"??!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}