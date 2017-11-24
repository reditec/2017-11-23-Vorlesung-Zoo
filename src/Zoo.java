public class Zoo {

    public Mitarbeiter[] mitarbeiter;

    public Zoo() {
        mitarbeiter = new Mitarbeiter[100];

        mitarbeiter[0] = new Mitarbeiter();
        mitarbeiter[1] = new Mitarbeiter();
        mitarbeiter[0].setName("Horst");
        mitarbeiter[1].setName("Horst");
        mitarbeiter[1].setAlter(-100);

        mitarbeiter[1].altern(20);

        System.out.println(mitarbeiter[0]);
        System.out.println(mitarbeiter[1]);

        System.out.println("Jahre bis zur Rente: " + mitarbeiter[1].gibJahreBisZurRente());

        mitarbeiter[0].arbeiten();
        mitarbeiter[1].arbeiten();
    }
}
