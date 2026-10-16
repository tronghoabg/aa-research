package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class vgq extends ijn implements vgs {
    public vgq(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapLongClickListener");
    }

    @Override // defpackage.vgs
    public final void e(LatLng latLng) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
        gj(1, parcelGh);
    }
}
