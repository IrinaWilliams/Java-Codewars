[Remove String Spaces](https://www.codewars.com/kata/57eae20f5500ad98e50002c5/solutions/java)
```java
public class Kata {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
```
[Growth of a Population](https://www.codewars.com/kata/growth-of-a-population/train/java)
```java
public class Kata {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int inhabitants = p0;
        while(inhabitants < p)
        {
            inhabitants = (int)(inhabitants + (inhabitants * (float)(percent/100)) + aug);
            years++;
        }
        return years;
    }
}
public class Kata {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
}
```
[8 kyu Square(n) Sum](https://www.codewars.com/kata/square-n-sum/train/java)
```java
//Complete the square sum function so that it squares each number passed into it and then sums the results together.

//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
public class Kata {
  public static int squareSum(int[] n) { 
     int power = 2;
     int sum = 0;
       for(int i = 0; i < n.length; i++) {
         sum += Math.pow(n[i], power);
       }
    return sum;
  }
}

public class Kata {
  public static int squareSum(int[] xs) {
    return Arrays.stream(xs).map(x -> x * x).sum();
  }
}

public class Kata 
 {
  public static int squareSum(int[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      sum += n[i]*n[i];
    }
    return sum;
  }
 }
 
 public class Kata
  {
   public static int squareSum(int[] n){ 
       return IntStream.of(n)
                 .map(operand -> (int) Math.pow(operand, 2))
                 .sum();
   }
  }
  
  public class Kata {
    public static int squareSum(int[] n) { 
      return Arrays.stream(n).map(num -> num * num).sum();
    }
  }
//assertEquals(9, Kata.squareSum(new int[] {1,2,2}));
//assertEquals(5, Kata.squareSum(new int[] {1,2}));
//assertEquals(50, Kata.squareSum(new int[] {5,-3,4}));
```
[7 kyu Maximum Multiple](https://www.codewars.com/kata/maximum-multiple/train/javascript)
```java
public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
   int res = 0;
  for(int i = divisor; i <= bound; i += divisor) {
   res = i;
  }
  return res;
  }
}
```
[7 kyu Fibonacci](https://www.codewars.com/kata/fibonacci/train/java)
```java
public class Fibonacci {
	public static long fib (int n){
		long f1 = 0;
    long f2 = 1;
    long f3 = 1;
    for(int i = 1; i < n; i++) {
      f3 = f1 + f2;
      f1 = f2;
      f2 = f3;
    }
		return f3;
  }
}
```
[8 kyu Remove exclamation marks](https://www.codewars.com/kata/remove-exclamation-marks/train/java)
```java
class Solution {
    static String removeExclamationMarks(String s) {
      String a = "";
        for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) != '!') {
            a += s.charAt(i);
          }
        }
      return a;
    }
}
class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}
```
