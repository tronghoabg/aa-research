package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rjp extends defpackage.ijv implements defpackage.rjr {
    public rjp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarPropertyUpdateListener");
    }

    @Override // defpackage.rjr
    public final void e(com.google.android.gms.car.control.CarPropertyState carPropertyState) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carPropertyState);
        fs(1, parcelFp);
    }
}
