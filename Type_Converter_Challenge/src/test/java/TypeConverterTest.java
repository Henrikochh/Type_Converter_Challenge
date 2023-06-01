
import org.TypeConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TypeConverterTest {
    @BeforeEach
    void init(){

    }
    @Test
    public void convertStringToShortTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "1000";
        short s1 = Short.parseShort("1000");
        try {
            short shortString = typeConverter.convertStringToShort(s);
            assertEquals (s1, shortString);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void convertStringToDoubleTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "109.46";
        Double s1 = 109.46;
        try {
            Double doubleConverted = typeConverter.convertStringToDouble(s);
            assertEquals(s1, doubleConverted);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void convertStringToLongTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "1005";
        Long s1 = 1005L;
        try {
            assertEquals(s1, typeConverter.convertStringToLong(s));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void StringToCharSetTest(){
        TypeConverter typeConverter = new TypeConverter();
        String s = "10";
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("0");
        try {
            assertEquals(hashSet, typeConverter.StringToCharSet(s));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}