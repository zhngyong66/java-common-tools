package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.zeroten.common.util.CheckUtils.isAnyEmpty;
import static com.zeroten.common.util.CheckUtils.equalsString;

public class CheckUtilsTest {

    @Test
    public void checkStringIsAnyEmpty() {
        String[] strings = {"111", "bbb", "ccc", null};
        boolean isTrue = isAnyEmpty(strings);
        Assert.assertEquals(false, isTrue);


        String[] strings2 = {"111", "bbb", "ccc", "null"};
        boolean isTrue2 = isAnyEmpty(strings2);
        Assert.assertEquals(true, isTrue2);

    }

    @Test
    public void checkEquales() {
        String str1 = "123";
        String str2 = "123";
        boolean isTrue = equalsString(str1, str2);
        Assert.assertEquals(false, isTrue);
    }
}
