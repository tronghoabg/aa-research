package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class dly {
    public final long a;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }

    public static java.lang.String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean d(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.dly) && j == ((defpackage.dly) obj).a;
    }

    public final boolean equals(java.lang.Object obj) {
        return d(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return c(this.a);
    }
}
