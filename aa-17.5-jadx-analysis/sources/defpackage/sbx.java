package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sbx extends ijn implements sbz {
    public sbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ILocalBinderTransport");
    }

    @Override // defpackage.sbz
    public final IBinder e() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        IBinder strongBinder = parcelGi.readStrongBinder();
        parcelGi.recycle();
        return strongBinder;
    }
}
