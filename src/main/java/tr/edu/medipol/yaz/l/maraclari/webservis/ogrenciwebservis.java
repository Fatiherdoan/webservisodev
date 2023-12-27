package tr.edu.medipol.yaz.l.maraclari.webservis;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class ogrenciwebservis<ogrenciListesi> {

    public record ogrenci(String adsoyad, String numara) {
    }

    private static final List<ogrenci> ogrenciListesi = new ArrayList<>(); 

    static {
	ogrenciListesi.add(new ogrenci("ahmet veli","1"));
      ogrenciListesi.add(new ogrenci("ayse fatma","2"));
      ogrenciListesi.add(new ogrenci("mehmet emin","3"));
    }

    @GetMapping("/")
    public  List <ogrenci> listele() {
        return ogrenciListesi;
    }
}

