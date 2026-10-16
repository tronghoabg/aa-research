package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ril extends defpackage.ijv implements defpackage.rin {
    public ril(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.carlocalmedia.ICarLocalMediaCallback");
    }

    @Override // defpackage.rin
    public final void e(com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata carLocalMediaPlaybackMetadata) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carLocalMediaPlaybackMetadata);
        fs(2, parcelFp);
    }

    @Override // defpackage.rin
    public final void f(com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus carLocalMediaPlaybackStatus) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carLocalMediaPlaybackStatus);
        fs(1, parcelFp);
    }
}
