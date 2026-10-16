package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class quw extends ijn implements quy {
    public quw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityStartProcessor");
    }

    @Override // defpackage.quy
    public final void e(Intent intent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, intent);
        gk(1, parcelGh);
    }
}
