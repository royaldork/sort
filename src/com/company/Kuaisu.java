package com.company;

public class Kuaisu {
    public int quzhongjianzhou (Integer[] list, int low, int high) {
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] > tmp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] < tmp) {
                low++;
            }
            list[high] = list[low];
        }
        list[low] = tmp;
        return low;
    }
    public void kuaisupaixu(Integer[] list, int low, int high) {
        if (low < high) {
            int middle = quzhongjianzhou (list, low, high);
            kuaisupaixu(list, low, middle - 1);
            kuaisupaixu(list, middle + 1, high);
        }
    }



}
