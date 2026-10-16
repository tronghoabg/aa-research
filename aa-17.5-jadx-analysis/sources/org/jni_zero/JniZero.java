package org.jni_zero;

import defpackage.a;
import defpackage.akcf;
import defpackage.akcp;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class JniZero {
    public static int a(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException(a.bN(j, "Value cannot fit in an int: "));
        }
        return (int) j;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
    }

    public static void c(akcf akcfVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new akcp(akcfVar.p(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    private static void crashIfMultiplexingMisaligned(long j, long j2) throws IllegalAccessException, IllegalArgumentException {
        try {
            long j3 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 != j && j3 != j2 && j4 != j) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j2 + " Java: " + j3 + " or " + j4);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP, JniZero.class.getClassLoader()};
    }
}
