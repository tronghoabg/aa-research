package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qys extends defpackage.ijv implements defpackage.qyu {
    public qys(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjectionCallback");
    }

    @Override // defpackage.qyu
    public final void A() throws android.os.RemoteException {
        fr(17, fp());
    }

    @Override // defpackage.qyu
    public final void e(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(12, parcelFp);
    }

    @Override // defpackage.qyu
    public final void f() throws android.os.RemoteException {
        fr(31, fp());
    }

    @Override // defpackage.qyu
    public final void g() throws android.os.RemoteException {
        fr(10, fp());
    }

    @Override // defpackage.qyu
    public final void h(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(33, parcelFp);
    }

    @Override // defpackage.qyu
    public final void i() throws android.os.RemoteException {
        fr(15, fp());
    }

    @Override // defpackage.qyu
    public final void j(com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, keyEventCompleteData);
        fr(34, parcelFp);
    }

    @Override // defpackage.qyu
    public final void k(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(9, parcelFp);
    }

    @Override // defpackage.qyu
    public final void l(com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, touchEventCompleteData);
        fr(32, parcelFp);
    }

    @Override // defpackage.qyu
    public final void m() throws android.os.RemoteException {
        fr(2, fp());
    }

    @Override // defpackage.qyu
    public final void n() throws android.os.RemoteException {
        fr(7, fp());
    }

    @Override // defpackage.qyu
    public final void o() throws android.os.RemoteException {
        fr(5, fp());
    }

    @Override // defpackage.qyu
    public final void p(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(11);
        fr(23, parcelFp);
    }

    @Override // defpackage.qyu
    public final void q() throws android.os.RemoteException {
        fr(1, fp());
    }

    @Override // defpackage.qyu
    public final void r() throws android.os.RemoteException {
        fr(3, fp());
    }

    @Override // defpackage.qyu
    public final void s(android.view.Surface surface) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, surface);
        fr(30, parcelFp);
    }

    @Override // defpackage.qyu
    public final void t() throws android.os.RemoteException {
        fr(6, fp());
    }

    @Override // defpackage.qyu
    public final void u() throws android.os.RemoteException {
        fr(27, fp());
    }

    @Override // defpackage.qyu
    public final void v() throws android.os.RemoteException {
        fr(20, fp());
    }

    @Override // defpackage.qyu
    public final void w() throws android.os.RemoteException {
        fr(13, fp());
    }

    @Override // defpackage.qyu
    public final void x(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        fr(21, parcelFp);
    }

    @Override // defpackage.qyu
    public final void y(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(35, parcelFp);
    }

    @Override // defpackage.qyu
    public final void z(defpackage.rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rnhVar);
        defpackage.ijx.g(parcelFp, editorInfo);
        fr(16, parcelFp);
    }
}
