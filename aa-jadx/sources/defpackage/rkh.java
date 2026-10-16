package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rkh extends defpackage.ijw implements defpackage.rki {
    public rkh() {
        super("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayManager");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rkl rkjVar = null;
        if (i == 2) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
                rkjVar = iInterfaceQueryLocalInterface instanceof defpackage.rkl ? (defpackage.rkl) iInterfaceQueryLocalInterface : new defpackage.rkj(strongBinder);
            }
            defpackage.ijx.d(parcel);
            a(rkjVar);
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.car.display.integratedoverlay.OverlayParameters.CREATOR);
            defpackage.ijx.d(parcel);
            b(arrayListCreateTypedArrayList);
            return true;
        }
        android.os.IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
            rkjVar = iInterfaceQueryLocalInterface2 instanceof defpackage.rkl ? (defpackage.rkl) iInterfaceQueryLocalInterface2 : new defpackage.rkj(strongBinder2);
        }
        defpackage.ijx.d(parcel);
        c(rkjVar);
        return true;
    }
}
