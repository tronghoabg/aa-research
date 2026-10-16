package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vgz extends ijn implements vhb {
    public vgz(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMarkerDragListener");
    }

    @Override // defpackage.vhb
    public final void e(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        gj(2, parcelGh);
    }

    @Override // defpackage.vhb
    public final void f(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        gj(3, parcelGh);
    }

    @Override // defpackage.vhb
    public final void g(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        gj(1, parcelGh);
    }
}
