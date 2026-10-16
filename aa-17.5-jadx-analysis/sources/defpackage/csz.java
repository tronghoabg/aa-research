package defpackage;

/* loaded from: classes.dex */
public final class csz extends cfx implements cwu {
    public afeh a;

    public csz(afeh afehVar) {
        this.a = afehVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        return (ctq) this.a.invoke(ctsVar, ctoVar, new dle(j));
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return ty.d(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return ty.f(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(this), csqVar, cspVar, i);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.a + ")";
    }
}
