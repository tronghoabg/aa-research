package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;

/* loaded from: classes3.dex */
public final class vgh extends ijn implements vgj {
    public vgh(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapCapabilitiesChangedListener");
    }

    @Override // defpackage.vgj
    public final void e(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMapCapabilitiesDelegate);
        gj(1, parcelGh);
    }
}
