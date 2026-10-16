package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzt extends defpackage.ijv implements defpackage.qzv {
    public qzt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarWindow");
    }

    @Override // defpackage.qzv
    public final void e(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(10, parcelFp);
    }

    @Override // defpackage.qzv
    public final void f(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, projectionWindowAnimationParams);
        fr(12, parcelFp);
    }

    @Override // defpackage.qzv
    public final void g(com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, keyEventCompleteData);
        fr(13, parcelFp);
    }

    @Override // defpackage.qzv
    public final void h(com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, touchEventCompleteData);
        fr(6, parcelFp);
    }

    @Override // defpackage.qzv
    public final void i() throws android.os.RemoteException {
        fr(5, fp());
    }

    @Override // defpackage.qzv
    public final void j() throws android.os.RemoteException {
        fr(1, fp());
    }

    @Override // defpackage.qzv
    public final void k() throws android.os.RemoteException {
        fr(4, fp());
    }

    @Override // defpackage.qzv
    public final void l(int i, boolean z, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(1);
        defpackage.ijx.g(parcelFp, projectionWindowAnimationParams);
        fr(16, parcelFp);
    }

    @Override // defpackage.qzv
    public final void m(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeTypedList(list);
        fr(20, parcelFp);
    }

    @Override // defpackage.qzv
    public final void n() throws android.os.RemoteException {
        fr(8, fp());
    }

    @Override // defpackage.qzv
    public final void o(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(19, parcelFp);
    }

    @Override // defpackage.qzv
    public final void p(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(17, parcelFp);
    }

    @Override // defpackage.qzv
    public final void q() throws android.os.RemoteException {
        fr(18, fp());
    }

    @Override // defpackage.qzv
    public final void r(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(11, parcelFp);
    }

    @Override // defpackage.qzv
    public final void s(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, projectionWindowAnimationParams);
        fr(14, parcelFp);
    }

    @Override // defpackage.qzv
    public final void t(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(15, parcelFp);
    }

    @Override // defpackage.qzv
    public final void u(android.graphics.Rect rect) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, rect);
        fr(9, parcelFp);
    }
}
