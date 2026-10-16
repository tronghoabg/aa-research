package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rav extends defpackage.ijv implements defpackage.rax {
    public rav(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ISystemUiService");
    }

    @Override // defpackage.rax
    public final void e() throws android.os.RemoteException {
        fr(4, fp());
    }

    @Override // defpackage.rax
    public final void f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(2, parcelFp);
    }

    @Override // defpackage.rax
    public final void g(java.lang.CharSequence charSequence, int i, android.content.ComponentName componentName) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.e(parcelFp, charSequence);
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, componentName);
        fr(6, parcelFp);
    }

    @Override // defpackage.rax
    public final void h(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, intent);
        fr(1, parcelFp);
    }

    @Override // defpackage.rax
    public final boolean i() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(5, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
