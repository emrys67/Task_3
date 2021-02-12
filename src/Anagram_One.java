import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Anagram_One {
    public String getAnagram(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null, output;
        int count = 0;
        try {
            input = reader.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        char chars[] = new char[input.length()];
        char chars_out[] = new char[input.length()];
        for(int i = 0; i < input.length();i++){
            if(Character.isAlphabetic(input.charAt(i))){
                chars[count] = input.charAt(i);
                count++;
            }
        }
        count--;
        for(int i = 0;i < input.length();i++){
            if(Character.isAlphabetic(input.charAt(i))){
                chars_out[i] = chars[count];
                count--;
            }
            else
                chars_out[i] = input.charAt(i);
        }
        output = new String(chars_out);
        return output;
    }

    public static void main(String[] args) {
        Anagram_One a = new Anagram_One();
        System.out.println(a.getAnagram());

    }
}
