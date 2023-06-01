package blj;

import java.beans.PropertyEditorSupport;
import java.util.HashSet;
import java.util.Set;

public class TypeConverter {

  /**
   * This method converts a String representing a short value to a short.
   * Accepted Values are:
   *    - (only at first place)
   *    _ and ' (10_000 and 10'000 are equal to 10000)
   *    numbers 0-9
   *
   * @param toConvert String to be converted
   * @return converted short
   * @throws IllegalArgumentException if String cannot be converted
   *
   * @author <todo: Name of author>
   */
  public short convertStringToShort(String toConvert) throws IllegalArgumentException{
    toConvert = toConvert.replaceAll("'", "");
    toConvert = toConvert.replaceAll("_", "");

    return Short.parseShort(toConvert);
  }

  /**
   * This method converts a String representing a double value to a double.
   * Accepted Values are:
   *    - (only at first place)
   *    _ and ' (10_000 and 10'000 are equal to 10000)
   *    . and , for decimal (only one allowed)
   *    numbers 0-9
   *
   * @param toConvert String to be converted
   * @return converted double
   * @throws IllegalArgumentException if String cannot be converted
   *
   * @author <todo: Name of author>
   */
  public double convertStringToDouble(String toConvert) throws IllegalArgumentException{
    toConvert = toConvert.replaceAll("'", "");
    toConvert = toConvert.replaceAll("_", "");

    return Double.parseDouble(toConvert);
  }

  /**
   * This method converts a String representing a long value to a long.
   * Accepted Values are:
   *    - (only at first place)
   *    _ and ' (10_000 and 10'000 are equal to 10000)
   *    numbers 0-9
   *
   * @param toConvert String to be converted
   * @return converted long
   * @throws IllegalArgumentException if String cannot be converted
   *
   * @author <todo: Name of author>
   */
  public Long convertStringToLong(String toConvert) throws IllegalArgumentException{
    toConvert = toConvert.replaceAll("'", "");
    toConvert = toConvert.replaceAll("_", "");

    return Long.parseLong(toConvert);
  }

  /**
   * This method converts a String to a lowercase char array.
   * Accepted Values are:
   *    - (acts as hyphenation, respects common rules, e.g. ex-ample, ex-am-ple)
   *    letters a-z and A-Z
   *
   * @param toConvert String to be converted
   * @return converted char array, with all - removed
   * @throws IllegalArgumentException if String cannot be converted
   *
   * @author <todo: Name of author>
   */
  public char[] StringToCharArray(String toConvert) throws IllegalArgumentException{
    // todo implement
    return new char[]{};
  }

  /**
   * This method converts a String to a set of unique characters.
   * Accepted Values are:
   *    - (only after second place and before second last place, e.g. ge-laufen is ok, g-elaufen is not ok)
   *    letters a-z and A-Z
   *    each letter is allowed only once
   *
   * @param toConvert String to be converted
   * @return converted character set, with all - removed
   * @throws IllegalArgumentException if String cannot be converted
   *
   * @author <todo: Name of author>
   */
   public Set<Character> StringToCharSet(String toConvert){
     Set<Character> StringToCharacterSet = new HashSet<>();

     for (int i = 0; i < toConvert.length(); i++) {
       char c = toConvert.charAt(i);

       if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
         if (i > 1 && i < toConvert.length() - 2 && c == '-') {
           throw new IllegalArgumentException("Invalid position for hyphen (-)");
         }

         if (StringToCharacterSet.contains(c)) {
           throw new IllegalArgumentException("Duplicate character: " + c);
         }

         StringToCharacterSet.add(c);
       } else {
         throw new IllegalArgumentException("Invalid character: " + c);
       }
     }

     return StringToCharacterSet;
  }

}
