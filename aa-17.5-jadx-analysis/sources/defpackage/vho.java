package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IPolygonDelegate;

/* loaded from: classes3.dex */
public final class vho extends ijn implements vhq {
    public vho(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnPolygonClickListener");
    }

    @Override // defpackage.vhq
    public final void e(IPolygonDelegate iPolygonDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iPolygonDelegate);
        gj(1, parcelGh);
    }
}
