package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class scw extends defpackage.ijv implements defpackage.scy {
    public scw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IServiceHandshake");
    }

    @Override // defpackage.scy
    public final void a(defpackage.sdb sdbVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, sdbVar);
        fr(1, parcelFp);
    }
}
