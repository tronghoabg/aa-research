package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;

/* loaded from: classes3.dex */
public final class vhv extends ijn implements vhx {
    public vhv(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
    }

    @Override // defpackage.vhx
    public final void e(StreetViewPanoramaCamera streetViewPanoramaCamera) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, streetViewPanoramaCamera);
        gj(1, parcelGh);
    }
}
