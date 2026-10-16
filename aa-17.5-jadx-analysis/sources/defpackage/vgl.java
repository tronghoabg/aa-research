package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class vgl extends ijo implements vgm {
    final /* synthetic */ GoogleMap.OnMapClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgl(GoogleMap.OnMapClickListener onMapClickListener) {
        super("com.google.android.libraries.maps.internal.IOnMapClickListener");
        this.a = onMapClickListener;
    }

    @Override // defpackage.vgm
    public final void e(LatLng latLng) {
        this.a.onMapClick(latLng);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        LatLng latLng = (LatLng) ijp.a(parcel, LatLng.CREATOR);
        ijp.d(parcel);
        e(latLng);
        parcel2.writeNoException();
        return true;
    }
}
