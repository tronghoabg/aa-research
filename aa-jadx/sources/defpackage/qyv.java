package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyv extends defpackage.ijv implements defpackage.qyx {
    public qyv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarRadio");
    }

    @Override // defpackage.qyx
    public final com.google.android.gms.car.RadioConfiguration f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(9, fp());
        com.google.android.gms.car.RadioConfiguration radioConfiguration = (com.google.android.gms.car.RadioConfiguration) defpackage.ijx.a(parcelFq, com.google.android.gms.car.RadioConfiguration.CREATOR);
        parcelFq.recycle();
        return radioConfiguration;
    }

    @Override // defpackage.qyx
    public final void n(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(4, parcelFp);
    }

    @Override // defpackage.qyx
    public final void o(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        fr(8, parcelFp);
    }

    @Override // defpackage.qyx
    public final void s(defpackage.qza qzaVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzaVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.qyx
    public final void t(defpackage.qza qzaVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzaVar);
        fr(5, parcelFp);
    }

    @Override // defpackage.qyx
    public final void u(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(6, parcelFp);
    }

    @Override // defpackage.qyx
    public final void v(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(7, parcelFp);
    }

    @Override // defpackage.qyx
    public final void w(com.google.android.gms.car.RadioProgramSelector radioProgramSelector) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, radioProgramSelector);
        fr(3, parcelFp);
    }

    @Override // defpackage.qyx
    public final void x(defpackage.qza qzaVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzaVar);
        fr(2, parcelFp);
    }
}
