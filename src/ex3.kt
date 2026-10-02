class MessageRunnable(private val nomThread: String) : Runnable {
    override fun run() {
        for (i in 1..5) {
            println("[$nomThread] - Message numéro $i")
            Thread.sleep(10)
        }
    }
}

fun main() {
    val runnable1 = MessageRunnable("Thread-1")
    val runnable2 = MessageRunnable("Thread-2")
    val runnable3 = MessageRunnable("Thread-3")

    val thread1 = Thread(runnable1)
    val thread2 = Thread(runnable2)
    val thread3 = Thread(runnable3)

    thread1.start()
    thread2.start()
    thread3.start()
}