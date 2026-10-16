package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qxf extends defpackage.ijv implements defpackage.qxh {
    public qxf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGalMonitor");
    }

    @Override // defpackage.qxh
    public final void b(defpackage.qxe qxeVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxeVar);
        fr(5, parcelFp);
    }

    @Override // defpackage.qxh
    public final void c(defpackage.qxe qxeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxeVar);
        parcelFp.writeInt(i);
        fr(3, parcelFp);
    }

    @Override // defpackage.qxh
    public final void d(defpackage.qxe qxeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxeVar);
        parcelFp.writeInt(i);
        fr(1, parcelFp);
    }

    @Override // defpackage.qxh
    public final void f(defpackage.qxe qxeVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxeVar);
        fr(6, parcelFp);
    }

    @Override // defpackage.qxh
    public final void g(defpackage.qxe qxeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxeVar);
        parcelFp.writeInt(i);
        fr(4, parcelFp);
    }

    @Override // defpackage.qxh
    public final void h(defpackage.qxe qxeVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxeVar);
        parcelFp.writeInt(i);
        fr(2, parcelFp);
    }
}
