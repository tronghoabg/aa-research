package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class crc {
    private final long a;

    public static java.lang.String a(long j) {
        return defpackage.a.bH(j, "PointerId(value=", ")");
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.crc) && this.a == ((defpackage.crc) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
