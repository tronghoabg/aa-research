package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qwb extends defpackage.ijv implements qwd {
    public qwb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudioRecord");
    }

    public final android.os.ParcelFileDescriptor a(qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        android.os.Parcel parcelFq = fq(4, parcelFp);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcelFq, android.os.ParcelFileDescriptor.CREATOR);
        parcelFq.recycle();
        return parcelFileDescriptor;
    }

    public final void d(qwg qwgVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }

    public final void f(qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(3, parcelFp);
    }

    public final void g(qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(5, parcelFp);
    }

    public final void h(qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(1, parcelFp);
    }

    public final void i(qwg qwgVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        fr(2, parcelFp);
    }

    public final boolean k(qwg qwgVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwgVar);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
