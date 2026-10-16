package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sbr extends ijn implements sbt {
    public sbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ICarSetupBinder");
    }

    @Override // defpackage.sbt
    public final qwl e() throws RemoteException {
        qwl qwjVar;
        Parcel parcelGi = gi(1, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qwjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalMonitor");
            qwjVar = iInterfaceQueryLocalInterface instanceof qwl ? (qwl) iInterfaceQueryLocalInterface : new qwj(strongBinder);
        }
        parcelGi.recycle();
        return qwjVar;
    }

    @Override // defpackage.sbt
    public final void f() throws RemoteException {
        gj(2, gh());
    }
}
