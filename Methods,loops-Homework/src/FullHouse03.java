import java.util.concurrent.atomic.AtomicInteger;

public class FullHouse03 {
    public static void main(String[] args) {
        String[] faces ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        char[] suits = {'\u2660', '\u2666', '\u2664', '\u2663'};
        int count = 0;
        for (int num1 = 0; num1 < faces.length; num1++) {
            for (int num2 = 0; num2 < faces.length; num2++) {
                for (int suit1 = 0; suit1 < suits.length; suit1++) {
                    for (int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
                        for (int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
                            for (int suit4 = 0; suit4 < suits.length; suit4++) {
                                for (int suit5 = suit4+1; suit5 < suits.length; suit5++) {
                                    if (num1 != num2){
                                        System.out.printf("(%s%c %s%c %s%c %s%c %s%c)",faces[num1],suits[suit1],faces[num1],suits[suit2],faces[num1],suits[suit3],faces[num2],suits[suit4],faces[num2],suits[suit5]);
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.printf("%s full houses",count);

    }
}
