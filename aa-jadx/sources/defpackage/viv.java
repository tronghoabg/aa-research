package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class viv extends defpackage.ijv implements defpackage.vix {
    public viv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    @Override // defpackage.vix
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, streetViewPanoramaLocation);
        fr(1, parcelFp);
    }
}
