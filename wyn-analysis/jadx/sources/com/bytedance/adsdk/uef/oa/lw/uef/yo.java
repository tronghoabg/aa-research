package com.bytedance.adsdk.uef.oa.lw.uef;

import Va.M6;

/* loaded from: classes.dex */
public class yo {
    private static Object uef(int i5, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i5 > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i5) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i5) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i5) > number.doubleValue());
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static Object uef(long j8, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j8 > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j8 > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j8) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j8) > number.doubleValue());
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static Object uef(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    private static Object uef(double d3, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d3 > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d3 > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d3 > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d3 > number.doubleValue());
        }
        throw new UnsupportedOperationException(M6.o(number, "This type of addition operation is not supported"));
    }

    public static Object uef(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return uef(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return uef(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return uef(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return uef(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return uef(((Number) obj).intValue(), number);
    }
}
