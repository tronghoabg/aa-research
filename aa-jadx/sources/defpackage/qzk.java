package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qzk extends defpackage.ijv implements defpackage.qzm {
    public qzk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVendorExtension");
    }

    @Override // defpackage.qzm
    public final android.os.ParcelFileDescriptor a(defpackage.qzp qzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        android.os.Parcel parcelFq = fq(8, parcelFp);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcelFq, android.os.ParcelFileDescriptor.CREATOR);
        parcelFq.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qzm
    public final android.os.ParcelFileDescriptor f(defpackage.qzp qzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        android.os.Parcel parcelFq = fq(5, parcelFp);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcelFq, android.os.ParcelFileDescriptor.CREATOR);
        parcelFq.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qzm
    public final java.lang.String g(defpackage.qzp qzpVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qzm
    public final void j(defpackage.qzp qzpVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        parcelFp.writeInt(i);
        fr(7, parcelFp);
    }

    @Override // defpackage.qzm
    public final void k(defpackage.qzp qzpVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        parcelFp.writeInt(i);
        fr(9, parcelFp);
    }

    @Override // defpackage.qzm
    public final void l(defpackage.qzp qzpVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }

    @Override // defpackage.qzm
    public final void o(defpackage.qzp qzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        fr(2, parcelFp);
    }

    @Override // defpackage.qzm
    public final boolean s(defpackage.qzp qzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzpVar);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qzm
    public final byte[] t(defpackage.qzp qzpVar) throws android.os.RemoteException {
        throw null;
    }
}
