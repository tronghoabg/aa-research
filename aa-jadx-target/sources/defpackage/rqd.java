package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqd extends defpackage.ijw implements defpackage.rqe {
    private final defpackage.lip a;

    public rqd(defpackage.lip lipVar) {
        super("com.google.android.gms.car.lifetime.IProjectionLifetime");
        this.a = lipVar;
    }

    @Override // defpackage.rqe
    public final void e(defpackage.rqh rqhVar) {
        defpackage.lip lipVar = this.a;
        lipVar.sendMessage(lipVar.obtainMessage(0, android.os.Binder.getCallingUid(), 0, rqhVar));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rqh rqfVar = null;
        if (i == 2) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
                rqfVar = iInterfaceQueryLocalInterface instanceof defpackage.rqh ? (defpackage.rqh) iInterfaceQueryLocalInterface : new defpackage.rqf(strongBinder);
            }
            defpackage.ijx.d(parcel);
            e(rqfVar);
        } else {
            if (i != 3) {
                return false;
            }
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
                rqfVar = iInterfaceQueryLocalInterface2 instanceof defpackage.rqh ? (defpackage.rqh) iInterfaceQueryLocalInterface2 : new defpackage.rqf(strongBinder2);
            }
            defpackage.ijx.d(parcel);
            f(rqfVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.rqe
    public final void f(defpackage.rqh rqhVar) {
        defpackage.lip lipVar = this.a;
        lipVar.sendMessage(lipVar.obtainMessage(1, android.os.Binder.getCallingUid(), 0, rqhVar));
    }
}
