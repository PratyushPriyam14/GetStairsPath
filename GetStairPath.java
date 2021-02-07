import java.util.*;
import java.io.*;
public class GetStairPath
{
    public static void main(String[]args)throws Exception
    {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     ArrayList<String>paths=getstairpath(n);
     System.out.println(paths);
    }
    public static ArrayList<String>getstairpath(int n)
    {//positive base case that we reach to ground that is we are from 4 to 0
     if(n==0){
         ArrayList<String>baseresult=new ArrayList<>();
         baseresult.add(" ");
         return baseresult;
     }
     //negative base case here we reach to some negative value
     else if(n<0){
         ArrayList<String>baseresult=new ArrayList<>();
         return baseresult;
     }
     //Assumption that n-1, n-2,n-3  will find their path
     ArrayList<String>paths1=getstairpath(n-1);
     ArrayList<String>paths2=getstairpath(n-2);
     ArrayList<String>paths3=getstairpath(n-3);
     //myresult
        ArrayList<String>paths=new ArrayList<>();
        for(String path:paths1){
            paths.add(1+path);
        }
        for(String path:paths2){
            paths.add(2+path);
        }
        for(String path:paths3){
            paths.add(3+path);
        }
        return paths;
    }
}
