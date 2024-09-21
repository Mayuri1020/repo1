class Test{
  public static void main(String args[]){
    int arr[]={9,-6,8,5,-3,-2,7,-4};
    int n=arr.length;
    int start=0;
    int end=n-1;
    while(start<end){
      if(arr[start]<0 & arr[end]<0){
         start++;
       }
      if(arr[start]<0 & arr[end]>0){
          start++;
          end--;
       }
      if(arr[start]>0 & arr[end]<0){
          arr[end]=arr[start]+arr[end]-(arr[start]=arr[end]);
          start++;
          end--;
         }
      if(arr[start]>0 & arr[end]>0){
         end--;
       }
    }
   for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}