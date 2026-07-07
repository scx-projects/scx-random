package dev.scx.random;

/// CodePointPool
///
/// @author scx567888
public final class CodePointPool {

    private final int[] codePoints;

    public CodePointPool(int... codePoints) {
        this.codePoints = codePoints;
    }

    public static CodePointPool ofString(String s) {
        return new CodePointPool(s.codePoints().toArray());
    }

    public int length() {
        return codePoints.length;
    }

    public int codePointAt(int index) {
        return codePoints[index];
    }

}
