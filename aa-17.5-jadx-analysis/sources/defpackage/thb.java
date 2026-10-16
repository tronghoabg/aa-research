package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class thb extends qvz {
    final /* synthetic */ the a;

    public thb(the theVar) {
        this.a = theVar;
    }

    @Override // defpackage.qwa
    public final void e(KeyEvent keyEvent) throws RemoteException {
        yph yphVar = the.a;
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((qrv) it.next()).a(keyEvent);
        }
    }

    @Override // defpackage.qwa
    public final void f(boolean z, int i, int i2) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void g(CarCall carCall) throws RemoteException {
        yph yphVar = the.a;
        int i = carCall.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void h(CarCall carCall) throws RemoteException {
        yph yphVar = the.a;
        int i = carCall.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void i(CarCall carCall) throws RemoteException {
        yph yphVar = the.a;
        int i = carCall.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void j(CarCall carCall, List list) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void k(CarCall carCall, List list) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void l(CarCall carCall, List list) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(carCall, list);
    }

    @Override // defpackage.qwa
    public final void n(CarCall carCall, CarCall.Details details) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void o(CarCall carCall, CarCall carCall2) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void p(CarCall carCall, String str) throws RemoteException {
        yph yphVar = the.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void q(CarCall carCall, int i) throws RemoteException {
        yph yphVar = the.a;
        int i2 = carCall.a;
        this.a.c(null, null);
    }

    @Override // defpackage.qwa
    public final void m(CarCall carCall, String str, Bundle bundle) throws RemoteException {
    }
}
