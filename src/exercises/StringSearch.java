package exercises;
import java.util.Scanner;

public class StringSearch {
    public static void main(String [] args){
        String book = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";
        book = book.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("What word would you like to search for?");
        String word = input.nextLine();
        word = word.toLowerCase();

        if (book.contains(word)) {
            System.out.println(book.substring(0, book.indexOf(word)).concat(book.substring(book.indexOf(word)+word.length())));
        };


    }
}
