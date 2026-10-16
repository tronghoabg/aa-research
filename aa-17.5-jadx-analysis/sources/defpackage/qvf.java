package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qvf extends ijn implements qvh {
    public qvf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudioRecord");
    }

    @Override // defpackage.qvh
    public final ParcelFileDescriptor a(qvk qvkVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        Parcel parcelGi = gi(4, parcelGh);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcelGi, ParcelFileDescriptor.CREATOR);
        parcelGi.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qvh
    public final void d(qvk qvkVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        parcelGh.writeInt(i);
        gj(6, parcelGh);
    }

    @Override // defpackage.qvh
    public final void f(qvk qvkVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        gj(3, parcelGh);
    }

    @Override // defpackage.qvh
    public final void g(qvk qvkVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.qvh
    public final void h(qvk qvkVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.qvh
    public final void i(qvk qvkVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.qvh
    public final boolean k(qvk qvkVar, int i) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvkVar);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(7, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
