package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class e6 {
    public static long a(long j2, long j3, long j4) {
        if (j2 >= 0) {
            return Math.max(-1L, Math.min(j2 - j3, j4));
        }
        return -1L;
    }

    public static long b(long j2, long j3) {
        long j4 = j3 >= 0 ? j2 + j3 : Long.MAX_VALUE;
        if (j4 >= 0) {
            return j4;
        }
        return Long.MAX_VALUE;
    }

    public static int c(long j2) {
        return (j2 != -1 ? j7.u : 0) | j7.t;
    }

    public static b6 d(w wVar, long j2, long j3) {
        if (j2 >= 0) {
            return new b6(wVar, c(j3), j2, j3);
        }
        j$.time.f.a(j2);
        return null;
    }

    public static x5 e(l1 l1Var, long j2, long j3) {
        if (j2 >= 0) {
            return new x5(l1Var, c(j3), j2, j3);
        }
        j$.time.f.a(j2);
        return null;
    }

    public static z5 f(q1 q1Var, long j2, long j3) {
        if (j2 >= 0) {
            return new z5(q1Var, c(j3), j2, j3);
        }
        j$.time.f.a(j2);
        return null;
    }

    public static v5 g(l5 l5Var, long j2, long j3) {
        if (j2 >= 0) {
            return new v5(l5Var, c(j3), j2, j3);
        }
        j$.time.f.a(j2);
        return null;
    }

    public static Spliterator h(k7 k7Var, Spliterator spliterator, long j2, long j3) {
        long jB = b(j2, j3);
        int i2 = c6.f50352a[k7Var.ordinal()];
        if (i2 == 1) {
            return new e8(spliterator, j2, jB);
        }
        if (i2 == 2) {
            return new a8((Spliterator.OfInt) spliterator, j2, jB);
        }
        if (i2 == 3) {
            return new b8((j$.util.x0) spliterator, j2, jB);
        }
        if (i2 == 4) {
            return new z7((j$.util.s0) spliterator, j2, jB);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(k7Var)));
    }
}
