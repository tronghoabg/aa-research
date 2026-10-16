package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class owu extends defpackage.ijv implements defpackage.oww {
    public owu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IStatusBarController");
    }

    @Override // defpackage.oww
    public final void e() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void f() throws android.os.RemoteException {
        fr(8, fp());
    }

    @Override // defpackage.oww
    public final void g() throws android.os.RemoteException {
        fr(10, fp());
    }

    @Override // defpackage.oww
    public final void h() throws android.os.RemoteException {
        fr(6, fp());
    }

    @Override // defpackage.oww
    public final void i() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void j() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void k(float f) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void l(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void m(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(2);
        fr(20, parcelFp);
    }

    @Override // defpackage.oww
    public final void n(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void o(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(21, parcelFp);
    }

    @Override // defpackage.oww
    public final void p(boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(z2 ? 1 : 0);
        fr(19, parcelFp);
    }

    @Override // defpackage.oww
    public final void q(java.lang.CharSequence charSequence) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void r() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void s() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final void t() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.oww
    public final boolean u() throws android.os.RemoteException {
        throw null;
    }
}
