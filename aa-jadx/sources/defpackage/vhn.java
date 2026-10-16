package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vhn extends defpackage.ijv implements defpackage.vhp {
    public vhn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapLongClickListener");
    }

    @Override // defpackage.vhp
    public final void e(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, latLng);
        fr(1, parcelFp);
    }
}
