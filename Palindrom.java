import java.util.*;
public class Palindrom{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter a string : ");
        String str=sc.nextLine();

        int i=0;
        int j=str.length();
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
        }
        System.out.println(flag);


        sc.close();
    }
}