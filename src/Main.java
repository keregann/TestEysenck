import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by keregann on 8/8/15.
 */
public class Main {
    public static final int NUM_DE_INTREBARI = 99;

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
//           System.out.println(Calculus.i1);
//i2
        Print.printItem(Items.i2);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("Y") || InputAnswer.answer.equals("y")) {
            Calculus.i2 = 1;
        } else {
            Calculus.i2 = 0;
        }
 //       System.out.println(Calculus.i2);
//i3
        Print.printItem(Items.i3);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i3 = 1;
        } else {
            Calculus.i3 = 0;
        }
 //       System.out.println(Calculus.i3);
//i4
        Print.printItem(Items.i4);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i4 = 1;
        } else {
            Calculus.i4 = 0;
        }
 //       System.out.println(Calculus.i4);
//i5
        Print.printItem(Items.i5);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i5 = 1;
        } else {
            Calculus.i5 = 0;
        }
//        System.out.println(Calculus.i5);
//i6
        Print.printItem(Items.i6);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i6 = 1;
        } else {
            Calculus.i6 = 0;
        }
 //       System.out.println(Calculus.i6);
//i7
        Print.printItem(Items.i7);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i7 = 1;
        } else {
            Calculus.i7 = 0;
        }
//        System.out.println(Calculus.i7);
//i8
        Print.printItem(Items.i8);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i8 = 1;
        } else {
            Calculus.i8 = 0;
        }
//        System.out.println(Calculus.i8);
//9
        Print.printItem(Items.i9);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i9 = 1;
        } else {
            Calculus.i9 = 0;
        }
//        System.out.println(Calculus.i9);
//10
        Print.printItem(Items.i10);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i10 = 1;
        } else {
            Calculus.i10 = 0;
        }
//        System.out.println(Calculus.i10);
//i11
        Print.printItem(Items.i11);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i11 = 1;
        } else {
            Calculus.i11 = 0;
        }
//        System.out.println(Calculus.i11);
//i12
        Print.printItem(Items.i12);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i12 = 1;
        } else {
            Calculus.i12 = 0;
        }
//        System.out.println(Calculus.i12);
//i13
        Print.printItem(Items.i13);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i13 = 1;
        } else {
            Calculus.i13 = 0;
        }
 //       System.out.println(Calculus.i13);
//14
        Print.printItem(Items.i14);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i14 = 1;
        } else {
            Calculus.i14 = 0;
        }
//        System.out.println(Calculus.i14);
//i15
        Print.printItem(Items.i15);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i15 = 1;
        } else {
            Calculus.i15 = 0;
        }
//        System.out.println(Calculus.i15);
//i16
        Print.printItem(Items.i16);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i16 = 1;
        } else {
            Calculus.i16 = 0;
        }
 //       System.out.println(Calculus.i16);
//i17
        Print.printItem(Items.i17);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i17 = 1;
        } else {
            Calculus.i17 = 0;
        }
//        System.out.println(Calculus.i17);
//i18
        Print.printItem(Items.i18);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i18 = 1;
        } else {
            Calculus.i18 = 0;
        }
 //       System.out.println(Calculus.i18);
//i19
        Print.printItem(Items.i19);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i19 = 1;
        } else {
            Calculus.i19 = 0;
        }
 //       System.out.println(Calculus.i19);
//i20
        Print.printItem(Items.i20);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i20 = 1;
        } else {
            Calculus.i20 = 0;
        }
//        System.out.println(Calculus.i20);
//i21
        Print.printItem(Items.i21);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i21 = 1;
        } else {
            Calculus.i21 = 0;
        }
 //       System.out.println(Calculus.i21);
//i22
        Print.printItem(Items.i22);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i22 = 1;
        } else {
            Calculus.i22 = 0;
        }
//        System.out.println(Calculus.i22);
//23
        Print.printItem(Items.i23);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i23 = 1;
        } else {
            Calculus.i23 = 0;
        }
 //       System.out.println(Calculus.i23);
//i24
        Print.printItem(Items.i24);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i24 = 1;
        } else {
            Calculus.i24 = 0;
        }
        System.out.println(Calculus.i24);
//i25
        Print.printItem(Items.i25);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i25 = 1;
        } else {
            Calculus.i25 = 0;
        }
 //       System.out.println(Calculus.i25);
//i26
        Print.printItem(Items.i26);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i26 = 1;
        } else {
            Calculus.i26 = 0;
        }
//        System.out.println(Calculus.i26);
//i27
        Print.printItem(Items.i27);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i27 = 1;
        } else {
            Calculus.i27 = 0;
        }
//        System.out.println(Calculus.i27);
//28
        Print.printItem(Items.i28);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i28 = 1;
        } else {
            Calculus.i28 = 0;
        }
//        System.out.println(Calculus.i28);
//29
        Print.printItem(Items.i29);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i29 = 1;
        } else {
            Calculus.i29 = 0;
        }
 //       System.out.println(Calculus.i29);
//30
        Print.printItem(Items.i30);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i30 = 1;
        } else {
            Calculus.i30 = 0;
        }
 //       System.out.println(Calculus.i30);
//31
        Print.printItem(Items.i31);
        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i31 = 1;
        } else {
            Calculus.i31 = 0;
        }
 //       System.out.println(Calculus.i31);
//32
        Print.printItem(Items.i32);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i32 = 1;
        } else {
            Calculus.i32 = 0;
        }
 //       System.out.println(Calculus.i32);
//33
        Print.printItem(Items.i33);
        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i33 = 1;
        } else {
            Calculus.i33 = 0;
        }
 //       System.out.println(Calculus.i33);
//34
        Print.printItem(Items.i34);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i34 = 1;
        } else {
            Calculus.i34 = 0;
        }
//        System.out.println(Calculus.i34);
//35
        Print.printItem(Items.i35);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i35 = 1;
        } else {
            Calculus.i35 = 0;
        }
//        System.out.println(Calculus.i35);
//36
        Print.printItem(Items.i36);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i36 = 1;
        } else {
            Calculus.i36 = 0;
        }
 //       System.out.println(Calculus.i36);
//37
        Print.printItem(Items.i37);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i37 = 1;
        } else {
            Calculus.i37 = 0;
        }
 //       System.out.println(Calculus.i37);
//38
        Print.printItem(Items.i38);
  //      Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i38 = 1;
        } else {
            Calculus.i38 = 0;
        }
//        System.out.println(Calculus.i38);
//39
        Print.printItem(Items.i39);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i39 = 1;
        } else {
            Calculus.i39 = 0;
        }
//        System.out.println(Calculus.i39);
//40
        Print.printItem(Items.i40);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i40 = 1;
        } else {
            Calculus.i40= 0;
        }
//        System.out.println(Calculus.i40);
//41
        Print.printItem(Items.i41);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i41 = 1;
        } else {
            Calculus.i41 = 0;
        }
//        System.out.println(Calculus.i41);
//42
        Print.printItem(Items.i42);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i42 = 1;
        } else {
            Calculus.i42 = 0;
        }
 //       System.out.println(Calculus.i42);
//43
        Print.printItem(Items.i43);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i43 = 1;
        } else {
            Calculus.i43 = 0;
        }
 //       System.out.println(Calculus.i43);
//44
        Print.printItem(Items.i44);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i44= 1;
        } else {
            Calculus.i44 = 0;
        }
 //       System.out.println(Calculus.i44);
//45
        Print.printItem(Items.i45);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i45 = 1;
        } else {
            Calculus.i45 = 0;
        }
 //       System.out.println(Calculus.i45);
//46
        Print.printItem(Items.i46);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i46 = 1;
        } else {
            Calculus.i46 = 0;
        }
 //       System.out.println(Calculus.i46);
//47
        Print.printItem(Items.i47);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i47 = 1;
        } else {
            Calculus.i47 = 0;
        }
//        System.out.println(Calculus.i47);
//48
        Print.printItem(Items.i48);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i48 = 1;
        } else {
            Calculus.i48 = 0;
        }
//        System.out.println(Calculus.i48);
//49
        Print.printItem(Items.i49);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i49 = 1;
        } else {
            Calculus.i49 = 0;
        }
//        System.out.println(Calculus.i49);
//50
        Print.printItem(Items.i50);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i50 = 1;
        } else {
            Calculus.i50 = 0;
        }
 //       System.out.println(Calculus.i50);
//51
        Print.printItem(Items.i51);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i51= 1;
        } else {
            Calculus.i51 = 0;
        }
 //       System.out.println(Calculus.i51);
//52
        Print.printItem(Items.i52);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i52 = 1;
        } else {
            Calculus.i52 = 0;
        }
//        System.out.println(Calculus.i52);
//53
        Print.printItem(Items.i53);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i53 = 1;
        } else {
            Calculus.i53 = 0;
        }
 //       System.out.println(Calculus.i53);
//54
        Print.printItem(Items.i54);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("N") || InputAnswer.answer.equals("n")) {
            Calculus.i54 = 1;
        } else {
            Calculus.i54 = 0;
        }
//        System.out.println(Calculus.i54);
//55
        Print.printItem(Items.i55);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i55 = 1;
        } else {
            Calculus.i55 = 0;
        }
//        System.out.println(Calculus.i55);
//56
        Print.printItem(Items.i56);
//        Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i56 = 1;
        } else {
            Calculus.i56 = 0;
        }
//        System.out.println(Calculus.i56);
//57
        Print.printItem(Items.i57);
 //       Print.printItemEntryInstruction();
        itemAnswer;
        InputAnswer.validate();
        if (InputAnswer.answer.equals("y") || InputAnswer.answer.equals("Y")) {
            Calculus.i57 = 1;
        } else {
            Calculus.i57 = 0;
        }
//        System.out.println(Calculus.i57);
//REZULT

        Calculus.simcerityResult();
 */
