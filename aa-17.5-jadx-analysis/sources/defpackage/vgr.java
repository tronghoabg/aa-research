package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class vgr extends ijo implements vgs {
    final /* synthetic */ GoogleMap.OnMapLongClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgr(GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        super("com.google.android.libraries.maps.internal.IOnMapLongClickListener");
        this.a = onMapLongClickListener;
    }

    @Override // defpackage.vgs
    public final void e(LatLng latLng) {
        this.a.onMapLongClick(latLng);
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
