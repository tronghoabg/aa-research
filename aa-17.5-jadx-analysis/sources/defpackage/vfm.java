package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.ICircleDelegate;

/* loaded from: classes3.dex */
public final class vfm extends ijn implements vfo {
    public vfm(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCircleClickListener");
    }

    @Override // defpackage.vfo
    public final void e(ICircleDelegate iCircleDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iCircleDelegate);
        gj(1, parcelGh);
    }
}
