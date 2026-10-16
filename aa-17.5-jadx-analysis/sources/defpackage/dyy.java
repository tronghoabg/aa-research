package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class dyy implements dyf {
    private final /* synthetic */ dyf a;

    public dyy(dyf dyfVar) {
        this.a = dyfVar;
    }

    @Override // defpackage.dyf
    public final void a(boolean z, dxv dxvVar) throws RemoteException {
        this.a.a(z, dxvVar);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a.asBinder();
    }
}
