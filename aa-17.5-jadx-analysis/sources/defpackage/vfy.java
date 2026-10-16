package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vfy extends ijn implements vga {
    public vfy(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnInfoWindowCloseListener");
    }

    @Override // defpackage.vga
    public final void e(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        gj(1, parcelGh);
    }
}
