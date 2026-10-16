package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rxm extends defpackage.ijv implements defpackage.rxo {
    public rxm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IStartup");
    }

    @Override // defpackage.rxo
    public final defpackage.qvl b() throws android.os.RemoteException {
        defpackage.qvl qvjVar;
        android.os.Parcel parcelFq = fq(13, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qvjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICar");
            qvjVar = iInterfaceQueryLocalInterface instanceof defpackage.qvl ? (defpackage.qvl) iInterfaceQueryLocalInterface : new defpackage.qvj(strongBinder);
        }
        parcelFq.recycle();
        return qvjVar;
    }

    @Override // defpackage.rxo
    public final defpackage.rxi c(defpackage.rxl rxlVar) throws android.os.RemoteException {
        defpackage.rxi rxgVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rxlVar);
        android.os.Parcel parcelFq = fq(16, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rxgVar = null;
        } else {
            rxg rxgVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPoint");
            rxgVar = rxgVarQueryLocalInterface instanceof defpackage.rxi ? (defpackage.rxi) rxgVarQueryLocalInterface : new rxg(strongBinder);
        }
        parcelFq.recycle();
        return rxgVar;
    }

    @Override // defpackage.rxo
    public final void d(long j, int i, android.os.Bundle bundle, defpackage.rxr rxrVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, bundle);
        defpackage.ijx.i(parcelFp, rxrVar);
        fr(20, parcelFp);
    }

    @Override // defpackage.rxo
    public final void f() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxo
    public final void g(long j, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxr rxrVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxo
    public final void h(long j, defpackage.rxr rxrVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        defpackage.ijx.i(parcelFp, rxrVar);
        fr(5, parcelFp);
    }

    @Override // defpackage.rxo
    public final void i(long j, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeInt(i);
        fr(19, parcelFp);
    }

    @Override // defpackage.rxo
    public final void j(long j, java.util.List list, java.util.List list2, defpackage.rxf rxfVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxo
    public final void k(long j, java.util.List list, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxo
    public final void l(long j, java.util.List list, java.util.List list2, android.os.ParcelFileDescriptor parcelFileDescriptor, defpackage.rxf rxfVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        parcelFp.writeList(list);
        parcelFp.writeList(list2);
        defpackage.ijx.g(parcelFp, parcelFileDescriptor);
        defpackage.ijx.i(parcelFp, rxfVar);
        fr(17, parcelFp);
    }

    @Override // defpackage.rxo
    public final void m(long j) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        fr(8, parcelFp);
    }

    @Override // defpackage.rxo
    public final void n(long j, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        defpackage.ijx.g(parcelFp, bundle);
        fr(23, parcelFp);
    }

    @Override // defpackage.rxo
    public final void o(boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(z2 ? 1 : 0);
        fr(22, parcelFp);
    }

    @Override // defpackage.rxo
    public final boolean r(long j) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeLong(j);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rxo
    public final boolean s(int i, int i2, android.os.ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxo
    public final void t() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rxo
    public final void u() throws android.os.RemoteException {
        throw null;
    }
}
