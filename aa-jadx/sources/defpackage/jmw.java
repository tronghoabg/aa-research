package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jmw extends defpackage.ijv implements android.os.IInterface {
    public jmw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.carservice.frx.phonescreen.ICarServiceCallbacks");
    }

    public final void e(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carInfoInternal);
        parcelFp.writeInt(z ? 1 : 0);
        fr(2, parcelFp);
    }
}
