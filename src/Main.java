class Main {
    public static void main(String[] args) {

        int speedOfPlayer = 5;

        boolean isGreenLight = true;

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