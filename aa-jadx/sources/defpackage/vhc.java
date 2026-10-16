package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vhc extends defpackage.ijw implements defpackage.vhd {
    public vhc() {
        super("com.google.android.libraries.maps.internal.IOnLocationChangeListener");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.srh srfVar;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                srfVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
            }
            defpackage.ijx.d(parcel);
            e(srfVar);
        } else {
            if (i != 2) {
                return false;
            }
            android.location.Location location = (android.location.Location) defpackage.ijx.a(parcel, android.location.Location.CREATOR);
            defpackage.ijx.d(parcel);
            f(location);
        }
        parcel2.writeNoException();
        return true;
    }
}
