package codecool.com;

public class PaperbackBook extends Book {

    private final int PAGEWEIGTH = 10;
    private final int WEIGTHOFCOVER = 100;

    public HardCoverBook(String author, String title, int releaseYear, int numberOfPages);
    {
        super(author, title, releaseYear, numberOfPages, weigthInGram: numberOfPages * PAGEWEIGTH + WEIGTHOFCOVER);

    }

}
