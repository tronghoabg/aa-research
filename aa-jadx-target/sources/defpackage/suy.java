package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class suy extends defpackage.sor {
    public final defpackage.aba a;
    private final defpackage.aba x;
    private final defpackage.aba y;

    public suy(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.smx smxVar, defpackage.snr snrVar) {
        super(context, looper, 23, somVar, smxVar, snrVar);
        this.a = new defpackage.aba(0);
        this.x = new defpackage.aba(0);
        this.y = new defpackage.aba(0);
        new defpackage.aba(0);
    }

    @Override // defpackage.sok
    public final void E() {
        java.lang.System.currentTimeMillis();
        defpackage.aba abaVar = this.a;
        synchronized (abaVar) {
            abaVar.clear();
        }
        defpackage.aba abaVar2 = this.x;
        synchronized (abaVar2) {
            abaVar2.clear();
        }
        defpackage.aba abaVar3 = this.y;
        synchronized (abaVar3) {
            abaVar3.clear();
        }
    }

    public final boolean H(com.google.android.gms.common.Feature feature) {
        com.google.android.gms.common.Feature feature2;
        com.google.android.gms.common.Feature[] featureArrR = r();
        if (featureArrR != null) {
            int i = 0;
            while (true) {
                if (i >= featureArrR.length) {
                    feature2 = null;
                    break;
                }
                feature2 = featureArrR[i];
                if (feature.a.equals(feature2.a)) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.a() >= feature.a()) {
                return true;
            }
        }
        return false;
    }

    public final void I(suw suwVar, com.google.android.gms.location.LocationRequest locationRequest, defpackage.lhe lheVar) throws android.os.RemoteException {
        stx stxVar;
        sno snoVarB = suwVar.b();
        snm snmVar = snoVarB.a;
        snmVar.getClass();
        boolean zH = H(defpackage.stu.j);
        defpackage.aba abaVar = this.x;
        synchronized (abaVar) {
            stx stxVar2 = (stw) abaVar.get(snmVar);
            if (stxVar2 == null || zH) {
                stx stwVar = new stw(suwVar);
                abaVar.put(snmVar, stwVar);
                stxVar = stwVar;
            } else {
                ((stw) stxVar2).a.d(snoVarB);
                stxVar = stxVar2;
                stxVar2 = null;
            }
            if (zH) {
                ((defpackage.suj) v()).e(com.google.android.gms.location.internal.LocationReceiver.a(stxVar2, stxVar, snmVar.a()), locationRequest, new sut((java.lang.Object) null, lheVar));
            } else {
                ((defpackage.suj) v()).g(new com.google.android.gms.location.internal.LocationRequestUpdateData(1, new com.google.android.gms.location.internal.LocationRequestInternal(locationRequest, (java.util.List) null, false, false, false, false, Long.MAX_VALUE), (android.os.IBinder) null, stxVar, (android.app.PendingIntent) null, new suq(lheVar, stxVar), snmVar.a()));
            }
        }
    }

    public final void J(snm snmVar, boolean z, defpackage.lhe lheVar) throws android.os.RemoteException {
        defpackage.aba abaVar = this.x;
        synchronized (abaVar) {
            stw stwVar = (stw) abaVar.remove(snmVar);
            if (stwVar == null) {
                lheVar.f(java.lang.Boolean.FALSE);
                return;
            }
            stwVar.a.b().a();
            if (!z) {
                lheVar.f(java.lang.Boolean.TRUE);
            } else if (H(defpackage.stu.j)) {
                ((defpackage.suj) v()).f(com.google.android.gms.location.internal.LocationReceiver.a((android.os.IInterface) null, stwVar, "ILocationCallback@" + java.lang.System.identityHashCode(stwVar)), new sut(java.lang.Boolean.TRUE, lheVar));
            } else {
                ((defpackage.suj) v()).g(new com.google.android.gms.location.internal.LocationRequestUpdateData(2, (com.google.android.gms.location.internal.LocationRequestInternal) null, (android.os.IBinder) null, stwVar, (android.app.PendingIntent) null, new suu(java.lang.Boolean.TRUE, lheVar), (java.lang.String) null));
            }
        }
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 11717000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof defpackage.suj ? (defpackage.suj) iInterfaceQueryLocalInterface : new defpackage.suj(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.sok
    public final boolean f() {
        return true;
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.stu.q;
    }
}
