package codecool.com;

public class HardCoverBook extends Book {

    private final int PAGEWEIGTH = 10;
    private final int WEIGTHOFCOVER = 100;

    public HardCoverBook(String author, String title, int releaseYear, int numberOfPages * PAGEWEIGTH + WEIGTHOFCOVER);
    {
        super(author, title, releaseYear, numberOfPages);
        int weightInGram = numberOfPages * 10 + 20;
    }


}
