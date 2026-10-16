package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class viw extends defpackage.ijw implements defpackage.vix {
    final /* synthetic */ com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viw(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaChangeListener");
        this.a = onStreetViewPanoramaChangeListener;
    }

    @Override // defpackage.vix
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.a.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.libraries.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.libraries.maps.model.StreetViewPanoramaLocation) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.StreetViewPanoramaLocation.CREATOR);
        defpackage.ijx.d(parcel);
        e(streetViewPanoramaLocation);
        parcel2.writeNoException();
        return true;
    }
}
