package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.PointOfInterest;

/* loaded from: classes3.dex */
public final class vhm extends ijo implements vhn {
    final /* synthetic */ GoogleMap.OnPoiClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhm(GoogleMap.OnPoiClickListener onPoiClickListener) {
        super("com.google.android.libraries.maps.internal.IOnPoiClickListener");
        this.a = onPoiClickListener;
    }

    @Override // defpackage.vhn
    public final void e(PointOfInterest pointOfInterest) {
        this.a.onPoiClick(pointOfInterest);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        PointOfInterest pointOfInterest = (PointOfInterest) ijp.a(parcel, PointOfInterest.CREATOR);
        ijp.d(parcel);
        e(pointOfInterest);
        parcel2.writeNoException();
        return true;
    }
}
