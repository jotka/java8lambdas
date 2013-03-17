package pl.agilecoders;

/**
 * (c) 2013 agilecoders.pl
 * User: jarek
 * Date: 17.03.13
 * Time: 17:29
 */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Predicate {

    @Test
    public void shouldTestPredicate() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> filteredNames = names.filter(e -> e.length() >= 4)
                .into(new ArrayList<String>());
        for (String name : filteredNames) {
            System.out.println(name);
        }
    }

}
