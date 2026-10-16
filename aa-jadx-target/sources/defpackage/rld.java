package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rld extends defpackage.ijv implements defpackage.rlf {
    public rld(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayManager");
    }

    @Override // defpackage.rlf
    public final defpackage.rkt e(com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        defpackage.rkt rkrVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carDisplayId);
        android.os.Parcel parcelFq = fq(3, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            rkrVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplay");
            rkrVar = iInterfaceQueryLocalInterface instanceof defpackage.rkt ? (defpackage.rkt) iInterfaceQueryLocalInterface : new defpackage.rkr(strongBinder);
        }
        parcelFq.recycle();
        return rkrVar;
    }

    @Override // defpackage.rlf
    public final java.util.List f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        java.util.ArrayList arrayListCreateTypedArrayList = parcelFq.createTypedArrayList(com.google.android.gms.car.display.CarDisplay.CREATOR);
        parcelFq.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.rlf
    public final boolean g() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(4, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
