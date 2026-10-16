package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qxx extends defpackage.ijv implements qxz {
    public qxx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMessageCallback");
    }

    public final void e(int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(0);
        parcelFp.writeInt(i3);
        fs(1, parcelFp);
    }

    public final void f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(2, parcelFp);
    }
}
