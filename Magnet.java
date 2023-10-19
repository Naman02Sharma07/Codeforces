import java.util.*;
public class Magnet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0,count1=0;
        String arr[]=new String[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.next();
        }
//        System.out.println("Your arr is");
        for(int i=0;i<num;i++){
//            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<num-1;i++){
            if(!arr[i].equals(arr[i+1])){
                count++;
//                System.out.println(count+" count");
            }
        }
        System.out.println(count+1);
    }
}
