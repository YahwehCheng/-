import java.util.Scanner;
public class maxSubArray {

    public static int maxSubArrayMethodTwo(int arr[]){
        int size =arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){

            int sum=0;
            for(int j=i;j<size;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=Integer.parseInt(sc.next());
        //number表示数组的长度
        int[] num=new int[number];

        //对数组元素循环赋值
        for(int i=0;i<number;i++){
            num[i]=(int)sc.nextInt();
        }
        System.out.println(maxSubArrayMethodTwo(num));

    }

}
