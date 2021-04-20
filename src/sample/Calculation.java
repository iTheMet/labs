package sample;

public class Calculation {
//Ef = 1/Tok
public static double Ef;
    //Tok = К/Э
public  static  double Tok;
   public static double KapVlojAvtInf, EkonomEffect;

        //К<KapVlojAvtInf> = Кп + Кр
        public static double KapVlojNaProekt, KapVlojNaReal;

            //Кп<KapVlojNaProekt> = (1+Wd)*(1+Wc)+Wh)*Cумма m по i=1(Зoi + Cм+Мв)
            public static double Wd = 0.4, Wc = 0.302, Wh = 0.6;
            public  static double Zo1 = 17190.48, Zo2 = 38333.33, Mv;
            public  static int Sm;  //Sm = SQL таблица 1.5
                //Mv = Tmv * Smhours * Kmultiprogramm
                public static int Tmv = 460, Smhours = 20, Kmultiprogramm = 1;

            //Кр = Ко + Кдд + Кпп + Ксв + Киб + Кпк
            //Кр = 22500*1*6*247/(247*8) = 16875 руб
            public static int Kr;
                public static int StoimKomp = 22500, KolKomp = 1, Mvodn = 6, RabD = 247, TrD = 8; // Должен быть блять 80800 какого хуя

        //Э =(З1*Ak–З2)*N  - 16 СТР
        public static double Ztek1, Ak, Ztek2, Nrabot=1;



                //Ztek1 = ЗзП + Са + Зэ + Срем + Зм + Зн
                public static double /*Zzp1, /*Sa1, Ze1, Srem1, */Zm = StoimKomp * 0.01 /*,Zn1*/;

                    //Zzp1 = Сумма m по i=1(Ti * Зi(1+Wd)(1+Wc)) 1.13
                    public static double MTS = 714.29, PROG = 476.19, tm1 = 40, tpr1 = 20, Zzp1 = tm1*MTS*(1+Wd)*(1+Wc)+PROG*tpr1*(1+Wd)*(1+Wc);

                        public static int t1 = (int) ((tm1+tpr1)*TrD);
                        public static int Fef = RabD * TrD;
                    public static double Sa1 = (StoimKomp * 0.2 * KolKomp * t1)/ Fef;

                    public static double Ze1 = KolKomp * 0.4 * t1 * 2.6;

                        public static double Cp = 0.05;
                    public static double Srem1 = (Cp * StoimKomp * t1) / Fef;

                    public static double Zn1= (Zzp1 + Sa1 + Ze1 + Srem1 + Zm) * 0.2;

                //Ztek2 = ЗзП + Са + Зэ + Срем + Зм + Зн
                    public static double  tm2 = 60, tpr2 = 40, Zzp2 = tm2*MTS*(1+Wd)*(1+Wc)+PROG*tpr2*(1+Wd)*(1+Wc);

                        public static int t2 = (int) ((tm2+tpr2)*TrD);
                    public static double Sa2 = (StoimKomp * 0.2 * KolKomp * t2)/ Fef;

                    public static double Ze2 = KolKomp * 0.4 * t2 * 2.6;

                    public static double Srem2 = (Cp * StoimKomp * t2) / Fef;

                    public static double Zn2= (Zzp2 + Sa2 + Ze2 + Srem2 + Zm) * 0.2;

            public static double Z1= Ztek1 + 0.33 *80800/*Kr*/;
            public static double Z2= Ztek2 + 0.33 *161798.09/*А ЭТО ОТКУДА ЕБЫБОБЫ*/;

            //Ak = Jeta1 / Jeta2 -- SQL 1.1
            public static double Jeta1, Jeta2;


    public static void Calc(){

        System.out.println("Ef= "+Ef+"\nTok= "+Tok+"\nKapVlojAvtInf= "+KapVlojAvtInf+"\n" +
                "EkonomEffect= "+EkonomEffect);



    }




}
