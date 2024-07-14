package Prog_14072024;

public class Lab027 {
    public static void main(String[] args) {

        byte b= 10;

        int i = b;
      //  int i = b; //Implicit casting -JVM
       int a1 = (int)b; //vaid explicit
        System.out.println(a1);
        //Narrowing
        int val =300;
        byte b1 =(byte)val;
        System.out.println(b1);


    }
}
