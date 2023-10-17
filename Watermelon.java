
import java.util.Scanner;
public class Watermelon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        if(w%2==0 && w!=2){
            System.out.println("Yes");
        }
        else if(w%2!=0){
            System.out.println("NO");
        }
        else if(w==2){
            System.out.println("NO");
        }
    }
}
