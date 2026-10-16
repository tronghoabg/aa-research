package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ran extends defpackage.ijw implements defpackage.rao {
    private final defpackage.rbv a;

    public ran(defpackage.rbv rbvVar) {
        super("com.google.android.gms.car.IProjectionLifecycle");
        this.a = rbvVar;
    }

    @Override // defpackage.rao
    public final void e(android.os.Bundle bundle, defpackage.rar rarVar) {
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "onPreflightStart on binder thread", new java.lang.Object[0]);
        }
        defpackage.rbv rbvVar = this.a;
        rbvVar.sendMessage(rbvVar.obtainMessage(2, android.os.Binder.getCallingUid(), 0, new android.util.Pair(bundle, rarVar)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws wfo, android.os.RemoteException {
        defpackage.rar rapVar;
        defpackage.qvl qvjVar = null;
        defpackage.rar rapVar2 = null;
        defpackage.rar rapVar3 = null;
        defpackage.rar rapVar4 = null;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                rapVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                rapVar = iInterfaceQueryLocalInterface instanceof defpackage.rar ? (defpackage.rar) iInterfaceQueryLocalInterface : new defpackage.rap(strongBinder);
            }
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICar");
                qvjVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qvl ? (defpackage.qvl) iInterfaceQueryLocalInterface2 : new defpackage.qvj(strongBinder2);
            }
            defpackage.ijx.d(parcel);
            h(rapVar, qvjVar);
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
            android.os.IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                rapVar4 = iInterfaceQueryLocalInterface3 instanceof defpackage.rar ? (defpackage.rar) iInterfaceQueryLocalInterface3 : new defpackage.rap(strongBinder3);
            }
            defpackage.ijx.d(parcel);
            e(bundle, rapVar4);
        } else if (i == 4) {
            android.os.IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                rapVar3 = iInterfaceQueryLocalInterface4 instanceof defpackage.rar ? (defpackage.rar) iInterfaceQueryLocalInterface4 : new defpackage.rap(strongBinder4);
            }
            defpackage.ijx.d(parcel);
            g(rapVar3);
        } else {
            if (i != 5) {
                return false;
            }
            android.os.IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycleCallback");
                rapVar2 = iInterfaceQueryLocalInterface5 instanceof defpackage.rar ? (defpackage.rar) iInterfaceQueryLocalInterface5 : new defpackage.rap(strongBinder5);
            }
            defpackage.ijx.d(parcel);
            i(rapVar2);
        }
        return true;
    }

    @Override // defpackage.rao
    public final void f() {
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            defpackage.rrx.a("CAR.CLIENT.PLS", null, "onProjectionEnd on binder thread");
        }
        defpackage.rbv rbvVar = this.a;
        rbvVar.sendMessage(rbvVar.obtainMessage(1, android.os.Binder.getCallingUid(), 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rao
    public final void g(defpackage.rar rarVar) throws wfo {
        defpackage.wfp.b();
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "onProjectionReady on binder thread", new java.lang.Object[0]);
        }
        defpackage.rbv rbvVar = this.a;
        rbvVar.sendMessage(rbvVar.obtainMessage(3, android.os.Binder.getCallingUid(), 0, rarVar));
    }

    @Override // defpackage.rao
    public final void h(defpackage.rar rarVar, defpackage.qvl qvlVar) {
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT.PLS", null, "onProjectionStart on binder thread", new java.lang.Object[0]);
        }
        defpackage.rbv rbvVar = this.a;
        rbvVar.sendMessage(rbvVar.obtainMessage(0, android.os.Binder.getCallingUid(), 0, new android.util.Pair(rarVar, qvlVar)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.rao
    public final void i(defpackage.rar rarVar) throws wfo {
        defpackage.wfp.b();
        if (defpackage.omv.c("CAR.CLIENT.PLS", 3)) {
            defpackage.rrx.a("CAR.CLIENT.PLS", null, "onProjectionTearDown on binder thread");
        }
        defpackage.rbv rbvVar = this.a;
        rbvVar.sendMessage(rbvVar.obtainMessage(4, android.os.Binder.getCallingUid(), 0, rarVar));
    }
}
