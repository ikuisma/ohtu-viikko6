package statistics.matcher;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import statistics.Player;

public class HasFewerThan implements Matcher {

    private int value;
    private String category;

    public HasFewerThan(int value, String category) {
        this.value = value;
        this.category = category;
    }

    @Override
    public boolean matches(Player p) {
        boolean hasAtLeast = new HasAtLeast(value, category).matches(p);
        return !hasAtLeast;
    }
}
