package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qty extends ijn implements qua {
    public qty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorServiceReadyCallback");
    }

    @Override // defpackage.qua
    public final void a(qtu qtuVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qtuVar);
        gk(1, parcelGh);
    }
}
