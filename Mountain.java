import java.util.*;
public class Mountain {
    public Mountain() {
        System.out.println("Find the mountain of array");

    }
    public boolean validMountainArray(int[] arr) {
        boolean check;
        if(arr.length >= 3) {
            check = true;
            //now to check if it increases and decreases
            //look for the max and ensure it is in the middle instead of the end
            int index;
            //convert the array to an arraylist
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int i = 0; i < arr.length; i++) {
                al.add(arr[i]);
            }

            //get the max index
            int maxe = Collections.max(al);
            index = al.indexOf(maxe);

            //if the max is at the end, then it cannot be a mountain
            if(index == arr.length - 1 || index == 0) {
                check = false;
            }

            //now make two loops where they each end at the max
            else {
                int temp;
                for(int i = 0; i < index; i++) {
                    //save the temp value
                    temp = arr[i];
                    //loop through the rest of the array to ensure the current value is smaller than everything
                    for(int j = i + 1; j < index + 1; j++) {
                        if(arr[j] <= temp) {
                            //if at any point a value is less than the value previously, then it is false;
                            check = false;
                            break;
                        }
                    }
                }
                for(int i = index; i < arr.length; i++) {
                    temp = arr[i];
                    //loop through the rest of the array to ensure the current value is smaller than everything
                    for(int j = i + 1; j < arr.length; j++) {
                        if(arr[j] >= temp) {
                            //if at any point a value is less than the value previously, then it is false;
                            check = false;
                            break;
                        }
                    }

                }
            }
        }
        else {
            check = false;
            //not big enough to be a mountain
        }
        return check;

    }
    public boolean efficient(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;

        }

        if(i==0 ||i==n-1){
            return false;
        }

        while(i+1<n && arr[i]>arr[i+1]){
            i++;

        }
        return i==n-1;
    }
}
