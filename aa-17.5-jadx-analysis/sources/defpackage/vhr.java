package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IPolylineDelegate;

/* loaded from: classes3.dex */
public final class vhr extends ijn implements vht {
    public vhr(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnPolylineClickListener");
    }

    @Override // defpackage.vht
    public final void e(IPolylineDelegate iPolylineDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iPolylineDelegate);
        gj(1, parcelGh);
    }
}
