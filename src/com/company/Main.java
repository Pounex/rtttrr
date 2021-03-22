package com.company;

public class Main {

    public static void main(String[] args) {
	/*or(int i=7;i >=1; i--)
    {
        System.out.println(i);
    } **/


   /*int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
   int i = 0;
   while ( i < 10)
     {

         System.out.println(arr[i]);
         i = ++i;
     }**/
int a,b,c;
a=0;
b=1;

        while(a<=1000)
        {

            System.out.println(a);
            c=b;
            b=a;
            a= b+c;

        }
    }
}
