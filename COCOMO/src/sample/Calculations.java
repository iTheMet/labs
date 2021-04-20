package sample;

import java.util.Scanner;

public class Calculations {
    //Basic cocomo
    /*public static double[] common = new double[] {2.4,1.05,2.5,0.38};
    public static double[] semi = new double[] {3.0,1.12,2.5,0.32};
    public static double[] integrated = new double[] {3.6,1.20,2.5,0.32};*/
    public static int diff;
    public static double PM;
    public static double TM;
    public static double[][] BasicCocomo = new double[][]{{2.4, 1.05, 2.5, 0.38}, {3.0, 1.12, 2.5, 0.32}, {3.6, 1.20, 2.5, 0.32}};

    //intermidiant cocomo
    public static double[] common2 = new double[]{3.2, 1.05};
    public static double[] semi2 = new double[]{3.0, 1.12};
    public static double[] integrated2 = new double[]{2.8, 1.20};
    public static String [] costDrivers = new String []{" Требуемая надежность ПО ", "Размер БД приложения","Сложность продукта","Сложность продукта"," Ограничения памяти","Неустойчивость окружения виртуальной машины",
    "Требуемое время восстановления","Аналитические способности","Опыт разработки","Способности к разработке ПО",". Опыт использования виртуальных машин","Опыт разработки на языках программирования","Применение методов разработки ПО",
    "Использование инструментария разработки ПО","Требования соблюдения графика разработки"};



    public static double[][] CDk = new double[15][6];
    public static double[][] SFj = new double[5][6];
    public static double[][] EMj = new double[17][6];
    public static double[][] EMi = new double[7][7];
    public static double[] EMiChosen = new double[]{1,1,1,1,1,1,1};

public static void testEmi(){
    for (int i = 0;i< EMiChosen.length;i++){
        System.out.println(EMiChosen[i]);
    }


}
    public static double[][] getEMi() {
        return EMi;
    }

    public static void SFjStorage() {
        SFj[0][0] = 6.20;
        SFj[0][1] = 4.96;
        SFj[0][2] = 3.72;
        SFj[0][3] = 2.48;
        SFj[0][4] = 1.24;
        ////////////////////
        SFj[1][0] = 5.07;
        SFj[1][1] = 4.05;
        SFj[1][2] = 3.04;
        SFj[1][3] = 2.03;
        SFj[1][4] = 1.01;
        ////////////////////
        SFj[2][0] = 7.07;
        SFj[2][1] = 5.65;
        SFj[2][2] = 4.24;
        SFj[2][3] = 2.83;
        SFj[2][4] = 1.41;
        ////////////////////
        SFj[3][0] = 5.48;
        SFj[3][1] = 4.38;
        SFj[3][2] = 3.29;
        SFj[3][3] = 2.19;
        SFj[3][4] = 1.1;
        ////////////////////
        SFj[4][0] = 7.80;
        SFj[4][1] = 6.24;
        SFj[4][2] = 4.68;
        SFj[4][3] = 3.12;
        SFj[4][4] = 1.56;


    }

    public static void EMjStorage() {

        EMj[0][0] = 1.42;
        EMj[0][1] = 1.29;
        EMj[0][2] = 1.00;
        EMj[0][3] = 0.85;
        EMj[0][4] = 0.71;
        //  EMj[0][5]=1.65 ;
////////////////////////////////////
        EMj[1][0] = 1.22;
        EMj[1][1] = 1.10;
        EMj[1][2] = 1.00;
        EMj[1][3] = 0.88;
        EMj[1][4] = 0.81;
        //  EMj[0][5]=1.65
        ////////////////////////////////////
        EMj[2][0] = 1.34;
        EMj[2][1] = 1.15;
        EMj[2][2] = 1.00;
        EMj[2][3] = 0.88;
        EMj[2][4] = 0.76;
        //  EMj[0][5]=1.65
////////////////////////////////////
        EMj[3][0] = 1.29;
        EMj[3][1] = 1.12;
        EMj[3][2] = 1.00;
        EMj[3][3] = 0.90;
        EMj[3][4] = 0.81;
        //  EMj[0][5]=1.65
        ////////////////////////////////////
        EMj[4][0] = 1.19;
        EMj[4][1] = 1.09;
        EMj[4][2] = 1.00;
        EMj[4][3] = 0.91;
        EMj[4][4] = 0.85;
        //  EMj[0][5]=1.65
        ////////////////////////////////////
        EMj[5][0] = 1.20;
        EMj[5][1] = 1.09;
        EMj[5][2] = 1.00;
        EMj[5][3] = 0.91;
        EMj[5][4] = 0.84;
        //  EMj[0][5]=1.65
        ////////////////////////////////////

        ////////////////////////////////////
        EMj[6][0] = 0.84;
        EMj[6][1] = 0.92;
        EMj[6][2] = 1;
        EMj[6][3] = 1.1;
        EMj[6][4] = 1.26;
        //  EMj[0][5]=1.65
        ////////////////////////////////
        //  EMj[7][0]=0.84  ;
        EMj[7][1] = 0.23;
        EMj[7][2] = 1;
        EMj[7][3] = 1.14;
        EMj[7][4] = 1.28;
        //  EMj[0][5]=1.65
        ////////////////////////////////
        EMj[8][0] = 0.27;
        EMj[8][1] = 0.87;
        EMj[8][2] = 1;
        EMj[8][3] = 1.17;
        EMj[8][4] = 1.34;
        EMj[8][5] = 1.75;
        ////////////////////////////////
        //  EMj[7][0]=0.84  ;
        EMj[9][1] = 0.95;
        EMj[9][2] = 1;
        EMj[9][3] = 1.07;
        EMj[9][4] = 1.15;
        EMj[9][5] = 1.24;
        ////////////////////////////////
        EMj[10][0] = 0.81;
        EMj[10][1] = 0.91;
        EMj[10][2] = 1;
        EMj[10][3] = 1.11;
        EMj[10][4] = 1.23;
        //  EMj[0][5]=1.65
        ////////////////////////////////
        // EMj[7][0]=0.84  ;
        // EMj[7][1]=0.23  ;
        EMj[11][2] = 1;
        EMj[11][3] = 1.11;
        EMj[11][4] = 1.29;
        EMj[11][5] = 1.63;
        ////////////////////////////////
        // EMj[7][0]=0.84  ;
        // EMj[7][1]=0.23  ;
        EMj[12][2] = 1;
        EMj[12][3] = 1.05;
        EMj[12][4] = 1.17;
        EMj[12][5] = 1.46;
        ////////////////////////////////
        // EMj[13][0]=0.84  ;
        EMj[13][1] = 0.87;
        EMj[13][2] = 1;
        EMj[13][3] = 1.15;
        EMj[13][4] = 1.30;
        //  EMj[13][5]=1.63;
        ////////////////////////////////
        EMj[14][0] = 1.17;
        EMj[14][1] = 1.09;
        EMj[14][2] = 1;
        EMj[14][3] = 0.9;
        EMj[14][4] = 0.78;
        // EMj[14][5]=1.63;
        ////////////////////////////////
        /*
         *ЭТО
         * БЛЯДЬ
         *  СЕМНАДЦАТАЯ
         *         СТРОЧКА
         */
        EMj[15][0] = 1.22;
        EMj[15][1] = 1.09;
        EMj[15][2] = 1;
        EMj[15][3] = 0.93;
        EMj[15][4] = 0.86;
        EMj[15][5] = 0.80;
        ////////////////////////////////
        /*
         *А ЭТО
         * БЛЯДЬ
         *  ШЕСТНАДЦАТАЯ
         *         СТРОЧКА
         *       !!!!
         *       !!!!
         *       !!!!
         *       !!!!
         *       !!!!
         * !!!!!!!!!!!!!!!!!
         * !!!!!!!!!!!!!!!!!
         */
        EMj[16][0] = 1.43;
        EMj[16][1] = 1.14;
        EMj[16][2] = 1;
        EMj[16][3] = 1;
        EMj[16][4] = 1;
        //EMj[14][5]=1.63;
        //////////////////////


    }

    public static void EMiStorage() {
        EMi[0][0] = 2.12;
        EMi[0][1] = 1.62;
        EMi[0][2] = 1.26;
        EMi[0][3] = 1;
        EMi[0][4] = 0.83;
        EMi[0][5] = 0.63;
        EMi[0][6] = 0.50;
///////////////////////////////////
        EMi[1][0] = 1.59;
        EMi[1][1] = 1.33;
        EMi[1][2] = 1.22;
        EMi[1][3] = 1;
        EMi[1][4] = 0.87;
        EMi[1][5] = 0.74;
        EMi[1][6] = 0.62;
///////////////////////////////////
        EMi[2][0] = 0.49;
        EMi[2][1] = 0.60;
        EMi[2][2] = 0.83;
        EMi[2][3] = 1;
        EMi[2][4] = 1.33;
        EMi[2][5] = 1.91;
        EMi[2][6] = 2.72;
///////////////////////////////////
        //   EMi[2][0]=0.49  ;
        //   EMi[2][1]=0.60 ;
        EMi[3][2] = 0.95;
        EMi[3][3] = 1;
        EMi[3][4] = 1.07;
        EMi[3][5] = 1.15;
        EMi[3][6] = 1.24;
///////////////////////////////////
        //EMi[4][0]=0.49  ;
        //EMi[4][1]=0.60 ;
        EMi[4][2] = 0.87;
        EMi[4][3] = 1;
        EMi[4][4] = 1.29;
        EMi[4][5] = 1.81;
        EMi[4][6] = 2.61;
///////////////////////////////////
        EMi[5][0] = 1.43;
        EMi[5][1] = 1.30;
        EMi[5][2] = 1.10;
        EMi[5][3] = 1;
        EMi[5][4] = 0.87;
        EMi[5][5] = 0.73;
        EMi[5][6] = 0.62;
///////////////////////////////////
        // EMi[4][0]=0.49  ;
        EMi[6][1] = 1.43;
        EMi[6][2] = 1.14;
        EMi[6][3] = 1;
        EMi[6][4] = 1;
        // EMi[4][5]=1.81;
        // EMi[4][6]=2.61;


    }

    public static void CDkStorage() {
        CDk[0][0] = 0.75;
        CDk[0][1] = 0.88;
        CDk[0][2] = 1;
        CDk[0][3] = 1.15;
        CDk[0][4] = 1.4;
        //////////////////////
        CDk[1][1] = 0.94;
        CDk[1][2] = 1;
        CDk[1][3] = 1.08;
        CDk[1][4] = 1.16;
        //////////////////////////
        CDk[2][0] = 0.70;
        CDk[2][1] = 0.85;
        CDk[2][2] = 1;
        CDk[2][3] = 1.15;
        CDk[2][4] = 1.3;
        CDk[2][5] = 1.65;
        /////////////////////////////
        //  CDk[3][0]=0.70 ;
        // CDk[3][1]=0.85;
        CDk[3][2] = 1;
        CDk[3][3] = 1.11;
        CDk[3][4] = 1.3;
        CDk[3][5] = 1.66;
        /////////////////////////////
        // CDk[4][0]=0.70 ;
        // CDk[4][1]=0.85;
        CDk[4][2] = 1;
        CDk[4][3] = 1.06;
        CDk[4][4] = 1.21;
        CDk[4][5] = 1.56;
        //////////////////////
        //  CDk[5][0]=0.70 ;
        CDk[5][1] = 0.87;
        CDk[5][2] = 1;
        CDk[5][3] = 1.15;
        CDk[5][4] = 1.3;
        // CDk[5][5]=1.65 ;
        ///////////////////////
        // CDk[6][0]=0.07 ;
        CDk[6][1] = 0.87;
        CDk[6][2] = 1;
        CDk[6][3] = 1.07;
        CDk[6][4] = 1.15;
        //  CDk[6][5]=1.65 ;
        /////////////////////////
        CDk[7][0] = 1.46;
        CDk[7][1] = 1.17;
        CDk[7][2] = 1;
        CDk[7][3] = 0.86;
        CDk[7][4] = 0.71;
        //       CDk[7][5]=1.65 ;
        /////////////////////////
        CDk[8][0] = 1.29;
        CDk[8][1] = 1.13;
        CDk[8][2] = 1;
        CDk[8][3] = 0.91;
        CDk[8][4] = 0.82;
        //  CDk[2][5]=1.65 ;
        /////////////////////////
        CDk[9][0] = 1.42;
        CDk[9][1] = 1.17;
        CDk[9][2] = 1;
        CDk[9][3] = 0.86;
        CDk[9][4] = 0.70;
        //   CDk[2][5]=1.65 ;
        /////////////////////////
        CDk[10][0] = 1.21;
        CDk[10][1] = 1.1;
        CDk[10][2] = 1;
        CDk[10][3] = 0.9;
        // CDk[10][4]=1.3 ;
        // CDk[10][5]=1.65 ;
        /////////////////////////
        CDk[11][0] = 1.14;
        CDk[11][1] = 1.07;
        CDk[11][2] = 1;
        CDk[11][3] = 0.95;
        //CDk[2][4]=1.3 ;
        //  CDk[2][5]=1.65 ;
        ////////////////////////
        CDk[12][0] = 1.24;
        CDk[12][1] = 1.1;
        CDk[12][2] = 1;
        CDk[12][3] = 0.91;
        CDk[12][4] = 0.82;
        //CDk[2][5]=1.65 ;
        /////////////////////////////
        CDk[13][0] = 1.24;
        CDk[13][1] = 1.1;
        CDk[13][2] = 1;
        CDk[13][3] = 0.91;
        CDk[13][4] = 0.83;
        // CDk[2][5]=1.65 ;
        //////////////////////
        CDk[14][0] = 1.23;
        CDk[14][1] = 1.08;
        CDk[14][2] = 1;
        CDk[14][3] = 1.04;
        CDk[14][4] = 1.1;
        // CDk[2][5]=1.65 ;


    }

    public static void EAF() {

    }

    public static void BasicSource() {

    }

    public static void calc9() {

        CDkStorage();
        for (int i = 0; i < CDk.length; i++) {
            System.out.println();
            for (int j = 0; j < CDk[0].length; j++) {

                if (CDk[i][j] != 0) {
                    System.out.print(CDk[i][j]);
                    System.out.print('|');
                } else {
                    System.out.print("Null");
                    System.out.print('|');
                }
            }

        }
        // System.out.println(CDk.length);

    }

    public static void ConsoleVisual_basicCOCOMO() {
        int projectLevel = 0;
        boolean gate = false;
        Scanner scanner = new Scanner(System.in);
       int[] currentArray = new int[CDk.length];


        System.out.println("\nУкажите сложность проекта:\n1 - Распространённый\n2 - Полунезависимый\n3 - Встроенный");
        while (gate == false) {
             diff = scanner.nextInt();
            if ((diff == 1) || (diff == 2) || (diff == 3)) {
                //System.out.println("молодец");
                projectLevel = diff--;
                gate = true;
            } else {
                System.out.println("говно, переделывай!");
            }

        }
        System.out.println("Вы выбрали вариант " + projectLevel++);
        gate = false;

        CDkStorage();

        for (int i = 0; i < CDk.length; i++) {
            System.out.println("\n Выберите важность атрибута Стоимости от 1 до 6");
            System.out.println(costDrivers[i] );
                     for (int j= 0;j<CDk[i].length;j++){
                        double currentNum = CDk[i][j];
                        String currentString = Double.toString(currentNum);
                        if (currentNum==0.0){
                            currentString="NULL";
                        }
                         System.out.print("|"+currentString+" |");
                     }
                     System.out.println(" ");
                     gate = false;
            while (gate == false){



            currentArray[i]=scanner.nextInt();
                    currentArray[i]=currentArray[i]-1;
            if(   ( currentArray[i]>-1) && ( currentArray[i]<6) && (CDk[i][currentArray[i]]!=0)){
            System.out.println("Вы выбрали "+CDk[i][currentArray[i]]);
            gate =true;
            }
            else
            System.out.println("Нельзя выбрать NULL или другой не существующий параметр");

            }


        }
        System.out.println("Вы выбрали все элементы ");
        double result = 1;
        for (int i = 0; i < currentArray.length; i++){
             result=result*CDk[i][currentArray[i]];
           // System.out.println(result);
        }
        System.out.println("EAF Равна "+result);

        System.out.println("Введите количество тысяч строк кода  ");
        double countKSLOC = scanner.nextDouble();

        PM =result*BasicCocomo[diff][0]*Math.pow(countKSLOC,BasicCocomo[diff][1]);

        TM = (Math.pow(PM,BasicCocomo[diff][3]))*BasicCocomo[diff][2];

        System.out.println("PM-трудоемкость (чел.×мес.)\nTМ-время разработки в календарных месяцах");
        System.out.println("PM Равна "+PM+" TM Равна "+ TM);




        }



















       /* for (int i = 0; i < CDk.length; i++) {

           switch (i){
                case (0): System.out.println("\nУкажите сложность проекта:\n1 - Распространённый\n2 - Полунезависимый\n3 - Встроенный");
                    break;
               case (1): System.out.println("Вы выбрали вариант ");
                   break;
               case (2): System.out.println("Вы выбрали вариант ");
                   break;
               case (3): System.out.println("Вы выбрали вариант ");
                   break;
               case (4): System.out.println("Вы выбрали вариант ");
                   break;
               case (5): System.out.println("Вы выбрали вариант ");
                   break;
               case (6): System.out.println("Вы выбрали вариант ");
                   break;
               case (7): System.out.println("Вы выбрали вариант ");
                   break;
               case (8): System.out.println("Вы выбрали вариант ");
                   break;
               case (9): System.out.println("Вы выбрали вариант ");
                   break;
               case (10): System.out.println("Вы выбрали вариант ");
                   break;
               case (11): System.out.println("Вы выбрали вариант ");
                   break;
               case (12): System.out.println("Вы выбрали вариант ");
                   break;
               case (13): System.out.println("Вы выбрали вариант ");
                   break;
               case (14): System.out.println("Вы выбрали вариант ");
                   break;
            }*/

           /* while (gate == false) {

                int  rate = scanner.nextInt();
                if (rate >=1 && rate <=6) {
                    if ((CDk[i][rate-1]==0)&&(CDk[i][rate])!=0){

                    //System.out.println("молодец");
                    projectLevel = ;
                    gate = true;

                    }
                }
            }*/
        }


