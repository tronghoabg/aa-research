package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.StreetViewPanorama;
import com.google.android.libraries.maps.model.StreetViewPanoramaLocation;

/* loaded from: classes3.dex */
public final class vhz extends ijo implements via {
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhz(StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaChangeListener");
        this.a = onStreetViewPanoramaChangeListener;
    }

    @Override // defpackage.via
    public final void e(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.a.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) ijp.a(parcel, StreetViewPanoramaLocation.CREATOR);
        ijp.d(parcel);
        e(streetViewPanoramaLocation);
        parcel2.writeNoException();
        return true;
    }
}
