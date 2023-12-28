
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double math1 []= new double[15];
        int chislo=0;
        int j=0;
        for ( double element : math1){
            element=Math.random()*100-50;
            math1[j]=element;
            if (math1[j]>0){
                chislo++;
            }
            j++;

        }
        System.out.println(Arrays.toString(math1));

        double gygfg1[]=new double[chislo];
        int index=0;
        int t=0;
        for(double element2:math1){
            math1[t]=element2;
            if (math1[t]>0){
                gygfg1[index]=math1[t];
                index++;
            }
            t++;
        }

        System.out.println("массив с позитивными числами");
        System.out.println(Arrays.toString(gygfg1));

        double sum=0;
        int r=0;
        for (double element2:gygfg1){
            sum=sum+gygfg1[r];
            r++;
        }
        System.out.println("сумма второго массива"+sum);
        System.out.println("среднее арифметическое число массива"+sum/gygfg1.length);


    }
}