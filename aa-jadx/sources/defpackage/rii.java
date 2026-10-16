package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rii extends defpackage.ijv implements defpackage.rik {
    public rii(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.carlocalmedia.ICarLocalMedia");
    }

    @Override // defpackage.rik
    public final void f(defpackage.rin rinVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rinVar);
        fr(2, parcelFp);
    }

    @Override // defpackage.rik
    public final void g(com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carLocalMediaPlaybackRequest);
        fr(3, parcelFp);
    }

    @Override // defpackage.rik
    public final void h(defpackage.rin rinVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rinVar);
        fr(4, parcelFp);
    }
}
