package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vjn extends defpackage.ijv implements defpackage.vjp {
    public vjn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // defpackage.vjp
    public final defpackage.srh e(com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws android.os.RemoteException {
        defpackage.srh srfVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, streetViewPanoramaOrientation);
        android.os.Parcel parcelFq = fq(19, parcelFp);
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

    @Override // defpackage.vjp
    public final com.google.android.libraries.maps.model.StreetViewPanoramaCamera f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(10, fp());
        com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.libraries.maps.model.StreetViewPanoramaCamera) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.StreetViewPanoramaCamera.CREATOR);
        parcelFq.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // defpackage.vjp
    public final com.google.android.libraries.maps.model.StreetViewPanoramaLocation g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(14, fp());
        com.google.android.libraries.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.libraries.maps.model.StreetViewPanoramaLocation) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.StreetViewPanoramaLocation.CREATOR);
        parcelFq.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // defpackage.vjp
    public final com.google.android.libraries.maps.model.StreetViewPanoramaOrientation h(defpackage.srh srhVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, srhVar);
        android.os.Parcel parcelFq = fq(18, parcelFp);
        com.google.android.libraries.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.libraries.maps.model.StreetViewPanoramaOrientation) defpackage.ijx.a(parcelFq, com.google.android.libraries.maps.model.StreetViewPanoramaOrientation.CREATOR);
        parcelFq.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // defpackage.vjp
    public final void i(com.google.android.libraries.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, streetViewPanoramaCamera);
        parcelFp.writeLong(j);
        fr(9, parcelFp);
    }

    @Override // defpackage.vjp
    public final void j(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(2, parcelFp);
    }

    @Override // defpackage.vjp
    public final void k(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(4, parcelFp);
    }

    @Override // defpackage.vjp
    public final void l(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(3, parcelFp);
    }

    @Override // defpackage.vjp
    public final void m(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(1, parcelFp);
    }

    @Override // defpackage.vjp
    public final void n(defpackage.viu viuVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, viuVar);
        fr(16, parcelFp);
    }

    @Override // defpackage.vjp
    public final void o(defpackage.vix vixVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, vixVar);
        fr(15, parcelFp);
    }

    @Override // defpackage.vjp
    public final void p(defpackage.vja vjaVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, vjaVar);
        fr(17, parcelFp);
    }

    @Override // defpackage.vjp
    public final void q(defpackage.vjd vjdVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, vjdVar);
        fr(20, parcelFp);
    }

    @Override // defpackage.vjp
    public final void r(com.google.android.libraries.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, latLng);
        fr(12, parcelFp);
    }

    @Override // defpackage.vjp
    public final void s(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        fr(11, parcelFp);
    }

    @Override // defpackage.vjp
    public final void t(com.google.android.libraries.maps.model.LatLng latLng, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, latLng);
        parcelFp.writeInt(i);
        fr(13, parcelFp);
    }

    @Override // defpackage.vjp
    public final void u(com.google.android.libraries.maps.model.LatLng latLng, int i, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, latLng);
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, streetViewSource);
        fr(22, parcelFp);
    }

    @Override // defpackage.vjp
    public final void v(com.google.android.libraries.maps.model.LatLng latLng, com.google.android.libraries.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, latLng);
        defpackage.ijx.g(parcelFp, streetViewSource);
        fr(21, parcelFp);
    }

    @Override // defpackage.vjp
    public final boolean w() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(6, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.vjp
    public final boolean x() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(8, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.vjp
    public final boolean y() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(7, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.vjp
    public final boolean z() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(5, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
