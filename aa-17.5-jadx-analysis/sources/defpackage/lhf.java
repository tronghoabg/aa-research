package defpackage;

/* loaded from: classes.dex */
public class lhf implements lhg, eqa {
    public final eqc j = new eqc(this, true);

    @Override // defpackage.lhg
    public void c() {
        eqc eqcVar = this.j;
        eqcVar.e(epr.ON_CREATE);
        eqcVar.e(epr.ON_START);
    }

    @Override // defpackage.lhg
    public void d() {
        boolean zC = acsr.c();
        eqc eqcVar = this.j;
        if (!zC) {
            eqcVar.e(epr.ON_STOP);
            return;
        }
        eps epsVar = eqcVar.e;
        if (epsVar == eps.a) {
            return;
        }
        if (epsVar.a(eps.d)) {
            eqcVar.e(epr.ON_STOP);
        }
        eqcVar.e(epr.ON_DESTROY);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.j;
    }
}
