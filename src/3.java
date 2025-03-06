import java.util.Random;
public class MathHomework {
private static final Random RANDOM = new Random();
private static int[] getRandomNumbers(int n) {
int[] numbers = new int[n];
for (int i = 0; i < n; i++) {
numbers[i] = RANDOM.nextInt(10);
}
return numbers;
}
public static void main(String[] args) {
int[] numbers = getRandomNumbers(5);
System.out.println(Arrays.toString(numbers));
}
}