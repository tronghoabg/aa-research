package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vio extends defpackage.ijv implements defpackage.viq {
    public vio(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnPolylineClickListener");
    }

    @Override // defpackage.viq
    public final void e(com.google.android.libraries.maps.model.internal.IPolylineDelegate iPolylineDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iPolylineDelegate);
        fr(1, parcelFp);
    }
}
