import org.junit.Assert;
import org.junit.Test;

public class RomanNumbersConverterTest {
    RomanNumbersConverter converter = new RomanNumbersConverter();

    @Test
    public void converting0ShouldReturnNull() {
        Assert.assertNull(converter.Convert(0));
    }

    @Test
    public void convertingLowestNumberShouldReturnI(){
        Assert.assertEquals("I", converter.Convert(1));
    }

    @Test
    public void convertingHighestNumberShouldReturnMMMMCMXCIX(){
        Assert.assertEquals("MMMMCMXCIX", converter.Convert(4999));
    }



}