import java.util.*;
public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.next());
        int count=0,count1=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            int as=(int)str.charAt(i);
            if(as>=97 && as<=122){
                count++;
            }
            else if(as>=65 && as<=90){
                count1++;
            }
        }
        if(count>count1){
            System.out.println(str.toLowerCase());
        }
        else if(count1>count){
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
}
