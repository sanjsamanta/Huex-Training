# 1. Using oops concepts write a code to find if a string/integer is palindrome or not, can it be converted into palindrome, and if yes how many swaps are required

int temp,n,sum,r;
temp=n;
while(n!=0)
{
  r=n%10;
  sum=sum*10+r;
  n=n/10;
 }
 if(temp==sum)
 {
  System.out.println("Number is palindrome");
 }
 else
 System.out.println("Number is not a palindrome");
