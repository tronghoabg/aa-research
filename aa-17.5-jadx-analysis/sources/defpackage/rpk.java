package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rpk extends ijn implements rpm {
    public rpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
    }

    @Override // defpackage.rpm
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(2, parcelGh);
    }
}
