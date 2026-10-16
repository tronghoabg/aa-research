package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vje extends defpackage.ijv implements defpackage.vjg {
    public vje(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // defpackage.vjg
    public final void a(defpackage.vjp vjpVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, vjpVar);
        fr(1, parcelFp);
    }
}
