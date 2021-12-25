public class GameFlow {

    Player player0, player1;
    boolean turn; //false - player0; true - player1

    boolean areWeStillPlaying = true;

// jak imie przekazywaź hmhmhhmhmh- chyba jednak nie?


    public void decideGameType(boolean gameMode){
        if(!gameMode){  // gramy z komputrem
            humanVsComputer();
        }else{  //gramy z ludziem
            humanVsHuman();
        }
    }

    public void humanVsComputer(){

        player0 = new Player(); // człwoiek zaczyna deafultowo
        player1 = new Player(player0);

        turn = player0.colour;

        while(areWeStillPlaying){

        }

    }
    public void humanVsHuman(){

        player0 = new Player();
        player1 = new Player(player0);
        player1.name = "guest";

        turn = player0.colour;

        while(areWeStillPlaying){

        }


    }







}
