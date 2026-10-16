package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzb extends defpackage.ijv implements defpackage.qzd {
    public qzb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarSensor");
    }

    @Override // defpackage.qzd
    public final void fl(int i, defpackage.qzg qzgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        defpackage.ijx.i(parcelFp, qzgVar);
        fr(4, parcelFp);
    }

    @Override // defpackage.qzd
    public final int g() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qzd
    public final com.google.android.gms.car.CarSensorEvent h(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        com.google.android.gms.car.CarSensorEvent carSensorEvent = (com.google.android.gms.car.CarSensorEvent) defpackage.ijx.a(parcelFq, com.google.android.gms.car.CarSensorEvent.CREATOR);
        parcelFq.recycle();
        return carSensorEvent;
    }

    @Override // defpackage.qzd
    public final boolean o(int i, int i2, defpackage.qzg qzgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        defpackage.ijx.i(parcelFp, qzgVar);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        int i3 = parcelFq.readInt();
        parcelFq.recycle();
        return i3 != 0;
    }

    @Override // defpackage.qzd
    public final int[] p() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(7, fp());
        int[] iArrCreateIntArray = parcelFq.createIntArray();
        parcelFq.recycle();
        return iArrCreateIntArray;
    }

    @Override // defpackage.qzd
    public final int[] s() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(6, fp());
        int[] iArrCreateIntArray = parcelFq.createIntArray();
        parcelFq.recycle();
        return iArrCreateIntArray;
    }

    @Override // defpackage.qzd
    public final int[] t() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        int[] iArrCreateIntArray = parcelFq.createIntArray();
        parcelFq.recycle();
        return iArrCreateIntArray;
    }
}
