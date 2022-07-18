import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int speedOfPlayer = 0;
        boolean res = GameClass.passes(speedOfPlayer);
        System.out.println("Result: " + res);

        int[] speed = {
                0,
                2,
                3,
                5,
                8
        };
        int count = GameClass.first(speed);

        System.out.println(count);

        int[] second = GameClass.second(speed);

        System.out.println(Arrays.toString(second));

        int[] three = GameClass.three(speed);

        System.out.println(Arrays.toString(three));
    }

}