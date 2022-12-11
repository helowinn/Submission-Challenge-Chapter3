import view.MainView
import view.SuitCallback

class Main {
    companion object : SuitCallback {
        @JvmStatic
        fun main(args: Array<String>) {
            do {
                val mainMenu = MainView()
                mainMenu.startGame(this)
                println("\n")
                print("Main lagi? Y/N")
                val lanjutMain = readLine()!!.toUpperCase()
            }while (lanjutMain == "Y")

        }

        override fun kirimNilaiBalik(hasil: String) {
            print(hasil)
        }
    }
}