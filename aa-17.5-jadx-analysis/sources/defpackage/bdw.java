package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;

/* loaded from: classes.dex */
public final class bdw extends cfx implements cwc, cwu, cyg {
    public dfw a;
    public int b;
    public int c;
    public boolean d;
    public dfw e;
    private int f = -1;
    private int g = -1;
    private bym h;

    public bdw(dfw dfwVar, int i, int i2) {
        this.a = dfwVar;
        this.b = i;
        this.c = i2;
    }

    private final dfw f() {
        dfw dfwVar = this.e;
        if (dfwVar != null) {
            return dfwVar;
        }
        asl.a("Resolved style is not set.");
        throw new aezp();
    }

    private final void g(dlg dlgVar) throws IOException {
        if (this.d) {
            l(dlgVar, f(), (wci) bzi.x(this, dbc.f));
            this.d = false;
        }
        int i = this.f;
        this.f = i >= 0 ? i : 0;
        int i2 = this.g;
        if (i2 == -1) {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        this.g = i2;
    }

    private final void l(dlg dlgVar, dfw dfwVar, wci wciVar) throws IOException {
        den denVarB = bep.b(dfwVar, dlgVar, wciVar, 3);
        float fD = denVarB.d(0);
        float fD2 = denVarB.d(1);
        float fD3 = denVarB.d(2);
        this.f = asl.ag(fD, fD2, fD3, this.b, 1);
        this.g = asl.ag(fD, fD2, fD3, this.c, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final bym d() {
        bym bymVar = this.h;
        if (bymVar != null) {
            return bymVar;
        }
        asl.a("Font resolution state is not set.");
        throw new aezp();
    }

    @Override // defpackage.cfx
    public final void ec() {
        this.e = dao.g(this.a, bzi.q(this).s);
        this.d = true;
        bzi.q(this).I();
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) throws IOException {
        if (this.d) {
            l(ctsVar, f(), (wci) bzi.x(this, dbc.f));
            this.d = false;
        }
        int i = this.f;
        int iG = i != -1 ? afpt.g(i, dle.c(j), dle.a(j)) : dle.c(j);
        int i2 = this.g;
        cuo cuoVarV = ctoVar.v(dle.m(j, 0, 0, iG, i2 != -1 ? afpt.g(i2, dle.c(j), dle.a(j)) : dle.a(j), 3));
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new bbn(cuoVarV, 12));
    }

    @Override // defpackage.cfx
    public final void er() {
        wci wciVar = (wci) bzi.x(this, dbc.f);
        this.e = dao.g(this.a, bzi.q(this).s);
        dhs dhsVarK = f().k();
        die dieVarN = f().n();
        if (dieVarN == null) {
            dieVarN = die.k;
        }
        dhx dhxVarL = f().l();
        int i = dhxVarL != null ? dhxVarL.a : 0;
        dhy dhyVarM = f().m();
        this.h = wciVar.f(dhsVarK, dieVarN, i, dhyVarM != null ? dhyVarM.a : 65535);
        cjn.p(this, new bap(this, 19));
        this.d = true;
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) throws IOException {
        g(csqVar);
        int i2 = this.f;
        int i3 = this.g;
        if (i2 == i3) {
            return i3;
        }
        int iC = cspVar.c(i);
        int i4 = this.f;
        int i5 = this.g;
        if (iC < i4) {
            iC = i4;
        }
        return iC > i5 ? i5 : iC;
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) throws IOException {
        g(csqVar);
        int i2 = this.f;
        if (i2 == this.g) {
            return i2;
        }
        int iE = cspVar.e(i);
        int i3 = this.f;
        int i4 = this.g;
        if (iE < i3) {
            iE = i3;
        }
        return iE > i4 ? i4 : iE;
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final void t() {
        this.d = true;
        bzi.q(this).I();
    }

    @Override // defpackage.cfx
    public final void q() {
        this.e = null;
        this.h = null;
        this.d = false;
    }

    @Override // defpackage.cyg
    public final void r() {
        if (this.h != null) {
            cjn.p(this, new bap(this, 20));
        }
        this.d = true;
        bzi.q(this).I();
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
