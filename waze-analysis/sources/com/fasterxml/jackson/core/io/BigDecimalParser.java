package com.fasterxml.jackson.core.io;

import b.a.a.k;
import java.math.BigDecimal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BigDecimalParser {
    private static String _generateExceptionMessage(String str, String str2) {
        return String.format("Value %s can not be deserialized as `java.math.BigDecimal`, reason:  %s", str, str2);
    }

    private static String _getValueDesc(char[] cArr, int i2, int i3) {
        return i3 <= 1000 ? String.format("\"%s\"", new String(cArr, i2, i3)) : String.format("\"%s\" (truncated to %d chars (from %d))", new String(cArr, i2, 1000), 1000, Integer.valueOf(i3));
    }

    private static NumberFormatException _parseFailure(Exception exc, String str) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(_generateExceptionMessage(_getValueDesc(str), message));
    }

    public static BigDecimal parse(String str) {
        try {
            return str.length() < 500 ? new BigDecimal(str) : k.a(str);
        } catch (ArithmeticException | NumberFormatException e2) {
            throw _parseFailure(e2, str);
        }
    }

    public static BigDecimal parseWithFastParser(String str) {
        try {
            return k.a(str);
        } catch (ArithmeticException | NumberFormatException e2) {
            throw _parseFailure(e2, str);
        }
    }

    public static BigDecimal parseWithFastParser(char[] cArr, int i2, int i3) {
        try {
            return k.b(cArr, i2, i3);
        } catch (ArithmeticException | NumberFormatException e2) {
            throw _parseFailure(e2, cArr, i2, i3);
        }
    }

    private static NumberFormatException _parseFailure(Exception exc, char[] cArr, int i2, int i3) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(_generateExceptionMessage(_getValueDesc(cArr, i2, i3), message));
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }

    public static BigDecimal parse(char[] cArr, int i2, int i3) {
        try {
            if (i3 < 500) {
                return new BigDecimal(cArr, i2, i3);
            }
            return k.b(cArr, i2, i3);
        } catch (ArithmeticException | NumberFormatException e2) {
            throw _parseFailure(e2, cArr, i2, i3);
        }
    }

    private static String _getValueDesc(String str) {
        int length = str.length();
        if (length <= 1000) {
            return String.format("\"%s\"", str);
        }
        return String.format("\"%s\" (truncated to %d chars (from %d))", str.substring(0, 1000), 1000, Integer.valueOf(length));
    }
}
