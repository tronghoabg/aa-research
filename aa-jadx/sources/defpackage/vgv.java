package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vgv extends defpackage.ijv implements defpackage.vgx {
    public vgv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnInfoWindowCloseListener");
    }

    @Override // defpackage.vgx
    public final void e(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        fr(1, parcelFp);
    }
}
