package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ovx extends ijn implements ovz {
    public ovx(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IStatusBarController");
    }

    @Override // defpackage.ovz
    public final void e() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void f() throws RemoteException {
        gj(8, gh());
    }

    @Override // defpackage.ovz
    public final void g() throws RemoteException {
        gj(10, gh());
    }

    @Override // defpackage.ovz
    public final void h() throws RemoteException {
        gj(6, gh());
    }

    @Override // defpackage.ovz
    public final void i() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void j() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void k(float f) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void l(int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void m(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(2);
        gj(20, parcelGh);
    }

    @Override // defpackage.ovz
    public final void n(int i) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void o(boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        gj(21, parcelGh);
    }

    @Override // defpackage.ovz
    public final void p(boolean z, boolean z2) throws RemoteException {
        Parcel parcelGh = gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeInt(z ? 1 : 0);
        parcelGh.writeInt(z2 ? 1 : 0);
        gj(19, parcelGh);
    }

    @Override // defpackage.ovz
    public final void q(CharSequence charSequence) throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void r() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void s() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final void t() throws RemoteException {
        throw null;
    }

    @Override // defpackage.ovz
    public final boolean u() throws RemoteException {
        throw null;
    }
}
