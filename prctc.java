// import java.util.Scanner;
// public class prctc {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length = sc.nextInt();
//         int[] arr = new int[length];
//         for (int i = 0; i < length; i++) {
//             System.out.print("Enter element : ");
//             arr[i] = sc.nextInt();
//         }
//         int max_count = 0;
//         int max_element = 0;
//         for (int i = 0; i < length; i++) {
//             int count = 1;
//             for (int j = i + 1; j < length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             if (count > max_count) {
//                 max_count = count;
//                 max_element = arr[i];
//             }
//         }
//         System.out.println("Maximum frequency = " + max_count);
//         System.out.println("Element = " + max_element);
//         sc.close();
//     }
// }






// import java.util.Scanner;
// public class prctc{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         boolean found=false;
//         for(int i=0;i<length;i++){
//             int count=1;
//             for(int j=i+1;j<length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count>length/2){
//                 System.out.println("Majority element of an array is : "+arr[i]);
//                 found=true;
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println("No majority element");
//         }
//         sc.close();
//     }
// }







// import java.util.Scanner;
// public class prctc{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         int max_count=0;
//         int max_element=0;
//         int sec_count=0;
//         int sec_element=0;
//         for(int i=0;i<length;i++){
//             boolean visited=false;
//             int count=1;
//             for(int j=0;j<i;j++){
//                 if(arr[i]==arr[j]){
//                     visited=true;
//                     break;
//                 }
//             }
//             if(visited){
//                 continue;
//             }
//             for(int k=i+1;k<length;k++){
//                 if(arr[i]==arr[k]){
//                     count++;
//                 }
//             }
//             if(count>max_count){
//                 int temp=max_count;
//                 max_count=count;
//                 sec_count=temp;
//                 int teemp=max_element;
//                 max_element=arr[i];
//                 sec_element=teemp;
//             }
//             else if(count<max_count && count>sec_count){
//                 sec_count=count;
//                 sec_element=arr[i];
//             }
//         }   
//         System.out.println("Second maximum frequency is of element : "+sec_element);
//         System.out.println("Second max frequency is : "+sec_count);
//         sc.close();
//     }
// }