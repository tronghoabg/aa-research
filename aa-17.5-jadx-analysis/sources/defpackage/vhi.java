package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vhi extends ijn implements vhk {
    public vhi(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMyLocationClickListener");
    }

    @Override // defpackage.vhk
    public final void e(Location location) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, location);
        gj(1, parcelGh);
    }
}
