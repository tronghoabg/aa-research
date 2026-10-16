package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rqc extends defpackage.ijv implements defpackage.rqe {
    public rqc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.lifetime.IProjectionLifetime");
    }

    @Override // defpackage.rqe
    public final void e(defpackage.rqh rqhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rqhVar);
        fr(2, parcelFp);
    }

    @Override // defpackage.rqe
    public final void f(defpackage.rqh rqhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rqhVar);
        fr(3, parcelFp);
    }
}
