package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class dlm {
    public final long a;

    public /* synthetic */ dlm(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        int i5 = ((int) (j >> (i4 + 46))) & ((1 << (18 - i4)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final int b(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = ((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int c(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        return ((int) (j >> (i4 + 15))) & ((1 << (18 - i4)) - 1);
    }

    public static final int d(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return ((int) (j >> 2)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1);
    }

    public static java.lang.String e(long j) {
        int iB = b(j);
        java.lang.String strValueOf = iB == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(iB);
        int iA = a(j);
        java.lang.String strValueOf2 = iA != Integer.MAX_VALUE ? java.lang.String.valueOf(iA) : "Infinity";
        return "Constraints(minWidth = " + d(j) + ", maxWidth = " + strValueOf + ", minHeight = " + c(j) + ", maxHeight = " + strValueOf2 + ")";
    }

    public static boolean f(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.dlm) && j == ((defpackage.dlm) obj).a;
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        return (((int) (j >> (i4 + 46))) & ((1 << (18 - i4)) + (-1))) != 0;
    }

    public static final boolean h(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        return (((int) (j >> 33)) & ((1 << (((i3 + i3) + (i2 * 3)) + 13)) + (-1))) != 0;
    }

    public static final boolean i(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        int i5 = i4 + 15;
        int i6 = (1 << (18 - i4)) - 1;
        int i7 = ((int) (j >> (i4 + 46))) & i6;
        return (((int) (j >> i5)) & i6) == (i7 == 0 ? Integer.MAX_VALUE : i7 + (-1));
    }

    public static final boolean j(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = (1 << (((i3 + i3) + (i2 * 3)) + 13)) - 1;
        int i5 = ((int) (j >> 33)) & i4;
        return (((int) (j >> 2)) & i4) == (i5 == 0 ? Integer.MAX_VALUE : i5 + (-1));
    }

    public static final boolean k(long j) {
        int i = (int) (3 & j);
        int i2 = (i & 2) >> 1;
        int i3 = i & 1;
        int i4 = i3 + i3 + (i2 * 3);
        return ((((1 << (i4 + 13)) + (-1)) & ((int) (j >> 33))) + (-1) == 0) | ((((int) (j >> (i4 + 46))) & ((1 << (18 - i4)) + (-1))) + (-1) == 0);
    }

    public static final long l(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            defpackage.dlv.a(afzh.a("\n            maxWidth(" + i2 + ") must be >= than minWidth(" + i + "),\n            maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + "),\n            minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0\n            "));
        }
        return defpackage.dln.g(i, i2, i3, i4);
    }

    public static /* synthetic */ long m(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = d(j);
        }
        if ((i5 & 2) != 0) {
            i2 = b(j);
        }
        if ((i5 & 4) != 0) {
            i3 = c(j);
        }
        if ((i5 & 8) != 0) {
            i4 = a(j);
        }
        return l(i, i2, i3, i4);
    }

    public final boolean equals(java.lang.Object obj) {
        return f(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return e(this.a);
    }
}
