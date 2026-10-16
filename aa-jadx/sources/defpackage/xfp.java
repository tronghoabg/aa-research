package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfp extends defpackage.ijv implements defpackage.xfr {
    public xfp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.projection.gearhead.sdk.ICarSystemUiCallback");
    }

    @Override // defpackage.xfr
    public final void e(byte b) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeByte(b);
        fs(7, parcelFp);
    }
}
