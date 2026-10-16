package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwl extends defpackage.ijv implements defpackage.qwn {
    public qwl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarBluetooth");
    }

    @Override // defpackage.qwn
    public final int c() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qwn
    public final java.lang.String g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(8, fp());
        java.lang.String string = parcelFq.readString();
        parcelFq.recycle();
        return string;
    }

    @Override // defpackage.qwn
    public final java.lang.String h() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(11, fp());
        java.lang.String string = parcelFq.readString();
        parcelFq.recycle();
        return string;
    }

    @Override // defpackage.qwn
    public final java.lang.String i() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(12, fp());
        java.lang.String string = parcelFq.readString();
        parcelFq.recycle();
        return string;
    }

    @Override // defpackage.qwn
    public final void n() throws android.os.RemoteException {
        fr(10, fp());
    }

    @Override // defpackage.qwn
    public final boolean q() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwn
    public final boolean r() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwn
    public final boolean s() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwn
    public final boolean t() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwn
    public final boolean u() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwn
    public final boolean v(defpackage.qwq qwqVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwqVar);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qwn
    public final int[] w() throws android.os.RemoteException {
        throw null;
    }
}
