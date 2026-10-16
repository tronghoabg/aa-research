package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class jnm implements Runnable {
    final /* synthetic */ IBinder a;
    final /* synthetic */ zhc b;

    public jnm(IBinder iBinder, zhc zhcVar) {
        this.a = iBinder;
        this.b = zhcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yph yphVar = jnp.a;
        IBinder iBinder = this.a;
        zhc zhcVar = this.b;
        try {
            if (iBinder == null) {
                jnp.a(zhcVar, "CarChimeraService in Gearhead returned null binder.");
                return;
            }
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.servicebroker.ICarServiceBroker");
                rwj rwhVar = iInterfaceQueryLocalInterface instanceof rwj ? (rwj) iInterfaceQueryLocalInterface : new rwh(iBinder);
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("client_name", "car-1-0");
                    qup qupVarA = rwhVar.a(bundle);
                    if (qupVarA == null) {
                        jnp.a(zhcVar, "CarChimeraService in Gearhead returned null iCar.");
                        if (zhcVar.isDone()) {
                            return;
                        }
                        jnp.a(zhcVar, "Failed to successfully complete connection future.");
                        return;
                    }
                    ((ype) jnp.a.l().ai(2414)).u("Successfully connected to CarChimeraService in Gearhead");
                    zhcVar.o(qupVarA);
                    if (zhcVar.isDone()) {
                        return;
                    }
                    jnp.a(zhcVar, "Failed to successfully complete connection future.");
                } catch (RemoteException e) {
                    jnp.b(zhcVar, "Failed to fetch ICar from CarServiceBroker", e);
                    if (zhcVar.isDone()) {
                        return;
                    }
                    jnp.a(zhcVar, "Failed to successfully complete connection future.");
                }
            } catch (Exception e2) {
                jnp.b(zhcVar, "onServiceConnected failure", e2);
                if (zhcVar.isDone()) {
                    return;
                }
                jnp.a(zhcVar, "Failed to successfully complete connection future.");
            }
        } catch (Throwable th) {
            if (!zhcVar.isDone()) {
                jnp.a(zhcVar, "Failed to successfully complete connection future.");
            }
            throw th;
        }
    }
}
