package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class tme implements tmb {
    @Override // defpackage.tmb
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.tmb
    public final long b() {
        return tmd.a();
    }

    @Override // defpackage.tmb
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.tmb
    public final Duration d() {
        return Duration.ofMillis(SystemClock.currentThreadTimeMillis());
    }

    @Override // defpackage.tmb
    public final Duration e() {
        return Duration.ofMillis(SystemClock.uptimeMillis());
    }

    @Override // defpackage.tmb
    public final Instant f() {
        return Instant.now();
    }
}
