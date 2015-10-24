import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by keregann on 8/28/15.
 */
public class InputAnswer {


    public static Character inputAnswer() {

        Character answer = 0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            do {
                answer = reader.readLine().charAt(0);
            }
            while (!isValid(answer));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }


    public static boolean isValid(Character answer4validate) throws IOException {
        answer4validate = Character.toLowerCase(answer4validate);
        if (answer4validate.equals('y') || answer4validate.equals('n') || answer4validate.equals('s')) {
            return true;
        } else {
            System.out.println("Reintrodu raspunsul (y/n/s):");
            return false;
        }
    }
}
