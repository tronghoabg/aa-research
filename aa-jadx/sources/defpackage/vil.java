package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vil extends defpackage.ijv implements defpackage.vin {
    public vil(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnPolygonClickListener");
    }

    @Override // defpackage.vin
    public final void e(com.google.android.libraries.maps.model.internal.IPolygonDelegate iPolygonDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iPolygonDelegate);
        fr(1, parcelFp);
    }
}
