package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class scd extends ijn implements scf {
    public scd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IServiceHandshakeCallback");
    }

    @Override // defpackage.scf
    public final void e() throws RemoteException {
        gj(1, gh());
    }
}
