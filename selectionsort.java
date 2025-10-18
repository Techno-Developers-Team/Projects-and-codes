import java.util.*;

class hi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++)  
        {   
        arr[i]=sc.nextInt();  
        }  
        for(int i=0; i<n;i++){
            int m = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[m];
            arr[m]=temp;
            System.out.println(arr[i]);
        }
    }

}
