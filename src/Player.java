public class Player {

    boolean colour;
    String name;

    //kolor samemu się wybiera czy dogórnie? jak samemu to jak podać booleana?

    //narazie jak się jest pierwszym graczem to się jest białymi później można wymyślić jak przekazyć?

    Player(){
        this.name = "human";
        this.colour = false;
    }

    //jak gramy z komputerem to sami sobie wybieramy kolor a on dodstaje ten drugi?
    Player(Player player){
        this.name = "";
        this.colour = !player.colour;
    }

}
