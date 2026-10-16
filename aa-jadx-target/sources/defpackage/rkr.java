package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rkr extends defpackage.ijv implements defpackage.rkt {
    public rkr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplay");
    }

    @Override // defpackage.rkt
    public final android.graphics.Rect a() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(9, fp());
        android.graphics.Rect rect = (android.graphics.Rect) defpackage.ijx.a(parcelFq, android.graphics.Rect.CREATOR);
        parcelFq.recycle();
        return rect;
    }

    @Override // defpackage.rkt
    public final com.google.android.gms.car.CarUiInfo c() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(3, fp());
        com.google.android.gms.car.CarUiInfo carUiInfo = (com.google.android.gms.car.CarUiInfo) defpackage.ijx.a(parcelFq, com.google.android.gms.car.CarUiInfo.CREATOR);
        parcelFq.recycle();
        return carUiInfo;
    }

    @Override // defpackage.rkt
    public final defpackage.rab d() throws android.os.RemoteException {
        defpackage.rab qzzVar;
        android.os.Parcel parcelFq = fq(2, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qzzVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarWindowManager");
            qzzVar = iInterfaceQueryLocalInterface instanceof defpackage.rab ? (defpackage.rab) iInterfaceQueryLocalInterface : new defpackage.qzz(strongBinder);
        }
        parcelFq.recycle();
        return qzzVar;
    }

    @Override // defpackage.rkt
    public final com.google.android.gms.car.display.CarDisplay g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(6, fp());
        com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) defpackage.ijx.a(parcelFq, com.google.android.gms.car.display.CarDisplay.CREATOR);
        parcelFq.recycle();
        return carDisplay;
    }

    @Override // defpackage.rkt
    public final com.google.android.gms.car.display.CarDisplayUiFeatures h() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(12, fp());
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures = (com.google.android.gms.car.display.CarDisplayUiFeatures) defpackage.ijx.a(parcelFq, com.google.android.gms.car.display.CarDisplayUiFeatures.CREATOR);
        parcelFq.recycle();
        return carDisplayUiFeatures;
    }

    @Override // defpackage.rkt
    public final java.util.List i() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(15, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(android.graphics.Rect.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkt
    public final void k(defpackage.rkz rkzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeStrongBinder(rkzVar);
        fr(7, parcelFp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkt
    public final void l(defpackage.rlc rlcVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeStrongBinder(rlcVar);
        fr(10, parcelFp);
    }

    @Override // defpackage.rkt
    public final void m(rll rllVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rllVar);
        fr(13, parcelFp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkt
    public final void n(defpackage.qzj qzjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeStrongBinder(qzjVar);
        fr(4, parcelFp);
    }

    @Override // defpackage.rkt
    public final void o() throws android.os.RemoteException {
        fr(16, fp());
    }

    @Override // defpackage.rkt
    public final void p(defpackage.rkz rkzVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rkzVar);
        fr(8, parcelFp);
    }

    @Override // defpackage.rkt
    public final void q(defpackage.rlc rlcVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rlcVar);
        fr(11, parcelFp);
    }

    @Override // defpackage.rkt
    public final void r(rll rllVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rllVar);
        fr(14, parcelFp);
    }

    @Override // defpackage.rkt
    public final void s(defpackage.qzj qzjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzjVar);
        fr(5, parcelFp);
    }
}
