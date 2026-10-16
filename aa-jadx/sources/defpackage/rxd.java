package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxd extends defpackage.ijv implements defpackage.rxf {
    public rxd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.ICarServiceCallback");
    }

    @Override // defpackage.rxf
    public final void e(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(0);
        fr(3, parcelFp);
    }

    @Override // defpackage.rxf
    public final void f(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(2, parcelFp);
    }
}
