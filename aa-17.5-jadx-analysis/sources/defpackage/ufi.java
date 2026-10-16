package defpackage;

import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ufi extends ufs {
    private static final Duration V = Duration.ofSeconds(10);
    private ScheduledFuture W;

    /* JADX WARN: Illegal instructions before constructor call */
    public ufi(uvg uvgVar, usy usyVar, tox toxVar, ukr ukrVar, uor uorVar, ugy ugyVar, ums umsVar, ugq ugqVar, tmb tmbVar, ScheduledExecutorService scheduledExecutorService, ttx ttxVar, rjr rjrVar, int i, boolean z, aezk aezkVar, tpa tpaVar, boolean z2, ackk ackkVar, boolean z3, uaj uajVar, plq plqVar) {
        abgl abglVar = abgl.EVCS;
        super(uvgVar, usyVar, toxVar, ukrVar, uorVar, ugyVar, umsVar, ugqVar, tmbVar, scheduledExecutorService, rjrVar, ttxVar, null, null, i, true, tpaVar.a(abglVar), tpaVar.e(abglVar), z, aezkVar, tpaVar, z2, ackkVar, z3, false, xvy.a, uajVar, plqVar);
    }

    @Override // defpackage.ufs
    public final ufs g(ukr ukrVar, uor uorVar) {
        return new ufi(this.Q, this.R, this.c, ukrVar, uorVar, this.e.c(ukrVar, uorVar), this.D, this.G, this.n, this.F, this.z, this.S, this.l, this.u, this.I, this.J, this.L, this.M, this.N, this.P, this.O);
    }

    @Override // defpackage.ufs
    public final void h() {
        vaq.d();
        ScheduledFuture scheduledFuture = this.W;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.W = null;
        }
    }

    @Override // defpackage.ufs
    public final void i() {
        vaq.d();
        ScheduledExecutorService scheduledExecutorService = this.F;
        ueh uehVar = new ueh(this, 4);
        Duration duration = V;
        this.W = scheduledExecutorService.scheduleWithFixedDelay(uehVar, duration.toMillis(), duration.toMillis(), TimeUnit.MILLISECONDS);
    }
}
