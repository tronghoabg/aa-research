package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ras extends defpackage.ijv implements defpackage.rau {
    public ras(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IProjectionWindowDragCallback");
    }

    @Override // defpackage.rau
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }

    @Override // defpackage.rau
    public final void f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(3, parcelFp);
    }

    @Override // defpackage.rau
    public final void g() throws android.os.RemoteException {
        fs(2, fp());
    }
}
