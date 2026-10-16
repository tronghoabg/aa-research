package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rur extends defpackage.ijv implements defpackage.rut {
    public rur(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
    }

    @Override // defpackage.rut
    public final void e(long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        fr(1, parcelFp);
    }
}
