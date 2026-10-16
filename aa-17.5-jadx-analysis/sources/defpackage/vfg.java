package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vfg extends ijn implements vfi {
    public vfg(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraMoveListener");
    }

    @Override // defpackage.vfi
    public final void e() throws RemoteException {
        gj(1, gh());
    }
}
