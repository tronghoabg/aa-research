package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rjm extends defpackage.ijv implements defpackage.rjo {
    public rjm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarPropertySetResultCallback");
    }

    @Override // defpackage.rjo
    public final void e(com.google.android.gms.car.control.CarProperty carProperty, com.google.android.gms.car.control.CarPropertySetError carPropertySetError) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carProperty);
        defpackage.ijx.g(parcelFp, carPropertySetError);
        fr(3, parcelFp);
    }

    @Override // defpackage.rjo
    public final void f(com.google.android.gms.car.control.CarProperty carProperty) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carProperty);
        fr(2, parcelFp);
    }
}
