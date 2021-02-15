public class TruthTableGenerator{
// Function to print the output 
  static void printTheArray(int[] arr, int n){ 
    //print the inputs of the circuit
    for (int i = 0; i < n; i++)  
      System.out.print(arr[i]+" "); 
    
    //print the output of the circuit
    System.out.print((transfer(arr[0]) && transfer(arr[1])) || (reversal(arr[0]) && reversal(arr[1])) || (reversal(arr[1]) && transfer(arr[2])));
    System.out.println(); 
  } 
  
// Function to generate all binary strings 
  static void generateAllBinaryStrings(int n, int arr[], int i){ 
    if (i == n){  
      printTheArray(arr, n); 
      return;
    }
  
    // First assign "0" at ith position 
    // and try for all other permutations 
    // for remaining positions 
    arr[i] = 0; 
    generateAllBinaryStrings(n, arr, i + 1); 
  
    // And then assign "1" at ith position 
    // and try for all other permutations 
    // for remaining positions 
    arr[i] = 1; 
    generateAllBinaryStrings(n, arr, i + 1); 
  } 
  
  //transfer from number (0/1) to state (on/off)
  public static boolean transfer(int i){
    if (i == 0) return false;
  return true;
  }
 
  //reverse the state of an input
  public static boolean reversal(int i){
    if (i == 1) return false;
   return true;  
  }
 
  //reverse the state of an output
  public static boolean reversal(boolean i){
    if (i) return false;
    return true;  
  }
  
  public static void main(String[] args){
    int[] arr = new int[Integer.parseInt(args[0])];
    TruthTableGenerator.generateAllBinaryStrings(Integer.parseInt(args[0]), arr, 0);
  }
  
}