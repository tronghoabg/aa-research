package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ovl extends ijn implements ovn {
    public ovl(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IImeCallback");
    }

    @Override // defpackage.ovn
    public final void e() throws RemoteException {
        gj(2, gh());
    }

    @Override // defpackage.ovn
    public final void f() throws RemoteException {
        gj(3, gh());
    }

    @Override // defpackage.ovn
    public final boolean g() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
