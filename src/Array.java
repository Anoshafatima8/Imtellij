public class Array {
    public static void main(String[] args) {
        int[]marks={55,45,32,12,67};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("REVERSE ORDER");
        for (int i=marks.length-1;i>=0;i--) {
            System.out.println(marks[i]);
        }
    }
}
