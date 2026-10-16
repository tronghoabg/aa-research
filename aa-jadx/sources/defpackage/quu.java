package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class quu extends defpackage.ijv implements defpackage.quw {
    public quu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorServiceReadyCallback");
    }

    @Override // defpackage.quw
    public final void a(defpackage.quq quqVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, quqVar);
        fs(1, parcelFp);
    }
}
