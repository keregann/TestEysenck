import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by keregann on 8/8/15.
 */
public class Print {

    public static void printGeneralInstruction() {
        System.out.println("Cititi cu atentie ficare intrebare si raspundeti" +
                " prin DA sau NU (Dupa afisara intrebarii pe ecran introduceti " +
                "de la tastatura raspunsul: litera \" y \" pentru DA sau litera \" n \" pentru NU)" +
                "in functie de faptul daca continutul ei corespunde sau nu cu felul dumneavoastra" +
                "de a fi. Este in interesul dumneavoastra sa nu pierdeti prea mult timp la nici o intrebare" +
                ". Fiti atent pentru a nu omite nici una din intrebari. NU exista intrebari juste sau nejuste," +
                " prezentul chestionar reprezinta doar o masura a modelului in care dumneavoastra va comportati");
    }

    public static void printItemEntryInstruction(){
        System.out.println("Introduceti de la tastatura raspunsul: litera \" y \" pentru DA sau litera \" n \" pentru NU ");
    }

    public static void printItemQuestion(int itemNumber){
        System.out.println(ItemsMapImpl.itemList.get(itemNumber).getQuestion());
    }



}
