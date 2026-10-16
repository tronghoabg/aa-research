package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwb extends defpackage.ijv implements defpackage.qwd {
    public qwb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudioRecord");
    }

    @Override // defpackage.qwd
    public final android.os.ParcelFileDescriptor a(defpackage.qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        android.os.Parcel parcelFq = fq(4, parcelFp);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcelFq, android.os.ParcelFileDescriptor.CREATOR);
        parcelFq.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qwd
    public final void d(defpackage.qwg qwgVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }

    @Override // defpackage.qwd
    public final void f(defpackage.qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(3, parcelFp);
    }

    @Override // defpackage.qwd
    public final void g(defpackage.qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(5, parcelFp);
    }

    @Override // defpackage.qwd
    public final void h(defpackage.qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.qwd
    public final void i(defpackage.qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(2, parcelFp);
    }

    @Override // defpackage.qwd
    public final boolean k(defpackage.qwg qwgVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
