package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qwj extends ijn implements qwl {
    public qwj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGalMonitor");
    }

    @Override // defpackage.qwl
    public final void b(qwi qwiVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwiVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.qwl
    public final void c(qwi qwiVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwiVar);
        parcelGh.writeInt(i);
        gj(3, parcelGh);
    }

    @Override // defpackage.qwl
    public final void d(qwi qwiVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwiVar);
        parcelGh.writeInt(i);
        gj(1, parcelGh);
    }

    @Override // defpackage.qwl
    public final void f(qwi qwiVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwiVar);
        gj(6, parcelGh);
    }

    @Override // defpackage.qwl
    public final void g(qwi qwiVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwiVar);
        parcelGh.writeInt(i);
        gj(4, parcelGh);
    }

    @Override // defpackage.qwl
    public final void h(qwi qwiVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwiVar);
        parcelGh.writeInt(i);
        gj(2, parcelGh);
    }
}
