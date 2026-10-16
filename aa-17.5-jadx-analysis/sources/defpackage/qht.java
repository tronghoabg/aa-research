package defpackage;

import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes.dex */
final class qht extends ebf {
    final /* synthetic */ qhx a;

    public qht(qhx qhxVar) {
        this.a = qhxVar;
    }

    private final void O() {
        boolean zE = odn.a().E();
        qhx qhxVar = this.a;
        qhxVar.h = zE;
        if (zE && qhxVar.r()) {
            qhxVar.j(ywk.INTERRUPTED);
        }
        qhxVar.p();
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        O();
    }

    @Override // defpackage.ebf
    public final void o(CarCall carCall) {
        if (this.a.s()) {
            O();
        }
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        if (this.a.s()) {
            return;
        }
        O();
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) {
        O();
    }
}
