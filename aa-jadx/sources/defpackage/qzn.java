package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qzn extends defpackage.ijv implements defpackage.qzp {
    public qzn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVendorExtensionClient");
    }

    @Override // defpackage.qzp
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }
}
