package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.StreetViewPanorama;
import com.google.android.libraries.maps.model.StreetViewPanoramaOrientation;

/* loaded from: classes3.dex */
public final class vic extends ijo implements vid {
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vic(StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaClickListener");
        this.a = onStreetViewPanoramaClickListener;
    }

    @Override // defpackage.vid
    public final void e(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.a.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) ijp.a(parcel, StreetViewPanoramaOrientation.CREATOR);
        ijp.d(parcel);
        e(streetViewPanoramaOrientation);
        parcel2.writeNoException();
        return true;
    }
}
