package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwr extends defpackage.ijv implements defpackage.qwt {
    public qwr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCall");
    }

    @Override // defpackage.qwt
    public final void A() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwt
    public final void B() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwt
    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(5, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qwt
    public final int f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qwt
    public final java.util.List g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.gms.car.CarCall.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.qwt
    public final void h(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(9, parcelFp);
    }

    @Override // defpackage.qwt
    public final void i(com.google.android.gms.car.CarCall carCall, com.google.android.gms.car.CarCall carCall2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, carCall2);
        fr(17, parcelFp);
    }

    @Override // defpackage.qwt
    public final void j(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(11, parcelFp);
    }

    @Override // defpackage.qwt
    public final void k() throws android.os.RemoteException {
        fr(20, fp());
    }

    @Override // defpackage.qwt
    public final void l(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(12, parcelFp);
    }

    @Override // defpackage.qwt
    public final void m(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        fr(19, parcelFp);
    }

    @Override // defpackage.qwt
    public final void n(com.google.android.gms.car.CarCall carCall, char c) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(c);
        fr(14, parcelFp);
    }

    @Override // defpackage.qwt
    public final void o(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }

    @Override // defpackage.qwt
    public final void p(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(3, parcelFp);
    }

    @Override // defpackage.qwt
    public final void q(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(15, parcelFp);
    }

    @Override // defpackage.qwt
    public final void r(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(13, parcelFp);
    }

    @Override // defpackage.qwt
    public final boolean s() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qwt
    public final boolean t(defpackage.qww qwwVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwwVar);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qwt
    public final boolean u(defpackage.qww qwwVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwwVar);
        android.os.Parcel parcelFq = fq(8, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    @Override // defpackage.qwt
    public final void v(com.google.android.gms.car.CarCall carCall, android.telecom.PhoneAccountHandle phoneAccountHandle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, phoneAccountHandle);
        parcelFp.writeInt(0);
        fr(26, parcelFp);
    }

    @Override // defpackage.qwt
    public final void w() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwt
    public final void x() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwt
    public final void y() throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.qwt
    public final void z(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(0);
        parcelFp.writeString(null);
        fr(10, parcelFp);
    }
}
