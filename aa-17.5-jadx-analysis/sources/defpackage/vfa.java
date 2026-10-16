package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vfa extends ijn implements vfc {
    public vfa(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraIdleListener");
    }

    @Override // defpackage.vfc
    public final void e() throws RemoteException {
        gj(1, gh());
    }
}
