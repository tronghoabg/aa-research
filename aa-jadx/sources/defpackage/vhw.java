package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vhw extends defpackage.ijv implements defpackage.vhy {
    public vhw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMarkerDragListener");
    }

    @Override // defpackage.vhy
    public final void e(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        fr(2, parcelFp);
    }

    @Override // defpackage.vhy
    public final void f(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        fr(3, parcelFp);
    }

    @Override // defpackage.vhy
    public final void g(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        fr(1, parcelFp);
    }
}
