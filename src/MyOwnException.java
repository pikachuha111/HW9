public class MyOwnException extends Exception{
    public MyOwnException(String mark, int number) {
        System.out.println(mark + " не завелась - " + number);
    }
}
