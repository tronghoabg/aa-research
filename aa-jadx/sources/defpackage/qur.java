package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qur extends defpackage.ijv implements defpackage.qut {
    public qur(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorServiceProvider");
    }

    @Override // defpackage.qut
    public final void h(defpackage.quw quwVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, quwVar);
        fs(1, parcelFp);
    }
}
