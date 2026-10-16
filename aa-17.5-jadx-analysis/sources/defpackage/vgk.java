package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class vgk extends ijn implements vgm {
    public vgk(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapClickListener");
    }

    @Override // defpackage.vgm
    public final void e(LatLng latLng) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
        gj(1, parcelGh);
    }
}
