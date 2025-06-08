public class StringMethod {
    public static void main(String [] args) {
        String name = "Faruk Idris";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('I');
        int lastIndex = name.lastIndexOf('k');
        String nameToUpper = name.toUpperCase();
        String nameToLower = name.toLowerCase();
        String nameWithNoSpace = name.trim();

        name = name.replace("k", "q");
        //name.isEmpty();

        System.out.println("Length of name is: " + length);
        System.out.println("The letter at index [0] is: " + letter);
        System.out.println("Index of I is: " + index);
        System.out.println("Last index of 'k' is " + lastIndex);
        System.out.println("Name to upper case: " + nameToUpper);
        System.out.println("Name to lower case: " + nameToLower);
        System.out.println("Name without whitespace: " + nameWithNoSpace);
        System.out.println("Name (k replaced with q): " +  name);
    }
}