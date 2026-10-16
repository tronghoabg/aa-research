package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rku extends defpackage.ijv implements defpackage.rkw {
    public rku(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayActionsController");
    }

    @Override // defpackage.rkw
    public final void e(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        fs(3, parcelFp);
    }

    @Override // defpackage.rkw
    public final void f(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        fs(2, parcelFp);
    }
}
