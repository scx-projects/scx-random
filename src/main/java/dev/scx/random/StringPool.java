package dev.scx.random;

/// StringPool
///
/// @author scx567888
public final class StringPool {

    private final String[] strings;

    public StringPool(String... strings) {
        this.strings = strings;
    }

    public int length() {
        return strings.length;
    }

    public String stringAt(int index) {
        return strings[index];
    }

}
