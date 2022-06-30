package cards;
// step 3
public class App 
{
    public static void main( String[] args )
    {
        Deck d = new Deck(); // put in 2 if you want 2 decks
        System.out.println("----- Before");
        System.out.println(d);
        d.shuffle();
        System.out.println(" ----- After");
        System.out.println(d);

        List<Cards> cards = d.take(5);
        System.out.println("------- Take 5");
        System.out.println(cards);
    }
}
