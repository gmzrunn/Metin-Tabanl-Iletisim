import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Center {
    HashMap<Iletisimci,Integer> hashMap = new HashMap<>();
    ID id = new ID();


    public void kayit (Iletisimci kullanici){
        int a = id.generateId();

        hashMap.put(kullanici,a);

    }

    public void showMap (){
        for (Map.Entry<Iletisimci, Integer> entry : hashMap.entrySet()) {
            Iletisimci key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Iletisimci: " + key.getClass().getSimpleName() + ", ID: " + value);
        }
    }

    public void idGonder (){
        for (Iletisimci a : hashMap.keySet()) {
            for (Iletisimci b : hashMap.keySet()){
                a.IDtopla(b,hashMap.get(b));
            }

        }

    }




}

