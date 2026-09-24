package reverseLetter;

public class reverseLetter {
    public static void main(String[] args) {
        String inputString = "J@va the be$t!123";

        String result = reverseLetters(inputString);

        System.out.println(result);
    }
    public static String reverseLetters(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }

            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            char tmp = chars[left];     // меняем местами края
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;                     // сдвигаем указатели навстречу
            right--;

        }
        return new String(chars);
    }
}
