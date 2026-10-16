package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.PointOfInterest;

/* loaded from: classes3.dex */
public final class vhl extends ijn implements vhn {
    public vhl(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnPoiClickListener");
    }

    @Override // defpackage.vhn
    public final void e(PointOfInterest pointOfInterest) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, pointOfInterest);
        gj(1, parcelGh);
    }
}
