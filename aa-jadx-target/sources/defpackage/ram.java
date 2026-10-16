package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ram extends defpackage.ijv implements defpackage.rao {
    public ram(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IProjectionLifecycle");
    }

    @Override // defpackage.rao
    public final void e(android.os.Bundle bundle, defpackage.rar rarVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        defpackage.ijx.i(parcelFp, rarVar);
        fs(3, parcelFp);
    }

    @Override // defpackage.rao
    public final void f() throws android.os.RemoteException {
        fs(2, fp());
    }

    @Override // defpackage.rao
    public final void g(defpackage.rar rarVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rarVar);
        fs(4, parcelFp);
    }

    @Override // defpackage.rao
    public final void h(defpackage.rar rarVar, defpackage.qvl qvlVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rarVar);
        defpackage.ijx.i(parcelFp, qvlVar);
        fs(1, parcelFp);
    }

    @Override // defpackage.rao
    public final void i(defpackage.rar rarVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rarVar);
        fs(5, parcelFp);
    }
}
