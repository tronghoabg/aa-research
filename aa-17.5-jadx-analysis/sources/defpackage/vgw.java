package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vgw extends ijn implements vgy {
    public vgw(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMarkerClickListener");
    }

    @Override // defpackage.vgy
    public final boolean e(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        Parcel parcelGi = gi(1, parcelGh);
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
