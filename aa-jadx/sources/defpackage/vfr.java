package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfr extends defpackage.ijv implements defpackage.vft {
    public vfr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IMapsAppCheckTokenProvider");
    }

    @Override // defpackage.vft
    public final void e(defpackage.vfq vfqVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, vfqVar);
        fr(2, parcelFp);
    }
}
