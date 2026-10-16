package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class zl {
    public final long a;

    public /* synthetic */ zl(long j) {
        this.a = j;
    }

    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static long c(int i, int i2) {
        return (((long) i2) & 4294967295L) | (i << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.zl) && this.a == ((defpackage.zl) obj).a;
    }

    public final int hashCode() {
        return defpackage.a.f(this.a);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        long j = this.a;
        sb.append(a(j));
        sb.append(", ");
        sb.append(b(j));
        sb.append(")");
        return sb.toString();
    }
}
