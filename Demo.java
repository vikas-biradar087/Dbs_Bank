public class I {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;

        // Modifying str1
        str1 = str1.concat(" World");

        // Printing both strings
        System.out.println("str1: " + str1); // Output: str1: Hello World
        System.out.println("str2: " + str2); // Output: str2: Hello
    }
}
