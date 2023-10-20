import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startGameHour = input.nextInt();
        int startGameMinutes = input.nextInt();
        int finishGameHour = input.nextInt();
        int finishGameMinute = input.nextInt();

        int hours = finishGameHour - startGameHour;
        int minutes = finishGameMinute - startGameMinutes;

        if (hours < 0) {
            hours = 24 + (finishGameMinute - startGameMinutes);
        }

        if (minutes < 0) {
            minutes = 60 + (finishGameMinute - startGameMinutes);
            hours--;
        }

        if (startGameMinutes == finishGameMinute && startGameHour == finishGameHour) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.println(("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)"));
        }
    }
}
