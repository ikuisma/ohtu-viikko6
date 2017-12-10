package statistics;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import statistics.matcher.*;

public class QueryBuilder {

    private Matcher matcher;

    public QueryBuilder() {
    }

    public QueryBuilder playsIn(String team) {
        matcher = new PlaysIn(team);
        return this;
    }

    public QueryBuilder hasAtLeast(int number, String field) {
        matcher = new And(this.matcher, new HasAtLeast(number, field));
        return this;
    }

    public QueryBuilder hasFewerThan(int number, String field) {
        matcher = new And(this.matcher, new HasFewerThan(number, field));
        return this;
    }

    public QueryBuilder oneOf(Matcher m1, Matcher m2) {
        matcher = new Or(m1, m2);
        return this;
    }

    private void resetMatcher() {
        this.matcher = null;
    }

    public Matcher build() {
        Matcher output = this.matcher;
        resetMatcher();
        return output;
    }

}
