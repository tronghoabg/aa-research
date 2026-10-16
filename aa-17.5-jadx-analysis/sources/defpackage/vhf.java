package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vhf extends ijn implements vhh {
    public vhf(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMyLocationChangeListener");
    }

    @Override // defpackage.vhh
    public final void e(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        gj(1, parcelGh);
    }
}
