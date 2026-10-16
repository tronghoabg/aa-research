package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
public final class rnh extends qvz {
    public final smr a;

    public rnh(smr smrVar) {
        this.a = smrVar;
    }

    private final void a(rng rngVar) {
        smr smrVar = this.a;
        if (smrVar == null || !smrVar.c()) {
            return;
        }
        smrVar.b(rngVar);
    }

    @Override // defpackage.qwa
    public final void e(KeyEvent keyEvent) throws RemoteException {
        a(new rmx(keyEvent));
    }

    @Override // defpackage.qwa
    public final void f(boolean z, int i, int i2) {
        a(new rmy(z, i, i2));
    }

    @Override // defpackage.qwa
    public final void g(CarCall carCall) {
        a(new rmz(carCall));
    }

    @Override // defpackage.qwa
    public final void h(CarCall carCall) {
        a(new rmu(carCall));
    }

    @Override // defpackage.qwa
    public final void i(CarCall carCall) {
        a(new rna(carCall));
    }

    @Override // defpackage.qwa
    public final void j(CarCall carCall, List list) {
        a(new rnf(carCall, list));
    }

    @Override // defpackage.qwa
    public final void k(CarCall carCall, List list) {
        a(new rnd(carCall, list));
    }

    @Override // defpackage.qwa
    public final void l(CarCall carCall, List list) {
        a(new rmv(carCall, list));
    }

    @Override // defpackage.qwa
    public final void m(CarCall carCall, String str, Bundle bundle) {
        a(new rmw(carCall, str, bundle));
    }

    @Override // defpackage.qwa
    public final void n(CarCall carCall, CarCall.Details details) {
        a(new rne(carCall, details));
    }

    @Override // defpackage.qwa
    public final void o(CarCall carCall, CarCall carCall2) {
        a(new rnc(carCall, carCall2));
    }

    @Override // defpackage.qwa
    public final void p(CarCall carCall, String str) {
        a(new rmt(carCall, str));
    }

    @Override // defpackage.qwa
    public final void q(CarCall carCall, int i) {
        a(new rnb(carCall, i));
    }
}
