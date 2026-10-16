package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qzt extends ijn implements qzv {
    public qzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IProjectionLifecycleCallback");
    }

    @Override // defpackage.qzv
    public final void e(int i, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(1);
        ijp.g(parcelGh, bundle);
        gj(2, parcelGh);
    }

    @Override // defpackage.qzv
    public final void f(int i, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(1);
        ijp.g(parcelGh, bundle);
        gj(1, parcelGh);
    }
}
