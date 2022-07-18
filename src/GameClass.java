public class GameClass {

    public static boolean passes(int speed) {
        boolean isGreenLight = false;
        if (isGreenLight) {
            return true;
        }
        return speed == 0;
    }

    public static int first(int[] speed) {
        int count = 0;
        for (int i = 0; i < speed.length; i++) {
            if (!passes(speed[i])) {
                count++;
            }
        }
        return count;
    }

    public static int[] second(int[] speed) {
        int count = first(speed);
        int[] result = new int[count];
        for (int i = 0; i < speed.length; i++) {
            if (!passes(speed[i])) {
                result[i - 1] = speed[i];
            }
        }
        return result;

    }

    public static int[] three(int[] speed) {
        int count = speed.length -  first(speed);
        int[] result = new int[count];
        for (int i = 0; i < speed.length; i++) {
            if (passes(speed[i])) {
                result[i] = speed[i];
            }
        }
        return result;
    }
}