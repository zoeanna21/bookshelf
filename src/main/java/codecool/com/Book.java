package codecool.com;

public class Book {

    private String Author;
    private String Title;
    private int releaseYear;
    private int numberOfPages;
    private int weightInGram;

    public Book(String author, String title, int releaseYear, int numberOfPages, int weightInGram)
    {
        this.Author = author;
        this.Title = title;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weightInGram = weightInGram;
    }

    public Book(String author, String title, int releaseYear, int numberOfPages)
    {
        public String getBookInfo();
        {
            return(author + " " + title + " (" + releaseYear")");
        }
    }

}


/*
Az osztály rendelkezzen egy olyan konstruktorral melynek segítségével az összes előre megadott tulajdonságát be tudjuk állítani a fent megadott sorrendben. (cím, szerző, stb.)
Legyen egy getBookInfo() metódusa, ami egy stringgel tér vissza a következő formátumban: <author>: <title> (<releaseYear>)
Példa: J. K. Rowling: Harry Potter and the Philosopher's Stone (1997)
 */

/*
Az osztály neve legyen: HardcoverBook

a constructor a következő sorrendben várja a paramtéreket:
cím (title)
szerző (author)
kiadási év (releaseYear)
oldalak száma (numberOfPages)
1 oldal tömege: 10 gram
A keménykötésű borító tömege: 100 gram
A keménykötésű könyv tömegét az oldalak tömegének összege és a keménykötésű borító tömegének összege alapján kapjuk meg
 */

/*
Az osztály neve legyen: PaperbackBook
a constructor a következő sorrendben várja a paramtéreket:
cím (title)
szerző (author)
kiadási év (releaseYear)
oldalak száma (numberOfPages)
1 oldal tömege: 10 gram
A papírkötésű borító tömege: 20 gram
A papírkötésű könyv tömegét az oldalak tömegének összege és a papírkötésű borító tömegének összege alapján kapjuk meg

 */

/*
Az osztály neve legyen Bookshelf
Legyen egy addBook() függvénye, aminek segítségével a paraméterben megadott könyvet el lehet tárolni a polcban
 */

/*
Legyen egy getBooks() függvénye, aminek legyen egy year paramétere. Azon könyveket adja vissza egy listában, amik a year évében lettek kiadva.
 */

/*
Legyen egy getLightestAuthor() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legkönnyebb könyvet írta.
 */

/*
Legyen egy getAuthorOfMostWrittenPages() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legtöbb oldalt írta.
 */
/*
Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát. Soronként kiírja a könyvek getBookInfo() visszatérési értékét
 */
