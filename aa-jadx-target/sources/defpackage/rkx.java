package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rkx extends defpackage.ijv implements defpackage.rkz {
    public rkx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
    }

    @Override // defpackage.rkz
    public final void e(com.google.android.gms.car.display.CarDisplay carDisplay) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplay);
        fr(1, parcelFp);
    }
}
