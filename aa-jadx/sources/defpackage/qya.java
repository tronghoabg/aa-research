package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qya extends defpackage.ijv implements defpackage.qyc {
    public qya(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
    }

    @Override // defpackage.qyc
    public final void e(byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeByteArray(bArr);
        fs(2, parcelFp);
    }
}
