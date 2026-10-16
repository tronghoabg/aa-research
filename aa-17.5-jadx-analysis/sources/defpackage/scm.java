package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class scm extends ijn implements sco {
    public scm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
    }

    @Override // defpackage.sco
    public final void e() throws RemoteException {
        gj(1, gh());
    }
}
