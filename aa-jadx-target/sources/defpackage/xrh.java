package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xrh extends defpackage.ijw implements xri {
    final /* synthetic */ com.google.android.gearhead.demand.DemandClientService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrh(com.google.android.gearhead.demand.DemandClientService demandClientService) {
        super("com.google.android.projection.sdk.demand.IDemandSpace");
        this.a = demandClientService;
    }

    public final void e(android.os.Bundle bundle) {
        com.google.android.gearhead.demand.DemandClientService demandClientService = this.a;
        demandClientService.c.post(new defpackage.qbr(demandClientService, bundle, 12));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        xrf xrdVar = null;
        if (i != 1) {
            int i2 = 2;
            if (i == 2) {
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.projection.sdk.demand.ICallbacks");
                    xrdVar = iInterfaceQueryLocalInterface instanceof xrf ? (xrf) iInterfaceQueryLocalInterface : new defpackage.xrd(strongBinder);
                }
                defpackage.ijx.d(parcel);
                g(xrdVar);
            } else if (i == 3) {
                defpackage.ijx.a(parcel, com.google.android.projection.sdk.demand.Template.CREATOR);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null && (strongBinder2.queryLocalInterface("com.google.android.projection.sdk.demand.ICallbacks") instanceof xrf)) {
                }
                defpackage.ijx.d(parcel);
            } else if (i == 4) {
                com.google.android.gearhead.demand.DemandClientService demandClientService = this.a;
                demandClientService.c.post(new defpackage.qie(demandClientService, i2));
            } else {
                if (i != 5) {
                    return false;
                }
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                e(bundle);
            }
        } else {
            android.os.IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.projection.sdk.demand.ICallbacks");
                xrdVar = iInterfaceQueryLocalInterface2 instanceof xrf ? (xrf) iInterfaceQueryLocalInterface2 : new defpackage.xrd(strongBinder3);
            }
            defpackage.ijx.d(parcel);
            f(xrdVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void f(xrf xrfVar) {
        com.google.android.gearhead.demand.DemandClientService demandClientService = this.a;
        demandClientService.c.post(new defpackage.qbr(demandClientService, xrfVar, 14, (byte[]) null));
    }

    public final void g(xrf xrfVar) {
        com.google.android.gearhead.demand.DemandClientService demandClientService = this.a;
        demandClientService.c.post(new defpackage.qbr(demandClientService, xrfVar, 13, (byte[]) null));
    }
}
