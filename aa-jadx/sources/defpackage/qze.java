package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qze extends defpackage.ijv implements defpackage.qzg {
    public qze(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarSensorEventListener");
    }

    @Override // defpackage.qzg
    public final void b(com.google.android.gms.car.CarSensorEvent carSensorEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carSensorEvent);
        fs(1, parcelFp);
    }
}
