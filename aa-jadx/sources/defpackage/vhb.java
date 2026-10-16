package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vhb extends defpackage.ijv implements defpackage.vhd {
    public vhb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnLocationChangeListener");
    }

    @Override // defpackage.vhd
    public final void e(defpackage.srh srhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, srhVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.vhd
    public final void f(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, location);
        fr(2, parcelFp);
    }
}
