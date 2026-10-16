package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vic extends defpackage.ijv implements defpackage.vie {
    public vic(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMyLocationChangeListener");
    }

    @Override // defpackage.vie
    public final void e(defpackage.srh srhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, srhVar);
        fr(1, parcelFp);
    }
}
