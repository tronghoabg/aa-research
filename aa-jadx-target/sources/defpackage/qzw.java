package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzw extends defpackage.ijv implements defpackage.qzy {
    public qzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarWindowCallback");
    }

    @Override // defpackage.qzy
    public final void e() throws android.os.RemoteException {
        fs(7, fp());
    }

    @Override // defpackage.qzy
    public final void f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(6, parcelFp);
    }

    @Override // defpackage.qzy
    public final void g(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, inputFocusChangedEvent);
        fs(8, parcelFp);
    }

    @Override // defpackage.qzy
    public final void h(boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(z2 ? 1 : 0);
        fs(3, parcelFp);
    }

    @Override // defpackage.qzy
    public final void i(android.graphics.Rect rect) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, rect);
        fs(12, parcelFp);
    }

    @Override // defpackage.qzy
    public final void j(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, keyEvent);
        fs(5, parcelFp);
    }

    @Override // defpackage.qzy
    public final void k(android.view.MotionEvent motionEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, motionEvent);
        fs(4, parcelFp);
    }

    @Override // defpackage.qzy
    public final void l(android.content.res.Configuration configuration, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, configuration);
        parcelFp.writeInt(i);
        fs(11, parcelFp);
    }

    @Override // defpackage.qzy
    public final void m(com.google.android.gms.car.DrawingSpec drawingSpec, android.content.res.Configuration configuration) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, drawingSpec);
        defpackage.ijx.g(parcelFp, configuration);
        fs(10, parcelFp);
    }

    @Override // defpackage.qzy
    public final void n(com.google.android.gms.car.DrawingSpec drawingSpec) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, drawingSpec);
        fs(1, parcelFp);
    }

    @Override // defpackage.qzy
    public final void o(com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carWindowManagerLayoutParams);
        fs(9, parcelFp);
    }

    @Override // defpackage.qzy
    public final void p() throws android.os.RemoteException {
        fs(2, fp());
    }
}
