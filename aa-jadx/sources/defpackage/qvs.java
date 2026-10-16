package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qvs extends defpackage.ijv implements defpackage.qvu {
    public qvs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityStartProcessor");
    }

    @Override // defpackage.qvu
    public final void e(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        fs(1, parcelFp);
    }
}
