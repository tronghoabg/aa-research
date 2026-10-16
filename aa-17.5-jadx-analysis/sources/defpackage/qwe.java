package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qwe extends ijn implements qwg {
    public qwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarConnectionListener");
    }

    @Override // defpackage.qwg
    public final void a(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(3, parcelGh);
    }

    @Override // defpackage.qwg
    public final void b(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(1, parcelGh);
    }

    @Override // defpackage.qwg
    public final void c() throws RemoteException {
        gk(2, gh());
    }
}
