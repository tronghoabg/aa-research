package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qtv extends ijn implements qtx {
    public qtv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorServiceProvider");
    }

    @Override // defpackage.qtx
    public final void h(qua quaVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, quaVar);
        gk(1, parcelGh);
    }
}
