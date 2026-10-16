package com.bytedance.adsdk.uef.oa.lw.uef;

import Va.M6;

/* loaded from: classes.dex */
public class xs {
    private static Object uef(int i5, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(number.intValue() * i5);
        }
        if (number instanceof Long) {
            return Long.valueOf(number.longValue() * i5);
        }
        if (number instanceof Float) {
            return Float.valueOf(number.floatValue() * i5);
        }
        if (!(number instanceof Double)) {
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(number.doubleValue() * i5);
    }

    private static Object uef(long j8, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(number.longValue() * j8);
            }
            if (number instanceof Float) {
                return Float.valueOf(number.floatValue() * j8);
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() * j8);
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j8 * number.intValue());
    }

    private static Object uef(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 * number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(number.floatValue() * f10);
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() * f10);
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f10 * number.intValue());
    }

    private static Object uef(double d3, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d3 * number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d3 * number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(number.doubleValue() * d3);
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d3 * number.intValue());
    }

    public static Object uef(Number number, Number number2) {
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
