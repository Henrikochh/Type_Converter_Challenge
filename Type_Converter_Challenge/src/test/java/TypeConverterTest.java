import ch.noseryoung.main.SideCreatorService;
import ch.noseryoung.main.Triangle;
import ch.noseryoung.main.TriangleManager;
import ch.noseryoung.main.TriangleValidator;
import org.TypeConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TypeConverterTest {
    @BeforeEach

    @Test
    public void convertStringToShortTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "hsjgfb";
        assertEquals (Short.class, typeConverter.convertStringToShort(s));
    }

    public void convertStringToShort(){

    }

}