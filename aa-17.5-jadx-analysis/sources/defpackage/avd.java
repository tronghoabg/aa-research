package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
final class avd extends avb {
    public boolean a = true;
    public int b;

    public avd(int i) {
        this.b = i;
    }

    @Override // defpackage.avb
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.avb
    public final long f(cto ctoVar, long j) {
        int iF = this.b == 1 ? ctoVar.f(dle.a(j)) : ctoVar.d(dle.a(j));
        if (iF < 0) {
            iF = 0;
        }
        return dlf.g(iF, iF, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.avb, defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        return this.b == 1 ? cspVar.f(i) : cspVar.d(i);
    }

    @Override // defpackage.avb, defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        return this.b == 1 ? cspVar.f(i) : cspVar.d(i);
    }
}
