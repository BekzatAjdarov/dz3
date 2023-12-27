
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

        double gygfg=0;
        int r=0;
        for(double element:math1){
            gygfg=gygfg+math1[r];
            r++;
        }
        System.out.println("среднее арифметическое число;"+gygfg/math1.length);

    }
}