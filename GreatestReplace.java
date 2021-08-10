public class GreatestReplace {
    public GreatestReplace() {
        System.out.println("Replacing the current element with the greatest value to the right");

    }
    public int[] replaceElements(int[] arr) {
        if(arr.length > 1) {
            for(int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[j] > arr[i]) {
                        arr[i] = arr[j];
                    }
                }
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public int[] efficient(int[] arr) {
        int max = -1;
        for(int i=arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                max = arr[i];
                arr[i] = -1;
            }
            else{
                int temp = arr[i];
                arr[i] = max;
                max = Math.max(temp,max);
            }

        }
        return arr;
    }
}
