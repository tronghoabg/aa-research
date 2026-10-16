package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qxb extends ijn implements qxd {
    public qxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMessageCallback");
    }

    @Override // defpackage.qxd
    public final void e(int i, int i2, int i3) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(0);
        parcelGh.writeInt(i3);
        gk(1, parcelGh);
    }

    @Override // defpackage.qxd
    public final void f(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(2, parcelGh);
    }
}
