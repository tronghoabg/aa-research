package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class viz extends defpackage.ijw implements defpackage.vja {
    final /* synthetic */ com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viz(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaClickListener");
        this.a = onStreetViewPanoramaClickListener;
    }

    @Override // defpackage.vja
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.a.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
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
