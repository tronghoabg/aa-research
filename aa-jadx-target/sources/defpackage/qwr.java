package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qwr extends defpackage.ijv implements qwt {
    public qwr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCall");
    }

    public final void A() throws android.os.RemoteException {
        throw null;
    }

    public final void B() throws android.os.RemoteException {
        throw null;
    }

    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(5, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    public final int f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    public final java.util.List g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.gms.car.CarCall.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void h(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(9, parcelFp);
    }

    public final void i(com.google.android.gms.car.CarCall carCall, com.google.android.gms.car.CarCall carCall2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, carCall2);
        fr(17, parcelFp);
    }

    public final void j(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(11, parcelFp);
    }

    public final void k() throws android.os.RemoteException {
        fr(20, fp());
    }

    public final void l(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(12, parcelFp);
    }

    public final void m(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        fr(19, parcelFp);
    }

    public final void n(com.google.android.gms.car.CarCall carCall, char c) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(c);
        fr(14, parcelFp);
    }

    public final void o(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(6, parcelFp);
    }

    public final void p(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        fr(3, parcelFp);
    }

    public final void q(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(15, parcelFp);
    }

    public final void r(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fr(13, parcelFp);
    }

    public final boolean s() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    public final boolean t(qww qwwVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwwVar);
        android.os.Parcel parcelFq = fq(7, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    public final boolean u(qww qwwVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qwwVar);
        android.os.Parcel parcelFq = fq(8, parcelFp);
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }

    public final void v(com.google.android.gms.car.CarCall carCall, android.telecom.PhoneAccountHandle phoneAccountHandle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, phoneAccountHandle);
        parcelFp.writeInt(0);
        fr(26, parcelFp);
    }

    public final void w() throws android.os.RemoteException {
        throw null;
    }

    public final void x() throws android.os.RemoteException {
        throw null;
    }

    public final void y() throws android.os.RemoteException {
        throw null;
    }

    public final void z(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(0);
        parcelFp.writeString(null);
        fr(10, parcelFp);
    }
}
