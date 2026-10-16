package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
final class ava extends avb {
    public boolean a = true;
    public int b;

    public ava(int i) {
        this.b = i;
    }

    @Override // defpackage.avb
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.avb
    public final long f(cto ctoVar, long j) {
        int iE = this.b == 1 ? ctoVar.e(dle.b(j)) : ctoVar.c(dle.b(j));
        if (iE < 0) {
            iE = 0;
        }
        return dlf.g(0, Alert.DURATION_SHOW_INDEFINITELY, iE, iE);
    }

    @Override // defpackage.avb, defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        return this.b == 1 ? cspVar.e(i) : cspVar.c(i);
    }

    @Override // defpackage.avb, defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        return this.b == 1 ? cspVar.e(i) : cspVar.c(i);
    }
}
