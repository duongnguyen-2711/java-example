import java.util.*;

public class example1 {
    static void duplicateItem(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a[j]);
            }
            count = 0;
        }
    }

    static void NonDuplicateItem(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a.length; k++) {
                if (a[j] == a[k]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a[j]);
            }
            count = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3,6,5,3,6,7,8};
        duplicateItem(a);
        NonDuplicateItem(a);
    }
}
