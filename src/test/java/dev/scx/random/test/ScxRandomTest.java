package dev.scx.random.test;

import dev.scx.random.CodePointPool;
import dev.scx.random.ScxRandom;
import dev.scx.random.StringPool;
import org.testng.annotations.Test;

import static dev.scx.random.ScxRandom.NUMBER;
import static dev.scx.random.ScxRandom.NUMBER_AND_LETTER;

public class ScxRandomTest {

    public static void main(String[] args) {
        test1();
    }

    @Test
    public static void test1() {
        ScxRandom.randomString(1000, NUMBER_AND_LETTER);
        ScxRandom.randomString(1000, NUMBER);
        ScxRandom.randomString(1000, new StringPool("😂", "🥶", "😡", "🤢"));
        ScxRandom.randomString(1000, CodePointPool.ofString("🐷😂🤣123你好😅😍😡"));
    }

}
