package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qvp extends ijn implements qvr {
    public qvp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarBluetooth");
    }

    @Override // defpackage.qvr
    public final int c() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qvr
    public final String g() throws RemoteException {
        Parcel parcelGi = gi(8, gh());
        String string = parcelGi.readString();
        parcelGi.recycle();
        return string;
    }

    @Override // defpackage.qvr
    public final String h() throws RemoteException {
        Parcel parcelGi = gi(11, gh());
        String string = parcelGi.readString();
        parcelGi.recycle();
        return string;
    }

    @Override // defpackage.qvr
    public final String i() throws RemoteException {
        Parcel parcelGi = gi(12, gh());
        String string = parcelGi.readString();
        parcelGi.recycle();
        return string;
    }

    @Override // defpackage.qvr
    public final void n() throws RemoteException {
        gj(10, gh());
    }

    @Override // defpackage.qvr
    public final boolean q() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvr
    public final boolean r() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvr
    public final boolean s() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvr
    public final boolean t() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvr
    public final boolean u() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvr
    public final boolean v(qvu qvuVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvuVar);
        Parcel parcelGi = gi(2, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qvr
    public final int[] w() throws RemoteException {
        throw null;
    }
}
