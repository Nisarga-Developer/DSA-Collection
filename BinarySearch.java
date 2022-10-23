import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BinarySearch
{
    public void bubbleSort(int[] arr) 
    {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++)
        {  
            for(int j=1; j < (n-i); j++)
            {  
                if(arr[j-1] > arr[j])
                {  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
    }  

    public boolean binarySearch(int[] arr, int n)
    {
        boolean found = false;
        int L = 0, U = arr.length - 1, M = 0;
        while(L<=U){
            M = (L + U)/2;
            if(n > arr[M]){
                L = M + 1;
            }
            else if(n < arr[M]){
                U = M - 1;
            }
            else{
                found = true;
                break;
            }
        }
        
        if(found == true){
            // System.out.println("Found element at"+M);
            return true;
        }
        else{
            // System.out.println("Not Found");
            return false;
        }
    }

    public static void main(String args[]) throws IOException
    {
        BinarySearch obj = new BinarySearch();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Determining size of the array
        System.out.println("Enter the size of the array");
        int size = Integer.parseInt(br.readLine());
        
        // Array initialisation
        int[] arr = new int[size];
        
        System.out.println("Enter Array Elements");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // Clears the Screen and asks for which number to search for
        System.out.println("\fEnter the number to search for");
        int num = Integer.parseInt(br.readLine());

        // Sorting the array to let binarySearch() do it's work
        obj.bubbleSort(arr);
        
        // calling the binarySearch() method
        if(obj.binarySearch(arr, num))
        {
            System.out.println("The element is found");
        }
        else
        {
            System.out.println("The element is not found");
        }
    }
}

