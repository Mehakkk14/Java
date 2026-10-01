package TwoPointer;

public class Movezeros {
    public static void main(String[] args) {

        //My thinking

//        int[] arr = {0,1,0,3,12};
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            if (arr[left] != 0) {
//                left++;
//            } else if (arr[right] == 0) {
//                right--;
//            } else {
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//    }
//
//    public static void swap(int[] arr, int left, int right){
//        int temp = arr[left];
//
//        arr[left] = arr[right];
//
//        arr[right] = temp;
//    }


                int[] nums = {0,1,0,3,12};
                int left = 0;

                for (int right = 0; right < nums.length; right++) {

                    if (nums[right] != 0) {

                        int temp = nums[left];
                        nums[left] = nums[right];
                        nums[right] = temp;

                        left++;
                    }
                }
            }
        }