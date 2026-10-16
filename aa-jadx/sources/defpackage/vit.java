package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vit extends defpackage.ijw implements defpackage.viu {
    final /* synthetic */ com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vit(com.google.android.libraries.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        this.a = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // defpackage.viu
    public final void e(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.a.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.libraries.maps.model.StreetViewPanoramaCamera) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.StreetViewPanoramaCamera.CREATOR);
        defpackage.ijx.d(parcel);
        e(streetViewPanoramaCamera);
        parcel2.writeNoException();
        return true;
    }
}
