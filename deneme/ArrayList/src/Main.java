import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(null);
        list.add(2,15);//araya eklme
        list.set(2,25);//değer değiştirme için
        /*Iterator<Integer> itr =list.iterator();
        while (itr.hasNext()){
            System.out.println(list);
        }*/
       // System.out.println(list.size());
        //System.out.println(list.get(2)); //2.sıradakini geri döndürmek için (try-catch kullanılabilir)
        System.out.println(list.indexOf(1)); //Hangisini bulmak istiyorsak
        System.out.println(list.lastIndexOf(1)); //son değerden indis numarası
        System.out.println(list.contains(10)); //arama işlemi sağlıyor.true döndürür.toksa false
        for (Integer element : list){
            //System.out.println(element);
        }

    }
}