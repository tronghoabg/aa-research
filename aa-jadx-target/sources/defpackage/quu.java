package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class quu extends defpackage.ijv implements quw {
    public quu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorServiceReadyCallback");
    }

    public final void a(quq quqVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, quqVar);
        fs(1, parcelFp);
    }
}
