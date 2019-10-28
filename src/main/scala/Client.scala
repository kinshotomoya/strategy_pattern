// ここは、実際にstarategyパターンで実装された処理を呼び出す
// usecase層をイメージすればいいと思う
class Clinet extends App{
  def janken = {
    // こんな感じで、文脈によって、具体的なstrategyを切り替えることで、
    // 同じような処理やけど、文脈によって少しちゃう処理をするものなど、
    // それぞれで具体strategyを作れるので、拡張性がある。
    val p1 = Player("tomoya", new RandomStrategy)
    val p2 = Player("nana", new GuuStrategy)
  }
}