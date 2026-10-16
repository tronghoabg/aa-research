package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rmw extends defpackage.ijv implements defpackage.rmy {
    public rmw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarEditableListener");
    }

    @Override // defpackage.rmy
    public final void e(int i, int i2, int i3, int i4) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeInt(i3);
        parcelFp.writeInt(i4);
        fr(1, parcelFp);
    }
}
