package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rxp extends defpackage.ijv implements defpackage.rxr {
    public rxp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IStartupServiceCallback");
    }

    @Override // defpackage.rxr
    public final void a() throws android.os.RemoteException {
        fr(4, fp());
    }

    @Override // defpackage.rxr
    public final void b(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(9, parcelFp);
    }

    @Override // defpackage.rxr
    public final void c(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(1);
        fr(1, parcelFp);
    }

    @Override // defpackage.rxr
    public final void d(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(10, parcelFp);
    }

    @Override // defpackage.rxr
    public final void f() throws android.os.RemoteException {
        fr(8, fp());
    }

    @Override // defpackage.rxr
    public final void g(int i, int i2, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeString(str);
        fr(2, parcelFp);
    }

    @Override // defpackage.rxr
    public final void h(boolean z, java.util.List list, int i, int i2, byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeList(list);
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        parcelFp.writeByteArray(bArr);
        fr(6, parcelFp);
    }

    @Override // defpackage.rxr
    public final void i(java.util.List list, byte[] bArr, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeList(list);
        parcelFp.writeByteArray(bArr);
        defpackage.ijx.g(parcelFp, bundle);
        fr(7, parcelFp);
    }

    @Override // defpackage.rxr
    public final void j() throws android.os.RemoteException {
        fr(3, fp());
    }

    @Override // defpackage.rxr
    public final void k(java.util.List list, byte[] bArr) throws android.os.RemoteException {
        throw null;
    }
}
