class Primes1 {
  public static void main(String[] args) {
    int size = 100;

    boolean[] possiblePrime = new boolean[size];

    for (int i=0; i < possiblePrime.length; i++)
    {
      possiblePrime[i] = true;
    }

    for (int i=2; i < possiblePrime.length; i++)
    {
      if (possiblePrime[i] == true)
      {
        System.out.println(i);
        for (int j = i+i; j < possiblePrime.length; j = j + i)
        {
          possiblePrime[j] = false;
        }
      }
    }
  }
}