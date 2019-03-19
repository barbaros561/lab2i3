package lab3;
import lab2.*;

import javax.xml.bind.attachment.AttachmentUnmarshaller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.rmi.StubNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        //zad 1
        Map<String, String> dniTygodnia = new HashMap<>();
        dniTygodnia.put("pn", "poniedziałek");
        dniTygodnia.put("wt", "wtorek");
        dniTygodnia.put("śr", "środa");
        dniTygodnia.put("czw", "czwartek");
        dniTygodnia.put("pt", "piątek");
        dniTygodnia.put("sob", "sobota");
        dniTygodnia.put("nie", "niedziela");

        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");

        System.out.println(zbiorDni);

        //zad 2

        Teacher t1 = new Teacher("Iwona", "Drzeniecka", "idrzeniecka@zut.edu.pl", "Inglisz");
        Teacher t2 = new Teacher("Jezrzy", "Pejas", "jpejas@zut.edu.pl", "POI");
        Teacher t3 = new Teacher("Mikhailov", "Fedorov", "mfedorov@zut.pl", "PO");

        Student s1 = new Student("Karol", "Kondracki", "kkondracki@wi.zut.edu.pl", "32B");
        Student s2 = new Student("Łukasz", "Warchulski", "lwarchulski@wi.zut.edu.pl", "32B");
        Student s3 = new Student("Mateusz", "Lempek", "mlempek@wi.zut.edu.pl", "32B");
        Student s4 = new Student("Pan", "Przykładowy", "przykladowy@wi.zut.edu.pl", "32B");
        Student s5 = new Student("Tomek ", "Młynek", "tmlynek@wi.zut.edu.pl", "32A");
        Student s6 = new Student("Janek ", "Raz", "jraz@wi.zut.edu.pl", "32A");
        Student s7 = new Student("Piotr ", "Dwa", "pdwa@wi.zut.edu.pl", "32A");
        Student s8 = new Student("Adam ", "Trzy", "atrzy@wi.zut.edu.pl", "32A");
        Student s9 = new Student("Sebastian ", "Cztery", "scztery@wi.zut.edu.pl", "32A");


        Map<Teacher, String> ticzery = new HashMap<>();
        ticzery.put(t1, t1.getCourseName());
        ticzery.put(t2, t2.getCourseName());
        ticzery.put(t3, t3.getCourseName());

        for(Teacher ticzer : ticzery.keySet()) {
            String przedmiot = ticzery.get(ticzer);
            if (przedmiot == "PO") {
                System.out.println(ticzer + " - " + przedmiot);
            }
        }
        System.out.println();
        List<Student > grupa32B = new ArrayList<>();
        grupa32B.add(s1);
        grupa32B.add(s2);
        grupa32B.add(s3);
        grupa32B.add(s4);

        List<Student> grupa32A = new ArrayList<>();
        grupa32A.add(s5);
        grupa32A.add(s6);
        grupa32A.add(s7);
        grupa32A.add(s8);
        grupa32A.add(s9);

        Map<String, List<Student>> grupy = new HashMap<>();
        grupy.put("32A", grupa32A);
        grupy.put("32B", grupa32B);

        for(String skrot : grupy.keySet()) {
            if (skrot == "32B"){
                System.out.println("Studenci w grupie 32B to: ");
                List<Student> lista = grupy.get(skrot);
                for(Student dupa : lista){
                    System.out.println(dupa);
                }
            }
        }
        // zad 3
        //System.out.println("Working Directory = " +
         //       System.getProperty("user.dir"));
        try {
            BufferedReader in = new BufferedReader(new FileReader("plik.txt"));
            List<Product > produkty = new ArrayList<>();
                String s = in.readLine();

            while(s!=null) {
                //System.out.println(s);
                String[] pola = s.split(";");
                //System.out.println(pola[0]);   // 10
                //System.out.println(pola[1]);   // poniedziałek
                //System.out.println(pola[2]);
                //System.out.println(pola[3]);
                Product p = new Product(Integer.parseInt(pola[0]), pola[1],pola[2], Double.parseDouble(pola[3]));
                produkty.add(p);
                s = in.readLine();
            }
            Map<Integer, Product> znajdzPoId = new HashMap<>();
            for (Product id : produkty){
                znajdzPoId.put(id.getId(),id);
            }

            Map<String, List<Product>> znajdzPoKat = new HashMap<>();
            for (Product produkt1 : produkty ){
                if (!znajdzPoKat.containsKey(produkt1.getCategory())){
                    znajdzPoKat.put(produkt1.getCategory(), new ArrayList<Product>(){});

                }
                znajdzPoKat.get(produkt1.getCategory()).add(produkt1);
            }

            for (List<Product> lista : znajdzPoKat.values()){
                for (Product dupa :lista) {
                    System.out.println(dupa);

                }

            }






        }catch(Exception ex){
            System.err.println(ex);
        }
    }
}