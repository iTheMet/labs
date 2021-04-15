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



    public static void calc9234()
    {
        CDk[0][0]=0.75 ;
        CDk[0][1]=0.88 ;
        CDk[0][2]=1 ;
        CDk[0][3]=1.15 ;
        CDk[0][4]=1.4 ;
        }


   public static void calc9()
   {
       for (int j = 0; j < 4; j++) {

           System.out.println(common[j]);
       }


    }



}
