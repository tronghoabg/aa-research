package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qyr extends ijn implements qyt {
    public qyr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVendorExtensionClient");
    }

    @Override // defpackage.qyt
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gk(1, parcelGh);
    }
}
