package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vhc extends ijn implements vhe {
    public vhc(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // defpackage.vhe
    public final boolean e() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
