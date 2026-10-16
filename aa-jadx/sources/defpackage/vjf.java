package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vjf extends defpackage.ijw implements defpackage.vjg {
    public vjf() {
        super("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.vjp vjnVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            vjnVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IStreetViewPanoramaDelegate");
            vjnVar = iInterfaceQueryLocalInterface instanceof defpackage.vjp ? (defpackage.vjp) iInterfaceQueryLocalInterface : new defpackage.vjn(strongBinder);
        }
        defpackage.ijx.d(parcel);
        a(vjnVar);
        parcel2.writeNoException();
        return true;
    }
}
