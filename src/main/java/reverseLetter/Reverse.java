package reverseLetter;

public class Reverse {
     String phrase;

     public String ReversePhrase(String phraseInput) {
         char[] chars = phraseInput.toCharArray();
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
