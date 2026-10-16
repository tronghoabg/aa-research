package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mkg extends defpackage.ijw implements defpackage.mkh {
    public final java.util.List a;
    public final com.google.android.gearhead.service.SharedService b;

    public mkg(com.google.android.gearhead.service.SharedService sharedService) {
        super("com.google.android.apps.auto.components.service.ICarModeSharedService");
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
        this.b = sharedService;
    }

    private final void a() {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            com.google.android.gearhead.service.SharedService sharedService = this.b;
            defpackage.yqm yqmVar = com.google.android.gearhead.service.SharedService.a;
            java.lang.String[] packagesForUid = sharedService.getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
            defpackage.slj sljVarA = defpackage.slj.a(sharedService);
            if (packagesForUid != null) {
                for (java.lang.String str : packagesForUid) {
                    if (defpackage.kmv.c(adau.b(), str) && sljVarA.b(str)) {
                        return;
                    }
                }
            }
            throw new java.lang.SecurityException("Unauthorized");
        }
    }

    @Override // defpackage.mkh
    public final void e(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        int callingUid = android.os.Binder.getCallingUid();
        if (callingUid != android.os.Process.myUid()) {
            com.google.android.gearhead.service.SharedService sharedService = this.b;
            defpackage.yqm yqmVar = com.google.android.gearhead.service.SharedService.a;
            java.util.Set set = sharedService.c;
            if (!set.contains(java.lang.Integer.valueOf(callingUid))) {
                java.lang.String[] packagesForUid = sharedService.getPackageManager().getPackagesForUid(callingUid);
                defpackage.slj sljVarA = defpackage.slj.a(sharedService);
                if (packagesForUid != null) {
                    for (java.lang.String str : packagesForUid) {
                        if (sljVarA.b(str)) {
                            set.add(java.lang.Integer.valueOf(callingUid));
                        }
                    }
                }
                throw new java.lang.SecurityException(defpackage.a.bo(callingUid, "Cannot send telemetry from uid "));
            }
        }
        ((defpackage.oiq) defpackage.mkp.a.i(defpackage.oiq.class)).c(telemetryEvent);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            com.google.android.apps.auto.components.car.info.StartingProcessInfo startingProcessInfo = (com.google.android.apps.auto.components.car.info.StartingProcessInfo) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.car.info.StartingProcessInfo.CREATOR);
            defpackage.ijx.d(parcel);
            f(startingProcessInfo);
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            defpackage.ijx.d(parcel);
            g(strongBinder);
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent = (com.google.android.apps.auto.components.telemetry.TelemetryEvent) defpackage.ijx.a(parcel, com.google.android.apps.auto.components.telemetry.TelemetryEvent.CREATOR);
            defpackage.ijx.d(parcel);
            e(telemetryEvent);
            return true;
        }
        mki mkiVar = null;
        switch (i) {
            case 9:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.apps.auto.components.service.IPlugbotSharedServiceCallback");
                    mkiVar = iInterfaceQueryLocalInterface instanceof mki ? (mki) iInterfaceQueryLocalInterface : new mki(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                a();
                ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).l(mkiVar);
                parcel2.writeNoException();
                return true;
            case 10:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.apps.auto.components.service.IPlugbotSharedServiceCallback");
                    mkiVar = iInterfaceQueryLocalInterface2 instanceof mki ? (mki) iInterfaceQueryLocalInterface2 : new mki(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                a();
                ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).m(mkiVar);
                parcel2.writeNoException();
                return true;
            case 11:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.apps.auto.components.service.IPlugbotSharedServiceCallback");
                    mkiVar = iInterfaceQueryLocalInterface3 instanceof mki ? (mki) iInterfaceQueryLocalInterface3 : new mki(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                a();
                ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).n(mkiVar);
                parcel2.writeNoException();
                return true;
            case 12:
                a();
                ((defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class)).b();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.mkh
    public final void f(com.google.android.apps.auto.components.car.info.StartingProcessInfo startingProcessInfo) {
        a();
        ((defpackage.yqj) com.google.android.gearhead.service.SharedService.a.l().ai((char) 7427)).u("Projection process starting");
        try {
            defpackage.qkl qklVar = new defpackage.qkl(this, startingProcessInfo.a);
            com.google.android.gms.car.CarInfo carInfo = startingProcessInfo.b;
            if (carInfo != null) {
                defpackage.kiv.a().d(carInfo, com.google.android.gearhead.service.SharedService.class.getName());
            }
            java.lang.String str = startingProcessInfo.e;
            if (str != null) {
                defpackage.kiv.a().d.set(str);
            }
            com.google.android.gearhead.service.SharedService sharedService = this.b;
            sharedService.d = startingProcessInfo.c;
            sharedService.e = startingProcessInfo.d;
            ((defpackage.yqj) com.google.android.gearhead.service.SharedService.a.l().ai((char) 7428)).u("Resetting internal state");
            defpackage.omf.t().e();
            qklVar.a(0);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.service.SharedService.a.h()).p(e)).ai((char) 7429)).u("Couldn't create client");
        }
    }

    @Override // defpackage.mkh
    public final void g(android.os.IBinder iBinder) {
        defpackage.qkl qklVar;
        a();
        defpackage.yqm yqmVar = com.google.android.gearhead.service.SharedService.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 7430)).u("Projection process stopping");
        java.util.Iterator it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                qklVar = null;
                break;
            }
            qklVar = (defpackage.qkl) it.next();
        } while (qklVar.a != iBinder);
        if (qklVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 7431)).u("Unknown token sent for stopping. Ignore request");
            return;
        }
        if (qklVar.b(1)) {
            qklVar.a.unlinkToDeath(qklVar, 0);
        }
        defpackage.omf.t().b();
    }
}
