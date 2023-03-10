import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) throws Exception {
        for (int i=1; i<=11; i++){
            if (i%2 == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //NO 2
        for(int i=20; i>=0; i-=5){
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
}