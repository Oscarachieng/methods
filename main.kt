class Player (var name: String, var surname: String){

  var totalScore = 0
  var PersonalbestScore = 0

  fun fullName(): String{
    return name + " " + surname
  }
  
}

class Scores(){

  fun checkBest(best: Int, current: Int){
    if(current > best){
      return current;
    }
    return best;
  }
}



fun main() {
  val player1 = Player("Arnold", "Origi")
  val Player2 = Player("Erick", "Ochieng")

  val scoring = scoring()
  var lvlScore = 0

  player1.personalBestScore = scoring.checkBest(player1.personalBestScore,lvlScore)                      
}