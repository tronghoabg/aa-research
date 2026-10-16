package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rnf extends defpackage.ijv implements defpackage.rnh {
    public rnf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.IProxyInputConnection");
    }

    @Override // defpackage.rnh
    public final int e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(4, parcelFp);
        int i2 = parcelFq.readInt();
        parcelFq.recycle();
        return i2;
    }

    @Override // defpackage.rnh
    public final java.lang.CharSequence f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcelFq);
        parcelFq.recycle();
        return charSequenceB;
    }

    @Override // defpackage.rnh
    public final java.lang.CharSequence g(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcelFq);
        parcelFq.recycle();
        return charSequenceB;
    }

    @Override // defpackage.rnh
    public final java.lang.CharSequence h(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcelFq);
        parcelFq.recycle();
        return charSequenceB;
    }

    @Override // defpackage.rnh
    public final void i(defpackage.rmy rmyVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rmyVar);
        fr(19, parcelFp);
    }

    @Override // defpackage.rnh
    public final boolean j() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(13, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean k(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(16, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean l(java.lang.CharSequence charSequence, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.e(parcelFp, charSequence);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(9, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean m(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        android.os.Parcel parcelFq = fq(5, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean n() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(14, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean o() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(8, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean p(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(12, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean q(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(11, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean r(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        defpackage.ijx.g(parcelFp, bundle);
        android.os.Parcel parcelFq = fq(18, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean s(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        android.os.Parcel parcelFq = fq(17, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean t(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, keyEvent);
        android.os.Parcel parcelFq = fq(15, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean u(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean v(java.lang.CharSequence charSequence, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.e(parcelFp, charSequence);
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(6, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.rnh
    public final boolean w(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        android.os.Parcel parcelFq = fq(10, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
