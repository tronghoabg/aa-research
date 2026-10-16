package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;

/* loaded from: classes3.dex */
public final class vib extends ijn implements vid {
    public vib(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaClickListener");
    }

    @Override // defpackage.vid
    public final void e(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, streetViewPanoramaOrientation);
        gj(1, parcelGh);
    }
}
