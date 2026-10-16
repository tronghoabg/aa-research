package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyj extends defpackage.ijv implements defpackage.qyl {
    public qyj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarPhoneStatus");
    }

    @Override // defpackage.qyl
    public final void g(com.google.android.gms.car.CarPhoneStatus carPhoneStatus) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carPhoneStatus);
        fr(6, parcelFp);
    }

    @Override // defpackage.qyl
    public final void h(defpackage.qyo qyoVar, com.google.android.gms.car.CarPhoneStatus carPhoneStatus) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qyl
    public final boolean i() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qyl
    public final boolean j(int i, defpackage.qyo qyoVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(1);
        defpackage.ijx.i(parcelFp, qyoVar);
        android.os.Parcel parcelFq = fq(5, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qyl
    public final boolean k(defpackage.qyo qyoVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qyl
    public final boolean l(defpackage.qyo qyoVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qyoVar);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
