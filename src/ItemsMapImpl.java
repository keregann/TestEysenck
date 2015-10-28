import javafx.animation.KeyValue;

import java.util.*;

/**
 * Created by keregann on 8/8/15.
 */
public class ItemsMapImpl {
    public static String i1 = "Deseori doriti sa fiti in situatii care sa va stimuleze?";
    public static String i2 = "Aveti nevoie frecvent de prieteni care sa va inveseleasca?";
    public static String i3 = "Sunteti o persoana care deobicei nu-si face griji?";
    public static String i4 = "Va este greu sa acceptati un refuz?";
    public static String i5 = "Va opriti pentru a va gindi inainte de a face ceva?";
    public static String i6 = "Daca promiteti ceva, intodeauna va tineti de cuvint?";
    public static String i7 = "Vi se schimba adesea dispozitia";
    public static String i8 = "In general, vorbiti si actionati repede, fara a va opri pentru a reflecta asupra lucrurilor";
    public static String i9 = "Va simititi vreodata pur si simplu indispus, fara a avea motiv serios?";
    public static String i10 = "Ati face orice cind sunteti pus la ambitie?";
    public static String i11 = "Sunteti vreodata timid cind doriti sa vorbiti cu o persoana de sex opus de care va simtiti atras?";
    public static String i12 = "Vi se intitmpla sa va pierdeti, din cind in cind cumpatul si sa va infuriati?";
    public static String i13 = "Actionati deseori la inspiratia de moment";
    public static String i14 = "Va necajiti adesea pentru lucruri pe care nu trebuie sa le spuneti sau sa le faceti?";
    public static String i15 = "Preferati, de obicei, sa cititi in loc sa va intilniti cu alti oameni?";
    public static String i16 = "Puteti fi jignit cu usurinta?";
    public static String i17 = "Va place sa iesiti des in oras (la plimbare)?";
    public static String i18 = "Vi se intimpla sa aveti ginduri si idei care nu v-ar place sa fie cunoscute?";
    public static String i19 = "Va simtiti uneori plin de energie, motivatie, iar alteori apatic, demotivat?";
    public static String i20 = "Preferati sa aveti prieteni putini, dar alesi?";
    public static String i21 = "Deseori visati?";
    public static String i22 = "Cind oamenii ridica tonul la dumneavoastra, raspundeti in acelasi mod?";
    public static String i23 = "Deseori aveti sentimente de vinovatie?";
    public static String i24 = "Considerati ca toate obisnuintele dumneavoastra sunt bune si dezirabile (permise, acceptate)?";
    public static String i25 = "De obicei va puteti distinde si petrece foarte bine cind participati la o petrecere vesela?";
    public static String i26 = "Credeti despre dumneavoastra ca sunteti foarte sensibil?";
    public static String i27 = "Cei din jur va considera foarte vioi, energic?";
    public static String i28 = "Dupa ce ati facut un lucru important, vi se intimpla deseori sa aveti sentimentul ca ati fi putut sa-l faceti mai bine?";
    public static String i29 = "Cind sunteti cu alti oameni, sunteti in majoritatea cazurilor tacut?";
    public static String i30 = "Birfiti citeodata?";
    public static String i31 = "Vi se intimpla sa nu puteti dormi din cauza unor ginduri care va preocupa?";
    public static String i32 = "Daca doriti sa va informati asupra unei probleme, preferati sa aflati raspunsul din carti, internet, in loc sa discutati cu cineva depsre acest lucru?";
    public static String i33 = "Aveti vreodata palpitatii sau o greutate la inima?";
    public static String i34 = "Va place genul de munca ce necesita multa atentie?";
    public static String i35 = "Aveti crize de tremuraturi sau frisoane?";
    public static String i36 = "Ati declara intodeauna la vama tot ce aveti, daca ati sti ca nu v-ar prinde niciodata?";
    public static String i37 = "Va displace sa fiti intr-o societate in care oamenii joaca feste unul altuia?";
    public static String i38 = "Sunteti o persoana iritabila?";
    public static String i39 = "Va place sa faceti lucruri in care trebuie sa actionati rapid?";
    public static String i40 = "Va framintati in legatura cu anumite lucruri ingrozitoare care s-ar putea intimpla?";
    public static String i41 = "Sunteti lent si lipsit de graba in felul dumneavoastra de a va misca?";
    public static String i42 = "Intirziati deseori la intilnire sau la serviciu?";
    public static String i43 = "Aveti deseori cosmaruri?";
    public static String i44 = "Va place atit de mult sa discutati, incit intrati cu usurinta in vorba si cu necunoscuti?";
    public static String i45 = "Simtiti deseori dureri?";
    public static String i46 = "Daca nu v-ati  afla mai mult timp printre oameni, v-ati considera nefericit?";
    public static String i47 = "Va considerati o persoana nervoasa?";
    public static String i48 = "Din toti oamenii pe care ii cunoasteti sunt unii care categoric nu va plac?";
    public static String i49 = "COnsiderati ca aveti suficienta incredere in dumneavoastra?";
    public static String i50 = "Puteti fi cu usurinta jignit cind oamenii va gasesc defecte personale sau greseli in munca?";
    public static String i51 = "Va este greu sa va distrati la o petrecere vesela?";
    public static String i52 = "Sunteti framintat de sentimente de inferioritate?";
    public static String i53 = "Va este usor sa inviorati o petrecere plictisitoare?";
    public static String i54 = "Vorbiti citeodata lucruri despre care nu detineti informatii suficiente?";
    public static String i55 = "Sinteti ingrijorat in legatura cu sanatatea dumneavoastra?";
    public static String i56 = "Va place sa faceti farse altora?";
    public static String i57 = "Suferiti de insomnie?";


    public static List<Item> itemList;

    public static int initItemList() {
        itemList = new ArrayList<>();  // TODO: de introdus toti itemii (is done!!!)

        itemList.add(1, new Item(1, i1, 'y'));
        itemList.add(2, new Item(2, i2, 'y'));
        itemList.add(3, new Item(3, i3, 'y'));
        itemList.add(4, new Item(4, i4, 'y'));
        itemList.add(5, new Item(5, i5, 'n'));
        itemList.add(6, new Item(6, i6, 'y'));
        itemList.add(7, new Item(7, i7, 'y'));
        itemList.add(8, new Item(8, i8, 'y'));
        itemList.add(9, new Item(9, i9, 'y'));
        itemList.add(10, new Item(10, i10, 'y'));
        itemList.add(11, new Item(11, i11, 'y'));
        itemList.add(12, new Item(12, i12, 'n'));
        itemList.add(13, new Item(13, i13, 'y'));
        itemList.add(14, new Item(14, i14, 'y'));
        itemList.add(15, new Item(15, i15, 'n'));
        itemList.add(16, new Item(16, i16, 'y'));
        itemList.add(17, new Item(17, i17, 'y'));
        itemList.add(20, new Item(18, i18, 'n'));
        itemList.add(21, new Item(19, i19, 'y'));
        itemList.add(22, new Item(20, i20, 'n'));
        itemList.add(21, new Item(21, i21, 'y'));
        itemList.add(22, new Item(22, i22, 'y'));
        itemList.add(23, new Item(23, i23, 'y'));
        itemList.add(24, new Item(24, i24, 'y'));
        itemList.add(25, new Item(25, i25, 'y'));
        itemList.add(26, new Item(26, i26, 'y'));
        itemList.add(27, new Item(27, i27, 'y'));
        itemList.add(28, new Item(28, i28, 'y'));
        itemList.add(29, new Item(29, i29, 'n'));
        itemList.add(30, new Item(30, i30, 'n'));
        itemList.add(31, new Item(31, i31, 'y'));
        itemList.add(32, new Item(32, i32, 'n'));
        itemList.add(33, new Item(33, i33, 'y'));
        itemList.add(34, new Item(34, i34, 'n'));
        itemList.add(35, new Item(35, i35, 'y'));
        itemList.add(36, new Item(36, i36, 'y'));
        itemList.add(37, new Item(37, i37, 'n'));
        itemList.add(38, new Item(38, i38, 'y'));
        itemList.add(39, new Item(39, i39, 'y'));
        itemList.add(40, new Item(40, i40, 'y'));
        itemList.add(41, new Item(41, i41, 'n'));
        itemList.add(42, new Item(42, i42, 'n'));
        itemList.add(43, new Item(43, i43, 'y'));
        itemList.add(44, new Item(44, i44, 'y'));
        itemList.add(45, new Item(45, i45, 'y'));
        itemList.add(46, new Item(46, i46, 'y'));
        itemList.add(47, new Item(47, i47, 'y'));
        itemList.add(48, new Item(48, i48, 'n'));
        itemList.add(49, new Item(49, i49, 'y'));
        itemList.add(50, new Item(50, i50, 'y'));
        itemList.add(51, new Item(51, i51, 'n'));
        itemList.add(52, new Item(52, i52, 'y'));
        itemList.add(53, new Item(53, i53, 'y'));
        itemList.add(54, new Item(54, i54, 'n'));
        itemList.add(55, new Item(55, i55, 'y'));
        itemList.add(56, new Item(56, i56, 'y'));
        itemList.add(57, new Item(57, i57, 'y'));

        return itemList.size();


    }


}