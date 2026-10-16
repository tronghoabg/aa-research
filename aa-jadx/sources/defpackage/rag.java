package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rag extends defpackage.ijv implements defpackage.rai {
    public rag(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IDrivingStatusCallback");
    }

    @Override // defpackage.rai
    public final void a(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }

    @Override // defpackage.rai
    public final void b(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fs(4, parcelFp);
    }

    @Override // defpackage.rai
    public final void c(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fs(3, parcelFp);
    }
}
