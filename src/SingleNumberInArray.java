public class SingleNumberInArray {

    public static int singleNumberInArray(int [] arr){
        int xor =0;

        for(int i=0; i<arr.length; i++){
            xor ^=arr[i];
        }return xor;
    }



    public static void main(String[] args) {

    }
}
