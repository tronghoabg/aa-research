package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class scx extends defpackage.ijw implements defpackage.scy {
    public scx() {
        super("com.google.android.gms.carsetup.IServiceHandshake");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.sdb sczVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            sczVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.carsetup.IServiceHandshakeCallback");
            sczVar = iInterfaceQueryLocalInterface instanceof defpackage.sdb ? (defpackage.sdb) iInterfaceQueryLocalInterface : new defpackage.scz(strongBinder);
        }
        defpackage.ijx.d(parcel);
        a(sczVar);
        parcel2.writeNoException();
        return true;
    }
}
