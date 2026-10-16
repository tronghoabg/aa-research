package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;

/* loaded from: classes3.dex */
public final class vie extends ijn implements vig {
    public vie(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    @Override // defpackage.vig
    public final void e(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, streetViewPanoramaOrientation);
        gj(1, parcelGh);
    }
}
