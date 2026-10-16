package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sbw extends ijn implements IInterface {
    public sbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IConnectionTransferCallbacks");
    }

    public final void e() throws RemoteException {
        gj(2, gh());
    }

    public final void f(Bundle bundle) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, bundle);
        gj(1, parcelGh);
    }
}
