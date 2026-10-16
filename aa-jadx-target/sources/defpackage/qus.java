package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qus extends defpackage.ijw implements qut {
    public qus() {
        super("com.google.android.gms.car.IAppDecorServiceProvider");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        quw quuVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            quuVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAppDecorServiceReadyCallback");
            quuVar = iInterfaceQueryLocalInterface instanceof quw ? (quw) iInterfaceQueryLocalInterface : new defpackage.quu(strongBinder);
        }
        defpackage.ijx.d(parcel);
        h(quuVar);
        return true;
    }
}
