import java.util.StringJoiner;

public class Anagram {
    public String getAnagram(String input){
        final String SPACE = " ";
        String inputArray[] = input.split(SPACE);
        StringJoiner output = new StringJoiner(SPACE    );
        for(int a = 0; a < inputArray.length;a++) {
            int count = 0;
            char chars[] = new char[inputArray[a].length()];
            char chars_out[] = new char[inputArray[a].length()];
            for (int i = 0; i < inputArray[a].length(); i++) {
                if (Character.isAlphabetic(inputArray[a].charAt(i))) {
                    chars[count] = inputArray[a].charAt(i);
                    count++;
                }
            }
            count--;
            for (int i = 0; i < inputArray[a].length(); i++) {
                if (Character.isAlphabetic(inputArray[a].charAt(i))) {
                    chars_out[i] = chars[count];
                    count--;
                } else
                    chars_out[i] = inputArray[a].charAt(i);
            }
            output.add(new String(chars_out));
        }
        return output.toString();
    }
}
