public class Main {
    public static void main(String[] args) {
        AnagramTwo anagramTwo = new AnagramTwo();
        AnagramOne anagramOne = new AnagramOne();
        System.out.println(anagramTwo.getAnagram("App2lic1ation support!ing th!e for3ei4gn adminis12tration of a current2ly selected stu321dies."));
        System.out.println(anagramOne.getAnagram());
    }
}
