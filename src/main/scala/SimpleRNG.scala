/**
 * Created by User on 17/01/2015.
 */
trait RNG {
  def nextInt:(Int,RNG)
}
case class SimpleRNG(seed: Long) extends RNG {
  def nextInt:(Int,RNG)={
    val newSeed=(seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL
    val nextRNG=SimpleRNG(newSeed)
    val n=(newSeed >>> 15).toInt
    (n,nextRNG)
  }
}
