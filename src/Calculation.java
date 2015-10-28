/**
 * Created by keregann on 8/28/15.
 */
public class Calculation {

        int extraversion = 0;
        int nevrotism = 0;
        int sincerity = 0;
        int extroversionLevel = 0;
        int nevroticismLevel = 0;

        Integer[] extArray = {1, 3, 5, 8, 10, 13, 15, 17, 20, 22, 25, 27, 29, 32, 34, 37, 39, 42, 44, 46, 49, 51, 53, 56};
        Integer[] nevArray = {2, 4, 9, 11, 14, 16, 19, 21, 23, 26, 28, 31, 33, 35, 38, 40, 43, 45, 47, 50, 52, 55, 57};
        Integer[] sincerityArray = {6, 12, 18, 24, 30, 36, 42, 48, 54 };

        // TODO result function here (is done or not?)

      public void   calculateResults(){
          for (int i = 0; i < extArray.length; i++) {
            Item item = ItemsMapImpl.itemList.get(extArray[i]);
            if (item.getEnteredAnswer().equals(item.getExpectedAnswer())) {
                extraversion++;
            }
        }

        for (int i = 0; i < nevArray.length; i++) {
            Item item = ItemsMapImpl.itemList.get(nevArray[i]);
            if (item.getEnteredAnswer().equals(item.getExpectedAnswer())) {
                nevrotism++;
            }
        }

        if (extraversion >= 1 && extraversion <=7 ){
            extroversionLevel = 1;
        } else if(extraversion >= 8 && extraversion <=11){
             extroversionLevel = 2;
        } else if(extraversion >= 12 && extraversion <= 18){
            extroversionLevel = 3;
        } else if(extraversion >= 19 && extraversion <= 24){
            extroversionLevel = 4;
        }

         if (nevrotism >= 1 && nevrotism <= 10){
             nevroticismLevel = 1;
         } else if (nevrotism >= 11 && nevrotism <= 14){
             nevroticismLevel =  2;
         } else if (nevrotism >= 15 && nevrotism <= 18){
             nevroticismLevel = 3;
         } else if (nevrotism >= 19 && nevrotism <= 24){
             nevroticismLevel = 4;
         }
          // TODO change sout expresions with ENUMS or Strings from TemperamentTypes Class
         if(extroversionLevel == 1 && nevroticismLevel == 1){
             System.out.println("introversiune considerabila - stabilitate emotionala ridicata");
         } else if (extroversionLevel == 1 && nevroticismLevel == 2){
             System.out.println("introversiune considerabila - stabilitate emotionala medie");
         } else if (extroversionLevel == 1 && nevroticismLevel == 3){
             System.out.println("introversiune considerabila - instabilitate emotionala ridicata");
         } else if (extroversionLevel == 1 && nevroticismLevel == 4){
             System.out.println("introversiune considerabila - instabilitate emotionala foarte ridicata");
         } else if (extroversionLevel == 2 && nevroticismLevel == 1){
             System.out.println("introversiune moderata - stabilitate emotionala ridicata ");
         } else if (extroversionLevel == 2 && nevroticismLevel == 2){
             System.out.println("introversiune moderata - stabilitate emotionala medie");
         } else if (extroversionLevel == 2 && nevroticismLevel == 3){
             System.out.println("introversiune moderata - instabilitate emotionala ridicata");
         } else if (extroversionLevel == 2 && nevroticismLevel == 4){
             System.out.println("introvesiune moderata - instabilitate emotionala foarte ridicata");
         } else if (extroversionLevel == 3 && nevroticismLevel == 1){
             System.out.println("extraversiune moderata - stabilitate emotionala ridicata");
         } else if (extroversionLevel == 3 && nevroticismLevel == 2){
             System.out.println("extraversiune moderata - stabilitate emotionala medie");
         } else if (extroversionLevel == 3 && nevroticismLevel == 3){
             System.out.println("extraversiune moderata - instabilitate emotionala ridicata");
         } else if (extroversionLevel == 3 && nevroticismLevel == 4){
             System.out.println("extraversiune moderata - instabilitate emotionala foarte ridicata");
         } else if (extroversionLevel == 4 && nevroticismLevel == 1){
             System.out.println("extraversiune considerabila - stabilitate emotionala ridicata");
         } else if (extroversionLevel == 4 && nevroticismLevel == 2){
             System.out.println("extraversiune considerabila - stabilitate emotionala medie");
         } else if (extroversionLevel == 4 && nevroticismLevel == 3){
             System.out.println("extraversiune cconsiderabila - instabilitate emotionala ridicata");
         } else if (extroversionLevel == 4 && nevroticismLevel == 4){
             System.out.println("extraversiune considerabila - instabilitate emotionala foarte ridicata");
         }

    }


    public  void simcerityResult(){
        for (int i = 0; i < sincerityArray.length; i++) {
            Item item = ItemsMapImpl.itemList.get(sincerityArray[i]);
            if (item.getEnteredAnswer().equals(item.getExpectedAnswer())){
                sincerity++;
            }
        }

        if(sincerity >= 0 && sincerity <=3){
            System.out.println("Sunteti sincer in raspunsuri, este validat este valid");
            calculateResults();
        } else if (sincerity >= 4 && sincerity <= 6){
            System.out.println("Sunteti situativ in raspunsuri, totusi rezultatul este validat");
            calculateResults();
        } else if (sincerity >= 7 && sincerity <= 9) {
            System.out.println("Sunteti nesincer in raspunsuri si rezultatul testului v-a fi eronat. Din acest motiv rugam sa reporniti testul si fiti cit mai sinceri posibil");
             // TODO here: Create function witch will ask the user if he want to repeat the test, if yes - program return to begin, if no - say thank you and close the program
        }

    }







}
