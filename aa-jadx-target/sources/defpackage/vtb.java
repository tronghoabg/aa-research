package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtb {
    public final long a;
    public final long b;

    public vtb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static defpackage.vtb a(defpackage.tmy tmyVar) {
        return new defpackage.vtb(android.os.SystemClock.elapsedRealtime(), tmyVar.e().toMillis());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vtb) {
            defpackage.vtb vtbVar = (defpackage.vtb) obj;
            if (this.a == vtbVar.a && this.b == vtbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }

    public vtb() {
        throw null;
    }
}
