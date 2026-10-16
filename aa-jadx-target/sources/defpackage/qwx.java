package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qwx extends defpackage.ijv implements qwz {
    public qwx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallback");
    }

    public final void e(com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bitmapTeleporter);
        fs(2, parcelFp);
    }
}
