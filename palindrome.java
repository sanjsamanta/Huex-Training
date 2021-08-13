# 1. Using oops concepts write a code to find if a string/integer is palindrome or not, can it be converted into palindrome, and if yes how many swaps are required
import java.util.*;
 
class Palindrome {
    static int countSwap(String str)
    {
 
        int n = str.length();
        char s[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            int left = i;
            int right = n - left - 1;
            while (left < right) {
                if (s[left] == s[right]) {
                    break;
                }
                else {
                    right--;
                }
            }
            if (left == right) {
                return -1;
            }
            else if (s[left] != s[n - left - 1]) {
                char temp = s[right];
                s[right] = s[n - left - 1];
                s[n - left - 1] = temp;
                count++;
            }
        }
 
        return count;
    }
  
    public static void main(String[] args)
    {
        String s = "geeksfgeeks";
        int ans1 = countSwap(s);
        System.out.println(ans1);
    }
}
