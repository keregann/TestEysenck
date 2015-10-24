/**
 * Created by keregann on 8/28/15.
 */
public class Calculus {
    public static int i1; // De nimicit durdomu ista
    public static int i2;
    public static int i3;
    public static int i4;
    public static int i5;
    public static int i6;
    public static int i7;
    public static int i8;
    public static int i9;
    public static int i10;
    public static int i11;
    public static int i12;
    public static int i13;
    public static int i14;
    public static int i15;
    public static int i16;
    public static int i17;
   // Sters i18
    public static int i19;
    public static int i20;
    public static int i21;
    //Sters i22
    public static int i23;
    public static int i24;
    //Sters i25
    public static int i26;
    public static int i27;
    public static int i28;
    public static int i29;
    public static int i30;
    public static int i31;
    public static int i32;
    public static int i33;
    public static int i34;
    public static int i35;
    public static int i36;
    public static int i37;
    public static int i38;
    public static int i39;
    public static int i40;
    public static int i41;
    public static int i42;
    public static int i43;
    public static int i44;
    public static int i45;
    public static int i46;
    public static int i47;
    public static int i48;
    public static int i49;
    public static int i50;
    public static int i51;
    public static int i52;
    public static int i53;
    public static int i54;
    public static int i55;
    public static int i56;
    public static int i57;


    public static void calculateResults(){


        int extraversion = 0;
        // /i1+i3+i8+i10+i13+i17+i22+i25+i27+i39+i44+i46+i49+i53+i56+i5+i15+i20+i29+i32+i34+i37+i42+i51;
        int nevrotism = 0;
        //i2+i4+i7+i9+i11+i14+i16+i19+i21+i23+i26+i28+i31+i33+i35+i38+i40+i43+i45+i47+i50+i52+i55+i57;

        int extroversionLevel = 0;  //Ai Grija aici
        int nevroticismLevel = 0;

        Integer[] extArray = {1, 3, 8, 10};
        Integer[] nevArray = {2, 4, 9, 11};
        Integer[] sicerityArray = {}; // TODO result function here

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

         if(extroversionLevel == 1 && nevroticismLevel == 1){
            Print.printItem(TemperamentsTypes.fullFlegmatic);
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
 int sincerity = i6+i24+i36+i12+i18+i30+i42+i48+i54;
    }


    public static void simcerityResult(){
        int sincerity = i6+i24+i36+i12+i18+i30+i42+i48+i54;
        if(sincerity >= 0 && sincerity <=3){
            System.out.println("Sunteti sincer in raspunsuri, este validat este valid");
            calculateResults();
        } else if (sincerity >= 4 && sincerity <= 6){
            System.out.println("Sunteti situativ in raspunsuri, totusi rezultatul este validat");
            calculateResults();
        } else if (sincerity >= 7 && sincerity <= 9) {
            System.out.println("Sunteti nesincer in raspunsuri si rezultatul testului v-a fi eronat. Din acest motiv rugam sa reporniti testul si fiti cit mai sinceri posibil");
        }

    }







}
