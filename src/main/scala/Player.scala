// context
// 状況に応じて、strategyを切り替える
case class Player(
  name: String,
  strategy: Strategys
){
  def nextHand = {
    strategy.nextHand
  }
}