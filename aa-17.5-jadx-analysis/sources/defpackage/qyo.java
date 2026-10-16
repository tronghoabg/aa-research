package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qyo extends ijn implements qyq {
    public qyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVendorExtension");
    }

    @Override // defpackage.qyq
    public final ParcelFileDescriptor a(qyt qytVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        Parcel parcelGi = gi(8, parcelGh);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcelGi, ParcelFileDescriptor.CREATOR);
        parcelGi.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qyq
    public final ParcelFileDescriptor f(qyt qytVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        Parcel parcelGi = gi(5, parcelGh);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcelGi, ParcelFileDescriptor.CREATOR);
        parcelGi.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qyq
    public final String g(qyt qytVar) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qyq
    public final void j(qyt qytVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        parcelGh.writeInt(i);
        gj(7, parcelGh);
    }

    @Override // defpackage.qyq
    public final void k(qyt qytVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        parcelGh.writeInt(i);
        gj(9, parcelGh);
    }

    @Override // defpackage.qyq
    public final void l(qyt qytVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        parcelGh.writeInt(i);
        gj(6, parcelGh);
    }

    @Override // defpackage.qyq
    public final void o(qyt qytVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.qyq
    public final boolean s(qyt qytVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qytVar);
        Parcel parcelGi = gi(1, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qyq
    public final byte[] t(qyt qytVar) throws RemoteException {
        throw null;
    }
}
