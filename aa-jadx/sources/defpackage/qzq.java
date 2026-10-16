package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qzq extends defpackage.ijv implements defpackage.qzs {
    public qzq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVideoFocusListener");
    }

    @Override // defpackage.qzs
    public final void e(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fs(1, parcelFp);
    }
}
