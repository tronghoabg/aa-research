package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rpz extends defpackage.ijv implements defpackage.rqb {
    public rpz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
    }

    @Override // defpackage.rqb
    public final void e(java.lang.String str, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        defpackage.ijx.g(parcelFp, carDisplayId);
        fs(2, parcelFp);
    }
}
