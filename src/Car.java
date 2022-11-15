import java.util.Random;

public class Car {
    private String mark;
    private int speed;
    private int cost;
    private int number;
    Random random = new Random();

    public Car(String mark, int speed, int cost) {
        this.mark = mark;
        this.speed = speed;
        this.cost = cost;
    }

    private void start() throws MyOwnException {
        number = random.nextInt(21);
        if (number % 2 == 0) {
            throw new MyOwnException(mark, number);
        } else System.out.println(mark + " завелась - " + number);
    }

    public void zavod() {
        try {
            start();
        } catch (MyOwnException e) {
            e.printStackTrace();
        }

    }

}
