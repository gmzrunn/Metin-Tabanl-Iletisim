import java.util.HashMap;

public interface Iletisimci {

    void mesajGonder();
    void mesajAl();
    void IDtopla();

    HashMap<Iletisimci,Integer> hashMap = new HashMap<>();




}

