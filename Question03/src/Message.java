import java.util.Scanner;
import java.util.regex.*;

public class Message {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("*** Expression Program ***\n");
        System.out.println("Please, input a message: ");
        String ExpressionMsg = read.nextLine();

        Pattern funny = Pattern.compile(":-)", Pattern.LITERAL);
        Pattern angry = Pattern.compile(":-(", Pattern.LITERAL);

        Matcher funnyExpressionMsg = funny.matcher(ExpressionMsg);
        Matcher angryExpressionMsg = angry.matcher(ExpressionMsg);

        long funnyMsg = funnyExpressionMsg.results().count();
        long angryMsg = angryExpressionMsg.results().count();

        if (funnyMsg > angryMsg) {
            System.out.println("Output: Funny");
        } else if (angryMsg > funnyMsg) {
            System.out.println("Output: Angry");
        } else {
            System.out.println("Output: Neuter");
        }
    }
}

