public class ConditionalOperationExample {
    public static void main(String[] args)
    {
        int score = 85;
        char garde = (score > 90) ? 'A' : ((score >80) ? 'B' : 'C');
        System.out.println(score + "점은"+garde+"등급입니다.");
    }
}
