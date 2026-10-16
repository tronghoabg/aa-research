package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vgt extends ijn implements vgv {
    public vgt(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapReadyCallback");
    }

    @Override // defpackage.vgv
    public final void a(veg vegVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vegVar);
        gj(1, parcelGh);
    }
}
