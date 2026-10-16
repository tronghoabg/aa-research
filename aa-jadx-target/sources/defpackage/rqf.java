package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqf extends defpackage.ijv implements defpackage.rqh {
    public rqf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
    }

    @Override // defpackage.rqh
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(2, parcelFp);
    }
}
