package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.StreetViewPanorama;
import com.google.android.libraries.maps.model.StreetViewPanoramaCamera;

/* loaded from: classes3.dex */
public final class vhw extends ijo implements vhx {
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhw(StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        this.a = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // defpackage.vhx
    public final void e(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.a.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) ijp.a(parcel, StreetViewPanoramaCamera.CREATOR);
        ijp.d(parcel);
        e(streetViewPanoramaCamera);
        parcel2.writeNoException();
        return true;
    }
}
