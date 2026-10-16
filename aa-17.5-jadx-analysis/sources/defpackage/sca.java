package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sca extends ijn implements scc {
    public sca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IServiceHandshake");
    }

    @Override // defpackage.scc
    public final void a(scf scfVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, scfVar);
        gj(1, parcelGh);
    }
}
