package Prog_14072024;

public class Lab045 {
    public static void main(String[] args) {
        String password = "Sudhir@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);

        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));

        System.out.println(password.substring(0,3));
    }
}
