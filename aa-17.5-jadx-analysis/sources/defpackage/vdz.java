package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vdz extends ijn implements veb {
    public vdz(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.ICancelableCallback");
    }

    @Override // defpackage.veb
    public final void a() throws RemoteException {
        gj(2, gh());
    }

    @Override // defpackage.veb
    public final void b() throws RemoteException {
        gj(1, gh());
    }
}
