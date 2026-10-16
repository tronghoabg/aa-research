package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxi extends defpackage.ijv implements defpackage.qxk {
    public qxi(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGestureListener");
    }

    @Override // defpackage.qxk
    public final void e(com.google.android.gms.car.GestureDirection gestureDirection) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, gestureDirection);
        fs(2, parcelFp);
    }
}
