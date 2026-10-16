package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qxa extends defpackage.ijv implements defpackage.qxc {
    public qxa(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarConnectionListener");
    }

    @Override // defpackage.qxc
    public final void a(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(3, parcelFp);
    }

    @Override // defpackage.qxc
    public final void b(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }

    @Override // defpackage.qxc
    public final void c() throws android.os.RemoteException {
        fs(2, fp());
    }
}
