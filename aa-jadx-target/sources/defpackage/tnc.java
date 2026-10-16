package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tnc implements defpackage.tmy {
    @Override // defpackage.tmy
    public final long a() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // defpackage.tmy
    public final long b() {
        return tnb.a();
    }

    @Override // defpackage.tmy
    public final long c() {
        return java.lang.System.nanoTime();
    }

    @Override // defpackage.tmy
    public final j$.time.Duration d() {
        return j$.time.Duration.ofMillis(android.os.SystemClock.currentThreadTimeMillis());
    }

    @Override // defpackage.tmy
    public final j$.time.Duration e() {
        return j$.time.Duration.ofMillis(android.os.SystemClock.uptimeMillis());
    }

    @Override // defpackage.tmy
    public final j$.time.Instant f() {
        return j$.time.Instant.now();
    }
}
