import java.util.*;
public class beautiful_year {
    public static void main(String[] args) {
        int num=2002;
        ArrayList<Integer> A1=new ArrayList<>();
        while(num!=0){
            int r=num%10;
            A1.add(r);
            num=num/10;
        }
        HashSet<Integer>H1=new HashSet<>(A1);
        if(H1.size()==4){

        }
    }
}
