package sample;

public class Calculations
{
    //Basic cocomo
    public static double[] common = new double[] {2.4,1.05,2.5,0.38};
    public static double[] semi = new double[] {3.0,1.12,2.5,0.32};
    public static double[] integrated = new double[] {3.6,1.20,2.5,0.32};

    //
    public static double[][] CDk = new double[15][6];

    //intermidiant cocomo
    public static double[] common2 = new double[] {3.2,1.05};
    public static double[] semi2 = new double[] {3.0,1.12};
    public static double[] integrated2 = new double[] {2.8,1.20};



    public static void EAFsource()
    {
        CDk[0][0]=0.75 ;
        CDk[0][1]=0.88 ;
        CDk[0][2]=1 ;
        CDk[0][3]=1.15 ;
        CDk[0][4]=1.4 ;
        //////////////////////
        CDk[1][1]=0.94 ;
        CDk[1][2]=1;
        CDk[1][3]=1.08 ;
        CDk[1][4]=1.16 ;
        //////////////////////////
        CDk[2][0]=0.70 ;
        CDk[2][1]=0.85;
        CDk[2][2]=1 ;
        CDk[2][3]=1.15 ;
        CDk[2][4]=1.3 ;
        CDk[2][5]=1.65 ;
        /////////////////////////////
        //  CDk[3][0]=0.70 ;
        // CDk[3][1]=0.85;
        CDk[3][2]=1 ;
        CDk[3][3]=1.11 ;
        CDk[3][4]=1.3 ;
        CDk[3][5]=1.66 ;
        /////////////////////////////
        // CDk[4][0]=0.70 ;
        // CDk[4][1]=0.85;
        CDk[4][2]=1 ;
        CDk[4][3]=1.06 ;
        CDk[4][4]=1.21 ;
        CDk[4][5]=1.56 ;
        //////////////////////
        //  CDk[5][0]=0.70 ;
        CDk[5][1]=0.87;
        CDk[5][2]=1 ;
        CDk[5][3]=1.15 ;
        CDk[5][4]=1.3 ;
        // CDk[5][5]=1.65 ;
        ///////////////////////
        // CDk[6][0]=0.07 ;
        CDk[6][1]=0.87;
        CDk[6][2]=1 ;
        CDk[6][3]=1.07 ;
        CDk[6][4]=1.15 ;
        //  CDk[6][5]=1.65 ;
        /////////////////////////
        CDk[7][0]=1.46 ;
        CDk[7][1]=1.17;
        CDk[7][2]=1 ;
        CDk[7][3]=0.86 ;
        CDk[7][4]=0.71 ;
        //       CDk[7][5]=1.65 ;
        /////////////////////////
        CDk[8][0]=1.29 ;
        CDk[8][1]=1.13;
        CDk[8][2]=1 ;
        CDk[8][3]=0.91 ;
        CDk[8][4]=0.82 ;
        //  CDk[2][5]=1.65 ;
        /////////////////////////
        CDk[9][0]=1.42 ;
        CDk[9][1]=1.17;
        CDk[9][2]=1 ;
        CDk[9][3]=0.86 ;
        CDk[9][4]=0.70 ;
        //   CDk[2][5]=1.65 ;
        /////////////////////////
        CDk[10][0]=1.21 ;
        CDk[10][1]=1.1;
        CDk[10][2]=1 ;
        CDk[10][3]=0.9 ;
        // CDk[10][4]=1.3 ;
        // CDk[10][5]=1.65 ;
        /////////////////////////
        CDk[11][0]=1.14 ;
        CDk[11][1]=1.07;
        CDk[11][2]=1 ;
        CDk[11][3]=0.95 ;
        //CDk[2][4]=1.3 ;
        //  CDk[2][5]=1.65 ;
        ////////////////////////
        CDk[12][0]=1.24 ;
        CDk[12][1]=1.1;
        CDk[12][2]=1 ;
        CDk[12][3]=0.91 ;
        CDk[12][4]=0.82 ;
        //CDk[2][5]=1.65 ;
        /////////////////////////////
        CDk[13][0]=1.24 ;
        CDk[13][1]=1.1;
        CDk[13][2]=1 ;
        CDk[13][3]=0.91 ;
        CDk[13][4]=0.83 ;
        // CDk[2][5]=1.65 ;
        //////////////////////
        CDk[14][0]=1.23 ;
        CDk[14][1]=1.08;
        CDk[14][2]=1 ;
        CDk[14][3]=1.04 ;
        CDk[14][4]=1.1 ;
        // CDk[2][5]=1.65 ;
        }


   public static void calc9()
   {

       EAFsource();
         for (int i = 0; i < CDk.length; i++)
         {
           System.out.println();
           for (int j = 0; j < CDk[0].length; j++) {

         if(CDk[i][j]!=0){
           System.out.print(CDk[i][j]);
               System.out.print('|');
         }
         else{
             System.out.print("Null");
             System.out.print('|');
         }
           }

   }
      // System.out.println(CDk.length);

 }

    public static void ConsoleVisual(){
        boolean gate;
        char diff;
        System.out.println("Укажите сложность проекта:\n1 - Распространённый\n2 - Полунезависимый\n3 - Встроенный");
        while(gate = false){
            if(diff!= "1"||"2"||"3")
        }
        System.in.read()
    }

}
