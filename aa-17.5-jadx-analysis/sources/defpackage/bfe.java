package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
final class bfe extends cfx implements cwc, cwu {
    private final dfw a;
    private bym b;
    private bfc c;

    public bfe(dfw dfwVar) {
        this.a = dfwVar;
    }

    private final bym g() {
        bym bymVar = this.b;
        if (bymVar != null) {
            return bymVar;
        }
        asl.a("Font resolution state is not set.");
        throw new aezp();
    }

    public final bfc d() {
        bfc bfcVar = this.c;
        if (bfcVar != null) {
            return bfcVar;
        }
        asl.a("Min size state is not set.");
        throw new aezp();
    }

    @Override // defpackage.cfx
    public final void ec() {
        bfc bfcVar = this.c;
        if (bfcVar != null) {
            bfc.c(bfcVar, bzi.q(this).s, null, null, 30);
        }
        bzi.q(this).I();
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        bfc bfcVarD = d();
        bfcVarD.b(g().a());
        if (((Boolean) bfcVarD.c.a()).booleanValue()) {
            bfcVarD.d = bep.a(bfcVarD.b, bfcVarD.a, bfcVarD.e);
            bfcVarD.a(false);
        }
        long j2 = bfcVarD.d;
        int i = (int) (j2 & 4294967295L);
        cuo cuoVarV = ctoVar.v(dlf.f(j, dlf.d((int) (j2 >> 32), Alert.DURATION_SHOW_INDEFINITELY, i, Alert.DURATION_SHOW_INDEFINITELY)));
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new bgb(cuoVarV, 1));
    }

    @Override // defpackage.cfx
    public final void er() {
        dfw dfwVarG = dao.g(this.a, bzi.q(this).s);
        wci wciVar = (wci) bzi.x(this, dbc.f);
        f(dfwVarG, wciVar);
        this.c = new bfc(bzi.q(this).s, bzi.q(this).r, wciVar, dfwVarG, g().a());
    }

    public final void f(dfw dfwVar, wci wciVar) {
        dhs dhsVarK = dfwVar.k();
        die dieVarN = dfwVar.n();
        if (dieVarN == null) {
            dieVarN = die.k;
        }
        dhx dhxVarL = dfwVar.l();
        int i = dhxVarL != null ? dhxVarL.a : 0;
        dhy dhyVarM = dfwVar.m();
        this.b = wciVar.f(dhsVarK, dieVarN, i, dhyVarM != null ? dhyVarM.a : 65535);
        bzi.q(this).I();
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

    @Override // defpackage.cfx
    /* renamed from: p */
    public final void t() {
        bfc bfcVar = this.c;
        if (bfcVar != null) {
            bfc.c(bfcVar, null, bzi.q(this).r, null, 29);
        }
        bzi.q(this).I();
    }

    @Override // defpackage.cfx
    public final void q() {
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
