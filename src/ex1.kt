import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Entrer le premier nombre : ")
    val nombre1 = scanner.nextDouble()

    print("Entrer le deuxième nombre : ")
    val nombre2 = scanner.nextDouble()

    val somme = nombre1 + nombre2
    println("Addition : $nombre1 + $nombre2 =$somme")

    val soustraction = nombre1 - nombre2
    println("Soustraction : $nombre1 - $nombre2 =$soustraction")

    val multiplication = nombre1 * nombre2
    println("Multiplication : $nombre1 * $nombre2 =$multiplication")

    if (nombre2 == 0.0) {
        println(" Division : Erreur, impossible de diviser par zéro.")
    } else {
        val division = nombre1 / nombre2
        println("• Division : $nombre1 / $nombre2 =$division")
    }

    if (nombre1 > nombre2) {
        println(" Comparaison : Le premier nombre ($nombre1) est supérieur au second ($nombre2).")
    } else if (nombre1 < nombre2) {
        println(" Comparaison : Le premier nombre ($nombre1) est inférieur au second ($nombre2).")
    } else {
        println(" Comparaison : Les deux nombres sont égaux.")
    }
}