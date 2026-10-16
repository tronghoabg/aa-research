package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vhe extends defpackage.ijv implements defpackage.vhg {
    public vhe(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMapCapabilitiesChangedListener");
    }

    @Override // defpackage.vhg
    public final void e(com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate iMapCapabilitiesDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMapCapabilitiesDelegate);
        fr(1, parcelFp);
    }
}
