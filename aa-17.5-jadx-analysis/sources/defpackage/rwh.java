package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rwh extends ijn implements rwj {
    public rwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.servicebroker.ICarServiceBroker");
    }

    @Override // defpackage.rwj
    public final qup a(Bundle bundle) throws RemoteException {
        qup qunVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        Parcel parcelGi = gi(1, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qunVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICar");
            qunVar = iInterfaceQueryLocalInterface instanceof qup ? (qup) iInterfaceQueryLocalInterface : new qun(strongBinder);
        }
        parcelGi.recycle();
        return qunVar;
    }
}
