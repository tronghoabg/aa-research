package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qxx extends defpackage.ijv implements defpackage.qxz {
    public qxx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMessageCallback");
    }

    @Override // defpackage.qxz
    public final void e(int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(0);
        parcelFp.writeInt(i3);
        fs(1, parcelFp);
    }

    @Override // defpackage.qxz
    public final void f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(2, parcelFp);
    }
}
