package dev.scx.random;

/// CharPool
///
/// @author scx567888
public final class CharPool {

    private final char[] chars;

    public CharPool(char... chars) {
        this.chars = chars;
    }

    public static CharPool ofString(String s) {
        return new CharPool(s.toCharArray());
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        return chars[index];
    }

}
