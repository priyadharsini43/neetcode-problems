import java.util.Scanner;
class replaceGreatest {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int max=-1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]>max)
                    {
                        max=arr[j];
                    }
                }
                arr[i]=max;
            }
            return arr;
        }
    public static void main(String[] args)
    { 
        int[] arr={17,18,5,4,6,1};
replaceGreatest obj=new replaceGreatest();   
        int[] result=obj.replaceElements(arr); 
       for(int i:result) {
            System.out.print(i + " ");
        }
    }
}
