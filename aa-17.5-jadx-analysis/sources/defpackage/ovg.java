package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ovg extends ijn implements ovi {
    public ovg(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IDrawerController");
    }

    @Override // defpackage.ovi
    public final void e() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovi
    public final void f() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovi
    public final void g(ovf ovfVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, ovfVar);
        gj(5, parcelGh);
    }

    @Override // defpackage.ovi
    public final void h(int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovi
    public final boolean i() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovi
    public final boolean j() throws RemoteException {
        throw null;
    }
}
