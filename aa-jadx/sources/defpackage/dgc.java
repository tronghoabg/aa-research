package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dgc {
    public static final long a = defpackage.dax.g(0, 0);
    public final long b;

    public /* synthetic */ dgc(long j) {
        this.b = j;
    }

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        long j2 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j2;
        return java.lang.Math.max(i, i2) - java.lang.Math.min(i, i2);
    }

    public static final int c(long j) {
        return java.lang.Math.max((int) (j >> 32), (int) (4294967295L & j));
    }

    public static final int d(long j) {
        return java.lang.Math.min((int) (j >> 32), (int) (4294967295L & j));
    }

    public static final int e(long j) {
        return (int) (j >> 32);
    }

    public static java.lang.String f(long j) {
        return "TextRange(" + ((int) (j >> 32)) + ", " + ((int) (j & 4294967295L)) + ")";
    }

    public static final boolean g(long j, long j2) {
        long j3 = j & 4294967295L;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        long j4 = 4294967295L & j2;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j4;
        return (java.lang.Math.min(i, i2) <= java.lang.Math.min(i3, i4)) & (java.lang.Math.max(i3, i4) <= java.lang.Math.max(i, i2));
    }

    public static boolean h(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.dgc) && j == ((defpackage.dgc) obj).b;
    }

    public static final boolean i(long j) {
        return ((int) (j >> 32)) == ((int) (4294967295L & j));
    }

    public static final boolean j(long j) {
        return ((int) (j >> 32)) > ((int) (4294967295L & j));
    }

    public final boolean equals(java.lang.Object obj) {
        return h(this.b, obj);
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return f(this.b);
    }
}
