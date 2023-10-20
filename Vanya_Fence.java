import java.util.*;
public class Vanya_Fence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int h=sc.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            int hn=sc.nextInt();
            if(hn>h){
                count+=2;
            }
            else if(hn<=h){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
