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
public class Arge {
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
```