package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class C2 {
    static long b(long j8, long j10) {
        long j11 = j10 >= 0 ? j8 + j10 : Long.MAX_VALUE;
        if (j11 >= 0) {
            return j11;
        }
        return Long.MAX_VALUE;
    }

    static long a(long j8, long j10, long j11) {
        if (j8 >= 0) {
            return Math.max(-1L, Math.min(j8 - j10, j11));
        }
        return -1L;
    }

    static Spliterator c(EnumC2963h3 enumC2963h3, Spliterator spliterator, long j8, long j10) {
        long j11 = j10 >= 0 ? j8 + j10 : Long.MAX_VALUE;
        long j12 = j11 >= 0 ? j11 : Long.MAX_VALUE;
        int i5 = A2.f37951a[enumC2963h3.ordinal()];
        if (i5 == 1) {
            return new A3(spliterator, j8, j12);
        }
        if (i5 == 2) {
            return new C3042x3((Spliterator.OfInt) spliterator, j8, j12);
        }
        if (i5 == 3) {
            return new C3047y3((j$.util.a0) spliterator, j8, j12);
        }
        if (i5 != 4) {
            throw new IllegalStateException("Unknown shape " + enumC2963h3);
        }
        return new C3037w3((j$.util.V) spliterator, j8, j12);
    }

    public static Stream h(AbstractC2972j2 abstractC2972j2, long j8, long j10) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C3021t2(abstractC2972j2, d(j10), j8, j10);
    }

    public static IntStream f(AbstractC2935c0 abstractC2935c0, long j8, long j10) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C3031v2(abstractC2935c0, d(j10), j8, j10);
    }

    public static InterfaceC2990n0 g(AbstractC2975k0 abstractC2975k0, long j8, long j10) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C3041x2(abstractC2975k0, d(j10), j8, j10);
    }

    public static E e(B b5, long j8, long j10) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j8);
        }
        return new C3051z2(b5, d(j10), j8, j10);
    }

    private static int d(long j8) {
        return (j8 != -1 ? EnumC2958g3.f38211u : 0) | EnumC2958g3.f38210t;
    }
}
