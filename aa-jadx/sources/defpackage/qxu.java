package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qxu extends defpackage.ijv implements defpackage.qxw {
    public qxu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMessage");
    }

    @Override // defpackage.qxw
    public final void c(defpackage.qxz qxzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxzVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.qxw
    public final void d(defpackage.qxz qxzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxzVar);
        fr(7, parcelFp);
    }

    @Override // defpackage.qxw
    public final void f(defpackage.qxz qxzVar, int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qxw
    public final void i(defpackage.qxz qxzVar, int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxzVar);
        parcelFp.writeInt(i);
        parcelFp.writeInt(0);
        parcelFp.writeInt(i3);
        fr(4, parcelFp);
    }

    @Override // defpackage.qxw
    public final void j(defpackage.qxz qxzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxzVar);
        fr(2, parcelFp);
    }

    @Override // defpackage.qxw
    public final boolean k(defpackage.qxz qxzVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxzVar);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qxw
    public final int[] l(defpackage.qxz qxzVar, int i, int i2) throws android.os.RemoteException {
        throw null;
    }
}
