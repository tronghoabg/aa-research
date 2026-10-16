package defpackage;

/* loaded from: classes.dex */
public final class ajw extends cwe implements cyu, cwc, cyg {
    public asf a;
    public final afec b;
    public ary c;
    public azp d;
    public final ciu e;

    public ajw(asf asfVar, int i, afec afecVar) {
        this.a = asfVar;
        this.b = afecVar;
        ciu ciuVar = new ciu(i, false, new ajv(this), 10);
        W(ciuVar);
        this.e = ciuVar;
    }

    public final void a(asf asfVar, asd asdVar) {
        if (!this.A) {
            asfVar.c(asdVar);
        } else {
            aivh aivhVar = (aivh) ((ajbw) N()).a.get(aivh.d);
            ahnc.d(N(), null, 0, new aio(asfVar, asdVar, aivhVar != null ? aivhVar.p(new aju(asfVar, asdVar, 0)) : null, (afck) null, 4), 3);
        }
    }

    public final void b(asf asfVar) {
        ary aryVar;
        if (affa.f(this.a, asfVar)) {
            return;
        }
        asf asfVar2 = this.a;
        if (asfVar2 != null && (aryVar = this.c) != null) {
            asfVar2.c(new arz(aryVar));
        }
        this.c = null;
        this.a = asfVar;
    }

    public final azp d() {
        affv affvVar = new affv();
        cjn.p(this, new aiy(affvVar, this, 2, null));
        return (azp) affvVar.a;
    }

    @Override // defpackage.cfx
    public final void em() {
        azp azpVar = this.d;
        if (azpVar != null) {
            azpVar.a();
        }
        this.d = null;
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        decVar.a(ddx.l, Boolean.valueOf(this.e.g().b()));
        decVar.a(ddq.w, new ddf(null, new bgl((Object) this, 1, (byte[]) null)));
    }

    @Override // defpackage.cyg
    public final void r() {
        azp azpVarD = d();
        if (this.e.g().b()) {
            azp azpVar = this.d;
            if (azpVar != null) {
                azpVar.a();
            }
            if (azpVarD != null) {
                azpVarD.d();
            } else {
                azpVarD = null;
            }
            this.d = azpVarD;
        }
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }
}
