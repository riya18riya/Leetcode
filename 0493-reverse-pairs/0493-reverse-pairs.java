class Solution {

    int count = 0;

    public int reversePairs(int[] nums) {
        /*int count = 0;

        for (int i = 0; i <= nums.length-2; i++){
            for (int j = i+1; j < nums.length; j++){

                if ((long)nums[i] > 2 * (long)nums[j]){
                    count++;
                }
            }
        }
        return count;*/

        mergeSort(nums, 0, nums.length-1);

        return count;
    }

    void mergeSort(int[] nums, int left, int right){   //DIVIDE
        if(left >= right){
            return;
        }

        int mid = left + (right-left) / 2;

        mergeSort(nums, left, mid); // divide left part
        mergeSort(nums, mid+1, right); // divide right part

        countPairs(nums, left, mid, right);
        merge (nums, left, mid, right); //sort and merge
    }

    void countPairs(int[] nums, int left, int mid, int right){
        int j = mid + 1;

        for(int i = left; i <= mid; i++){

            while(j <= right && (long) nums[i] > 2L * nums[j]){
                j++;
            }
            count = count + j - (mid + 1);
        }
    }

    public void merge(int[] nums, int left, int mid, int right){   //MERGE
        ArrayList<Integer> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else {
                temp.add(nums[j]);
                j++;
            }
        }
        while (i <= mid){   // remaining LEFT
            temp.add(nums[i]);
            i++;
        }
        while (j <= right){   // remaining RIGHT
            temp.add(nums[j]);
            j++;
        }

        for(int m = 0, n = left; m < temp.size(); m++, n++){ // copy temp to origal array
            nums[n] = temp.get(m);
        }
    } 
}