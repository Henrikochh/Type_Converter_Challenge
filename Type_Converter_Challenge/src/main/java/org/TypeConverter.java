package org;

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
    // todo implement
    return 0;
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
    // todo implelment
    return 0;
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
    // todo implement
    return 0l;
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
  public Set<char> StringToCharSet(String toConvert){
    // todo implement
    return new HashSet<char>();
  }

}
