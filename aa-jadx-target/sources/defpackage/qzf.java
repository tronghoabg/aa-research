package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qzf extends defpackage.ijw implements defpackage.qzg {
    public qzf() {
        super("com.google.android.gms.car.ICarSensorEventListener");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.car.CarSensorEvent carSensorEvent = (com.google.android.gms.car.CarSensorEvent) defpackage.ijx.a(parcel, com.google.android.gms.car.CarSensorEvent.CREATOR);
        defpackage.ijx.d(parcel);
        b(carSensorEvent);
        return true;
    }
}
