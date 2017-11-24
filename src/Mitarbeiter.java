public class Mitarbeiter {

    private String name = "";
    private int alter = 0;
    private char geschlecht = 'n';

    public Mitarbeiter() {
        System.out.println("Willkommen...");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGeschlecht(char geschlecht){
        if(geschlecht == 'n' || geschlecht == 'm' || geschlecht == 'w'){
            this.geschlecht = geschlecht;
        }
    }

    public char getGeschlecht(){
        return geschlecht;
    }

    public void setAlter(int alter){
        if(alter > 0){
            this.alter = alter;
        } else {
            this.alter = 0;
        }
    }



    public int getAlter(){
        return alter;
    }

    public void arbeiten() {
        if(alter > 16) {
            if(name.equals("Horst")) {
                System.out.println(name + " schläft");
            }
            else {
                System.out.println(name + " arbeitet");
            }
        }
        else {
            System.out.println(name + " darf noch nicht arbeiten!");
        }
    }

    public int gibJahreBisZurRente() {
        return 67 - alter;
    }

    public void altern(int jahre){
        System.out.println("Es sind " + jahre + " Jahre vergangen.");
        alter += jahre;
        System.out.println(name + " ist jetzt " + alter + " Jahre alt");
    }

    public String toString(){
        return "Name: " + name + ", Alter: " + alter;
    }
}
