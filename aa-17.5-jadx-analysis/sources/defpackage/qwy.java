package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qwy extends ijn implements qxa {
    public qwy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMessage");
    }

    @Override // defpackage.qxa
    public final void c(qxd qxdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxdVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.qxa
    public final void d(qxd qxdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxdVar);
        gj(7, parcelGh);
    }

    @Override // defpackage.qxa
    public final void f(qxd qxdVar, int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxa
    public final void i(qxd qxdVar, int i, int i2, int i3) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxdVar);
        parcelGh.writeInt(i);
        parcelGh.writeInt(0);
        parcelGh.writeInt(i3);
        gj(4, parcelGh);
    }

    @Override // defpackage.qxa
    public final void j(qxd qxdVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxdVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.qxa
    public final boolean k(qxd qxdVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxdVar);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(3, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qxa
    public final int[] l(qxd qxdVar, int i, int i2) throws RemoteException {
        throw null;
    }
}
