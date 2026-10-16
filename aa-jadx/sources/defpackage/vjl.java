package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vjl extends defpackage.ijw implements defpackage.vjm {
    public vjl() {
        super("com.google.android.libraries.maps.internal.ISnapshotReadyCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.srh srfVar;
        if (i == 1) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) defpackage.ijx.a(parcel, android.graphics.Bitmap.CREATOR);
            defpackage.ijx.d(parcel);
            a(bitmap);
        } else {
            if (i != 2) {
                return false;
            }
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                srfVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
            }
            defpackage.ijx.d(parcel);
            b(srfVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
