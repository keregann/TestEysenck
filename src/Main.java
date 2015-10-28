import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by keregann on 8/8/15.
 */
public class Main {
    public static final int NUM_DE_INTREBARI = 57;

    public static void main(String[] args) {

        // functia main se ocupa de initializarea si flow programului, nu contine bussiness logica
        init();
        mainMenu();     // se va ocupa de bussines logica aplicatiei

        // TODO: De modificat aplicatia dupa modeleul Model-View-Controller, fiecare clasa si metoda de organizat dupa patern
        // http://stackoverflow.com/questions/2626803/mvc-model-view-controller-can-it-be-explained-in-simple-terms
        // http://www.oracle.com/technetwork/articles/javase/index-142890.html
        // http://code.tutsplus.com/tutorials/mvc-for-noobs--net-10488


    }

    private static void init() {
        int numOfItems = ItemsMapImpl.initItemList();

        if (numOfItems != NUM_DE_INTREBARI) {
            System.out.println("Nu a fost initdializata lista de itemi. Actual " + numOfItems + ", expected: " + NUM_DE_INTREBARI);
            return;
        }

        // introducere itemi
        for (int i = 1; i <= NUM_DE_INTREBARI; i++) {
            enterItem(i);
        }
    }

    private static void mainMenu() {

        Print.printGeneralInstruction();
        Print.printItemEntryInstruction();  // asta daca vrei puneo in functia de enterItem() sa fie la fiecare

        while (true) {

            int choice = 1;
          try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(reader.readLine());
            // TODO: read choice from keyboard
            switch (choice) {
                case 1 : readAllAnswers(); break;
                case 2 : modifyAnswer(); break;
                case 3 : showAllAnswers(); break;
                default: break;
            }
        }

    }

    private static void showAllAnswers() {


        // TODO: citeste toate itemele din lista si afiseaza impreuna cu raspunsurile introduse
        // fa un loop si cheama functia printItemWithAnswer()

        throw new NotImplementedException();
    }

    private static void modifyAnswer() {


        int itemNumber = 1;
        char answer = 'Y';
        // TODO: read intem number and answer from keyboard

        enterItem(itemNumber);
    }

    private static void readAllAnswers() {

        int itemNumber = 1;
        char answer = 'Y';
        // TODO: make a loop and eneter all items numbers and answers from keyboard
        // TODO loop -> enterItem(itemNumber);

    }

    public static void enterItem(int itemNumber) {

        if (!ItemsMapImpl.itemList.contains(itemNumber)) {
            System.err.println("Nu exista item " + itemNumber);
            System.exit(1);
        }

        Print.printItemQuestion(itemNumber);

        Character itemAnswer = InputAnswer.inputAnswer();
        itemAnswer = Character.toLowerCase(itemAnswer);

        if (itemAnswer.equals('y') || itemAnswer.equals('n')) {
            Item item = ItemsMapImpl.itemList.get(itemNumber);
            item.setEnteredAnswer(itemAnswer);
        }
    }





}



/*
//           System.out.println(Calculation.i1);
//i2
        Print.printItem(Items.i2);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("Y") || InputAnswer.answer.equals("y")) {
            Calculation.i2 = 1;
        } else {
            Calculation.i2 = 0;
        }
 //       System.out.println(Calculation.i2);
//i3
        Print.printItem(Items.i3);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i3 = 1;
        } else {
            Calculation.i3 = 0;
        }
 //       System.out.println(Calculation.i3);
//i4
        Print.printItem(Items.i4);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i4 = 1;
        } else {
            Calculation.i4 = 0;
        }
 //       System.out.println(Calculation.i4);
//i5
        Print.printItem(Items.i5);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i5 = 1;
        } else {
            Calculation.i5 = 0;
        }
//        System.out.println(Calculation.i5);
//i6
        Print.printItem(Items.i6);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i6 = 1;
        } else {
            Calculation.i6 = 0;
        }
 //       System.out.println(Calculation.i6);
//i7
        Print.printItem(Items.i7);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i7 = 1;
        } else {
            Calculation.i7 = 0;
        }
//        System.out.println(Calculation.i7);
//i8
        Print.printItem(Items.i8);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i8 = 1;
        } else {
            Calculation.i8 = 0;
        }
//        System.out.println(Calculation.i8);
//9
        Print.printItem(Items.i9);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i9 = 1;
        } else {
            Calculation.i9 = 0;
        }
//        System.out.println(Calculation.i9);
//10
        Print.printItem(Items.i10);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i10 = 1;
        } else {
            Calculation.i10 = 0;
        }
//        System.out.println(Calculation.i10);
//i11
        Print.printItem(Items.i11);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i11 = 1;
        } else {
            Calculation.i11 = 0;
        }
//        System.out.println(Calculation.i11);
//i12
        Print.printItem(Items.i12);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i12 = 1;
        } else {
            Calculation.i12 = 0;
        }
//        System.out.println(Calculation.i12);
//i13
        Print.printItem(Items.i13);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i13 = 1;
        } else {
            Calculation.i13 = 0;
        }
 //       System.out.println(Calculation.i13);
//14
        Print.printItem(Items.i14);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i14 = 1;
        } else {
            Calculation.i14 = 0;
        }
//        System.out.println(Calculation.i14);
//i15
        Print.printItem(Items.i15);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i15 = 1;
        } else {
            Calculation.i15 = 0;
        }
//        System.out.println(Calculation.i15);
//i16
        Print.printItem(Items.i16);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i16 = 1;
        } else {
            Calculation.i16 = 0;
        }
 //       System.out.println(Calculation.i16);
//i17
        Print.printItem(Items.i17);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i17 = 1;
        } else {
            Calculation.i17 = 0;
        }
//        System.out.println(Calculation.i17);
//i18
        Print.printItem(Items.i18);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i18 = 1;
        } else {
            Calculation.i18 = 0;
        }
 //       System.out.println(Calculation.i18);
//i19
        Print.printItem(Items.i19);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i19 = 1;
        } else {
            Calculation.i19 = 0;
        }
 //       System.out.println(Calculation.i19);
//i20
        Print.printItem(Items.i20);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i20 = 1;
        } else {
            Calculation.i20 = 0;
        }
//        System.out.println(Calculation.i20);
//i21
        Print.printItem(Items.i21);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i21 = 1;
        } else {
            Calculation.i21 = 0;
        }
 //       System.out.println(Calculation.i21);
//i22
        Print.printItem(Items.i22);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i22 = 1;
        } else {
            Calculation.i22 = 0;
        }
//        System.out.println(Calculation.i22);
//23
        Print.printItem(Items.i23);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i23 = 1;
        } else {
            Calculation.i23 = 0;
        }
 //       System.out.println(Calculation.i23);
//i24
        Print.printItem(Items.i24);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i24 = 1;
        } else {
            Calculation.i24 = 0;
        }
        System.out.println(Calculation.i24);
//i25
        Print.printItem(Items.i25);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i25 = 1;
        } else {
            Calculation.i25 = 0;
        }
 //       System.out.println(Calculation.i25);
//i26
        Print.printItem(Items.i26);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i26 = 1;
        } else {
            Calculation.i26 = 0;
        }
//        System.out.println(Calculation.i26);
//i27
        Print.printItem(Items.i27);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i27 = 1;
        } else {
            Calculation.i27 = 0;
        }
//        System.out.println(Calculation.i27);
//28
        Print.printItem(Items.i28);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i28 = 1;
        } else {
            Calculation.i28 = 0;
        }
//        System.out.println(Calculation.i28);
//29
        Print.printItem(Items.i29);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i29 = 1;
        } else {
            Calculation.i29 = 0;
        }
 //       System.out.println(Calculation.i29);
//30
        Print.printItem(Items.i30);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i30 = 1;
        } else {
            Calculation.i30 = 0;
        }
 //       System.out.println(Calculation.i30);
//31
        Print.printItem(Items.i31);
        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i31 = 1;
        } else {
            Calculation.i31 = 0;
        }
 //       System.out.println(Calculation.i31);
//32
        Print.printItem(Items.i32);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i32 = 1;
        } else {
            Calculation.i32 = 0;
        }
 //       System.out.println(Calculation.i32);
//33
        Print.printItem(Items.i33);
        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i33 = 1;
        } else {
            Calculation.i33 = 0;
        }
 //       System.out.println(Calculation.i33);
//34
        Print.printItem(Items.i34);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i34 = 1;
        } else {
            Calculation.i34 = 0;
        }
//        System.out.println(Calculation.i34);
//35
        Print.printItem(Items.i35);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i35 = 1;
        } else {
            Calculation.i35 = 0;
        }
//        System.out.println(Calculation.i35);
//36
        Print.printItem(Items.i36);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i36 = 1;
        } else {
            Calculation.i36 = 0;
        }
 //       System.out.println(Calculation.i36);
//37
        Print.printItem(Items.i37);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i37 = 1;
        } else {
            Calculation.i37 = 0;
        }
 //       System.out.println(Calculation.i37);
//38
        Print.printItem(Items.i38);
  //      Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i38 = 1;
        } else {
            Calculation.i38 = 0;
        }
//        System.out.println(Calculation.i38);
//39
        Print.printItem(Items.i39);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i39 = 1;
        } else {
            Calculation.i39 = 0;
        }
//        System.out.println(Calculation.i39);
//40
        Print.printItem(Items.i40);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i40 = 1;
        } else {
            Calculation.i40= 0;
        }
//        System.out.println(Calculation.i40);
//41
        Print.printItem(Items.i41);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i41 = 1;
        } else {
            Calculation.i41 = 0;
        }
//        System.out.println(Calculation.i41);
//42
        Print.printItem(Items.i42);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i42 = 1;
        } else {
            Calculation.i42 = 0;
        }
 //       System.out.println(Calculation.i42);
//43
        Print.printItem(Items.i43);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i43 = 1;
        } else {
            Calculation.i43 = 0;
        }
 //       System.out.println(Calculation.i43);
//44
        Print.printItem(Items.i44);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i44= 1;
        } else {
            Calculation.i44 = 0;
        }
 //       System.out.println(Calculation.i44);
//45
        Print.printItem(Items.i45);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i45 = 1;
        } else {
            Calculation.i45 = 0;
        }
 //       System.out.println(Calculation.i45);
//46
        Print.printItem(Items.i46);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i46 = 1;
        } else {
            Calculation.i46 = 0;
        }
 //       System.out.println(Calculation.i46);
//47
        Print.printItem(Items.i47);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i47 = 1;
        } else {
            Calculation.i47 = 0;
        }
//        System.out.println(Calculation.i47);
//48
        Print.printItem(Items.i48);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i48 = 1;
        } else {
            Calculation.i48 = 0;
        }
//        System.out.println(Calculation.i48);
//49
        Print.printItem(Items.i49);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i49 = 1;
        } else {
            Calculation.i49 = 0;
        }
//        System.out.println(Calculation.i49);
//50
        Print.printItem(Items.i50);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i50 = 1;
        } else {
            Calculation.i50 = 0;
        }
 //       System.out.println(Calculation.i50);
//51
        Print.printItem(Items.i51);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i51= 1;
        } else {
            Calculation.i51 = 0;
        }
 //       System.out.println(Calculation.i51);
//52
        Print.printItem(Items.i52);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i52 = 1;
        } else {
            Calculation.i52 = 0;
        }
//        System.out.println(Calculation.i52);
//53
        Print.printItem(Items.i53);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i53 = 1;
        } else {
            Calculation.i53 = 0;
        }
 //       System.out.println(Calculation.i53);
//54
        Print.printItem(Items.i54);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculation.i54 = 1;
        } else {
            Calculation.i54 = 0;
        }
//        System.out.println(Calculation.i54);
//55
        Print.printItem(Items.i55);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i55 = 1;
        } else {
            Calculation.i55 = 0;
        }
//        System.out.println(Calculation.i55);
//56
        Print.printItem(Items.i56);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i56 = 1;
        } else {
            Calculation.i56 = 0;
        }
//        System.out.println(Calculation.i56);
//57
        Print.printItem(Items.i57);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculation.i57 = 1;
        } else {
            Calculation.i57 = 0;
        }
//        System.out.println(Calculation.i57);
//REZULT

        Calculation.simcerityResult();
 */
