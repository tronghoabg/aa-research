package defpackage;

/* loaded from: classes2.dex */
public final class lts implements ltp {
    public final eqj a;
    private final eqj b;

    public lts(eqj eqjVar) {
        this.b = eqjVar;
        this.a = eqy.a(tby.v(eqjVar, new lti(9)));
    }

    @Override // defpackage.ltp
    public final eqj a() {
        return tby.v(this.b, new lti(11));
    }

    @Override // defpackage.ltp
    public final eqj b() {
        return tby.v(this.b, new lti(7));
    }

    @Override // defpackage.ltp
    public final eqj c() {
        return this.a;
    }

    @Override // defpackage.ltp
    public final eqj d() {
        return eqy.a(tby.v(this.a, new lti(10)));
    }

    @Override // defpackage.ltp
    public final /* synthetic */ eqj e() {
        afbe afbeVar = afbe.a;
        afco afcoVar = tby.a;
        return new eqm(afbeVar);
    }

    @Override // defpackage.ltp
    public final eqj f() {
        return eqy.a(tby.v(this.b, new lti(8)));
    }

    @Override // defpackage.ltp
    public final eqj g() {
        return tby.v(this.b, new lti(12));
    }
}
