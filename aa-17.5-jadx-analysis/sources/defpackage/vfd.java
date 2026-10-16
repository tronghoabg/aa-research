package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vfd extends ijn implements vff {
    public vfd(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraMoveCanceledListener");
    }

    @Override // defpackage.vff
    public final void e() throws RemoteException {
        gj(1, gh());
    }
}
