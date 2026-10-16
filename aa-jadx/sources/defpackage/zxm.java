package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zxm {
    public final long a;
    public final java.lang.Object b;

    public zxm() {
        this.b = java.util.UUID.randomUUID();
        this.a = android.os.SystemClock.elapsedRealtime();
    }

    public final java.lang.String a() {
        return android.os.SystemClock.elapsedRealtime() - this.a > 86400000 ? "over_ttl" : ((java.util.UUID) this.b).toString();
    }

    public zxm(java.lang.Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    public zxm(java.lang.RuntimeException runtimeException) {
        this.a = java.lang.System.currentTimeMillis();
        this.b = runtimeException;
    }
}
