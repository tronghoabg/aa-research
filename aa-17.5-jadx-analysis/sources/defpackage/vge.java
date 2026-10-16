package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vge extends ijn implements vgg {
    public vge(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnLocationChangeListener");
    }

    @Override // defpackage.vgg
    public final void e(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.vgg
    public final void f(Location location) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, location);
        gj(2, parcelGh);
    }
}
