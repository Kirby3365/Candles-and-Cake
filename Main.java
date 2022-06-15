class Main {
  public static void main(String[] args) {
    //Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    //Variables
    int numOfTries = 1000000;
    int numEachPieceHasCandle = 0;
    
    double candle1;
    double candle2;
    double cut;
    
    for(int i = 0; i < numOfTries; i++){
      candle1 = Math.random();
      candle2 = Math.random();
      cut = Math.random();

      if((candle1 < cut && cut < candle2) || (candle1 > cut && cut > candle2)){
        numEachPieceHasCandle++;
      }
    }
    
    double precentCandleOnEachPiece = ((double)numEachPieceHasCandle / numOfTries) * 100;
    
    System.out.println("Precent of time the cake has a candle on each piece: " + precentCandleOnEachPiece + "%");
  }
}