package com.bytedance.adsdk.uef.oa.lw.uef;

import Va.M6;

/* loaded from: classes.dex */
public class oa {
    private static boolean uef(int i5, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i5 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i5) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i5) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i5) == number.doubleValue();
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static boolean uef(long j8, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j8 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j8 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j8) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j8) == number.doubleValue();
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static boolean uef(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static boolean uef(double d3, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d3 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d3 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d3 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d3 == number.doubleValue();
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    public static boolean uef(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return uef(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return uef(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return uef(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return uef(number.intValue(), number2);
    }
}
