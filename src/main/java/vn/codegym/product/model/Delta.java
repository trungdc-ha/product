package vn.codegym.product.model;

public class Delta {

    public static String lang;
    static {
        lang = "VN";
    }


    static boolean foo(char c) {

        System.out.print(c);

        return true;

    }

    public static void main(String[] args) {

        int i = 1;
        while (i < 5) {
            if (i % 3 != 0) {
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }

}
