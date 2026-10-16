package org.apache.tika.utils;

import java.util.List;

/* loaded from: classes5.dex */
public class StringUtils {
    public static final String EMPTY = "";
    static int PAD_LIMIT = 10000;
    public static final String SPACE = " ";

    public static boolean isBlank(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String joinWith(String str, List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        for (String str2 : list) {
            int i10 = i5 + 1;
            if (i5 > 0) {
                sb2.append(str);
            }
            sb2.append(str2);
            i5 = i10;
        }
        return sb2.toString();
    }

    public static String leftPad(String str, int i5, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i5 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= PAD_LIMIT) {
            return leftPad(str, i5, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i10 = 0; i10 < length2; i10++) {
            cArr[i10] = charArray[i10 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String repeat(char c10, int i5) {
        if (i5 <= 0) {
            return "";
        }
        char[] cArr = new char[i5];
        for (int i10 = i5 - 1; i10 >= 0; i10--) {
            cArr[i10] = c10;
        }
        return new String(cArr);
    }

    public static String repeat(String str, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 <= 0) {
            return "";
        }
        int length = str.length();
        if (i5 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i5 <= PAD_LIMIT) {
            return repeat(str.charAt(0), i5);
        }
        int i10 = length * i5;
        if (length == 1) {
            return repeat(str.charAt(0), i5);
        }
        if (length != 2) {
            StringBuilder sb2 = new StringBuilder(i10);
            for (int i11 = 0; i11 < i5; i11++) {
                sb2.append(str);
            }
            return sb2.toString();
        }
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        char[] cArr = new char[i10];
        for (int i12 = (i5 * 2) - 2; i12 >= 0; i12 -= 2) {
            cArr[i12] = cCharAt;
            cArr[i12 + 1] = cCharAt2;
        }
        return new String(cArr);
    }

    public static String leftPad(String str, int i5, char c10) {
        if (str == null) {
            return null;
        }
        int length = i5 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > PAD_LIMIT) {
            return leftPad(str, i5, String.valueOf(c10));
        }
        return repeat(c10, length).concat(str);
    }
}
