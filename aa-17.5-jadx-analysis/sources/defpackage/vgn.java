package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vgn extends ijn implements vgp {
    public vgn(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapLoadedCallback");
    }

    @Override // defpackage.vgp
    public final void a() throws RemoteException {
        gj(1, gh());
    }
}
