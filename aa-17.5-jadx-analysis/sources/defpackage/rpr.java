package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rpr extends ssv {
    public final /* synthetic */ rps a;

    public rpr(rps rpsVar) {
        this.a = rpsVar;
    }

    @Override // defpackage.ssv
    public final void a(ComponentName componentName, IBinder iBinder) throws RemoteException {
        String interfaceDescriptor;
        rpj rphVar;
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Connected to %s", componentName.toShortString());
        }
        try {
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 5)) {
                rrd.d(5, "CAR.PROJECTION.PLSCM", null, "RemoteException received getting interface descriptor", new Object[0]);
            }
            interfaceDescriptor = null;
        }
        if (!"com.google.android.gms.car.lifetime.IProjectionLifetime".equals(interfaceDescriptor)) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 5)) {
                rrd.d(5, "CAR.PROJECTION.PLSCM", null, "Lifetime service connected but unable to cast interface descriptor. Proceeding without lifetime verification.", new Object[0]);
            }
            new sss(Looper.getMainLooper()).post(new rnq(this, 7));
            return;
        }
        rps rpsVar = this.a;
        rpsVar.f = true;
        if (iBinder == null) {
            rphVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetime");
            rphVar = iInterfaceQueryLocalInterface instanceof rpj ? (rpj) iInterfaceQueryLocalInterface : new rph(iBinder);
        }
        rpsVar.i = rphVar;
        woy.aa(rpsVar.f, "Lifetime service not bound.");
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "registerLifetimeCallback", new Object[0]);
        }
        if (rpsVar.i == null) {
            throw new IllegalStateException("Lifetime service not bound.");
        }
        if (rpsVar.d != null) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.d(3, "CAR.PROJECTION.PLSCM", null, "registerLifetimeCallback: Callback already registered.", new Object[0]);
                return;
            }
            return;
        }
        rpsVar.d = new rpl(rpsVar);
        try {
            rpsVar.i.e(rpsVar.d);
        } catch (RemoteException e) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 5)) {
                rrd.d(5, "CAR.PROJECTION.PLSCM", e, "RemoteException calling registerProjectionLifetimeCallback. Removing callback and unbinding service.", new Object[0]);
            }
            rpsVar.d = null;
            rpsVar.d();
        }
    }

    @Override // defpackage.ssv
    public final void b(ComponentName componentName) {
        rps rpsVar = this.a;
        if (!rpsVar.f) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.a("CAR.PROJECTION.PLSCM", null, "doServiceDisconnected called when not bound. Ignoring.");
                return;
            }
            return;
        }
        if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
            rrd.d(3, "CAR.PROJECTION.PLSCM", null, "Disconnected from %s. Unbinding service.", componentName.toShortString());
        }
        rpsVar.g = 0;
        rpsVar.e();
        rpsVar.d();
        if (rpsVar.b && rpsVar.c && rpsVar.e.isEmpty()) {
            if (rrd.e("CAR.PROJECTION.PLSCM", 3)) {
                rrd.a("CAR.PROJECTION.PLSCM", null, "No pending callbacks, not attempting to rebind");
            }
        } else {
            if (rpsVar.f(rps.a(rpsVar.a)) || !rrd.e("CAR.PROJECTION.PLSCM", 4)) {
                return;
            }
            rrd.c("CAR.PROJECTION.PLSCM", null, "Lifetime service could not be rebound. Unregistering callback.");
        }
    }
}
