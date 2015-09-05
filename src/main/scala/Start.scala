/**
 * Created by User on 17/01/2015.
 */
object Start {

    def main(args: Array[String]): Unit = {
        val rng = SimpleRNG(42)
        println(rng)
        val (n1, rng2) = rng.nextInt
        println(n1)
        println(rng2)
        val (n2,rng3)=rng2.nextInt
        println(n2)
        println(rng3)
    }

}
