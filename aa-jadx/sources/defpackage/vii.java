package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vii extends defpackage.ijv implements defpackage.vik {
    public vii(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnPoiClickListener");
    }

    @Override // defpackage.vik
    public final void e(com.google.android.libraries.maps.model.PointOfInterest pointOfInterest) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, pointOfInterest);
        fr(1, parcelFp);
    }
}
