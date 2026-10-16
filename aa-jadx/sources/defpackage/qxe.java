package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxe extends defpackage.ijv implements android.os.IInterface {
    public qxe(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGalListener");
    }

    public final void e(long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        fs(5, parcelFp);
    }

    public final void f(long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        fs(6, parcelFp);
    }

    public final void g(long j, int i, int i2, int i3, int i4) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(i3);
        parcelFp.writeInt(i4);
        fs(4, parcelFp);
    }

    public final void h(long j, int i, int i2, int i3, int i4) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(i3);
        parcelFp.writeInt(i4);
        fs(3, parcelFp);
    }

    public final void i(com.google.android.gms.car.CarGalMessage carGalMessage) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carGalMessage);
        fs(2, parcelFp);
    }

    public final void j(com.google.android.gms.car.CarGalMessage carGalMessage) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carGalMessage);
        fs(1, parcelFp);
    }
}
