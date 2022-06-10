class Main {
    public static void main(String[] args) {

        int speedOfPlayer = 2;

        boolean isGreenLight = false;

        if (isGreenLight) {
            System.out.println("Не выбыл");
        } else {
            if (speedOfPlayer == 0) {
                System.out.println("Не выбыл");
            }
            if (speedOfPlayer >= 1) {
                System.out.println("Выбыл");
            }
        }
    }
}