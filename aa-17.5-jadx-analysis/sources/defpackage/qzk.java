package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qzk extends ijn implements qzm {
    public qzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IDrivingStatusCallback");
    }

    @Override // defpackage.qzm
    public final void a(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(1, parcelGh);
    }

    @Override // defpackage.qzm
    public final void b(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gk(4, parcelGh);
    }

    @Override // defpackage.qzm
    public final void c(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gk(3, parcelGh);
    }
}
