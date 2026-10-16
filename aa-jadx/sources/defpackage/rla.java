package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rla extends defpackage.ijv implements defpackage.rlc {
    public rla(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
    }

    @Override // defpackage.rlc
    public final void e(com.google.android.gms.car.display.CarDisplayId carDisplayId, android.graphics.Rect rect) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        defpackage.ijx.g(parcelFp, rect);
        fr(1, parcelFp);
    }
}
