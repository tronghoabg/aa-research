package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxj extends defpackage.ijv implements defpackage.rxl {
    public rxj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
    }

    @Override // defpackage.rxl
    public final void a(int i, byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeByteArray(bArr);
        fr(1, parcelFp);
    }

    @Override // defpackage.rxl
    public final void b() throws android.os.RemoteException {
        fr(2, fp());
    }

    @Override // defpackage.rxl
    public final void c() throws android.os.RemoteException {
        fr(3, fp());
    }
}
