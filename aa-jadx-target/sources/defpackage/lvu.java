package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lvu implements java.lang.Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public lvu(defpackage.advx advxVar, adtt adttVar, boolean z, int i) {
        this.d = i;
        this.c = adttVar;
        this.a = z;
        this.b = advxVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws wfo {
        int i = this.d;
        if (i == 0) {
            lvn lvnVar = (lvp) this.c;
            defpackage.yqm yqmVar = defpackage.lvv.a;
            ((defpackage.yqj) yqmVar.l().ai((char) 4303)).y("updateImConversation: %s", lvnVar);
            defpackage.wfp.c();
            long j = lvnVar.e;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
            java.lang.Object obj = this.b;
            defpackage.lvv lvvVar = (defpackage.lvv) obj;
            java.util.Map map = lvvVar.c;
            lvn lvnVar2 = (lvn) map.get(lValueOf);
            if (lvnVar2 instanceof lvp) {
                lvn lvnVar3 = (lvp) lvnVar2;
                if (lvnVar3.l(lvnVar)) {
                    return;
                }
                java.util.Iterator it = lvvVar.b.iterator();
                while (it.hasNext()) {
                    ((defpackage.kez) ((ajnd) it.next()).a).d(lvnVar == null ? lvnVar3 : lvnVar);
                }
            } else {
                java.util.Iterator it2 = lvvVar.b.iterator();
                while (it2.hasNext()) {
                    ((defpackage.kez) ((ajnd) it2.next()).a).d(lvnVar);
                }
            }
            lvnVar.a = this.a && lvnVar.p();
            defpackage.lvv.l(lvnVar.g, ((lvp) lvnVar).o);
            map.put(java.lang.Long.valueOf(j), lvnVar);
            lvvVar.e(lvnVar);
            ((defpackage.yqj) yqmVar.l().ai((char) 4304)).u("Trying to get Smart Actions");
            lwv.a().d(((lvp) lvnVar).m, (int) defpackage.acul.d()).eM(defpackage.ler.c(), new jui(obj, lvnVar, 6));
            return;
        }
        if (i == 1) {
            ((qve) this.b).a.d((com.google.android.gms.car.AudioFocusInfo) this.c, this.a);
            return;
        }
        if (i == 2) {
            pik pikVar = (pik) this.c;
            defpackage.gka gkaVar = pikVar.b;
            if (((pij) gkaVar.e()).equals(pij.c)) {
                return;
            }
            boolean z = this.a;
            defpackage.ysr.bn(((pij) gkaVar.e()).equals(pij.b), "callback received when in state %s", ((pij) gkaVar.e()).name());
            if (z) {
                pikVar.d();
            }
            this.b.run();
            return;
        }
        if (i != 3) {
            boolean z2 = this.a;
            if (i != 4) {
                ((defpackage.advx) this.b).m.c(this.c, z2);
                return;
            }
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            if (z2) {
                ((com.google.android.gms.carsetup.FirstActivityImpl) obj3).A((android.content.Intent) obj2);
                return;
            } else {
                com.google.android.gms.carsetup.FirstActivityImpl.m.g().ai(8730).y("Intent validation failed %s", obj2);
                ((com.google.android.gms.carsetup.FirstActivityImpl) obj3).finish();
                return;
            }
        }
        java.lang.Object obj4 = this.b;
        int iOrdinal = ((defpackage.xls) obj4).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 11) {
                defpackage.qsa.a.g().ai(7693).y("BluetoothPairingResponse with wrong status: %s", obj4);
                return;
            }
            defpackage.qsa.a.l().ai(7695).u("Bluetooth pairing delayed by the car");
            defpackage.qsa qsaVar = (defpackage.qsa) this.c;
            defpackage.rhn rhnVar = qsaVar.e;
            if (rhnVar.j) {
                rhnVar.j = false;
            }
            rhnVar.c(defpackage.rhj.EVENT_CAR_DELAYING_PAIRING);
            qsaVar.m(new qrv(0));
            return;
        }
        java.lang.Object obj5 = this.c;
        boolean z3 = this.a;
        defpackage.qsa qsaVar2 = (defpackage.qsa) obj5;
        defpackage.rhn rhnVar2 = qsaVar2.e;
        rhnVar2.i = z3;
        if (rhnVar2.j && android.os.Build.VERSION.SDK_INT <= 29 && qsaVar2.t.g() != 2) {
            defpackage.qsa.a.l().ai(7694).u("BluetoothFsm failed to connect HFP for 3 times, unpairing and re-pairing.");
            qsaVar2.d.j(ria.b);
            qsaVar2.e.j = false;
        }
        qsaVar2.e.c(defpackage.rhj.EVENT_CAR_READY_FOR_PAIRING);
    }

    public /* synthetic */ lvu(com.google.android.gms.carsetup.FirstActivityImpl firstActivityImpl, boolean z, android.content.Intent intent, int i) {
        this.d = i;
        this.b = firstActivityImpl;
        this.a = z;
        this.c = intent;
    }

    public /* synthetic */ lvu(java.lang.Object obj, java.lang.Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    public /* synthetic */ lvu(pik pikVar, boolean z, java.lang.Runnable runnable, int i) {
        this.d = i;
        this.c = pikVar;
        this.a = z;
        this.b = runnable;
    }

    public lvu(defpackage.qsa qsaVar, defpackage.xls xlsVar, boolean z, int i) {
        this.d = i;
        this.b = xlsVar;
        this.a = z;
        this.c = qsaVar;
    }
}
