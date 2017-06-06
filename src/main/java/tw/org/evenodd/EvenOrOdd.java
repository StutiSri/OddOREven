package tw.org.evenodd;

/**
 * Created by stutis on 6/6/17.
 */
public class EvenOrOdd {
    public boolean isEven(int number) {
        return (number%2 == 0);
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.print(evenOrOdd.isEven(5));
    }
}
