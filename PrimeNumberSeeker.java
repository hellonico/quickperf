public class PrimeNumberSeeker extends Thread {
   private static final int ceiling = 100;
   private static final int interval = 1000;
   private static final int delay = 100;
   public int count = 0;
   public int current = 2;
   public int[] primes = null;
   public static void main(String[] a) {
      System.out.println("Period, Current int, # primes");
      PrimeNumberSeeker t = new PrimeNumberSeeker();
      t.start();
      int i = 0;
      while (true) {
         i++;
         System.out.println( i+", "+t.current+", "+t.count);
         try {
            sleep(interval);
         } catch (InterruptedException e) {
            System.out.println("Monitor interrupted.");
         }
      }
   }
   public void run() {
      primes = new int[ceiling];
      while (count < ceiling) {
         current++;
         int j = 2;
         boolean isPrime = true;
         while (j<current/2 && isPrime) {
            isPrime = current % j > 0;
            j++;
         }
         if (isPrime) {
            count++;
            primes[count-1] = current;
         }
         try {
            sleep(delay);
         } catch (InterruptedException e) {
            System.out.println("Runner interrupted.");
         }
      }
   }
}

