package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rac extends defpackage.ijv implements defpackage.rae {
    public rac(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IConnectionController");
    }

    @Override // defpackage.rae
    public final void e() throws android.os.RemoteException {
        fr(2, fp());
    }

    @Override // defpackage.rae
    public final void f(defpackage.ral ralVar, int i, boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, ralVar);
        defpackage.ijx.i(parcelFp, null);
        parcelFp.writeInt(3);
        parcelFp.writeInt(1);
        parcelFp.writeInt(0);
        fr(11, parcelFp);
    }
}
