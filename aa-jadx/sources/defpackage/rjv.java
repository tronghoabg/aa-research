package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rjv extends defpackage.ijv implements defpackage.rjx {
    public rjv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.diagnostics.ICarDiagnostics");
    }

    @Override // defpackage.rjx
    public final java.util.List a() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.gms.car.diagnostics.ConnectionState.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.rjx
    public final void b(defpackage.rka rkaVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rkaVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.rjx
    public final void c(defpackage.rka rkaVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rkaVar);
        fr(2, parcelFp);
    }
}
