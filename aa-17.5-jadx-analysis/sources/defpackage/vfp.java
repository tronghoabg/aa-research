package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate;

/* loaded from: classes3.dex */
public final class vfp extends ijn implements vfr {
    public vfp(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // defpackage.vfr
    public final void e(IGroundOverlayDelegate iGroundOverlayDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iGroundOverlayDelegate);
        gj(1, parcelGh);
    }
}
