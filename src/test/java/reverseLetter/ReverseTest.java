import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import reverseLetter.Reverse;

public class ReverseTest {
    private final Reverse revPhrase = new Reverse();

    @Test
    void checkReverseString() {
        String phrase = revPhrase.ReversePhrase( "J@va the be$t!123");   // Act
        assertEquals("t@eb eht av$J!123", phrase);     // Assert
    }

    @Test
    void sampleReverseString() {
        String phrase = revPhrase.ReversePhrase( "Java");   // Act
        assertEquals("avaJ", phrase);     // Assert
    }

    @Test
    void emptyReverseString() {
        String phrase = revPhrase.ReversePhrase( "");   // Act
        assertEquals("", phrase);     // Assert
    }
}
