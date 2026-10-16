package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class scg extends ijn implements sci {
    public scg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ITransferStateCallbacks");
    }

    @Override // defpackage.sci
    public final void a() throws RemoteException {
        gj(1, gh());
    }
}
