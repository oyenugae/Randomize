class Main {
  public static void main(String[] args) {
    // this is randomizing numbers between 1 and n
    int n = 12;
    int i = 0;
    boolean found;
    int [] list = new int[n];
    list[n-1] = 0;
    while (list[n-1] == 0){
      found = false;
      int result = (int)(Math.random() * n)+1;
      for (int num : list) {
            if (num == result) {
                found = true;
                break;
            }
        }
      if (!(found)){
          list[i] = result;
          i++;
      }
    }
    
    for (int j=0; j<n; j++){
      if (j%2 != 0)
        System.out.println(list[j]);
      else
        System.out.print(list[j]+"|");
    }
    
  }
}