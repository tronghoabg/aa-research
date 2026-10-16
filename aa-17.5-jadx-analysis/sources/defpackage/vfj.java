package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vfj extends ijn implements vfl {
    public vfj(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // defpackage.vfl
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(1, parcelGh);
    }
}
