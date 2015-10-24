/**
 * Created by keregann on 10/24/15.
 */
public class Item {
    private int number;
    private String question;
    private Character expectedAnswer;
    private Character enteredAnswer;

    public Item(int number, String question, char expectedAnswer) {
        this.number = number;
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public char getExpectedAnswer() {
        return expectedAnswer;
    }

    public void setExpectedAnswer(char expectedAnswer) {
        this.expectedAnswer = expectedAnswer;
    }

    public Character getEnteredAnswer() {
        return enteredAnswer;
    }

    public void setEnteredAnswer(Character enteredAnswer) {
        this.enteredAnswer = enteredAnswer;
    }
}
