package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzh extends defpackage.ijv implements defpackage.qzj {
    public qzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarUiInfoChangedListener");
    }

    @Override // defpackage.qzj
    public final void e(com.google.android.gms.car.CarUiInfo carUiInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carUiInfo);
        fs(1, parcelFp);
    }
}
