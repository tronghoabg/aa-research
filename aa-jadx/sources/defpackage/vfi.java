package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vfi extends defpackage.ijw implements defpackage.vfj {
    public vfi() {
        super("com.google.android.libraries.maps.internal.ILocationSourceDelegate");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.vhd vhbVar;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                vhbVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnLocationChangeListener");
                vhbVar = iInterfaceQueryLocalInterface instanceof defpackage.vhd ? (defpackage.vhd) iInterfaceQueryLocalInterface : new defpackage.vhb(strongBinder);
            }
            defpackage.ijx.d(parcel);
            a(vhbVar);
        } else {
            if (i != 2) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
