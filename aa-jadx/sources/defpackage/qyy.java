package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyy extends defpackage.ijv implements defpackage.qza {
    public qyy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarRadioCallback");
    }

    @Override // defpackage.qza
    public final void e(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeTypedList(list);
        fs(5, parcelFp);
    }

    @Override // defpackage.qza
    public final void f(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fs(2, parcelFp);
    }

    @Override // defpackage.qza
    public final void g(com.google.android.gms.car.RadioProgramInfo radioProgramInfo, boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, radioProgramInfo);
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(z2 ? 1 : 0);
        fs(3, parcelFp);
    }

    @Override // defpackage.qza
    public final void h(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeTypedList(list);
        fs(4, parcelFp);
    }

    @Override // defpackage.qza
    public final void i(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }
}
