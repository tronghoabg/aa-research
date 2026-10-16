package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjc extends defpackage.ijw implements defpackage.vjd {
    final /* synthetic */ com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjc(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaLongClickListener");
        this.a = onStreetViewPanoramaLongClickListener;
    }

    @Override // defpackage.vjd
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.a.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.libraries.maps.model.StreetViewPanoramaOrientation) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.CREATOR);
        defpackage.ijx.d(parcel);
        e(streetViewPanoramaOrientation);
        parcel2.writeNoException();
        return true;
    }
}
