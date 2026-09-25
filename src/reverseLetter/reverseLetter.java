package reverseLetter;

public class reverseLetter {
    public static void main(String[] args) {
        //инициализируем строку
        String inputString = "J@va the be$t!123";
        //инициализируем объект класса Reverse
        Reverse reverse = new Reverse();

        //вызыва
        String result = reverse.ReversePhrase(inputString);

        //печатаем результат
        System.out.println(result);
    }
}
