package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ufu extends ufs {
    private final long V;
    private ScheduledFuture W;
    private final float X;

    public ufu(uvg uvgVar, usy usyVar, tox toxVar, ukr ukrVar, uor uorVar, ugy ugyVar, ums umsVar, ugq ugqVar, tmb tmbVar, ScheduledExecutorService scheduledExecutorService, ttx ttxVar, rjr rjrVar, int i, boolean z, long j, aezk aezkVar, tpa tpaVar, boolean z2, ackk ackkVar, boolean z3, uaj uajVar, plq plqVar) {
        super(uvgVar, usyVar, toxVar, ukrVar, uorVar, ugyVar, umsVar, ugqVar, tmbVar, scheduledExecutorService, rjrVar, ttxVar, null, null, i, true, 256, false, z, aezkVar, tpaVar, z2, ackkVar, z3, false, xvy.a, uajVar, plqVar);
        this.V = j;
        this.X = 30.0f;
    }

    @Override // defpackage.ufs
    public final synchronized void K(usy usyVar, Set set) {
        vaq.d();
        if (usyVar.o().l < this.X) {
            super.K(usyVar, set);
        }
    }

    @Override // defpackage.ufs
    public final ufs g(ukr ukrVar, uor uorVar) {
        return new ufu(this.Q, this.R, this.c, ukrVar, uorVar, this.e.c(ukrVar, uorVar), this.D, this.G, this.n, this.F, this.z, this.S, this.l, this.u, this.V, this.I, this.J, this.L, this.M, this.N, this.P, this.O);
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
        this.W = this.F.scheduleAtFixedRate(new ueh(this, 9), 0L, this.V, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ufs, defpackage.ufj
    public final void m(uly ulyVar, boolean z) {
        if (ulyVar.d == ulx.a) {
            ulyVar = ulx.b.a(false);
        }
        super.m(ulyVar, z);
    }
}
