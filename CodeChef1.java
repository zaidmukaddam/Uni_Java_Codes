/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeChef1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }
            for (int j = n - 1; j > 0; j--) 
            {
                int max = arr[j];
                for (int i = 0; i < n; i++) 
                {
                    while (arr[i] != max) 
                    {
                        arr[i] = arr[i] + 2;
                        if (arr[i] > max)
                        {
                            arr[i] = arr[i] - 1;
                            break;
                        }
                    }
                    if (arr[i] == max) 
                    {
                        count++;
                    }
                }
                if (count >= n) 
                {
                    System.out.println("YES");
                    break;
                } else 
                {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
