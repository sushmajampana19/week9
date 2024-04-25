class Bubblesort <T extends Comparable<T>>{
    void sort(T arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if(arr[j-1].compareTo(arr[j])>0){
                    T temp;
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void display(T [] arr){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}
class  BubbleSortstring{
    public static void main(String[] args) {
        Bubblesort <Integer> x = new Bubblesort<>();
        Integer arr[]={1,2,3,4,5,6};
        x.sort(arr);
        x.display(arr);
        Bubblesort <String> x1 = new Bubblesort<>();
        String arr1[]={"s","u","s","h","m","a"};
        x1.sort(arr1);
        x1.display(arr1);
        Bubblesort <Double> x3 = new Bubblesort<>();
        Double arr3[]={0.98,0.64,1.23};
        x3.sort(arr3);
        x3.display(arr3);
    }
}

