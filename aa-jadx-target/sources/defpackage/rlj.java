package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rlj extends defpackage.ijv implements rll {
    public rlj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
    }

    public final void e(com.google.android.gms.car.display.CarDisplayId carDisplayId, com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        defpackage.ijx.g(parcelFp, carDisplayUiFeatures);
        fr(2, parcelFp);
    }
}
