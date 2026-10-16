package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;

/* loaded from: classes3.dex */
public final class vhy extends ijn implements via {
    public vhy(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    @Override // defpackage.via
    public final void e(StreetViewPanoramaLocation streetViewPanoramaLocation) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, streetViewPanoramaLocation);
        gj(1, parcelGh);
    }
}
