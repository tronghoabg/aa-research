package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyp extends defpackage.ijv implements defpackage.qyr {
    public qyp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjection");
    }

    @Override // defpackage.qyr
    public final void A() throws android.os.RemoteException {
        fs(14, fp());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qyr
    public final void B(defpackage.qyu qyuVar, defpackage.qvl qvlVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qyuVar);
        parcelFp.writeStrongBinder(qvlVar);
        fs(1, parcelFp);
    }

    @Override // defpackage.qyr
    public final void e() throws android.os.RemoteException {
        fs(25, fp());
    }

    @Override // defpackage.qyr
    public final void f() throws android.os.RemoteException {
        fs(11, fp());
    }

    @Override // defpackage.qyr
    public final void g(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(15, parcelFp);
    }

    @Override // defpackage.qyr
    public final void h(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, inputFocusChangedEvent);
        fs(20, parcelFp);
    }

    @Override // defpackage.qyr
    public final void i(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fs(10, parcelFp);
    }

    @Override // defpackage.qyr
    public final void j(boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(z2 ? 1 : 0);
        fs(18, parcelFp);
    }

    @Override // defpackage.qyr
    public final void k(int i, android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, keyEvent);
        fs(8, parcelFp);
    }

    @Override // defpackage.qyr
    public final void l(int i, android.view.MotionEvent motionEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, motionEvent);
        fs(7, parcelFp);
    }

    @Override // defpackage.qyr
    public final void m(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        fs(3, parcelFp);
    }

    @Override // defpackage.qyr
    public final void n(android.graphics.Rect rect) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, rect);
        fs(28, parcelFp);
    }

    @Override // defpackage.qyr
    public final void o(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(16, parcelFp);
    }

    @Override // defpackage.qyr
    public final void p(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(5, parcelFp);
    }

    @Override // defpackage.qyr
    public final void q(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(4, parcelFp);
    }

    @Override // defpackage.qyr
    public final void r(int i, int i2, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.Intent intent, android.content.res.Configuration configuration, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        defpackage.ijx.g(parcelFp, drawingSpec);
        defpackage.ijx.g(parcelFp, intent);
        defpackage.ijx.g(parcelFp, configuration);
        defpackage.ijx.g(parcelFp, bundle);
        fs(26, parcelFp);
    }

    @Override // defpackage.qyr
    public final void s(int i, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.Intent intent, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, drawingSpec);
        defpackage.ijx.g(parcelFp, intent);
        defpackage.ijx.g(parcelFp, bundle);
        fs(2, parcelFp);
    }

    @Override // defpackage.qyr
    public final void t(int i, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.Intent intent, android.content.res.Configuration configuration, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, drawingSpec);
        defpackage.ijx.g(parcelFp, intent);
        defpackage.ijx.g(parcelFp, configuration);
        defpackage.ijx.g(parcelFp, bundle);
        fs(23, parcelFp);
    }

    @Override // defpackage.qyr
    public final void u(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(9, parcelFp);
    }

    @Override // defpackage.qyr
    public final void v() throws android.os.RemoteException {
        fs(12, fp());
    }

    @Override // defpackage.qyr
    public final void w(android.graphics.Rect rect) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, rect);
        fs(22, parcelFp);
    }

    @Override // defpackage.qyr
    public final void x(int i, int i2, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.res.Configuration configuration) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        defpackage.ijx.g(parcelFp, drawingSpec);
        defpackage.ijx.g(parcelFp, configuration);
        fs(6, parcelFp);
    }

    @Override // defpackage.qyr
    public final void y(com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carWindowManagerLayoutParams);
        fs(21, parcelFp);
    }

    @Override // defpackage.qyr
    public final void z(com.google.android.gms.car.DrawingSpec drawingSpec) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, drawingSpec);
        fs(17, parcelFp);
    }
}
