package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sdf extends defpackage.ijv implements defpackage.sdh {
    public sdf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IZeroPartyChecker");
    }

    @Override // defpackage.sdh
    public final void e(defpackage.sdk sdkVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, sdkVar);
        fs(1, parcelFp);
    }
}
