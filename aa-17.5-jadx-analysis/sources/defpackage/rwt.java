package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class rwt extends ijn implements rwv {
    public rwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IStartup");
    }

    @Override // defpackage.rwv
    public final qup b() throws RemoteException {
        qup qunVar;
        Parcel parcelGi = gi(13, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qunVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICar");
            qunVar = iInterfaceQueryLocalInterface instanceof qup ? (qup) iInterfaceQueryLocalInterface : new qun(strongBinder);
        }
        parcelGi.recycle();
        return qunVar;
    }

    @Override // defpackage.rwv
    public final rwp c(rws rwsVar) throws RemoteException {
        rwp rwnVar;
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rwsVar);
        Parcel parcelGi = gi(16, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rwnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPoint");
            rwnVar = iInterfaceQueryLocalInterface instanceof rwp ? (rwp) iInterfaceQueryLocalInterface : new rwn(strongBinder);
        }
        parcelGi.recycle();
        return rwnVar;
    }

    @Override // defpackage.rwv
    public final void d(long j, int i, Bundle bundle, rwy rwyVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        ijp.g(parcelGh, bundle);
        ijp.i(parcelGh, rwyVar);
        gj(20, parcelGh);
    }

    @Override // defpackage.rwv
    public final void f() throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwv
    public final void g(long j, ParcelFileDescriptor parcelFileDescriptor, rwy rwyVar) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwv
    public final void h(long j, rwy rwyVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        ijp.i(parcelGh, rwyVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.rwv
    public final void i(long j, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        gj(19, parcelGh);
    }

    @Override // defpackage.rwv
    public final void j(long j, List list, List list2, rwm rwmVar) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwv
    public final void k(long j, List list, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwv
    public final void l(long j, List list, List list2, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeList(list);
        parcelGh.writeList(list2);
        ijp.g(parcelGh, parcelFileDescriptor);
        ijp.i(parcelGh, rwmVar);
        gj(17, parcelGh);
    }

    @Override // defpackage.rwv
    public final void m(long j) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        gj(8, parcelGh);
    }

    @Override // defpackage.rwv
    public final void n(long j, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        ijp.g(parcelGh, bundle);
        gj(23, parcelGh);
    }

    @Override // defpackage.rwv
    public final void o(boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(z2 ? 1 : 0);
        gj(22, parcelGh);
    }

    @Override // defpackage.rwv
    public final boolean r(long j) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        Parcel parcelGi = gi(1, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.rwv
    public final boolean s(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwv
    public final void t() throws RemoteException {
        throw null;
    }

    @Override // defpackage.rwv
    public final void u() throws RemoteException {
        throw null;
    }
}
