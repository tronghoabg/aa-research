package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rap extends defpackage.ijv implements defpackage.rar {
    public rap(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IProjectionLifecycleCallback");
    }

    @Override // defpackage.rar
    public final void e(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(1);
        defpackage.ijx.g(parcelFp, bundle);
        fr(2, parcelFp);
    }

    @Override // defpackage.rar
    public final void f(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(1);
        defpackage.ijx.g(parcelFp, bundle);
        fr(1, parcelFp);
    }
}
