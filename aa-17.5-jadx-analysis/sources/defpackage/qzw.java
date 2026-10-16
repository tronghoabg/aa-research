package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qzw extends ijn implements qzy {
    public qzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IProjectionWindowDragCallback");
    }

    @Override // defpackage.qzy
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(1, parcelGh);
    }

    @Override // defpackage.qzy
    public final void f(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(3, parcelGh);
    }

    @Override // defpackage.qzy
    public final void g() throws RemoteException {
        gk(2, gh());
    }
}
