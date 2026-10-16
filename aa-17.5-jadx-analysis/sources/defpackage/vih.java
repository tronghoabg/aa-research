package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vih extends ijn implements vij {
    public vih(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // defpackage.vij
    public final void a(vis visVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, visVar);
        gj(1, parcelGh);
    }
}
