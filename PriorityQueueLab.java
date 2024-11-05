// import statements
import java.util.Scanner;
import java.util.PriorityQueue;
import java.io.File;
import java.io.FileNotFoundException;

public class PriorityQueueLab {
  public static void main(String args[]){
    try{
        File file = new File("RandIntegers.txt");
        Scanner fileScanner = new Scanner(file);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(fileScanner.hasNextInt()){
            pq.add(fileScanner.nextInt());
        }
        for(int i = pq.size(); i > 0; i--){
            System.out.println(pq.remove());
        }
    }
    catch(FileNotFoundException e){
            System.out.println("no file");
        }
  }
}

