package 旋转数组的最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int num = array[0];
        int i = 0;
        if(i == array.length){
            return 0;
        }
        while(i < array.length){
            if(num >= array[i]){
                num = array[i];
            }
            i++;
        }
        return num;
    }
}