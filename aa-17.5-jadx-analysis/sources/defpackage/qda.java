package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qda extends ijn implements qdc {
    public qda(IBinder iBinder) {
        super(iBinder, "com.google.android.enterprise.connectedapps.ICrossProfileCallback");
    }

    @Override // defpackage.qdc
    public final void e(long j, int i, byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeByteArray(bArr);
        gj(4, parcelGh);
    }

    @Override // defpackage.qdc
    public final void f(long j, int i, int i2, byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeByteArray(bArr);
        gj(1, parcelGh);
    }

    @Override // defpackage.qdc
    public final void g(long j, int i, byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        parcelGh.writeInt(0);
        parcelGh.writeByteArray(bArr);
        gj(3, parcelGh);
    }

    @Override // defpackage.qdc
    public final void h(long j, Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(0);
        ijp.g(parcelGh, bundle);
        gj(2, parcelGh);
    }
}
