import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("saisir la note du examen1 :\n")
    val note1 = scanner.nextDouble()

    print("saisir la note du examen2 :\n")
    val note2 = scanner.nextDouble()

    print("saisir la note du examen3 :\n")
    val note3 = scanner.nextDouble()

    val moyenne = (note1 + note2 + note3) / 3.0

    val pourcentage = (moyenne / 20.0) * 100.0

    println("\nLa moyenne est : $moyenne")

    if (pourcentage >= 80.0) {
        println("Réussi avec mention excellente")
    } else if (pourcentage >= 50.0) {
        println("Réussi")
    } else {
        println("Échoué")
    }
}