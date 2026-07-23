import java.util.Arrays;
class secondLargest
{
    public static void main(String[] args) {
        
        int arr[]={2,5,3,7,4};
        int temp=arr[0];

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
            temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}