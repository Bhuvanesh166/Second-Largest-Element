import java.util.Scanner;

class SeccondLargest{
    public static int [] findSecondLargest(int arr[]){
        for(int i=0;i<2;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size:");
        int sze= scanner.nextInt();
        System.out.println("Enter array Element");
        int arr[]=new int[sze];
        for (int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Second largest Element");
        if(arr.length>=2) {
            findSecondLargest(arr);
            System.out.println(arr[1]);
        }
        else{
            System.out.println(-1);
        }
    }
}