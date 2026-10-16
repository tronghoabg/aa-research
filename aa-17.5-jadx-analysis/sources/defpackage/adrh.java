package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class adrh extends adrk implements adsh, adwp {
    public static final Logger s = Logger.getLogger(adrh.class.getName());
    private admc a;
    private volatile boolean b;
    private final adwq c;
    public final aeac t;
    public final boolean u;

    protected adrh(aeah aeahVar, adzv adzvVar, aeac aeacVar, admc admcVar, adiw adiwVar) {
        aeacVar.getClass();
        this.t = aeacVar;
        this.u = adue.h(adiwVar);
        this.c = new adwq(this, aeahVar, adzvVar);
        this.a = admcVar;
    }

    @Override // defpackage.adsh
    public final void b(aduk adukVar) {
        adukVar.b("remote_addr", a().a(adkd.a));
    }

    @Override // defpackage.adsh
    public final void c(adnq adnqVar) {
        woy.O(!adnqVar.g(), "Should not cancel with OK status");
        this.b = true;
        p().a(adnqVar);
    }

    @Override // defpackage.adsh
    public final void e() {
        if (t().s) {
            return;
        }
        t().s = true;
        adwq adwqVarV = v();
        if (adwqVarV.i) {
            return;
        }
        adwqVarV.i = true;
        aeag aeagVar = adwqVarV.b;
        if (aeagVar != null && aeagVar.a() == 0 && adwqVarV.b != null) {
            adwqVarV.b = null;
        }
        adwqVarV.a(true, true);
    }

    @Override // defpackage.adsh
    public final void i(adjr adjrVar) {
        admc admcVar = this.a;
        adlx adlxVar = adue.b;
        admcVar.d(adlxVar);
        this.a.f(adlxVar, Long.valueOf(adjrVar.b(TimeUnit.NANOSECONDS)));
    }

    @Override // defpackage.adsh
    public final void j(adjt adjtVar) {
        adrj adrjVarT = t();
        woy.aa(adrjVarT.q == null, "Already called start");
        adjtVar.getClass();
        adrjVarT.r = adjtVar;
    }

    @Override // defpackage.adsh
    public final void k(int i) {
        ((adwm) t().j).b = i;
    }

    @Override // defpackage.adsh
    public final void l(int i) {
        adwq adwqVar = this.c;
        woy.aa(adwqVar.a == -1, "max size already set");
        adwqVar.a = i;
    }

    @Override // defpackage.adsh
    public final void m(adsj adsjVar) {
        adrj adrjVarT = t();
        woy.aa(adrjVarT.q == null, "Already called setListener");
        adrjVarT.q = adsjVar;
        p().c(this.a);
        this.a = null;
    }

    @Override // defpackage.adrk, defpackage.adzw
    public final boolean o() {
        return q().i() && !this.b;
    }

    protected abstract adrg p();

    @Override // defpackage.adrk
    protected /* bridge */ /* synthetic */ adrj q() {
        throw null;
    }

    protected abstract adrj t();

    @Override // defpackage.adwp
    public final void u(aeag aeagVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (aeagVar == null && !z) {
            z3 = false;
        }
        woy.O(z3, "null frame before EOS");
        p().b(aeagVar, z, z2, i);
    }

    @Override // defpackage.adrk
    protected final adwq v() {
        return this.c;
    }
}
