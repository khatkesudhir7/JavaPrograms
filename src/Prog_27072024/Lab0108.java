package Prog_27072024;

public class Lab0108 {
    public static void main(String[] args) {

        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        // elements are fixed.
        // len -> 6
        // who index - 3 ->
        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(marks_10_board[10]);


    }
}