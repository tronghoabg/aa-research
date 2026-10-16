package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;

/* loaded from: classes.dex */
public final class qzr extends ijo implements qzs {
    private final rba a;

    public qzr(rba rbaVar) {
        super("com.google.android.gms.car.IProjectionLifecycle");
        this.a = rbaVar;
    }

    @Override // defpackage.qzs
    public final void e(Bundle bundle, qzv qzvVar) {
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.CLIENT.PLS", null, "onPreflightStart on binder thread", new Object[0]);
        }
        rba rbaVar = this.a;
        rbaVar.sendMessage(rbaVar.obtainMessage(2, Binder.getCallingUid(), 0, new Pair(bundle, qzvVar)));
    }

    @Override // defpackage.qzs
    public final void f() {
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            rrd.a("CAR.CLIENT.PLS", null, "onProjectionEnd on binder thread");
        }
        rba rbaVar = this.a;
        rbaVar.sendMessage(rbaVar.obtainMessage(1, Binder.getCallingUid(), 0));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qzv qztVar;
        qup qunVar = null;
        qzv qztVar2 = null;
        qzv qztVar3 = null;
        qzv qztVar4 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                qztVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                qztVar = iInterfaceQueryLocalInterface instanceof qzv ? (qzv) iInterfaceQueryLocalInterface : new qzt(strongBinder);
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICar");
                qunVar = iInterfaceQueryLocalInterface2 instanceof qup ? (qup) iInterfaceQueryLocalInterface2 : new qun(strongBinder2);
            }
            ijp.d(parcel);
            h(qztVar, qunVar);
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                qztVar4 = iInterfaceQueryLocalInterface3 instanceof qzv ? (qzv) iInterfaceQueryLocalInterface3 : new qzt(strongBinder3);
            }
            ijp.d(parcel);
            e(bundle, qztVar4);
        } else if (i == 4) {
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                qztVar3 = iInterfaceQueryLocalInterface4 instanceof qzv ? (qzv) iInterfaceQueryLocalInterface4 : new qzt(strongBinder4);
            }
            ijp.d(parcel);
            g(qztVar3);
        } else {
            if (i != 5) {
                return false;
            }
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                qztVar2 = iInterfaceQueryLocalInterface5 instanceof qzv ? (qzv) iInterfaceQueryLocalInterface5 : new qzt(strongBinder5);
            }
            ijp.d(parcel);
            i(qztVar2);
        }
        return true;
    }

    @Override // defpackage.qzs
    public final void g(qzv qzvVar) {
        wer.b();
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.CLIENT.PLS", null, "onProjectionReady on binder thread", new Object[0]);
        }
        rba rbaVar = this.a;
        rbaVar.sendMessage(rbaVar.obtainMessage(3, Binder.getCallingUid(), 0, qzvVar));
    }

    @Override // defpackage.qzs
    public final void h(qzv qzvVar, qup qupVar) {
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.CLIENT.PLS", null, "onProjectionStart on binder thread", new Object[0]);
        }
        rba rbaVar = this.a;
        rbaVar.sendMessage(rbaVar.obtainMessage(0, Binder.getCallingUid(), 0, new Pair(qzvVar, qupVar)));
    }

    @Override // defpackage.qzs
    public final void i(qzv qzvVar) {
        wer.b();
        if (omc.c("CAR.CLIENT.PLS", 3)) {
            rrd.a("CAR.CLIENT.PLS", null, "onProjectionTearDown on binder thread");
        }
        rba rbaVar = this.a;
        rbaVar.sendMessage(rbaVar.obtainMessage(4, Binder.getCallingUid(), 0, qzvVar));
    }
}
