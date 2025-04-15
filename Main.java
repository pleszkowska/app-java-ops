public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello user!\n");

       String[] names = {"Piotr", "Anna", "Jan", "Leszek"};

       for (int i = 1; i<=4; i++) {
           System.out.println(i + ". "+ names[i - 1]);

       }
    }
}
