import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AnagramOne {
    public String getAnagram() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null, output;
        try {
            input = reader.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        String inputArray[] = input.split(" ");
        String outputArray[] = new String[inputArray.length];
        for (int a = 0; a < inputArray.length; a++) {
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
            outputArray[a] = new String(chars_out);
        }
        output = String.join(" ", outputArray);
        return output;

    }
}
