package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vis extends defpackage.ijv implements defpackage.viu {
    public vis(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
    }

    @Override // defpackage.viu
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, streetViewPanoramaCamera);
        fr(1, parcelFp);
    }
}
