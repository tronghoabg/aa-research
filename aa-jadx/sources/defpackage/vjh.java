package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjh extends defpackage.ijv implements defpackage.vjj {
    public vjh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IProjectionDelegate");
    }

    @Override // defpackage.vjj
    public final defpackage.srh e(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException {
        defpackage.srh srfVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, latLng);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            srfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
        }
        parcelFq.recycle();
        return srfVar;
    }

    @Override // defpackage.vjj
    public final com.google.android.libraries.maps.model.LatLng f(defpackage.srh srhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, srhVar);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        com.google.android.libraries.maps.model.LatLng latLng = (com.google.android.libraries.maps.model.LatLng) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.LatLng.CREATOR);
        parcelFq.recycle();
        return latLng;
    }

    @Override // defpackage.vjj
    public final com.google.android.libraries.maps.model.VisibleRegion g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(3, fp());
        com.google.android.libraries.maps.model.VisibleRegion visibleRegion = (com.google.android.libraries.maps.model.VisibleRegion) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.VisibleRegion.CREATOR);
        parcelFq.recycle();
        return visibleRegion;
    }
}
