package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwu extends defpackage.ijv implements defpackage.qww {
    public qwu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallListener");
    }

    @Override // defpackage.qww
    public final void e(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, keyEvent);
        fs(1, parcelFp);
    }

    @Override // defpackage.qww
    public final void f(boolean z, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        fs(2, parcelFp);
    }

    @Override // defpackage.qww
    public final void g(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fs(3, parcelFp);
    }

    @Override // defpackage.qww
    public final void h(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fs(11, parcelFp);
    }

    @Override // defpackage.qww
    public final void i(com.google.android.gms.car.CarCall carCall) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        fs(4, parcelFp);
    }

    @Override // defpackage.qww
    public final void j(com.google.android.gms.car.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeStringList(list);
        fs(9, parcelFp);
    }

    @Override // defpackage.qww
    public final void k(com.google.android.gms.car.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeTypedList(list);
        fs(7, parcelFp);
    }

    @Override // defpackage.qww
    public final void l(com.google.android.gms.car.CarCall carCall, java.util.List list) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeTypedList(list);
        fs(12, parcelFp);
    }

    @Override // defpackage.qww
    public final void m(com.google.android.gms.car.CarCall carCall, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeString(str);
        defpackage.ijx.g(parcelFp, bundle);
        fs(13, parcelFp);
    }

    @Override // defpackage.qww
    public final void n(com.google.android.gms.car.CarCall carCall, com.google.android.gms.car.CarCall.Details details) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, details);
        fs(8, parcelFp);
    }

    @Override // defpackage.qww
    public final void o(com.google.android.gms.car.CarCall carCall, com.google.android.gms.car.CarCall carCall2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        defpackage.ijx.g(parcelFp, carCall2);
        fs(6, parcelFp);
    }

    @Override // defpackage.qww
    public final void p(com.google.android.gms.car.CarCall carCall, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeString(str);
        fs(10, parcelFp);
    }

    @Override // defpackage.qww
    public final void q(com.google.android.gms.car.CarCall carCall, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carCall);
        parcelFp.writeInt(i);
        fs(5, parcelFp);
    }
}
