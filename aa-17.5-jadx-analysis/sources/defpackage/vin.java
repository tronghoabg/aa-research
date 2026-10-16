package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vin extends ijn implements vip {
    public vin(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.ISnapshotReadyCallback");
    }

    @Override // defpackage.vip
    public final void a(Bitmap bitmap) throws RemoteException {
        throw null;
    }

    @Override // defpackage.vip
    public final void b(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        gj(2, parcelGh);
    }
}
