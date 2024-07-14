package Prog_14072024;

public class Lab042 {
    public static void main(String[] args) {
        String s1 = new String("Sudhir");
        String s2 = new String("Sudhir");
        String s3 = new String("Sudhir");

        System.out.println(s1 == s2);  //ref
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));  //Content
    }
}
