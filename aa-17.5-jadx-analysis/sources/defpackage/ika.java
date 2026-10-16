package defpackage;

import android.os.SystemClock;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class ika implements Runnable {
    public int a;
    final /* synthetic */ ikb b;
    private final xke c;

    public ika(ikb ikbVar, xke xkeVar) {
        this.b = ikbVar;
        this.c = xkeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i.a(this.c, 128, 1, Duration.ofMillis(SystemClock.elapsedRealtime()));
    }
}
