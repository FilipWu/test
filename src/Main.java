import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Float> s2_oceny = new ArrayList<>();
        s2_oceny.add(4.0f);
        s2_oceny.add(4.5f);
        s2_oceny.add(3.5f);
        s2_oceny.add(5.0f);

        List<Float> s3_oceny = new ArrayList<>();
        s3_oceny.add(5.0f);
        s3_oceny.add(4.0f);
        s3_oceny.add(4.5f);

    student s2 = new student("filip","waroch", (short) 5,"inzynierskie",
            s2_oceny,900);

    student s3 = new student("jacek","krawczyk", (short) 2, "licencjackie",
            s3_oceny, 90);

        s2.wyswietl();
        System.out.println("zostały ci " + s2.liczbaSemestrowDoKoncaStudiow() + " semestry");
        System.out.println("twoja średnia to " + s2.sredniaocen());
        System.out.println("czy przysługuje akademik - " + s2.czyPrzyslugujeAkademik());
        System.out.println("twoje stypendium to " + s2.kwotaStypentium() + "zł");
        System.out.println();
        s3.wyswietl();
        System.out.println("zostały ci " + s3.liczbaSemestrowDoKoncaStudiow() + " semestry");
        System.out.println("twoja średnia to " + s3.sredniaocen());
        System.out.println("czy przysługuje akademik - " + s3.czyPrzyslugujeAkademik());
        System.out.println("twoje stypendium to " + s3.kwotaStypentium() + "zł");
    }
}
