public class Question_1 {
    public static void main(String[] args){

        /*According to Java's syntax; y = ax^2 + 5x + 2 can be written like the followings a, b and d.
        Let's say "a" equals to 2 and x equals to 2 as well. y will equal to 20 in that case.
         */
        int a = 2;
        int x = 2;

        System.out.println(a * x * x + 5 * x + 2);
        System.out.println(a * x * x + (5 * x) + 2);
        System.out.println(a * (x * x) + 5 * x + 2);
    }
}
