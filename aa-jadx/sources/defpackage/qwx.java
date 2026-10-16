package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwx extends defpackage.ijv implements defpackage.qwz {
    public qwx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallback");
    }

    @Override // defpackage.qwz
    public final void e(com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bitmapTeleporter);
        fs(2, parcelFp);
    }
}
