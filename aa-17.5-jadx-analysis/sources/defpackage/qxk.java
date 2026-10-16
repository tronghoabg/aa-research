package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qxk extends ijn implements qxm {
    public qxk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarNavigationStatusEventListener");
    }

    @Override // defpackage.qxm
    public final void e(int i, int i2, int i3, int i4, int i5) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeInt(i4);
        parcelGh.writeInt(i5);
        gk(1, parcelGh);
    }

    @Override // defpackage.qxm
    public final void f() throws RemoteException {
        gk(2, gh());
    }
}
