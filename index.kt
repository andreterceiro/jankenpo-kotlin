import java.util.Scanner
fun main() {
    println("\nJankenpo!")
    println("=======================")
    var userChoice = getUserChoice()
    println(userChoice)
}

fun getRandomComputerChoice(): String {
    return "1"
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
    return "You must enter 'p', 'r' or 's'"
}
