package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vjs extends defpackage.ijw implements defpackage.vjt {
    public vjs() {
        super("com.google.android.libraries.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.vjg vjeVar;
        switch (i) {
            case 1:
                defpackage.vjp vjpVarB = b();
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, vjpVarB);
                return true;
            case 2:
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                d(bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                h();
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                f();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                i(bundle2);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, bundle2);
                return true;
            case 8:
                defpackage.srh srhVarA = a();
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, srhVarA);
                return true;
            case 9:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    vjeVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    vjeVar = iInterfaceQueryLocalInterface instanceof defpackage.vjg ? (defpackage.vjg) iInterfaceQueryLocalInterface : new defpackage.vje(strongBinder);
                }
                defpackage.ijx.d(parcel);
                c(vjeVar);
                parcel2.writeNoException();
                return true;
            case 10:
                j();
                parcel2.writeNoException();
                return true;
            case 11:
                k();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
