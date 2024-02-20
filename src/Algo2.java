import java.util.Arrays;

void main() {
    printDigits(100);   // [1, 0, 0]
    printDigits(1250);  // [1, 2, 5, 0]
    printDigits(10);    // [1, 0]
}
void printDigits(int number) {
  //With String API
    System.out.println(Arrays.toString(String.valueOf(number).toCharArray()));

    int power = 1;
    int count = 0;
    while ((number / (power *= 10)) != 0) count++;
    power /= 10;
    System.out.print("[");
    while (count-- >= 0) {
        System.out.print(STR."\{number / power}, ");
        number %= power;
        power /= 10;
    }
    System.out.println("\b\b]");
}

