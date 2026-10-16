package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vif extends defpackage.ijv implements defpackage.vih {
    public vif(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMyLocationClickListener");
    }

    @Override // defpackage.vih
    public final void e(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, location);
        fr(1, parcelFp);
    }
}
