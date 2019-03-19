package lab2;

public class Main {



    public static void main(String[] args) {

        // Person p1 = new Person("Bill", "Gates");
        // Person p2 = new Person("Gal", "Anonim");
        // System.out.println(p1);
        // System.out.println(p2);
        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");

        Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");

        EmailRecipient[] spamList = new EmailRecipient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;

        for (EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }
        //zad 3
        ((Student) s1).addGrade(2);
        ((Student) s1).addGrade(3);
        ((Student) s1).addGrade(4);
        System.out.println(((Student) s1).getGradesAverage());
        // zad 4
        University ZUT = new University("ZUT", "zut@edu.pl");
        Faculty Informatyka = new Faculty("Informatyka", "dupa@wp.pl");
        Faculty Automatyka = new Faculty("Automatyka", "chuj@wp.pl");

        ZUT.addFaculty(Informatyka);
        ZUT.addFaculty(Automatyka);
        ZUT.getFaculties();


        Teacher Iwonka = new Teacher("Iwona", "Drzeniecka", "idrzeniecka@zut.edu.pl", "Inglisz");
        Teacher Lempek = new Teacher("Mateusz", "Lempek", "mlempek@wp.pl", "lelagule");
        Informatyka.addTeacher(Iwonka);
        Informatyka.addTeacher(Lempek);
        Informatyka.getTeacher();
        //Informatyka.
        System.out.println("Hello World!");


    }
}
