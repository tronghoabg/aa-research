package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vht extends defpackage.ijv implements defpackage.vhv {
    public vht(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMarkerClickListener");
    }

    @Override // defpackage.vhv
    public final boolean e(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
