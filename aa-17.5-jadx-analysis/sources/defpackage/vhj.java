package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vhj extends ijo implements vhk {
    final /* synthetic */ GoogleMap.OnMyLocationClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhj(GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        super("com.google.android.libraries.maps.internal.IOnMyLocationClickListener");
        this.a = onMyLocationClickListener;
    }

    @Override // defpackage.vhk
    public final void e(Location location) {
        this.a.onMyLocationClick(location);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Location location = (Location) ijp.a(parcel, Location.CREATOR);
        ijp.d(parcel);
        e(location);
        parcel2.writeNoException();
        return true;
    }
}
