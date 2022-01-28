import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1=0,sayi2=0,buyuk=0,kucuk=0,ebob=0,ekok=0,ekokTest=0;

        System.out.print("1. Sayiyi girin: ");
        sayi1=input.nextInt();

        System.out.print("2. Sayiyi girin: ");
        sayi2=input.nextInt();

        if(sayi1>sayi2){
            buyuk=sayi1;
            kucuk=sayi2;
        }else{
            buyuk=sayi2;
            kucuk=sayi1;
        }

        /*
        for(int i=1;i<=kucuk;i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                System.out.println("Ortak Bolen:" + i);
                ebob = i;
            }
        }
         */

       /*
       for(int i=kucuk;i>=1;i--)
        {
            if((sayi1 % i == 0) && (sayi2 % i ==0)){
            System.out.println("Ortak Bolen:"+i);
            ebob = i;
            break;
            }

        }
        */

        int ii = kucuk;
        while(ii>1){
            if((sayi1 % ii == 0) && (sayi2 % ii ==0)){
                System.out.println("Ortak Bolen:"+ii);
                ebob = ii;
                break;
            }
            ii--;
        }

        for(int i=1;i<=(sayi1*sayi2);i++){
            if((i % sayi1 == 0) && (i % sayi2 ==0))
            {
                ekok = i;
                break;
            }
        }

        int iii=1;
        while(iii<=(sayi1*sayi2)){
            if((iii % sayi1 == 0) && (iii % sayi2 ==0))
            {
                ekok = iii;
                break;
            }
            iii++;
        }


        ekokTest = (sayi1*sayi2)/ebob;

        System.out.println("EBOB: "+ebob + " , EKOK: " +ekok + " EKOKTEST:"+ekokTest);
    }
}
