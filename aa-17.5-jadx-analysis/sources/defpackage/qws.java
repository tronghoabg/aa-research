package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qws extends ijn implements qwu {
    public qws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMediaPlaybackStatus");
    }

    @Override // defpackage.qwu
    public final void f(qwx qwxVar, String str, String str2, String str3, byte[] bArr, String str4, int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwxVar);
        parcelGh.writeString(str);
        parcelGh.writeString(str2);
        parcelGh.writeString(str3);
        parcelGh.writeByteArray(bArr);
        parcelGh.writeString(null);
        parcelGh.writeInt(i);
        parcelGh.writeInt(0);
        gj(2, parcelGh);
    }

    @Override // defpackage.qwu
    public final void g(qwx qwxVar, int i, String str, int i2, boolean z, boolean z2, boolean z3) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwxVar);
        parcelGh.writeInt(i);
        parcelGh.writeString(str);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(0);
        parcelGh.writeInt(0);
        gj(1, parcelGh);
    }

    @Override // defpackage.qwu
    public final boolean h(qwx qwxVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwxVar);
        Parcel parcelGi = gi(3, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }

    @Override // defpackage.qwu
    public final boolean i(qwx qwxVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwxVar);
        Parcel parcelGi = gi(4, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
