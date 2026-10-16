package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rph extends ijn implements rpj {
    public rph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.lifetime.IProjectionLifetime");
    }

    @Override // defpackage.rpj
    public final void e(rpm rpmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rpmVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.rpj
    public final void f(rpm rpmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rpmVar);
        gj(3, parcelGh);
    }
}
