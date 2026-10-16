package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qzg extends ijn implements qzi {
    public qzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IConnectionController");
    }

    @Override // defpackage.qzi
    public final void e() throws RemoteException {
        gj(2, gh());
    }

    @Override // defpackage.qzi
    public final void f(qzp qzpVar, int i, boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qzpVar);
        ijp.i(parcelGh, null);
        parcelGh.writeInt(3);
        parcelGh.writeInt(1);
        parcelGh.writeInt(0);
        gj(11, parcelGh);
    }
}
