package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vfv extends ijn implements vfx {
    public vfv(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // defpackage.vfx
    public final void e(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        gj(1, parcelGh);
    }
}
