package dev.scx.random;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/// ScxRandom (左开右闭)
///
/// @author scx567888
public final class ScxRandom {

    public static final CharPool NUMBER = CharPool.ofString("0123456789");

    public static final CharPool UPPER_LETTER = CharPool.ofString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    public static final CharPool LOWER_LETTER = CharPool.ofString("abcdefghijklmnopqrstuvwxyz");

    public static final CharPool LETTER = CharPool.ofString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

    public static final CharPool NUMBER_AND_UPPER_LETTER = CharPool.ofString("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    public static final CharPool NUMBER_AND_LOWER_LETTER = CharPool.ofString("0123456789abcdefghijklmnopqrstuvwxyz");

    public static final CharPool NUMBER_AND_LETTER = CharPool.ofString("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");

    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    public static int randomInt() {
        return ThreadLocalRandom.current().nextInt();
    }

    public static int randomInt(int bound) {
        return ThreadLocalRandom.current().nextInt(bound);
    }

    public static int randomInt(int origin, int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }

    public static long randomLong() {
        return ThreadLocalRandom.current().nextLong();
    }

    public static long randomLong(long bound) {
        return ThreadLocalRandom.current().nextLong(bound);
    }

    public static long randomLong(long origin, long bound) {
        return ThreadLocalRandom.current().nextLong(origin, bound);
    }

    public static float randomFloat() {
        return ThreadLocalRandom.current().nextFloat();
    }

    public static float randomFloat(float bound) {
        return ThreadLocalRandom.current().nextFloat(bound);
    }

    public static float randomFloat(float origin, float bound) {
        return ThreadLocalRandom.current().nextFloat(origin, bound);
    }

    public static double randomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    public static double randomDouble(double bound) {
        return ThreadLocalRandom.current().nextDouble(bound);
    }

    public static double randomDouble(double origin, double bound) {
        return ThreadLocalRandom.current().nextDouble(origin, bound);
    }

    public static boolean randomBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    public static void randomBytes(byte[] bytes) {
        ThreadLocalRandom.current().nextBytes(bytes);
    }

    public static byte[] randomBytes(int size) {
        var bytes = new byte[size];
        randomBytes(bytes);
        return bytes;
    }

    /// count 表示从池中抽取的次数, 等于 最终的字符串长度
    public static String randomString(int count, CharPool pool) {
        var chars = new char[count];
        int poolLength = pool.length();
        for (int i = 0; i < count; i = i + 1) {
            chars[i] = pool.charAt(randomInt(poolLength));
        }
        return new String(chars, 0, chars.length);
    }

    /// count 表示从池中抽取的次数, 可能 不等于 最终的字符串长度
    public static String randomString(int count, CodePointPool pool) {
        var codePoints = new int[count];
        int poolLength = pool.length();
        for (int i = 0; i < count; i = i + 1) {
            codePoints[i] = pool.codePointAt(randomInt(poolLength));
        }
        return new String(codePoints, 0, codePoints.length);
    }

    /// count 表示从池中抽取的次数, 可能 不等于 最终的字符串长度
    public static String randomString(int count, StringPool pool) {
        var stringBuilder = new StringBuilder();
        int poolLength = pool.length();
        for (int i = 0; i < count; i = i + 1) {
            stringBuilder.append(pool.stringAt(randomInt(poolLength)));
        }
        return stringBuilder.toString();
    }

    /// count 表示从池中抽取的次数, 等于 最终的字符串长度 (默认使用 数字 + 大小写字母池)
    public static String randomString(int count) {
        return randomString(count, NUMBER_AND_LETTER);
    }

}
