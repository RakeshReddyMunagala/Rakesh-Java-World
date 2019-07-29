public class FindtheFrequency{

     public static void main(String []args){
       
       int arr[] ={2,1,1,4,5,6,4,6,6};
       
        int object =0;
        int count =0;
       for(int i=0; i<arr.length ; i++)
       {
           int tempObject= arr[i];
           int tempCount =0;
          for(int j =0;j<arr.length; j++)
         
              if(arr[j]==tempObject)
             
                  tempCount++;
              
             if(tempCount>count)
             {
                 object = tempObject;
                 count = tempCount;
             }
              }
              System.out.println(object +" element is high frequency of "+ count);
          }
           
           
       }
