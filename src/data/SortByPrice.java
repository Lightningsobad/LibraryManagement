
package data;

import java.util.Comparator;

/**
 *
 * @author quang
 */
public class SortByPrice implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {  //tăng dần, muốn giảm dần dổi dấu
        if(o1.getPrice() > o2.getPrice())
            return 1;
        else if(o1.getPrice() < o2.getPrice())
            return -1;
        else
            return 0;
    }
    
}
