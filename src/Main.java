import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int num = 2;
        int num2 = 4;
        sum(2, 4); //1

        System.out.println(PISq());//2

        System.out.println(multiply(6, 7));//3
        System.out.println(multiply(num, num2)); //3
        int[] num1 = {8, 4, 6, 7, 8};
        printArray(num1);//4
        System.out.println("-------------");
        int[] arr = randomArr(20, 30);
        printArray(arr);//5
        System.out.println(sumArr(arr));//6
        System.out.println(averageArr2(arr));//7
        //System.out.println(sumArr(randomArr(20,30)));
        //8
        int x = 7;
        int y = 12;
        Main.Rectangle(x, y);
        //9
        String sentence = "Šiandien labai graži diena";
        sentence(sentence);

        //10.

        String text = "Naglis";

        System.out.println(codedSentence(text));


        //1 sunkesnis

        String text1 = "labas";

//      3.
        int number = 8;
        System.out.println(integer(number));

//        4.
        int [] arr1 = {34,56,42,66};
        int [] sortedArr = sortIntArr(arr1);
        System.out.println(Arrays.toString(sortedArr));

//        5.



    }

    // 1. Sukurkite Funkciją kuri priima du int tipo kintamuosius.
// Juos susumuoja ir atspausdina.
    public static void sum(int num, int num2) {
        System.out.println(num + num2);
    }

    //    2.Sukurkite Funkciją kuri vadinasi PISq.
//    Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.
    public static double PISq() {
        return 9.8596;
    }

//3.Sukurkite Funkciją kuri priima du int tipo kintamuosius.
// Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.


    public static int multiply(int num1, int num3) {
        return num1 * num3;
    }


// 4.Sukurkite Funkciją kuri priima int[] tipo kintamąį,
// prasuka ciklą ir atspausdina kiekvieną skaičių.


    public static void printArray(int[] num1) {
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
//    5.Sukurkite Funkciją kuri sugeneruotų 5-ių
//    random int skaičių masyvą ir jį gražintų. intervalą(min, max sugalvokite patys)

    public static int[] randomArr(int min, int max) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min + (int) (Math.random() * (max - min + 1));
        }
        return numbers;//13,20,8,40
    }


    // 6.Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį),
// susumuotų ir gražintų reikšmę.

    public static int sumArr(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    //7.Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).

    public static double averageArr2(int[] numbers) {
        double averageArr2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            averageArr2 += numbers[i];

        }
        return averageArr2 / numbers.length;
    }


//          8.Sukurkite Funkciją kuri priimtų du int skaičius ir
//          atspausdintų stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.

    public static void Rectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            String row = "";
            for (int b = 0; b < y; b++) {
                row += " * ";
            }
            System.out.println(row);
        }

    }


// 9.Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
// Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

    public static void sentence(String text) {
//           System.out.println(text);
//           System.out.println(text.length());
//           System.out.println(text.replace( " ",""));
//           System.out.println(text.replace(" ", "").length() );
        System.out.println(text.length() - text.replace(" ", "").length());
    }

//  10.Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
//  Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.

    public static String codedSentence(String text) {
        //====== a =====
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);

        }
        //===== b =====
        result = "";
        for (int i = 0; i < text.length(); i++) {
            result = text.charAt(i) + result;
        }

        return result;
    }

//    1.sunkesnis
//     Parašykite funkciją, kurios argumentas būtų tekstas,
    //  kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje ir gale. PVZ (---labas---)

    public static void printText(String text1) {
        System.out.println("---" + text1 + "---");
    }


// 3. Parašykite funkciją, kuri skaičiuotų, ir gražintų
// iš kiek sveikų skaičių jos argumentas dalijasi be liekanos (išskyrus vienetą ir patį save).

    public static int integer(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            //ar number padalintas is "i" dalijasi be liekanos
            // jei taip, count++;
            if (number % i == 0)

                count++;


        }
        return count;

    }


//    4. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
//    Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.


      public static int [] sortIntArr (int [] arr1){
          for (int i = 0; i < arr1.length; i++) {
              for (int  a = 0;  a< arr1.length; a++) {
                  if (arr1[i] > arr1[a] ){
                      int temp = arr1[i];
                      arr1[i] = arr1 [a];
                      arr1[a] = temp;
                  }
              }


          }
        return arr1;
      }

//     5.Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 333 iki 777.
//     Naudodami 3 uždavinio funkciją iš masyvo suskaičiuokite kiek yra pirminių skaičių.






}
















