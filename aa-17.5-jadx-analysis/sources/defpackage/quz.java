package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarAudioConfiguration;

/* loaded from: classes.dex */
public final class quz extends ijn implements qvb {
    public quz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudio");
    }

    @Override // defpackage.qvb
    public final int b(int i, int i2) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final int c(int i, int i2) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration d(int i, int i2) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration f(int i, int i2) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final void g(qvn qvnVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvnVar);
        gj(13, parcelGh);
    }

    @Override // defpackage.qvb
    public final void h(qxg qxgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxgVar);
        gj(15, parcelGh);
    }

    @Override // defpackage.qvb
    public final void k(qvn qvnVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qvnVar);
        gj(14, parcelGh);
    }

    @Override // defpackage.qvb
    public final void l(qxg qxgVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qxgVar);
        gj(16, parcelGh);
    }

    @Override // defpackage.qvb
    public final boolean m(long j) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final boolean n(long j) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final int[] o() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        int[] iArrCreateIntArray = parcelGi.createIntArray();
        parcelGi.recycle();
        return iArrCreateIntArray;
    }

    @Override // defpackage.qvb
    public final int[] p() throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration[] q(int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration[] r(int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.qvb
    public final qvh s(qve qveVar, int i) throws RemoteException {
        qvh qvfVar;
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qveVar);
        parcelGh.writeInt(0);
        parcelGh.writeInt(0);
        parcelGh.writeInt(sk.AUDIO_CONTENT_BUFFER_SIZE);
        Parcel parcelGi = gi(10, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qvfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioRecord");
            qvfVar = iInterfaceQueryLocalInterface instanceof qvh ? (qvh) iInterfaceQueryLocalInterface : new qvf(strongBinder);
        }
        parcelGi.recycle();
        return qvfVar;
    }

    @Override // defpackage.qvb
    public final qvo t() throws RemoteException {
        throw null;
    }
}
