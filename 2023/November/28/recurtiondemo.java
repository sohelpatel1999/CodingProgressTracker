public class recurtiondemo {

    static int pow(int num, int power) {

        if (power == 0) {
            return 1;
        }
        System.out.println(power);

        int result = pow(num, power / 2);

        if (power % 2 == 0) {
            System.out.println("if : " + power);

            return result * result;
        } else {
            System.out.println("else : " + power);
            return result * result * num;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println(pow(2, 5));
    }

}
