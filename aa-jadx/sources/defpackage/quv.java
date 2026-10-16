package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class quv extends defpackage.ijw implements defpackage.quw {
    public quv() {
        super("com.google.android.gms.car.IAppDecorServiceReadyCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.quq quoVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            quoVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAppDecorService");
            quoVar = iInterfaceQueryLocalInterface instanceof defpackage.quq ? (defpackage.quq) iInterfaceQueryLocalInterface : new defpackage.quo(strongBinder);
        }
        defpackage.ijx.d(parcel);
        a(quoVar);
        return true;
    }
}
