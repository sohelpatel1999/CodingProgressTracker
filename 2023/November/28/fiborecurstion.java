/**
 * fiborecurstion
 */
public class fiborecurstion {

    static int fibo(int num) {

        if (num == 1 || num == 0) {
            return num;
        }

        int answer = fibo(num - 1);
        int answer2 = fibo(num - 2);

        return answer + answer2;
    }

    public static void main(String[] args) {

        int answer = fibo(3);
        System.out.println(answer);

    }

}