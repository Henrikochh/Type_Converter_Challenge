
import org.TypeConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TypeConverterTest {
    @BeforeEach
    void init(){

    }
    @Test
    public void convertStringToShortTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "hsjgfb";
        try {

        }catch(Exception e){

        }
        short s1 = Short.parseShort("hsjgfb");
        assertEquals (s1, typeConverter.convertStringToShort(s));
    }
    @Test
    public void convertStringToDoubleTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "10.4";
        assertEquals(Double.class, typeConverter.convertStringToDouble(s));

    }
    @Test
    public void convertStringToLongTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "10.4";
        assertEquals(Long.class, typeConverter.convertStringToLong(s));
    }
}