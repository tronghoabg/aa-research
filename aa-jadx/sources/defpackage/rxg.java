package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxg extends defpackage.ijv implements defpackage.rxi {
    public rxg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    @Override // defpackage.rxi
    public final void f(defpackage.rxl rxlVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rxlVar);
        fr(6, parcelFp);
    }

    @Override // defpackage.rxi
    public final boolean fu(int i, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxi
    public final void g(defpackage.rxl rxlVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rxlVar);
        fr(7, parcelFp);
    }

    @Override // defpackage.rxi
    public final boolean h() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxi
    public final byte[] n(int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxi
    public final int[] o() throws android.os.RemoteException {
        throw null;
    }
}
