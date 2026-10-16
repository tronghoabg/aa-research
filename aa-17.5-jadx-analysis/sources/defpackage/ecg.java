package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class ecg extends ecm {
    final WindowInsets.Builder a;

    public ecg(ecy ecyVar) {
        super(ecyVar);
        WindowInsets windowInsetsE = ecyVar.e();
        this.a = windowInsetsE != null ? new WindowInsets.Builder(windowInsetsE) : new WindowInsets.Builder();
    }

    @Override // defpackage.ecm
    public ecy a() {
        i();
        ecy ecyVarQ = ecy.q(this.a.build(), null);
        ecyVarQ.t(this.b);
        ecyVarQ.s(null);
        ecyVarQ.w(this.c);
        ecyVarQ.x(this.d);
        return ecyVarQ;
    }

    @Override // defpackage.ecm
    public void b(dve dveVar) {
        this.a.setStableInsets(dveVar.a());
    }

    @Override // defpackage.ecm
    public void c(dve dveVar) {
        this.a.setSystemWindowInsets(dveVar.a());
    }

    @Override // defpackage.ecm
    public void d(dve dveVar) {
        this.a.setMandatorySystemGestureInsets(dveVar.a());
    }

    @Override // defpackage.ecm
    public void e(dve dveVar) {
        this.a.setSystemGestureInsets(dveVar.a());
    }

    @Override // defpackage.ecm
    public void f(dve dveVar) {
        this.a.setTappableElementInsets(dveVar.a());
    }

    public ecg() {
        this.a = new WindowInsets.Builder();
    }
}
