package examples.embed;

import com.intuit.karate.junit5.Karate;

/**
 *
 * @author pthomas3
 */

public class EmbedRunner {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("embed").relativeTo(getClass());
    }

}
