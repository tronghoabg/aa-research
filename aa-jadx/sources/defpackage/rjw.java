package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rjw extends defpackage.ijw implements defpackage.rjx {
    public rjw() {
        super("com.google.android.gms.car.diagnostics.ICarDiagnostics");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.rka rjyVar = null;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                rjyVar = iInterfaceQueryLocalInterface instanceof defpackage.rka ? (defpackage.rka) iInterfaceQueryLocalInterface : new defpackage.rjy(strongBinder);
            }
            defpackage.ijx.d(parcel);
            b(rjyVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                rjyVar = iInterfaceQueryLocalInterface2 instanceof defpackage.rka ? (defpackage.rka) iInterfaceQueryLocalInterface2 : new defpackage.rjy(strongBinder2);
            }
            defpackage.ijx.d(parcel);
            c(rjyVar);
            parcel2.writeNoException();
        } else if (i == 3) {
            android.os.IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                if (iInterfaceQueryLocalInterface3 instanceof defpackage.rka) {
                }
            }
            defpackage.ijx.d(parcel);
            parcel2.writeNoException();
            parcel2.writeInt(0);
        } else {
            if (i != 4) {
                return false;
            }
            java.util.List listA = a();
            parcel2.writeNoException();
            parcel2.writeTypedList(listA);
        }
        return true;
    }
}
