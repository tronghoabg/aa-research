package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vgs extends defpackage.ijv implements defpackage.vgu {
    public vgs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // defpackage.vgu
    public final void e(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        fr(1, parcelFp);
    }
}
