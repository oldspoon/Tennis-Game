package nl.secondfloor;

/**
 * 1. A game is won by the first player to have won at least four points in total and at least two points more than the opponent.
 * <p>
 * 2. The running score of each game is described in a manner peculiar to tennis:
 * Scores from zero to three points are described as "Love", "Fifteen", "Thirty", and "Forty" respectively.
 * <p>
 * 3. When both sides have won the same number of points within a given game - i.e., when each side has won one, or two, points -
 * the score is described as "Fifteen all" and "Thirty all", respectively.
 * <p>
 * 4. If at least three points have been scored by each player, and the scores are equal, the score is "Deuce".
 * <p>
 * 5. If at least three points have been scored by each side and a player has one more point than his opponent,
 * the score of the game is "Advantage" for the player in the lead.
 */
public class TennisGame {

    private final Str   ing playerOneName;
    private final String playerTwoName;

    private int playerOneScore;
    private int playerTwoScore;

    public TennisGame(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public String getScore() {
        String playerOneString = "";
        String playerTwoString = "";
        // TODO
        // Naming scores
        //       switch

        //       case:

        //Assign string variables
        if (playerOneScore == 0) {
            playerOneString = "Love";
        }
        if (playerOneScore == 1) {
            playerOneString = "Fifteen";
        }
        if (playerOneScore == 2) {
            playerOneString = "Thirty";
        }
        if (playerOneScore == 3) {
            playerOneString = "Forty";
        }


        if (playerTwoScore == 0) {
            playerTwoString = "Love";
        }
        if (playerTwoScore == 1) {
            playerTwoString = "Fifteen";
        }
        if (playerTwoScore == 2) {
            playerTwoString = "Thirty";
        }
        if (playerTwoScore == 3) {
            playerTwoString = "Forty";
        }

        // Condition where score points are the same
        if (playerOneScore == 0 && playerTwoScore == 0) {
            return "Love all";
        }

        if (playerOneScore == 1 && playerTwoScore == 1) {
            return "Fifteen all";

        }
        if (playerOneScore == 2 && playerTwoScore == 2) {
            return "Thirty all";
        }

        if ((playerOneScore >= 3 && playerTwoScore >= 3) && playerOneScore == playerTwoScore)  {
            return "Deuce";
        }

        // Check Win Condition
        if (playerOneScore >= 4 && (playerOneScore - playerTwoScore >= 2)) {
            return playerOneName + " " + "wins";
        }
        if (playerTwoScore >= 4 && (playerTwoScore - playerOneScore >= 2)) {
            return playerTwoName + " " + "wins";
        }

        // Condition to check for Advantage
        if (playerOneScore >= 3 && playerTwoScore >= 3 && playerOneScore > playerTwoScore) {
            playerOneString = "Advantage";
            return playerOneString + " " + playerOneName;
        }

        if (playerOneScore >= 3 && playerTwoScore >= 3 && playerTwoScore > playerOneScore) {
            playerTwoString = "Advantage";
            return playerTwoString + " " + playerTwoName;
        }


        return playerOneString +"," + playerTwoString;
    }
    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }
}




