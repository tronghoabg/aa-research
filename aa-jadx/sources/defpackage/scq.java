package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class scq extends defpackage.ijw implements defpackage.scr {
    public scq() {
        super("com.google.android.gms.carsetup.IConnectionTransfer");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.scs scsVar;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    scsVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.carsetup.IConnectionTransferCallbacks");
                    scsVar = iInterfaceQueryLocalInterface instanceof defpackage.scs ? (defpackage.scs) iInterfaceQueryLocalInterface : new defpackage.scs(strongBinder);
                }
                defpackage.ijx.d(parcel);
                j(scsVar);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.carsetup.CarInfoInternal carInfoInternalF = f();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, carInfoInternalF);
                return true;
            case 4:
                int iB = b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 5:
                boolean zI = i();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 6:
            default:
                return false;
            case 7:
                boolean zH = h();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 8:
                boolean zG = g();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 9:
                int iC = c();
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 10:
                int iA = a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 11:
                defpackage.rxi rxiVarD = d();
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, rxiVarD);
                return true;
        }
    }
}
