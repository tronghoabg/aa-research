package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarPhoneStatus;

/* loaded from: classes.dex */
public final class qxn extends ijn implements qxp {
    public qxn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarPhoneStatus");
    }

    @Override // defpackage.qxp
    public final void g(CarPhoneStatus carPhoneStatus) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carPhoneStatus);
        gj(6, parcelGh);
    }

    @Override // defpackage.qxp
    public final void h(qxs qxsVar, CarPhoneStatus carPhoneStatus) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxp
    public final boolean i() throws RemoteException {
        Parcel parcelGi = gi(4, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qxp
    public final boolean j(int i, qxs qxsVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(1);
        ijp.i(parcelGh, qxsVar);
        Parcel parcelGi = gi(5, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qxp
    public final boolean k(qxs qxsVar) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qxp
    public final boolean l(qxs qxsVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxsVar);
        Parcel parcelGi = gi(3, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
