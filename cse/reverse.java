class Test{
  public static void main(String args[]){
    int[] arr={5,7,3,8,9,6,4};
    int n=arr.length;
    int start=0;
    int end=n-1;
    while(start<end){
      arr[end]=arr[start]+arr[end]-(arr[start]=arr[end]);
      start++;
      end--;
      }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}















