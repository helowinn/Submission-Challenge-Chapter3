package view

import java.util.*

class MainView {

    var hasil = String()

    fun startGame(listener: SuitCallback) {
        println("============================================")
        println(">>>>>>> GAME SUIT TERMINAL VERSION <<<<<<<<<<")
        println("============================================")
        println(" Tentukan pilihan anda sekarang ! ")
        println(" Batu ")
        println(" Gunting ")
        println(" Kertas ")

        println("Masukkan pilihan Pemain 1 : ")
        val playerSatu = readLine()!!.lowercase()
        println("Masukkan pilihan Pemain 2 : ")
        val playerDua = readLine()!!.lowercase(Locale.getDefault())
        println("Hasil : ")


        if (playerSatu.equals(playerDua)) {
            hasil = "Seri"
        } else if (playerSatu == "batu" && playerDua == "gunting" || playerSatu == "gunting" && playerDua == "kertas" ||
            playerSatu == "kertas" && playerDua == "batu"
        ) {
            hasil = "Player satu menang! "
        } else if (playerDua == "batu" && playerSatu == "gunting" || playerDua == "gunting" && playerSatu == "kertas" ||
            playerDua == "kertas" && playerSatu == "batu"
        ) {
            hasil = "Player Dua menang!"
        } else {
            hasil = "Input salah! Silahkan masukkan ulang "
        }
        listener.kirimNilaiBalik(hasil)
    }
}