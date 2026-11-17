public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String value : args) { 
            char firstChar = value.charAt(0);
            int asciiValue = (int) firstChar;
            if (asciiValue % 5 == 0) {
                System.out.println(firstChar);
                
            }
        }
    }
}
