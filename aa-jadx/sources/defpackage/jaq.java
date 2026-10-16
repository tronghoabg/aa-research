package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jaq extends defpackage.ijv implements defpackage.jas {
    public jaq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.carservice.car.senderprotocol.ICarGalMonitorProxy");
    }

    @Override // defpackage.jas
    public final void e(long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        fr(1, parcelFp);
    }
}
