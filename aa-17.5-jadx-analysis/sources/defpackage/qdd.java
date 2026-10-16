package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qdd extends ijn implements qdf {
    public qdd(IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileService");
    }

    @Override // defpackage.qdf
    public final void e(long j, int i, int i2, byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeByteArray(bArr);
        gj(1, parcelGh);
    }

    @Override // defpackage.qdf
    public final byte[] f(long j, int i, long j2, int i2, byte[] bArr, qdc qdcVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeLong(-4319067186032159575L);
        parcelGh.writeInt(i2);
        parcelGh.writeByteArray(bArr);
        ijp.i(parcelGh, qdcVar);
        Parcel parcelGi = gi(3, parcelGh);
        byte[] bArrCreateByteArray = parcelGi.createByteArray();
        parcelGi.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.qdf
    public final byte[] g(long j, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        Parcel parcelGi = gi(4, parcelGh);
        byte[] bArrCreateByteArray = parcelGi.createByteArray();
        parcelGi.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.qdf
    public final Bundle h(long j) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(0);
        Parcel parcelGi = gi(5, parcelGh);
        Bundle bundle = (Bundle) ijp.a(parcelGi, Bundle.CREATOR);
        parcelGi.recycle();
        return bundle;
    }

    @Override // defpackage.qdf
    public final void i(long j, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(0);
        ijp.g(parcelGh, bundle);
        gj(2, parcelGh);
    }
}
