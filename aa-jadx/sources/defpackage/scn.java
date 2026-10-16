package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class scn extends defpackage.ijv implements defpackage.scp {
    public scn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ICarSetupBinder");
    }

    @Override // defpackage.scp
    public final defpackage.qxh e() throws android.os.RemoteException {
        defpackage.qxh qxfVar;
        android.os.Parcel parcelFq = fq(1, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qxfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalMonitor");
            qxfVar = iInterfaceQueryLocalInterface instanceof defpackage.qxh ? (defpackage.qxh) iInterfaceQueryLocalInterface : new defpackage.qxf(strongBinder);
        }
        parcelFq.recycle();
        return qxfVar;
    }

    @Override // defpackage.scp
    public final void f() throws android.os.RemoteException {
        fr(2, fp());
    }
}
