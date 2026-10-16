package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qyg extends defpackage.ijv implements defpackage.qyi {
    public qyg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarNavigationStatusEventListener");
    }

    @Override // defpackage.qyi
    public final void e(int i, int i2, int i3, int i4, int i5) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(i3);
        parcelFp.writeInt(i4);
        parcelFp.writeInt(i5);
        fs(1, parcelFp);
    }

    @Override // defpackage.qyi
    public final void f() throws android.os.RemoteException {
        fs(2, fp());
    }
}
