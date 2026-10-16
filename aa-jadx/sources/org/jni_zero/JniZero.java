package org.jni_zero;

/* JADX INFO: loaded from: classes2.dex */
public final class JniZero {
    public static int a(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new java.lang.ArithmeticException(defpackage.a.bM(j, "Value cannot fit in an int: "));
        }
        return (int) j;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new java.lang.ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
    }

    public static void c(defpackage.akdf akdfVar, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new defpackage.akdp(akdfVar.p(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        }
    }

    private static void crashIfMultiplexingMisaligned(long j, long j2) {
        try {
            long j3 = java.lang.Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j4 = java.lang.Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j3 != j && j3 != j2 && j4 != j) {
                throw new java.lang.RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j + " or " + j2 + " Java: " + j3 + " or " + j4);
            }
        } catch (java.lang.ReflectiveOperationException unused) {
        }
    }

    public static boolean d(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private static java.lang.Object[] init() {
        return new java.lang.Object[]{java.util.Collections.EMPTY_LIST, java.util.Collections.EMPTY_MAP, org.jni_zero.JniZero.class.getClassLoader()};
    }
}
