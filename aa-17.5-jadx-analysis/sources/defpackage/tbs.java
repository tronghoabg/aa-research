package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
public class tbs extends tbo {
    public final boolean h;
    public final Duration i;
    public final afeg j;
    public aitx k;
    public aivh l;
    public aivh m;

    public tbs(eqj eqjVar, Duration duration, boolean z, Duration duration2, afeg afegVar) {
        this.h = z;
        this.i = duration2;
        this.j = afegVar;
        if (duration2 != null && duration2.compareTo(duration) < 0) {
            throw new IllegalArgumentException("Settle time must not be greater than max-delay time");
        }
        super.r(eqjVar, new kko(new erl(this, duration, 16, (byte[]) null), 11));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected void c() {
        aitu aituVar = aium.a;
        this.k = ahni.b(ajct.a.i());
        b(this.h);
        super.c();
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        aitx aitxVar = this.k;
        if (aitxVar == null) {
            affa.d("coroutineScope");
            aitxVar = null;
        }
        ahni.e(aitxVar, null);
        a();
    }

    public final void u() {
        if (this.i == null) {
            return;
        }
        aivh aivhVar = this.m;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        aitx aitxVar = this.k;
        if (aitxVar == null) {
            affa.d("coroutineScope");
            aitxVar = null;
        }
        this.m = ahnc.d(aitxVar, null, 0, new nba(this, (afck) null, 10), 3);
    }
}
