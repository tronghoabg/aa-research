package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public final class alf extends cfx implements cwu, cyu {
    public alh a;
    public boolean b = true;

    public alf(alh alhVar) {
        this.a = alhVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        afp.y(j, this.b ? api.a : api.b);
        boolean z = this.b;
        int iB = Alert.DURATION_SHOW_INDEFINITELY;
        int iA = z ? Integer.MAX_VALUE : dle.a(j);
        if (z) {
            iB = dle.b(j);
        }
        cuo cuoVarV = ctoVar.v(dle.m(j, 0, iB, 0, iA, 5));
        int i = cuoVarV.a;
        int iB2 = dle.b(j);
        if (i <= iB2) {
            iB2 = i;
        }
        int i2 = cuoVarV.b;
        int iA2 = dle.a(j);
        if (i2 <= iA2) {
            iA2 = i2;
        }
        int i3 = i - iB2;
        int i4 = i2 - iA2;
        int i5 = 1;
        if (true == this.b) {
            i3 = i4;
        }
        alh alhVar = this.a;
        alhVar.f.h(i3);
        cec cecVar = (cec) cek.i.j();
        afec afecVarI = cecVar != null ? cecVar.i() : null;
        cec cecVarI = byx.i(cecVar);
        try {
            if (alhVar.c() > i3) {
                alhVar.f(i3);
            }
            byx.l(cecVar, cecVarI, afecVarI);
            this.a.d.h(true != this.b ? iB2 : iA2);
            this.a.e.h(this.b ? cuoVarV.b : cuoVarV.a);
            this.a.a.b(false);
            return ctsVar.eK(iB2, iA2, afbf.a, new bfo(this, i3, cuoVarV, i5));
        } catch (Throwable th) {
            byx.l(cecVar, cecVarI, afecVarI);
            throw th;
        }
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        decVar.a(ddx.n, true);
        ddp ddpVar = new ddp(new nx(this, 19), new nx(this, 20));
        if (this.b) {
            decVar.a(ddx.x, ddpVar);
        } else {
            decVar.a(ddx.w, ddpVar);
        }
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        if (true != this.b) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cspVar.c(i);
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        if (true == this.b) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cspVar.d(i);
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        if (true != this.b) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cspVar.e(i);
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        if (true == this.b) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return cspVar.f(i);
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
