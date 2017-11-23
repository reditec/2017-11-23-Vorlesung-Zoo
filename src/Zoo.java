public class Zoo {

    public Mitarbeiter[] mitarbeiter;

    public Zoo(){
        mitarbeiter = new Mitarbeiter[100];
        mitarbeiter[0] = new Mitarbeiter();
        mitarbeiter[1] = new Mitarbeiter();
        mitarbeiter[0].name = "Horst";
        mitarbeiter[1].arbeiten();


    }
}
