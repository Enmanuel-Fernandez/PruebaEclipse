import java.util.*; 
  
class cosa { 
    
      // Main Method 
    public static void main(String args[]) 
    { 
        // Creating empty priority queue 
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); 
  
        // Adding items to the pQueue using add() 
        pQueue.add(10); 
        pQueue.add(20); 
        pQueue.add(15); 
        
        for (int i=0; i<3;i++) {
        	System.out.println(pQueue.poll());
        }
        //System.out.println(pQueue);
    }
}