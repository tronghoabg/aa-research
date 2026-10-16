package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwh extends defpackage.ijv implements defpackage.qwj {
    public qwh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
    }

    @Override // defpackage.qwj
    public final void e(byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeByteArray(bArr);
        fs(2, parcelFp);
    }
}
