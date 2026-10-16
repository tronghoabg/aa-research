package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qxr extends defpackage.ijv implements defpackage.qxt {
    public qxr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
    }

    @Override // defpackage.qxt
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }
}
