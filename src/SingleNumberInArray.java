public class SingleNumberInArray {

    //check unique element in the given array
    public static int singleNumberInArray(int [] arr){

        //take xor as 0
        int xor =0;

        for(int i=0; i<arr.length; i++){
            //start with 0's xor as the xor of 0 will return the same element
            //afterwards the xor of same elements gives zero and then at the end returns
            //the remaining unique element
            xor ^=arr[i];
        }return xor;
    }



    public static void main(String[] args) {

    }
}
