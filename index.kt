import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    println("\nJankenpo!")
    println("=======================")
    var userChoice = getUserChoice()
    var computerChoice = getRandomComputerChoice()
    
    println("")

    if ( (userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
        println("User win")
    } else if (userChoice.equals(computerChoice)) {
        println("Draw")
    } else {
        println("Computer win")
    }

    println("User selected: $userChoice")
    println("Computer selected: $computerChoice")
}

fun getRandomComputerChoice(): String {
    return "paper"
}

fun getUserChoice(): String {
    val scan = Scanner(System.`in`)
    print("\nPlease insert 'p' for paper, 'r' for 'rock or 's' for 'scissors': ")

    var userChoice = scan.nextLine()

    if (userChoice.equals("p")) {
        return "paper"
    } else if (userChoice.equals("r")) {
        return "rock"
    } else if (userChoice.equals("s")) {
        return "scissors"
    }
    println("You must enter 'p', 'r' or 's'\n")
    exitProcess(-1)
}
