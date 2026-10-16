package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rwn extends ijn implements rwp {
    public rwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    @Override // defpackage.rwp
    public final void f(rws rwsVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rwsVar);
        gj(6, parcelGh);
    }

    @Override // defpackage.rwp
    public final void g(rws rwsVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rwsVar);
        gj(7, parcelGh);
    }

    @Override // defpackage.rwp
    public final boolean gm(int i, long j) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwp
    public final boolean h() throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwp
    public final byte[] n(int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwp
    public final int[] o() throws RemoteException {
        throw null;
    }
}
