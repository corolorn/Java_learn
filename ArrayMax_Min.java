import java.io.*;
import static java.lang.Math.*;
public class ArrayMax {
    public static void main(String[] args) throws Exception {
      // Создаем ридер с консоли
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int setArray = Integer.parseInt(br.readLine());
        
      // Обьявляем массив размером полученным с консоли и нужные переменные
        int array[] =  new int[setArray];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
      // Цикл заполняет массив 
        for (int i = 0;i<setArray;i++){
        array[i]=Integer.parseInt(br.readLine());}
        
      // Цикл поиска в массиве максимального и минимального числа
        for (int j = 0; j < array.length; j++){
        max = max(max, array[j]);
        min = min(min, array[j]);}
        
     // Вывод максимального и минимального 
        System.out.println(max);
        System.out.println(min)

        }

    }
