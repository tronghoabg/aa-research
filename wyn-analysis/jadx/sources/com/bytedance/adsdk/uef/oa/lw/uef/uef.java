package com.bytedance.adsdk.uef.oa.lw.uef;

import Va.M6;

/* loaded from: classes.dex */
public class uef {
    private static Object uef(int i5, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i5 / number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(i5 / number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i5 / number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(i5 / number.doubleValue());
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static Object uef(long j8, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j8 / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j8 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j8 / number.doubleValue());
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j8 / number.intValue());
    }

    private static Object uef(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f10 / number.doubleValue());
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f10 / number.intValue());
    }

    private static Object uef(double d3, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d3 / number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d3 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d3 / number.doubleValue());
            }
            throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d3 / number.intValue());
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
