

import java.util.*;

public class TestMovie {

    public static void main(String[] args) {

        ArrayList<Movie>  movies = new ArrayList<>();


        Movie m4= new Movie("Ali Baba","John James","2003");
        Movie m2= new Movie("Thor","do not know","2013");
        Movie m3= new Movie("Ich Unverbesserlich","Selene Dion","2015");
        Movie m1= new Movie("Kill the Boss","Guarlein Mada","2012");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        movies.add(m4);


        ArrayList<String>  movies1 = new ArrayList<>();


        Collections.sort(movies1);

    }

}
