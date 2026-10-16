package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class vdw implements com.google.android.libraries.maps.LocationSource.OnLocationChangedListener {
    final /* synthetic */ defpackage.vhd a;

    public vdw(defpackage.vhd vhdVar) {
        this.a = vhdVar;
    }

    @Override // com.google.android.libraries.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(android.location.Location location) {
        try {
            this.a.f(location);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
