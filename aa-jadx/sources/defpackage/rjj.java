package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rjj extends defpackage.ijv implements defpackage.rjl {
    public rjj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarControlGroupUpdateListener");
    }

    @Override // defpackage.rjl
    public final void e(com.google.android.gms.car.control.CarControlGroup carControlGroup) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carControlGroup);
        fs(1, parcelFp);
    }
}
