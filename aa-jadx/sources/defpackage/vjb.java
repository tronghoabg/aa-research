package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjb extends defpackage.ijv implements defpackage.vjd {
    public vjb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    @Override // defpackage.vjd
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, streetViewPanoramaOrientation);
        fr(1, parcelFp);
    }
}
