package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ioh implements defpackage.ixt {
    public static final android.content.Intent a;
    public static final defpackage.yqm b;
    static final java.util.Map c;
    public final defpackage.ita A;
    private final java.lang.String B;
    private final android.content.ComponentName C;
    private final android.content.ComponentName D;
    private final android.content.ComponentName E;
    private final android.content.ComponentName F;
    private final defpackage.iog G;
    private final defpackage.ikg H;
    private final defpackage.iyc I;
    private final defpackage.xyd J;
    private final defpackage.inm K;
    private final defpackage.inm L;
    private final defpackage.inm M;
    private android.content.ComponentName N;
    private java.util.Queue S;
    private final boolean T;
    private qvu U;
    private boolean W;
    private inz X;
    private android.os.Bundle Y;
    private boolean Z;
    public final android.content.Context d;
    public final defpackage.jfo e;
    public final defpackage.jfa f;
    public final defpackage.ilj g;
    public final defpackage.jfe h;
    public final defpackage.qvl i;
    public final defpackage.iya j;
    public final defpackage.jks k;
    public final defpackage.imk l;
    public final defpackage.irk m;
    public volatile boolean o;
    public defpackage.ioj p;
    java.util.Map s;
    public boolean y;
    public final defpackage.rqm z;
    final defpackage.zd n = new defpackage.zd();
    public final java.util.Set q = new java.util.HashSet();
    public final java.util.Set r = new java.util.HashSet();
    private final java.util.Set O = new java.util.HashSet();
    private final java.util.Set P = new java.util.HashSet();
    private final android.os.Handler Q = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
    private int R = 0;
    public final java.util.Map t = new java.util.HashMap();
    public final java.util.Map u = new java.util.HashMap();
    defpackage.iwd v = defpackage.iwd.d;
    private final java.util.Queue V = new java.util.ArrayDeque();
    public final java.lang.Object w = new java.lang.Object();
    public final java.util.Map x = new defpackage.zd();

    static {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        a = intent;
        b = defpackage.yqm.c("CAR.CAM");
        intent.addCategory("android.intent.category.HOME");
        c = new java.util.HashMap();
    }

    public ioh(defpackage.iog iogVar, android.content.Context context, defpackage.jfo jfoVar, defpackage.ikg ikgVar, defpackage.jfa jfaVar, defpackage.iyc iycVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, defpackage.qvl qvlVar, defpackage.iya iyaVar, defpackage.xyd xydVar, defpackage.inm inmVar, defpackage.inm inmVar2, defpackage.inm inmVar3, boolean z, defpackage.jks jksVar, defpackage.imk imkVar, defpackage.rqm rqmVar, defpackage.ita itaVar, defpackage.irk irkVar) {
        defpackage.ikk ikkVar = null;
        this.G = iogVar;
        this.d = context;
        this.e = jfoVar;
        this.H = ikgVar;
        this.f = jfaVar;
        this.I = iycVar;
        this.g = iljVar;
        this.h = jfeVar;
        this.i = qvlVar;
        this.j = iyaVar;
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            inmVar.getClass();
        }
        this.K = inmVar;
        this.L = inmVar2;
        this.M = inmVar3;
        this.T = z;
        this.J = xydVar;
        this.k = jksVar;
        this.l = imkVar;
        this.z = rqmVar;
        this.A = itaVar;
        this.m = irkVar;
        java.lang.String strC = defpackage.ill.c(context);
        this.B = strC;
        a.setPackage(strC);
        android.content.ComponentName componentName = new android.content.ComponentName(strC, "com.google.android.projection.gearhead.input.RotaryInputMethodService");
        this.D = componentName;
        android.content.ComponentName componentName2 = new android.content.ComponentName(strC, "com.google.android.projection.gearhead.input.TouchInputMethodService");
        this.E = componentName2;
        this.C = new android.content.ComponentName(strC, "com.google.android.projection.gearhead.media.MediaService");
        this.F = new android.content.ComponentName(strC, "com.google.android.projection.gearhead.telecom.TelecomService");
        this.o = true;
        if (jfeVar.h() == 0) {
            android.content.ComponentName componentName3 = ((defpackage.imi) iogVar).L;
            if (componentName3 != null) {
                componentName2 = componentName3;
            }
        } else {
            com.google.android.gms.car.CarUiInfo carUiInfoV = ((defpackage.imi) jfaVar).v(true);
            carUiInfoV.getClass();
            componentName = carUiInfoV.b ? componentName2 : componentName;
            android.content.Intent intent = new android.content.Intent("com.google.android.gms.car.BIND_CAR_INPUT");
            intent.setComponent(componentName);
            if (iycVar.d(intent.cloneFilter()).isEmpty()) {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 664)).y("Unable to find the IME component %s through CarProjectionValidator", componentName);
                componentName2 = null;
            } else {
                defpackage.yqm yqmVar = b;
                ((defpackage.yqj) yqmVar.l().ai((char) 662)).u("Found matching IME component");
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 663)).y("Using IME component %s", componentName);
                componentName2 = componentName;
            }
        }
        if (componentName2 != null) {
            defpackage.sqf sqfVarA = defpackage.sqf.a();
            defpackage.ivc ivcVarP = ((defpackage.imi) ikgVar).p();
            if (ivcVarP == null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai((char) 316)).u("Display is null, so returning null CarInputService");
            } else {
                ikkVar = ivcVarP.q;
            }
            this.p = new defpackage.iol(context, componentName2, sqfVarA, ikkVar.g());
        }
        ((defpackage.jfp) jfoVar).f.add(new defpackage.epv());
    }

    public static void R(defpackage.inn innVar) {
        ((defpackage.inh) innVar.y).R(innVar.d(), innVar.w, innVar.x, true, true, false, null);
    }

    private final defpackage.yhx aA(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.yhv yhvVar = new defpackage.yhv();
        for (com.google.android.gms.car.display.CarRegionId carRegionId : this.t.keySet()) {
            if (carRegionId.h.equals(carDisplayId)) {
                yhvVar.c(carRegionId);
            }
        }
        return yhvVar.g();
    }

    private final java.util.List aB(android.content.Intent intent) {
        return this.I.d(intent);
    }

    private final void aC(com.google.android.gms.car.display.CarRegionId carRegionId, com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig) {
        this.t.put(carRegionId, new defpackage.inv(this, new defpackage.fbk(carActivityRegionLayoutConfig, new defpackage.imx(this, carActivityRegionLayoutConfig.b, carRegionId, 2, (char[]) null))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aD(java.lang.String str, com.google.android.gms.car.display.CarRegionId carRegionId) {
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(666)).M("fallbackToDefaultComponent(). Reason: %s, region: %s", str, carRegionId);
        android.util.Pair pairAx = ax(carRegionId);
        android.content.ComponentName componentName = (android.content.ComponentName) pairAx.first;
        com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) pairAx.second;
        defpackage.ioi ioiVar = (defpackage.ioi) this.n.get(componentName);
        if (ioiVar == null || ioiVar.c() == null || (defpackage.acpa.h() && ioiVar.c().s == null)) {
            at(new android.content.Intent().setComponent(componentName), carRegionId2);
            return;
        }
        defpackage.inn innVarC = ioiVar.c();
        defpackage.inv invVarG = g(carRegionId2);
        defpackage.inn innVar = invVarG.e;
        invVarG.e = innVarC;
        s(innVarC);
        innVarC.w(new defpackage.ioa(innVarC.s, innVarC, true, new defpackage.jiu(null, null, null, null)));
    }

    private final void aE(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.inu inuVarF = f(carDisplayId);
        java.util.List<iod> list = inuVarF.h;
        if (list.isEmpty()) {
            return;
        }
        if (!inuVarF.c) {
            ((defpackage.yqj) b.l().ai((char) 669)).u("Cannot flush search keys without video focus");
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (iod iodVar : list) {
            long j = iodVar.a;
            if (2500 + j > jElapsedRealtime) {
                E(carDisplayId, iodVar.b, iodVar.c, iodVar.d, j$.time.Duration.ofMillis(j));
            }
        }
        list.clear();
    }

    private final void aF(xlf xlfVar, com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        com.google.android.gms.car.display.CarRegionId carRegionId = new com.google.android.gms.car.display.CarRegionId(0, carDisplayId);
        android.content.ComponentName componentName = ((defpackage.imi) this.G).M;
        if (componentName != null) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 678)).y("Using app key override %s", componentName);
        } else {
            int i = xlfVar.c;
            if (i != 3) {
                if (i != 65540) {
                    ((defpackage.yqj) b.l().ai((char) 675)).u("Not an app key.");
                } else {
                    ((defpackage.yqj) b.l().ai((char) 677)).u("Got keycode for tel.");
                    if (!defpackage.acpa.k()) {
                        componentName = this.F;
                    }
                }
                componentName = null;
            } else {
                ((defpackage.yqj) b.l().ai((char) 676)).u("Got keycode for home.");
                componentName = (android.content.ComponentName) ax(carRegionId).first;
            }
        }
        android.content.Intent component = new android.content.Intent().setComponent(componentName);
        if (componentName != null) {
            at(component, carRegionId);
        }
    }

    private final void aG(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (g(carRegionId).g) {
            return;
        }
        if (!f(carRegionId.h).b) {
            ((defpackage.yqj) b.l().ai((char) 703)).y("Waiting for video focus to pre-warm %s", carRegionId);
            return;
        }
        if (!this.Z) {
            ((defpackage.yqj) b.l().ai((char) 702)).y("Not ready to start pre-warms for %s", carRegionId);
            return;
        }
        long jB = defpackage.acvt.b();
        if (jB <= 0) {
            K(carRegionId);
        } else {
            defpackage.rbz.i(new defpackage.inq(this, carRegionId, 0), jB);
        }
    }

    private final void aH() {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        for (defpackage.inu inuVar : this.u.values()) {
            if (inuVar.c) {
                i++;
                for (defpackage.inn innVar : inuVar.f.v()) {
                    if (innVar.H()) {
                        hashSet.add(innVar.d);
                    }
                }
            }
        }
        int iJ = (int) defpackage.acsa.a.fF().j();
        defpackage.iwd iwdVar = (iJ != -1 && defpackage.tht.d(new defpackage.ikc(12), defpackage.acsa.p()).filter(new defpackage.ghv(hashSet, 5)).count() >= iJ && defpackage.dmh.K(i)) ? defpackage.iwd.a : defpackage.dmh.K(i) ? defpackage.iwd.b : defpackage.iwd.d;
        if (iwdVar != this.v) {
            ((defpackage.yqj) b.l().ai(707)).M("Updating restriction level from %s to %s", this.v, iwdVar);
            this.v = iwdVar;
            defpackage.ygw ygwVarV = this.k.V();
            int i2 = ((defpackage.ymx) ygwVarV).c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((defpackage.jkr) ygwVarV.get(i3)).V(iwdVar);
            }
        }
    }

    private final void aJ(com.google.android.gms.car.display.CarRegionId carRegionId, android.content.Intent intent) {
        com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = new com.google.android.gms.car.ActivityLaunchInfo(intent, carRegionId);
        aM(new defpackage.inp(activityLaunchInfo, 3), activityLaunchInfo);
    }

    private final void aK(defpackage.iob iobVar, java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set<qvr> set = this.r;
        set.size();
        for (qvr qvrVar : set) {
            if (!aX(qvrVar, iobVar, obj)) {
                arrayList.add(qvrVar);
            }
        }
        set.removeAll(arrayList);
    }

    private final void aL(com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<defpackage.rqb> set = this.O;
        for (defpackage.rqb rqbVar : set) {
            if (!aY(rqbVar, carDisplayLayoutConfig.a, carDisplayLayoutConfig.b)) {
                hashSet.add(rqbVar);
            }
        }
        set.removeAll(hashSet);
    }

    private final void aM(defpackage.iob iobVar, com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (qvo qvoVar : this.P) {
            try {
                iobVar.a(qvoVar);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.f()).p(e)).ai((char) 711)).y("Error calling lifecycle listener with %s. Listener will be removed.", activityLaunchInfo);
                arrayList.add(qvoVar);
            }
        }
        this.P.removeAll(arrayList);
    }

    private final void aN(defpackage.inn innVar) {
        defpackage.iof iofVar = innVar.s;
        if (iofVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 712)).y("Attempting to notify that %s was destroyed before it was resumed", innVar);
            return;
        }
        com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = new com.google.android.gms.car.ActivityLaunchInfo(iofVar.c, innVar.z);
        aM(new defpackage.inp(activityLaunchInfo, 1), activityLaunchInfo);
    }

    private final void aO(defpackage.inn innVar) {
        android.content.Intent intent = innVar.s.c;
        com.google.android.gms.car.display.CarRegionId carRegionId = innVar.z;
        com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = new com.google.android.gms.car.ActivityLaunchInfo(intent, carRegionId);
        aM(new defpackage.ins(activityLaunchInfo, 0), activityLaunchInfo);
        if (this.l.d(carRegionId)) {
            aK(new defpackage.inp(intent, 2), intent);
        }
    }

    private final void aP(defpackage.inn innVar, boolean z) {
        boolean z2;
        com.google.android.gms.car.display.CarRegionId carRegionId = innVar.z;
        defpackage.inv invVarG = g(carRegionId);
        if (invVarG.j.f(innVar)) {
            be(invVarG);
        }
        if (z) {
            innVar.y(null);
        }
        defpackage.inu inuVarF = f(carRegionId.h);
        if (inuVarF.c) {
            return;
        }
        java.util.Set set = inuVarF.a;
        java.util.Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (carRegionId.equals(((defpackage.inn) it.next()).z)) {
                z2 = true;
                break;
            }
        }
        boolean z3 = inuVarF.e;
        if (z2 || z3) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 725)).y("saving failed-to-resume client to restore on video focus gain: %s", innVar.d.getShortClassName());
        set.add(innVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.lang.Runnable] */
    private final void aQ(defpackage.inn innVar) {
        innVar.c.d();
        defpackage.inv invVarG = g(innVar.z);
        int i = invVarG.d;
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 771)).w("Default component crash #%d", i);
        if (i > 7) {
            this.N = new android.content.ComponentName(this.d, (java.lang.Class<?>) defpackage.iop.class);
            bf(new java.util.ArrayList(), new android.content.Intent().setComponent(this.N), null, 1);
        } else {
            long j = ((long) (i - 2)) * 2500;
            if (j < 0) {
                j = 0;
            }
            this.Q.postDelayed(invVarG.q.a, j);
        }
    }

    private final void aR(defpackage.inn innVar) {
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) b.f()).ai(775);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(innVar.b());
        android.content.ComponentName componentName = innVar.d;
        defpackage.ioi ioiVar = innVar.c;
        yqjVar.R("Starting %s from history, task:%s, layer:%d", componentName, ioiVar, numValueOf);
        defpackage.iof iofVar = innVar.s;
        iofVar.getClass();
        android.content.Intent intentAddFlags = iofVar.c.addFlags(1048576);
        defpackage.qrh qrhVar = new defpackage.qrh();
        qrhVar.e = innVar.z;
        ba(intentAddFlags, qrhVar.a(), ioiVar, innVar.b());
    }

    private final synchronized void aS(android.content.Intent intent, android.os.Bundle bundle, defpackage.ioi ioiVar, int i) throws java.lang.Throwable {
        try {
            try {
                defpackage.ill.d();
                bb(aB(intent), intent, bundle, ioiVar, i, true);
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final void aT(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.inv invVarG = g(carRegionId);
        defpackage.inn innVar = invVarG.e;
        if (innVar != null) {
            innVar.y(null);
        }
        invVarG.b = null;
        java.util.Set set = f(carRegionId.h).a;
        for (defpackage.inn innVar2 : new java.util.HashSet(set)) {
            com.google.android.gms.car.display.CarRegionId carRegionId2 = innVar2.z;
            if (carRegionId2.equals(carRegionId)) {
                set.remove(innVar2);
                android.content.Intent intent = innVar2.t;
                if (intent != null) {
                    ep$.ExternalSyntheticApiModelOutline1.m(intent, 4);
                    innVar2.D();
                    aJ(carRegionId2, intent);
                }
            }
        }
        invVarG.a();
    }

    private final boolean aU() {
        return this.t.containsKey(com.google.android.gms.car.display.CarRegionId.c);
    }

    private final boolean aV(android.content.Intent intent) {
        return aU() && intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.VOICEPLATE_2_ENABLED", false);
    }

    private final boolean aW(android.content.Intent intent) {
        ((defpackage.yqj) b.l().ai((char) 697)).y("Sending %s to be processed", intent);
        qvu qvuVar = this.U;
        if (qvuVar != null) {
            try {
                qvuVar.e(intent);
                return true;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai(698)).M("Remote exception with %s, queuing intent %s", this.U, intent);
                this.U = null;
            }
        }
        return false;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private static boolean aX(qvr qvrVar, defpackage.iob iobVar, java.lang.Object obj) {
        try {
            iobVar.a(qvrVar);
            return true;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.f()).p(e)).ai((char) 708)).y("Error calling ICarActivityStartListener with: %s. Listener will be removed.", obj);
            return false;
        }
    }

    private static boolean aY(defpackage.rqb rqbVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, java.lang.String str) {
        try {
            rqbVar.e(str, carDisplayId);
            return true;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.f()).p(e)).ai(710)).M("Error calling onDisplayLayoutUpdateComplete for %s with: %s", carDisplayId, str);
            return false;
        }
    }

    private final boolean aZ(defpackage.inn innVar) {
        defpackage.inv invVarG = g(innVar.z);
        if (innVar != invVarG.n) {
            return false;
        }
        invVarG.n = null;
        defpackage.rcm.f(invVarG.m);
        return true;
    }

    public static boolean am(android.content.Intent intent) {
        return intent != null && intent.getBooleanExtra("assistant_activity", false) && intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", false);
    }

    private final android.content.ComponentName aw(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).b.getComponent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final android.util.Pair ax(com.google.android.gms.car.display.CarRegionId carRegionId) {
        android.content.ComponentName componentNameAw = aw(carRegionId);
        if (componentNameAw == null) {
            defpackage.ygw ygwVarB = this.l.b(carRegionId);
            int size = ygwVarB.size();
            int i = 0;
            while (i < size) {
                com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i);
                android.content.ComponentName componentNameAw2 = aw(carRegionId2);
                i++;
                if (componentNameAw2 != null) {
                    carRegionId = carRegionId2;
                    componentNameAw = componentNameAw2;
                    break;
                }
            }
        }
        return android.util.Pair.create(componentNameAw, carRegionId);
    }

    private final com.google.android.gms.car.display.CarRegionId ay(android.os.Bundle bundle, android.content.Intent intent) {
        return bundle == null ? l(intent) : (com.google.android.gms.car.display.CarRegionId) new defpackage.nub(new defpackage.qrh(bundle).e).i(l(intent));
    }

    private final com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig az(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean ba(android.content.Intent intent, android.os.Bundle bundle, defpackage.ioi ioiVar, int i) {
        defpackage.ill.d();
        return bb(aB(intent), intent, bundle, ioiVar, i, false);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0339 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0346 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x034c A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0356 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0391 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x03a1 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03a9 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x03bc A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x011f A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x014f A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0158  */
    /* JADX WARN: Code duplicated, block: B:43:0x0175 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0183 A[Catch: all -> 0x0436, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ab A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bd A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fe A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0212  */
    /* JADX WARN: Code duplicated, block: B:62:0x0213 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0219  */
    /* JADX WARN: Code duplicated, block: B:65:0x021c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0233 A[Catch: all -> 0x0436, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:9:0x001f, B:17:0x0051, B:19:0x008b, B:21:0x0093, B:24:0x00b7, B:26:0x00ec, B:28:0x00f7, B:72:0x0243, B:74:0x0256, B:75:0x025e, B:77:0x029a, B:78:0x02ab, B:88:0x02e1, B:89:0x02e2, B:139:0x03ce, B:140:0x03d7, B:151:0x042d, B:92:0x02ef, B:94:0x02f5, B:97:0x0301, B:100:0x0308, B:102:0x0312, B:104:0x0316, B:106:0x0324, B:108:0x032c, B:109:0x0339, B:111:0x0341, B:123:0x0367, B:125:0x0375, B:127:0x037d, B:114:0x0346, B:116:0x034c, B:118:0x0356, B:121:0x035d, B:128:0x0389, B:130:0x0391, B:131:0x0393, B:133:0x03a1, B:135:0x03a9, B:136:0x03b4, B:138:0x03bc, B:29:0x00fe, B:31:0x011f, B:33:0x0123, B:36:0x012e, B:38:0x014f, B:40:0x015a, B:41:0x0161, B:43:0x0175, B:45:0x017c, B:48:0x0183, B:50:0x01ab, B:52:0x01bd, B:53:0x01cd, B:55:0x01d8, B:56:0x01f2, B:58:0x01fe, B:59:0x020a, B:67:0x0221, B:69:0x0233, B:71:0x023e, B:62:0x0213, B:66:0x021e, B:152:0x042e, B:153:0x0435, B:12:0x003c, B:14:0x0044, B:16:0x004a, B:141:0x03d8, B:143:0x03e2, B:145:0x0421, B:146:0x0428, B:144:0x0404, B:79:0x02ac, B:81:0x02b8, B:83:0x02bb, B:84:0x02dc), top: B:157:0x000b, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x023c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.lang.Runnable] */
    private final synchronized boolean bb(java.util.List list, android.content.Intent intent, android.os.Bundle bundle, defpackage.ioi ioiVar, int i, boolean z) {
        j$.util.Optional optionalFindFirst;
        int i2;
        java.lang.String shortClassName;
        j$.util.Optional optionalOfNullable;
        defpackage.qru qruVar;
        defpackage.imv imvVar;
        android.content.ComponentName componentName;
        android.content.ComponentName component;
        java.lang.String shortClassName2;
        java.lang.String shortClassName3;
        android.content.ComponentName component2;
        defpackage.ino inoVar;
        android.content.ComponentName component3;
        defpackage.yhe yheVar;
        defpackage.ioi ioiVar2 = ioiVar;
        int i3 = i;
        synchronized (this) {
            if (!this.o) {
                ((defpackage.yqj) b.l().ai((char) 781)).y("startActivityManager for %s when not connected, ignoring.", intent.getComponent());
                return false;
            }
            defpackage.yqm yqmVar = b;
            ((defpackage.yqj) yqmVar.l().ai((char) 776)).y("Starting activity manager for %s", intent.getComponent());
            int i4 = 1;
            defpackage.ysr.bk(!this.t.isEmpty(), "startActivityManager when not configured");
            if (intent != null && intent.getBooleanExtra("assistant_activity", false) && !aV(intent)) {
                intent.putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 36);
            }
            defpackage.ioe ioeVar = new defpackage.ioe();
            ioeVar.j(1);
            ioeVar.b(32);
            ioeVar.k(0);
            ioeVar.e = com.google.android.gms.car.display.CarRegionId.a;
            ioeVar.f = new android.graphics.Rect();
            ioeVar.i(new android.graphics.Rect());
            ioeVar.e(new android.graphics.Rect());
            ioeVar.h(1);
            ioeVar.g(0);
            ioeVar.j(i3);
            ioeVar.d = ioiVar2;
            ioeVar.c = bundle;
            if (intent == null) {
                throw new java.lang.NullPointerException("Null intent");
            }
            ioeVar.b = intent;
            if (defpackage.a.O()) {
                j$.util.Optional optionalFindFirst2 = j$.util.Collection.-EL.stream(list).map(new defpackage.ikc(8)).filter(new defpackage.hmj(3)).findFirst();
                if (optionalFindFirst2.isEmpty()) {
                    optionalFindFirst = j$.util.Collection.-EL.stream(list).map(new defpackage.ilz(4)).filter(new defpackage.iux(i4)).findFirst();
                    if (optionalFindFirst.isEmpty()) {
                        componentName = this.N;
                        if (componentName != null && componentName.equals(intent.getComponent())) {
                            ioeVar.f(this.M);
                            ioeVar.d(this.N);
                            intent.setComponent(this.N);
                            defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(778);
                            if (intent.getComponent() != null) {
                                shortClassName3 = intent.getComponent().getShortClassName();
                            } else {
                                shortClassName3 = "null";
                            }
                            yqjVar.y("Matched fallback projection client for %s", shortClassName3);
                        }
                        component = intent.getComponent();
                        defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(777);
                        if (component != null) {
                            shortClassName2 = component.getShortClassName();
                        } else {
                            shortClassName2 = "null";
                        }
                        yqjVar2.y("No matching Projection Clients found for %s", shortClassName2);
                        return false;
                    }
                    android.content.ComponentName componentName2 = new android.content.ComponentName(((android.content.pm.ServiceInfo) optionalFindFirst.get()).packageName, ((android.content.pm.ServiceInfo) optionalFindFirst.get()).name);
                    ioeVar.f(this.L);
                    ioeVar.d(componentName2);
                    intent.setComponent(componentName2);
                    if (defpackage.epv.k(this.d)) {
                        optionalOfNullable = j$.util.Optional.ofNullable(((android.content.pm.ServiceInfo) optionalFindFirst.get()).metaData);
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = j$.util.Optional.ofNullable(((android.os.Bundle) optionalOfNullable.get()).getString("com.google.android.projection.gearhead.GHOST_ACTIVITY"));
                        }
                        qruVar = new defpackage.qru(optionalFindFirst, 1);
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = j$.util.Optional.ofNullable(android.content.ComponentName.createRelative(((android.content.pm.ServiceInfo) ((j$.util.Optional) qruVar.a).get()).packageName, (java.lang.String) optionalOfNullable.get()));
                        }
                        imvVar = new defpackage.imv(ioeVar, 2);
                        if (true == optionalOfNullable.isPresent()) {
                            ((defpackage.ioe) imvVar.a).a = (android.content.ComponentName) optionalOfNullable.get();
                        }
                    }
                    if (intent.getBooleanExtra("assistant_activity", false)) {
                        if (true != defpackage.sqs.e()) {
                            i2 = 64;
                        } else {
                            i2 = 4160;
                        }
                        ioeVar.b(i2);
                    }
                    defpackage.yqj yqjVar3 = (defpackage.yqj) yqmVar.l().ai(779);
                    if (intent.getComponent() != null) {
                        shortClassName = intent.getComponent().getShortClassName();
                    } else {
                        shortClassName = "null";
                    }
                    yqjVar3.y("Matched service projection client for %s", shortClassName);
                } else {
                    android.content.ComponentName componentName3 = new android.content.ComponentName(((android.content.pm.ActivityInfo) optionalFindFirst2.get()).packageName, ((android.content.pm.ActivityInfo) optionalFindFirst2.get()).name);
                    defpackage.inm inmVar = this.K;
                    inmVar.getClass();
                    ioeVar.f(inmVar);
                    ioeVar.d(componentName3);
                    intent.setComponent(componentName3);
                    ((defpackage.yqj) yqmVar.l().ai(780)).y("Matched activity projection client for %s", intent.getComponent() != null ? intent.getComponent().getShortClassName() : "null");
                }
            } else {
                optionalFindFirst = j$.util.Collection.-EL.stream(list).map(new defpackage.ilz(4)).filter(new defpackage.iux(i4)).findFirst();
                if (optionalFindFirst.isEmpty()) {
                    componentName = this.N;
                    if (componentName != null) {
                        ioeVar.f(this.M);
                        ioeVar.d(this.N);
                        intent.setComponent(this.N);
                        defpackage.yqj yqjVar4 = (defpackage.yqj) yqmVar.l().ai(778);
                        if (intent.getComponent() != null) {
                            shortClassName3 = intent.getComponent().getShortClassName();
                        } else {
                            shortClassName3 = "null";
                        }
                        yqjVar4.y("Matched fallback projection client for %s", shortClassName3);
                    }
                    component = intent.getComponent();
                    defpackage.yqj yqjVar5 = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(777);
                    if (component != null) {
                        shortClassName2 = component.getShortClassName();
                    } else {
                        shortClassName2 = "null";
                    }
                    yqjVar5.y("No matching Projection Clients found for %s", shortClassName2);
                    return false;
                }
                android.content.ComponentName componentName4 = new android.content.ComponentName(((android.content.pm.ServiceInfo) optionalFindFirst.get()).packageName, ((android.content.pm.ServiceInfo) optionalFindFirst.get()).name);
                ioeVar.f(this.L);
                ioeVar.d(componentName4);
                intent.setComponent(componentName4);
                if (defpackage.epv.k(this.d)) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((android.content.pm.ServiceInfo) optionalFindFirst.get()).metaData);
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable(((android.os.Bundle) optionalOfNullable.get()).getString("com.google.android.projection.gearhead.GHOST_ACTIVITY"));
                    }
                    qruVar = new defpackage.qru(optionalFindFirst, 1);
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable(android.content.ComponentName.createRelative(((android.content.pm.ServiceInfo) ((j$.util.Optional) qruVar.a).get()).packageName, (java.lang.String) optionalOfNullable.get()));
                    }
                    imvVar = new defpackage.imv(ioeVar, 2);
                    if (true == optionalOfNullable.isPresent()) {
                        ((defpackage.ioe) imvVar.a).a = (android.content.ComponentName) optionalOfNullable.get();
                    }
                }
                if (intent.getBooleanExtra("assistant_activity", false)) {
                    if (true != defpackage.sqs.e()) {
                        i2 = 64;
                    } else {
                        i2 = 4160;
                    }
                    ioeVar.b(i2);
                }
                defpackage.yqj yqjVar6 = (defpackage.yqj) yqmVar.l().ai(779);
                if (intent.getComponent() != null) {
                    shortClassName = intent.getComponent().getShortClassName();
                } else {
                    shortClassName = "null";
                }
                yqjVar6.y("Matched service projection client for %s", shortClassName);
            }
            com.google.android.gms.car.display.CarRegionId carRegionIdAy = ay(bundle, intent);
            ioeVar.e = carRegionIdAy;
            defpackage.inv invVarG = g(carRegionIdAy);
            ioeVar.i(invVarG.i);
            defpackage.fbk fbkVar = invVarG.q;
            if (i3 == 1) {
                this.Q.removeCallbacks(fbkVar.a);
                i3 = 1;
            }
            com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) fbkVar.b).d;
            int i5 = carActivityLayoutParams.c;
            int i6 = carActivityLayoutParams.d;
            ioeVar.f = new android.graphics.Rect(i5, i6, carActivityLayoutParams.a + i5, carActivityLayoutParams.b + i6);
            ioeVar.e(carActivityLayoutParams.l);
            ioeVar.h(carActivityLayoutParams.j);
            ioeVar.g(carActivityLayoutParams.k);
            ioeVar.k(carActivityLayoutParams.e);
            com.google.android.gms.car.display.CarDisplayId carDisplayId = carRegionIdAy.h;
            ioeVar.c(f(carDisplayId).l);
            defpackage.iof iofVarA = ioeVar.a();
            if (z) {
                defpackage.iny inyVar = invVarG.j;
                com.google.android.gms.car.display.CarRegionId carRegionId = iofVarA.i;
                defpackage.ysr.aY(carRegionId.equals(inyVar.l), "Trying to pre-warm client on wrong ClientConnectionThread");
                synchronized (inyVar.f) {
                    android.content.ComponentName componentName5 = iofVarA.a;
                    java.util.Map map = inyVar.d;
                    if (((defpackage.inx) map.get(componentName5)) == null) {
                        map.put(componentName5, new defpackage.inx(inyVar, iofVarA, i3, carRegionId, true));
                        inyVar.c.add(componentName5);
                        inyVar.e.release();
                    }
                }
                return true;
            }
            int i7 = i3;
            if (!am(intent)) {
                defpackage.ioi ioiVar3 = ioiVar2 == null ? (defpackage.ioi) this.n.get(intent.getComponent()) : ioiVar2;
                if (ioiVar3 == null || ioiVar3.b() == null) {
                    if (intent.getBooleanExtra("assistant_activity", false) || !this.W) {
                        component2 = intent.getComponent();
                        if (ioiVar2 == null) {
                            ioiVar2 = (defpackage.ioi) this.n.get(component2);
                        }
                        if (ioiVar2 != null || ioiVar2.b() == null || ioiVar2.b().C()) {
                            if (intent.getBooleanExtra("assistant_activity", false)) {
                                this.W = true;
                            }
                            inoVar = defpackage.ino.l;
                            component3 = intent.getComponent();
                            if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                                yheVar = defpackage.ino.b;
                                if (yheVar.containsKey(component3)) {
                                    defpackage.tgg.a.b((defpackage.tgf) yheVar.get(component3));
                                }
                                if (inoVar.n.containsKey(component3)) {
                                    defpackage.tgg.a.b((defpackage.tgf) inoVar.n.get(component3));
                                    inoVar.n.remove(component3);
                                }
                            }
                        }
                    }
                    defpackage.yhe yheVar2 = defpackage.ino.b;
                    android.content.ComponentName component4 = intent.getComponent();
                    if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                        defpackage.yhe yheVar3 = defpackage.ino.c;
                        if (yheVar3.containsKey(component4)) {
                            defpackage.tgg.a.b((defpackage.tgf) yheVar3.get(component4));
                        }
                    }
                } else {
                    defpackage.inn innVarB = ioiVar3.b();
                    if (innVarB.C() && !innVarB.C) {
                        defpackage.yhe yheVar4 = defpackage.ino.b;
                        android.content.ComponentName component5 = intent.getComponent();
                        if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                            defpackage.yhe yheVar5 = defpackage.ino.d;
                            if (yheVar5.containsKey(component5)) {
                                defpackage.tgg.a.b((defpackage.tgf) yheVar5.get(component5));
                            }
                        }
                    } else if (intent.getBooleanExtra("assistant_activity", false)) {
                        component2 = intent.getComponent();
                        if (ioiVar2 == null) {
                            ioiVar2 = (defpackage.ioi) this.n.get(component2);
                        }
                        if (ioiVar2 != null) {
                        }
                        if (intent.getBooleanExtra("assistant_activity", false)) {
                            this.W = true;
                        }
                        inoVar = defpackage.ino.l;
                        component3 = intent.getComponent();
                        if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                            yheVar = defpackage.ino.b;
                            if (yheVar.containsKey(component3)) {
                                defpackage.tgg.a.b((defpackage.tgf) yheVar.get(component3));
                            }
                            if (inoVar.n.containsKey(component3)) {
                                defpackage.tgg.a.b((defpackage.tgf) inoVar.n.get(component3));
                                inoVar.n.remove(component3);
                            }
                        }
                    } else {
                        component2 = intent.getComponent();
                        if (ioiVar2 == null) {
                            ioiVar2 = (defpackage.ioi) this.n.get(component2);
                        }
                        if (ioiVar2 != null) {
                        }
                        if (intent.getBooleanExtra("assistant_activity", false)) {
                            this.W = true;
                        }
                        inoVar = defpackage.ino.l;
                        component3 = intent.getComponent();
                        if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                            yheVar = defpackage.ino.b;
                            if (yheVar.containsKey(component3)) {
                                defpackage.tgg.a.b((defpackage.tgf) yheVar.get(component3));
                            }
                            if (inoVar.n.containsKey(component3)) {
                                defpackage.tgg.a.b((defpackage.tgf) inoVar.n.get(component3));
                                inoVar.n.remove(component3);
                            }
                        }
                    }
                }
            }
            defpackage.iny inyVar2 = invVarG.j;
            defpackage.ill.d();
            com.google.android.gms.car.display.CarRegionId carRegionId2 = iofVarA.i;
            synchronized (inyVar2.f) {
                java.util.Map map2 = inyVar2.a;
                defpackage.inx inxVar = (defpackage.inx) map2.get(carRegionId2);
                if (inxVar == null) {
                    map2.put(carRegionId2, new defpackage.inx(inyVar2, iofVarA, i7, carRegionId2, false));
                    inyVar2.b.add(carRegionId2);
                    inyVar2.e.release();
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(646)).M("Overriding start of %s in favor of %s", inxVar.b, iofVarA.a);
                    inxVar.b = iofVarA;
                    inxVar.d = carRegionId2;
                    inxVar.c = i7;
                }
                inyVar2.i = true;
                inyVar2.m.q(carRegionId2);
            }
            return true;
        }
    }

    private static final void bc(defpackage.inn innVar, boolean z) {
        if (z) {
            return;
        }
        boolean z2 = false;
        if (innVar.p && !innVar.q) {
            z2 = true;
        }
        defpackage.jkr jkrVar = innVar.y;
        defpackage.inh inhVar = (defpackage.inh) jkrVar;
        inhVar.R(innVar.d(), innVar.w, innVar.x, true, true, z2, null);
    }

    private static final void bd(defpackage.inu inuVar, android.content.res.Configuration configuration, int i) {
        java.util.Iterator it = inuVar.f.v().iterator();
        while (it.hasNext()) {
            ((defpackage.inn) it.next()).r(configuration, i);
        }
    }

    private static final void be(defpackage.inv invVar) {
        java.lang.Runnable runnable = invVar.o;
        if (runnable != null) {
            ((defpackage.yqj) b.l().ai(756)).y("Posting resumeThenStopRunnable for %s", invVar.a);
            new defpackage.stq(android.os.Looper.getMainLooper()).post(runnable);
            invVar.o = null;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final synchronized void bf(java.util.List list, android.content.Intent intent, android.os.Bundle bundle, int i) {
        bb(list, intent, bundle, null, i, false);
    }

    public final synchronized void A(defpackage.inn innVar) {
        defpackage.ill.d();
        com.google.android.gms.car.display.CarRegionId carRegionId = innVar.z;
        ((defpackage.yqj) b.l().ai((char) 735)).y("Not releasing the ClientConnectionSemaphore for stop. wasConnecting: %b", java.lang.Boolean.valueOf(g(carRegionId).j.e(innVar)));
        bc(innVar, aZ(innVar));
        defpackage.iof iofVar = innVar.s;
        if (iofVar != null) {
            boolean z = innVar.p;
            android.content.Intent intent = iofVar.c;
            if (z) {
                intent.addFlags(4);
            } else {
                ep$.ExternalSyntheticApiModelOutline1.m(intent, 4);
            }
            innVar.D();
            aJ(carRegionId, intent);
        }
        defpackage.ioj iojVar = this.p;
        if (iojVar != null) {
            iojVar.d(innVar);
        }
    }

    public final synchronized void B(com.google.android.gms.car.display.CarDisplayId carDisplayId, android.content.res.Configuration configuration, int i) {
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai(737)).R("onConfigurationChanged(%s, %s, %d) called while not connected, ignoring.", carDisplayId, configuration, java.lang.Integer.valueOf(i));
            return;
        }
        defpackage.ill.d();
        int i2 = i & 519;
        if (i2 != 0) {
            if (carDisplayId != null) {
                bd(f(carDisplayId), configuration, i2);
            } else {
                java.util.Iterator it = this.u.values().iterator();
                while (it.hasNext()) {
                    bd((defpackage.inu) it.next(), configuration, i2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void C(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 739)).y("onFocusGained(%s) called while not connected, ignoring.", carDisplayId);
            return;
        }
        defpackage.inu inuVarF = f(carDisplayId);
        boolean z = inuVarF.b;
        if (!z) {
            inuVarF.b = true;
        }
        inuVarF.c = true;
        inuVarF.e = false;
        if (inuVarF.d) {
            defpackage.inn innVar = null;
            for (defpackage.inn innVar2 : f(carDisplayId).f.v()) {
                if (innVar2.H()) {
                    if (innVar2.z.equals(f(carDisplayId).k)) {
                        innVar = innVar2;
                    } else {
                        innVar2.t();
                    }
                }
            }
            if (innVar != null) {
                innVar.t();
            }
        } else {
            if (this.p != null && com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
                this.p.a(true);
            }
            defpackage.inn innVar3 = null;
            for (defpackage.inn innVar4 : f(carDisplayId).a) {
                if (innVar4 != null) {
                    if (innVar4.z.equals(f(carDisplayId).k)) {
                        innVar3 = innVar4;
                    } else {
                        aR(innVar4);
                    }
                }
            }
            if (innVar3 != null) {
                aR(innVar3);
            }
        }
        defpackage.yot it = aA(carDisplayId).iterator();
        while (it.hasNext()) {
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) it.next();
            defpackage.inv invVarG = g(carRegionId);
            if (invVarG.c != null) {
                if (invVarG.b == null) {
                    ((defpackage.yqj) ((defpackage.yqj) b.f()).ai(792)).y("Starting pending intent %s", invVarG.c);
                    android.content.Intent intent = invVarG.c;
                    com.google.android.gms.car.display.CarRegionId carRegionId2 = invVarG.a;
                    if (!at(intent, carRegionId2) && invVarG.c.getComponent() != null) {
                        aD("Initial activity failed to start", carRegionId2);
                    }
                }
                invVarG.c = null;
            }
            defpackage.iof iofVar = invVarG.b;
            if (iofVar != null) {
                ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 791)).y("Starting pending client %s", iofVar);
                int i = iofVar.g;
                ba(iofVar.c, iofVar.d, iofVar.f, i);
                invVarG.b = null;
            }
            java.util.List<defpackage.iof> list = invVarG.h;
            for (defpackage.iof iofVar2 : list) {
                ((defpackage.yqj) b.l().ai((char) 793)).y("Starting pending pre-warm for %s", iofVar2);
                aS(iofVar2.c, iofVar2.d, iofVar2.f, iofVar2.g);
            }
            list.clear();
            if (!z) {
                aG(carRegionId);
            }
        }
        java.util.List<android.util.Pair> list2 = f(carDisplayId).g;
        if (!list2.isEmpty()) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            for (android.util.Pair pair : list2) {
                if (((java.lang.Long) pair.first).longValue() + 2500 >= jElapsedRealtime || ((defpackage.imi) this.G).M != null) {
                    aF((xlf) pair.second, carDisplayId);
                } else {
                    ((defpackage.yqj) b.l().ai(668)).w("Dropping expired key %d", ((xlf) pair.second).c);
                }
            }
            list2.clear();
        }
        aH();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void D(com.google.android.gms.car.display.CarDisplayId carDisplayId, boolean z) {
        defpackage.ill.d();
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai(740)).N("onFocusLost(%s, %b) called", carDisplayId, z);
        if (!this.o) {
            ((defpackage.yqj) yqmVar.l().ai(742)).N("onFocusLost(%s, %b) called while not connected, ignoring.", carDisplayId, z);
            return;
        }
        for (defpackage.inn innVar : f(carDisplayId).f.v()) {
            if (innVar.H() && innVar.n < 3) {
                z = false;
                break;
            }
        }
        defpackage.inu inuVarF = f(carDisplayId);
        if (z && !inuVarF.c) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(741)).N("onFocusLost(%s, %b) called when video focus is already lost, ignoring.", carDisplayId, true);
            return;
        }
        inuVarF.c = false;
        inuVarF.k = j(carDisplayId).p();
        inuVarF.d = z;
        if (!z) {
            if (this.p != null && com.google.android.gms.car.display.CarDisplayId.b(carDisplayId)) {
                this.p.a(false);
                this.y = false;
            }
            defpackage.inu inuVarF2 = f(carDisplayId);
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.Cu);
            for (defpackage.inn innVar2 : inuVarF2.f.v()) {
                com.google.android.gms.car.display.CarRegionId carRegionId = innVar2.z;
                if (innVar2.H()) {
                    boolean z2 = innVar2.m;
                    innVar2.m = false;
                    if (z2 || !inuVarF2.m.isEmpty()) {
                        innVar2.q = true;
                        innVar2.z();
                        android.content.Intent intent = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).a;
                        if (intent.getComponent() == null) {
                            defpackage.ygw ygwVarB = this.l.b(carRegionId);
                            int size = ygwVarB.size();
                            for (int i = 0; i < size; i++) {
                                android.content.Intent intent2 = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g((com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i)).q.b).a;
                                if (intent2.getComponent() != null) {
                                    intent = intent2;
                                }
                            }
                        }
                        defpackage.ioi ioiVar = (defpackage.ioi) this.n.get(intent.getComponent());
                        if (ioiVar == null) {
                            at(intent, carRegionId);
                        } else {
                            inuVarF2.a.add(ioiVar.c());
                        }
                    } else {
                        innVar2.z();
                        inuVarF2.a.add(innVar2);
                    }
                    rrvVarH.d(innVar2.d);
                }
            }
            inuVarF2.m.clear();
            defpackage.rqt.a(this.d).c(rrvVarH.l());
        }
        defpackage.yot it = aA(carDisplayId).iterator();
        while (it.hasNext()) {
            g((com.google.android.gms.car.display.CarRegionId) it.next()).j.a(true);
        }
        aH();
    }

    public final synchronized void E(com.google.android.gms.car.display.CarDisplayId carDisplayId, xlf xlfVar, int i, int i2, j$.time.Duration duration) {
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(743)).S("Received keycode %s on display %s, flags %s, repeatCount %s", xlfVar == null ? null : java.lang.String.format(java.util.Locale.US, "{keycode:%d, down:%b, metastate:%d, longpress:%b}", java.lang.Integer.valueOf(xlfVar.c), java.lang.Boolean.valueOf(xlfVar.d), java.lang.Integer.valueOf(xlfVar.e), java.lang.Boolean.valueOf(xlfVar.f)), carDisplayId, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        defpackage.ill.d();
        if (this.o) {
            int i3 = xlfVar.c;
            if (i3 != 92 && i3 != 93 && i3 != 122 && i3 != 123) {
                defpackage.inu inuVarF = f(carDisplayId);
                defpackage.jkr jkrVarJ = j(carDisplayId);
                int i4 = xlfVar.c;
                if (i4 == 84) {
                    if (!inuVarF.j || !inuVarF.c) {
                        defpackage.rqt.a(this.d).c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.Cv).l());
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 750)).u("No activity shown on primary region, queuing search request");
                        inuVarF.h.add(new iod(android.os.SystemClock.elapsedRealtime(), xlfVar, i, i2));
                        jkrVarJ.U();
                        return;
                    }
                    i4 = 84;
                }
                if (i4 != 65537 && i4 != 209 && i4 != 84 && i4 != 65538 && i4 != 65540 && i4 != 3 && i4 != 187 && i4 != 65539) {
                    if (i4 >= 65535) {
                        ((defpackage.yqj) yqmVar.l().ai(746)).w("Dropping untranslated key: %d", xlfVar.c);
                        return;
                    }
                    android.view.KeyEvent keyEventH = defpackage.ikk.h(xlfVar, i, i2, duration);
                    ((defpackage.yqj) yqmVar.l().ai(744)).w("Got android key event %d", keyEventH.getKeyCode());
                    int keyCode = keyEventH.getKeyCode();
                    if (keyCode != 222) {
                        switch (keyCode) {
                            default:
                                switch (keyCode) {
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                        break;
                                    default:
                                        int keyCode2 = keyEventH.getKeyCode();
                                        if (keyCode2 != 5 && keyCode2 != 6 && keyCode2 != 91) {
                                            int i5 = carDisplayId.b;
                                            jkrVarJ.ap(keyEventH);
                                            return;
                                        }
                                        ((defpackage.yqj) yqmVar.l().ai(745)).w("Got phone key event %d", keyEventH.getKeyCode());
                                        defpackage.ikr ikrVar = ((defpackage.imi) this.H).u.B;
                                        if (ikrVar != null) {
                                            defpackage.aba abaVar = ikrVar.b;
                                            synchronized (abaVar) {
                                                for (int i6 = 0; i6 < abaVar.d; i6++) {
                                                    try {
                                                        defpackage.ikq ikqVar = (defpackage.ikq) abaVar.g(i6);
                                                        if (ikqVar.b > 0) {
                                                            ikqVar.a.e(keyEventH);
                                                        }
                                                    } catch (android.os.RemoteException e) {
                                                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ikr.a.h()).p(e)).ai(172)).u("Error calling onInput()");
                                                    }
                                                }
                                                break;
                                            }
                                            return;
                                        }
                                        break;
                                }
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                                U(keyEventH);
                                return;
                        }
                    }
                    U(keyEventH);
                    return;
                }
                if (!this.h.bs()) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 749)).u("Ignoring app-keys until car connected");
                    return;
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                defpackage.yhe yheVarQ = defpackage.yhe.q(84, bool, 65538, bool, 65540, java.lang.Boolean.valueOf(defpackage.acpa.k()), 65539, bool, 65537, bool, 209, bool, 187, bool);
                if (yheVarQ.containsKey(java.lang.Integer.valueOf(xlfVar.c)) && ((java.lang.Boolean) yheVarQ.get(java.lang.Integer.valueOf(xlfVar.c))).booleanValue()) {
                    android.view.KeyEvent keyEventH2 = defpackage.ikk.h(xlfVar, i, i2, duration);
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 670)).y("Forwarding %s", keyEventH2);
                    android.content.Intent intent = new android.content.Intent("android.intent.action.projected.KEY_EVENT");
                    intent.setPackage(this.B);
                    intent.putExtra("android.intent.extra.KEY_EVENT", keyEventH2);
                    intent.putExtra("car_display_id", defpackage.sqs.o(carDisplayId));
                    intent.addFlags(268435456);
                    this.d.sendBroadcast(intent);
                    return;
                }
                if (!xlfVar.d) {
                    if (!((defpackage.inh) jkrVarJ).C) {
                        ((defpackage.yqj) yqmVar.l().ai(748)).w("Window manager not compositing, queuing keycode:%d", xlfVar.c);
                        inuVarF.g.add(android.util.Pair.create(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), xlfVar));
                        jkrVarJ.U();
                        return;
                    } else {
                        if (inuVarF.b) {
                            aF(xlfVar, carDisplayId);
                            return;
                        }
                        ((defpackage.yqj) yqmVar.l().ai(747)).w("onKeyEvent called while not started. queuing keycode:%d", xlfVar.c);
                        inuVarF.g.add(android.util.Pair.create(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), xlfVar));
                        jkrVarJ.U();
                        return;
                    }
                }
            }
            ((defpackage.yqj) yqmVar.l().ai(751)).w("Dropping unexpected keycode: %d", xlfVar.c);
        }
    }

    public final synchronized void F(defpackage.inn innVar) {
        if (innVar instanceof defpackage.iop) {
            return;
        }
        aO(innVar);
    }

    public final synchronized void G(com.google.android.gms.car.display.CarDisplayId carDisplayId, android.view.MotionEvent motionEvent) {
        defpackage.ill.d();
        if (this.o) {
            j(carDisplayId).H(motionEvent);
        }
    }

    public final synchronized void H(com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.iyl iylVar) {
        defpackage.aba abaVar;
        try {
            defpackage.ill.d();
            if (this.o) {
                defpackage.jkr jkrVarJ = j(carDisplayId);
                int i = carDisplayId.b;
                defpackage.ill.d();
                ((defpackage.inh) jkrVarJ).A = true;
                if (((defpackage.inh) jkrVarJ).C) {
                    int i2 = 0;
                    if (((defpackage.inh) jkrVarJ).w.d != 1.0f && !((defpackage.inh) jkrVarJ).i) {
                        for (defpackage.iyk iykVar : iylVar.h) {
                            if (((defpackage.inh) jkrVarJ).w.d > 1.0d) {
                                iykVar.e = (int) ((iykVar.e * ((defpackage.inh) jkrVarJ).w.d) + 0.5f);
                            } else if (((defpackage.inh) jkrVarJ).w.d < 1.0d) {
                                iykVar.f = (int) ((iykVar.f * ((defpackage.inh) jkrVarJ).w.e) + 0.5f);
                            }
                        }
                    }
                    if (((defpackage.inh) jkrVarJ).aq.o(iylVar)) {
                        iylVar.b();
                        return;
                    }
                    int i3 = iylVar.e;
                    if (i3 == 0 || i3 == 1) {
                        defpackage.iyk iykVar2 = iylVar.h[0];
                        int i4 = iykVar2.e;
                        int i5 = iykVar2.f;
                        int i6 = iykVar2.g;
                        defpackage.jhl jhlVarN = ((defpackage.inh) jkrVarJ).n(i6, i4, i5);
                        java.util.List listSingletonList = java.util.Collections.singletonList(iykVar2);
                        long j = iylVar.g;
                        if (jhlVarN == null) {
                            ((defpackage.inh) jkrVarJ).am.b(j, i3, listSingletonList);
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).ai(519)).R("UpDown touch event (%s,%s) does not correspond to a window for %s", java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), ((defpackage.inh) jkrVarJ).af);
                        } else {
                            ((defpackage.inh) jkrVarJ).B(jhlVarN, ((defpackage.inh) jkrVarJ).g(jhlVarN, j, i3), j, i3, listSingletonList);
                            if (i3 == 1) {
                                ((defpackage.inh) jkrVarJ).Q(i6);
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                synchronized (((defpackage.inh) jkrVarJ).V) {
                                    android.util.SparseArray sparseArray = ((defpackage.inh) jkrVarJ).W;
                                    int size = sparseArray.size();
                                    while (true) {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                        for (defpackage.jhl jhlVar : (java.util.List) sparseArray.valueAt(size)) {
                                            if (jhlVar != null && jhlVar != jhlVarN && jhlVar.aH()) {
                                                arrayList.add(jhlVar);
                                            }
                                        }
                                    }
                                }
                                int size2 = arrayList.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    ((defpackage.jhl) arrayList.get(i7)).O(j, listSingletonList);
                                }
                            }
                        }
                    } else if (i3 == 2) {
                        defpackage.iyk[] iykVarArr = iylVar.h;
                        if (iykVarArr.length != 1) {
                            int i8 = 0;
                            while (true) {
                                defpackage.iyk[] iykVarArr2 = iylVar.h;
                                if (i8 >= iykVarArr2.length) {
                                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                                    int i9 = 0;
                                    while (true) {
                                        abaVar = ((defpackage.inh) jkrVarJ).R;
                                        if (i9 >= abaVar.d) {
                                            break;
                                        }
                                        defpackage.jhl jhlVar2 = (defpackage.jhl) abaVar.d(i9);
                                        ((defpackage.inh) jkrVarJ).B(jhlVar2, ((defpackage.inh) jkrVarJ).g(jhlVar2, jUptimeMillis, 2), jUptimeMillis, 2, (java.util.ArrayList) abaVar.g(i9));
                                        i9++;
                                    }
                                    abaVar.clear();
                                    break;
                                }
                                defpackage.iyk iykVar3 = iykVarArr2[i8];
                                defpackage.jhl jhlVarN2 = ((defpackage.inh) jkrVarJ).n(iykVar3.g, iykVar3.e, iykVar3.f);
                                if (jhlVarN2 == null) {
                                    break;
                                }
                                defpackage.aba abaVar2 = ((defpackage.inh) jkrVarJ).R;
                                java.util.ArrayList arrayList2 = (java.util.ArrayList) abaVar2.get(jhlVarN2);
                                if (arrayList2 == null) {
                                    arrayList2 = new java.util.ArrayList(2);
                                    abaVar2.put(jhlVarN2, arrayList2);
                                }
                                arrayList2.add(iykVar3);
                                i8++;
                            }
                        } else {
                            defpackage.iyk iykVar4 = iykVarArr[0];
                            defpackage.jhl jhlVarN3 = ((defpackage.inh) jkrVarJ).n(iykVar4.g, iykVar4.e, iykVar4.f);
                            long j2 = iylVar.g;
                            java.util.List listSingletonList2 = java.util.Collections.singletonList(iykVar4);
                            if (jhlVarN3 == null) {
                                ((defpackage.inh) jkrVarJ).am.b(j2, 2, listSingletonList2);
                            } else {
                                ((defpackage.inh) jkrVarJ).B(jhlVarN3, ((defpackage.inh) jkrVarJ).g(jhlVarN3, j2, 2), j2, 2, listSingletonList2);
                            }
                        }
                    } else {
                        int i10 = iylVar.f;
                        defpackage.iyk[] iykVarArr3 = iylVar.h;
                        if (i10 >= iykVarArr3.length) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).ai((char) 518)).w("Touch event's action index out of array %d", i10);
                        } else {
                            defpackage.iyk iykVar5 = iykVarArr3[i10];
                            int i11 = iykVar5.e;
                            int i12 = iykVar5.f;
                            defpackage.jhl jhlVarN4 = ((defpackage.inh) jkrVarJ).n(iykVar5.g, i11, i12);
                            if (jhlVarN4 == null) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).ai(517)).R("PointerUpDown touch event (%s,%s) does not correspond to a window for %s", java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12), ((defpackage.inh) jkrVarJ).af);
                            } else {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                defpackage.iyk[] iykVarArr4 = iylVar.h;
                                int length = iykVarArr4.length;
                                int i13 = 0;
                                int i14 = 0;
                                while (i13 < length) {
                                    defpackage.iyk iykVar6 = iykVarArr4[i13];
                                    int i15 = i2;
                                    defpackage.jkr jkrVar = jkrVarJ;
                                    if (jhlVarN4 == ((defpackage.inh) jkrVar).n(iykVar6.g, iykVar6.e, iykVar6.f)) {
                                        arrayList3.add(iykVar6);
                                        if (iykVar6 == iykVar5) {
                                            i10 = i14;
                                        }
                                        i14++;
                                    }
                                    i13++;
                                    i2 = i15;
                                    jkrVarJ = jkrVar;
                                }
                                defpackage.jkr jkrVar2 = jkrVarJ;
                                int i16 = i2;
                                if (arrayList3.size() == 1) {
                                    if (i3 == 5) {
                                        ((defpackage.yqj) defpackage.inh.a.l().ai(516)).w("Pointer id %d changed from ACTION_POINTER_DOWN to ACTION_DOWN", iykVar5.g);
                                        i3 = i16;
                                    } else if (i3 == 6) {
                                        ((defpackage.yqj) defpackage.inh.a.l().ai(515)).w("Pointer id %d changed from ACTION_POINTER_UP to ACTION_UP", iykVar5.g);
                                        i3 = 1;
                                    }
                                }
                                long j3 = iylVar.g;
                                long jG = ((defpackage.inh) jkrVar2).g(jhlVarN4, j3, i3);
                                if (i3 == 5) {
                                    i3 |= i10 << 8;
                                } else if (i3 == 6) {
                                    i3 = 6;
                                    i3 |= i10 << 8;
                                }
                                int i17 = i3;
                                ((defpackage.inh) jkrVar2).B(jhlVarN4, jG, j3, i17, arrayList3);
                                if (i17 == 6 || i17 == 1) {
                                    ((defpackage.inh) jkrVar2).Q(iykVar5.g);
                                }
                            }
                        }
                    }
                    iylVar.b();
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void I(com.google.android.gms.car.display.CarDisplayId carDisplayId, android.view.MotionEvent motionEvent) {
        defpackage.ill.d();
        if (this.o) {
            j(carDisplayId).I(motionEvent);
        }
    }

    public final synchronized void J(com.google.android.gms.car.display.CarRegionId carRegionId, java.lang.Runnable runnable) {
        g(carRegionId).b(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void K(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (this.o) {
            defpackage.inv invVarG = g(carRegionId);
            if (!invVarG.g) {
                invVarG.g = true;
                defpackage.ygw ygwVarA = az(carRegionId).a();
                for (int i = 0; i < ygwVarA.size(); i++) {
                    android.content.ComponentName componentName = (android.content.ComponentName) ygwVarA.get(i);
                    android.content.Intent component = new android.content.Intent().setComponent(componentName);
                    ((defpackage.yqj) b.l().ai((char) 757)).y("Pre-warming %s", componentName);
                    defpackage.qrh qrhVar = new defpackage.qrh();
                    qrhVar.e = carRegionId;
                    aS(component, qrhVar.a(), null, a(component, carRegionId));
                }
            }
        }
    }

    public final synchronized void L(android.content.Intent intent) {
        defpackage.ill.d();
        ((defpackage.yqj) b.l().ai((char) 760)).y("Processing %s and starting it", intent);
        if (this.U == null) {
            this.V.add(intent);
        } else {
            if (aW(intent)) {
                return;
            }
            this.V.add(intent);
        }
    }

    public final synchronized void M(qvo qvoVar) {
        defpackage.iof iofVar;
        defpackage.ill.d();
        this.P.add(qvoVar);
        for (java.util.Map.Entry entry : this.t.entrySet()) {
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
            defpackage.inn innVar = ((defpackage.inv) entry.getValue()).e;
            if (innVar != null && (iofVar = innVar.s) != null && innVar.E()) {
                com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = new com.google.android.gms.car.ActivityLaunchInfo(iofVar.c, carRegionId);
                try {
                    qvoVar.f(activityLaunchInfo);
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai((char) 700)).y("Error calling onActivityStarted with: %s", activityLaunchInfo);
                }
            }
        }
    }

    public final synchronized void N(qvr qvrVar) {
        defpackage.inn innVar;
        defpackage.iof iofVar;
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 761)).u("registerCarActivityStartListener() called while not connected, ignoring.");
            return;
        }
        this.r.add(qvrVar);
        for (java.util.Map.Entry entry : this.t.entrySet()) {
            if (this.l.d((com.google.android.gms.car.display.CarRegionId) entry.getKey()) && (innVar = ((defpackage.inv) entry.getValue()).e) != null && (iofVar = innVar.s) != null && innVar.E()) {
                android.content.Intent intent = iofVar.c;
                aX(qvrVar, new defpackage.inp(intent, 4), intent);
            }
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
            defpackage.inn innVar2 = ((defpackage.inv) entry.getValue()).e;
            if (innVar2 != null) {
                android.content.Intent intent2 = innVar2.t;
                if (intent2 == null) {
                    ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(694)).M("Active activity manager does not have an intent. Unable to send last activity started for %s, activityManager: %s", carRegionId, innVar2);
                } else if (innVar2.I()) {
                    com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = new com.google.android.gms.car.ActivityLaunchInfo(intent2, carRegionId);
                    ((defpackage.yqj) b.l().ai((char) 692)).y("Send last activity started:%s ", activityLaunchInfo);
                    aX(qvrVar, new defpackage.inp(activityLaunchInfo, 0), activityLaunchInfo);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void O(qvu qvuVar) {
        defpackage.ill.d();
        defpackage.ysr.bk(this.U == null, "There can only one ICarActivityStartProcessor registered at a time");
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai(762)).M("Registering ICarActivityStartProcessor: %s, previously was %s", qvuVar, this.U);
        this.U = qvuVar;
        java.util.Queue queue = this.V;
        defpackage.ygw ygwVarO = defpackage.ygw.o(queue);
        queue.clear();
        int size = ygwVarO.size();
        for (int i = 0; i < size; i++) {
            android.content.Intent intent = (android.content.Intent) ygwVarO.get(i);
            if (!aW(intent)) {
                queue.add(intent);
            }
        }
    }

    public final synchronized void P(defpackage.rqb rqbVar) {
        defpackage.ill.d();
        for (java.util.Map.Entry entry : this.u.entrySet()) {
            if (((defpackage.inu) entry.getValue()).l == null) {
                ((defpackage.yqj) b.l().ai((char) 763)).y("Registering carDisplayLayoutUpdateComplete listener before display %s has a layout", entry.getKey());
                return;
            } else {
                if (!aY(rqbVar, (com.google.android.gms.car.display.CarDisplayId) entry.getKey(), ((defpackage.inu) entry.getValue()).l.toString())) {
                    return;
                }
            }
        }
        this.O.add(rqbVar);
    }

    public final synchronized void Q(com.google.android.gms.car.display.CarRegionId carRegionId) {
        g(carRegionId).c();
    }

    public final synchronized void S(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 766)).u("Unable to reset client connection canceled after teardown");
            return;
        }
        boolean z = g(carRegionId).p;
        g(carRegionId).p = false;
        ((defpackage.yqj) b.l().ai(765)).N("Resetting canceled launch for %s from %s", carRegionId, z);
    }

    public final synchronized void T(com.google.android.gms.car.display.CarRegionId carRegionId) {
        com.google.android.gms.car.display.CarDisplayId carDisplayId = carRegionId.h;
        java.util.Set set = f(carDisplayId).m;
        set.remove(carRegionId);
        if (set.isEmpty()) {
            ((defpackage.yqj) b.l().ai((char) 767)).y("%s no longer relinquishing", carDisplayId);
        }
    }

    public final void U(android.view.KeyEvent keyEvent) {
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 772)).y("Forwarding media key %s", keyEvent);
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
        intent.setPackage(this.C.getPackageName());
        intent.addFlags(268435456);
        this.d.sendBroadcast(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void V(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig) {
        defpackage.ill.d();
        ((defpackage.yqj) b.l().ai((char) 773)).y("Setting CarActivityLayout to: %s", carActivityLayoutConfig);
        defpackage.dmh.I(carActivityLayoutConfig);
        java.util.Map map = this.t;
        defpackage.ysr.bk(map.isEmpty(), "We only support one call to setCarActivityLayoutConfig");
        defpackage.ygw ygwVarA = carActivityLayoutConfig.a();
        int size = ygwVarA.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig = (com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) ygwVarA.get(i);
            defpackage.ygw ygwVarA2 = carDisplayLayoutConfig.a();
            int size2 = ygwVarA2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA2.get(i2);
                com.google.android.gms.car.display.CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                defpackage.ysr.bn(!map.containsKey(carRegionId), "Trying to set the state for %s which was already set", carRegionId);
                aC(carRegionId, carActivityRegionLayoutConfig);
            }
            f(carDisplayLayoutConfig.a).l = java.util.UUID.fromString(carDisplayLayoutConfig.b);
            aL(carDisplayLayoutConfig);
        }
    }

    public final synchronized void W(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (this.o) {
            g(carRegionId).j.b();
        }
    }

    public final synchronized void X(android.content.ComponentName componentName, com.google.android.gms.car.display.CarRegionId carRegionId) {
        g(carRegionId).f = componentName;
    }

    public final synchronized void Y(android.os.Bundle bundle) {
        defpackage.ill.d();
        if (bundle == null) {
            this.Y = null;
            return;
        }
        android.os.Bundle bundleM = ep$.ExternalSyntheticApiModelOutline1.m(bundle);
        if (defpackage.acpa.a.fF().e()) {
            bundleM.putBoolean("CANCEL_PENDING_LIFECYCLE_EVENTS_FOR_FINISH_ENABLED", true);
        }
        this.Y = bundleM;
    }

    public final synchronized void Z(defpackage.inn innVar) {
        g(innVar.z).d(innVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    final int a(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        java.util.Map map;
        int iIntValue;
        boolean z;
        android.content.ComponentName component = intent.getComponent();
        if (intent != null && intent.getBooleanExtra("assistant_activity", false)) {
            return aV(intent) ? 1 : 4;
        }
        int i = 3;
        if (intent != null) {
            android.content.Intent intent2 = a;
            if (intent2.getAction().equals(intent.getAction()) && intent2.getPackage().equals(intent.getPackage()) && intent.getCategories() != null && intent.getCategories().containsAll(intent2.getCategories())) {
                iIntValue = 3;
            } else if (carRegionId.equals(com.google.android.gms.car.display.CarRegionId.d)) {
                iIntValue = 1;
            } else {
                map = c;
                if (map.containsKey(component)) {
                    iIntValue = ((java.lang.Integer) map.get(component)).intValue();
                } else {
                    iIntValue = 1;
                }
            }
        } else if (carRegionId.equals(com.google.android.gms.car.display.CarRegionId.d)) {
            iIntValue = 1;
        } else {
            map = c;
            if (map.containsKey(component)) {
                iIntValue = ((java.lang.Integer) map.get(component)).intValue();
            } else {
                iIntValue = 1;
            }
        }
        if (iIntValue != 1) {
            if (iIntValue != 3) {
                i = iIntValue;
                z = false;
            }
            if (z) {
                return i;
            }
            throw new java.lang.IllegalStateException(defpackage.ysr.aR("Window starting in a layer we don't allow: %s trying to use layer %s", component, java.lang.Integer.valueOf(i)));
        }
        i = iIntValue;
        z = true;
        if (z) {
            return i;
        }
        throw new java.lang.IllegalStateException(defpackage.ysr.aR("Window starting in a layer we don't allow: %s trying to use layer %s", component, java.lang.Integer.valueOf(i)));
    }

    @Override // defpackage.ixt
    public final synchronized void aI(int i, boolean z) {
        if (z) {
            char c2 = (char) i;
            java.util.Iterator it = this.u.values().iterator();
            while (it.hasNext()) {
                java.util.Iterator it2 = ((defpackage.inu) it.next()).f.v().iterator();
                while (it2.hasNext()) {
                    ((defpackage.inn) it2.next()).p(c2);
                }
            }
        }
    }

    public final synchronized void aa(java.util.List list, android.content.Intent intent, android.os.Bundle bundle) {
        bf(list, intent, bundle, a(intent, ay(bundle, intent)));
    }

    public final synchronized void ab() {
        defpackage.ill.d();
        java.util.Iterator it = this.t.entrySet().iterator();
        while (it.hasNext()) {
            ac((com.google.android.gms.car.display.CarRegionId) ((java.util.Map.Entry) it.next()).getKey());
        }
        defpackage.rqm rqmVar = this.z;
        boolean z = true;
        defpackage.ioy ioyVar = new defpackage.ioy(this, 1 == true ? 1 : 0);
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            z = false;
        }
        defpackage.ysr.bj(z);
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "doOnProjectionLifetimeDelayedStart");
        }
        if (rqmVar.h(new defpackage.rqj(rqmVar, new defpackage.lsn(6), ioyVar))) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 782)).u("Unable to connect to lifetime service, no pre-warming");
    }

    public final synchronized void ac(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 785)).y("startInitialIntentForRegion(%s) called while not connected, ignoring.", carRegionId);
            return;
        }
        android.content.Intent intent = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).a;
        if (!f(carRegionId.h).b) {
            g(carRegionId).c = intent;
        } else {
            if (at(intent, carRegionId) || intent.getComponent() == null) {
                return;
            }
            aD("Initial activity failed to start", carRegionId);
        }
    }

    public final synchronized void ad(rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo, defpackage.inn innVar) {
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai(788)).D("startInput/editorInfo.imeOptions=%d, region=%s", editorInfo.imeOptions, innVar.z);
        defpackage.ill.d();
        if (!innVar.H()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 790)).u("Can't start input on an unstarted activity");
            return;
        }
        defpackage.ioj iojVar = this.p;
        if (iojVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 789)).u("No ImeManager; can't start input");
        } else {
            iojVar.c(rnhVar, editorInfo, innVar);
            this.X = new inz(rnhVar, editorInfo, innVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void ae(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.ill.d();
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 796)).y("stopCarActivityManager called for %s", carRegionId);
        if (carRegionId.equals(com.google.android.gms.car.display.CarRegionId.c) && !aU()) {
            carRegionId = com.google.android.gms.car.display.CarRegionId.b;
        }
        if (!this.t.containsKey(carRegionId)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 797)).y("Attempt to stop region %s which doesn't exist", carRegionId);
            return;
        }
        defpackage.ygw ygwVarB = this.l.b(carRegionId);
        int size = ygwVarB.size();
        for (int i = 0; i < size; i++) {
            aT((com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i));
        }
        aT(carRegionId);
    }

    public final synchronized void af() {
        defpackage.ill.d();
        this.o = false;
        java.util.Map map = this.u;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            defpackage.yjm yjmVar = ((defpackage.inu) it.next()).f;
            java.util.ArrayList arrayList = new java.util.ArrayList(yjmVar.v());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.inn) arrayList.get(i)).l();
            }
            yjmVar.q();
        }
        this.Q.removeCallbacksAndMessages(null);
        defpackage.ioj iojVar = this.p;
        if (iojVar != null) {
            iojVar.b();
        }
        java.util.Map map2 = this.t;
        java.util.Iterator it2 = map2.values().iterator();
        while (it2.hasNext()) {
            ((defpackage.inv) it2.next()).e();
        }
        map.clear();
        map2.clear();
    }

    public final synchronized void ag(qvo qvoVar) {
        defpackage.ill.d();
        this.P.remove(qvoVar);
    }

    public final synchronized void ah() {
        defpackage.ill.d();
        this.U = null;
    }

    public final synchronized void ai(defpackage.rqb rqbVar) {
        defpackage.ill.d();
        this.O.remove(rqbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void aj(com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfig, boolean z) {
        defpackage.inn innVar;
        defpackage.yqm yqmVar;
        int i;
        boolean z2;
        defpackage.inn innVarE;
        int i2;
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 803)).y("updateCarActivityLayoutConfig(%s) called while not connected, ignoring.", carActivityLayoutConfig);
            return;
        }
        defpackage.yqm yqmVar2 = b;
        ((defpackage.yqj) yqmVar2.l().ai((char) 802)).y("Updating carActivityLayoutConfig with %s", carActivityLayoutConfig);
        defpackage.ygw ygwVarA = carActivityLayoutConfig.a();
        int size = ygwVarA.size();
        int i3 = 0;
        while (i3 < size) {
            com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig = (com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) ygwVarA.get(i3);
            defpackage.yhv yhvVar = new defpackage.yhv();
            defpackage.ygw ygwVarA2 = carDisplayLayoutConfig.a();
            int size2 = ygwVarA2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA2.get(i4);
                com.google.android.gms.car.display.CarRegionId carRegionId = carActivityRegionLayoutConfig.c;
                if (this.t.containsKey(carRegionId)) {
                    android.content.Intent intent = az(carRegionId).b;
                    if (intent.getComponent() != null && this.l.a(carRegionId) == null) {
                        intent.getComponent();
                        android.content.Intent intent2 = carActivityRegionLayoutConfig.b;
                        intent2.getComponent();
                        defpackage.ysr.aY(j$.util.Objects.equals(intent.getComponent(), intent2.getComponent()), "Changing the fallback intent is not supported");
                    }
                }
                yhvVar.c(carRegionId);
            }
            defpackage.yot it = defpackage.ysr.p(aA(carDisplayLayoutConfig.a), yhvVar.g()).f().iterator();
            while (true) {
                i2 = i3 + 1;
                if (it.hasNext()) {
                    com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) it.next();
                    ((defpackage.yqj) yqmVar2.l().ai((char) 764)).y("Removing region: %s", carRegionId2);
                    defpackage.inv invVarG = g(carRegionId2);
                    java.util.Iterator it2 = new defpackage.ydg(f(carRegionId2.h).f).u().iterator();
                    while (it2.hasNext()) {
                        defpackage.inn innVar2 = (defpackage.inn) ((java.util.Map.Entry) it2.next()).getValue();
                        if (innVar2.z.equals(carRegionId2)) {
                            innVar2.l();
                            R(innVar2);
                        }
                    }
                    invVarG.e();
                    this.t.remove(carRegionId2);
                    aH();
                }
            }
            i3 = i2;
        }
        defpackage.ygw ygwVarA3 = carActivityLayoutConfig.a();
        int size3 = ygwVarA3.size();
        int i5 = 0;
        while (i5 < size3) {
            com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig carDisplayLayoutConfig2 = (com.google.android.gms.car.lifecycle.CarDisplayLayoutConfig) ygwVarA3.get(i5);
            defpackage.zd zdVar = new defpackage.zd();
            java.util.UUID uuidFromString = java.util.UUID.fromString(carDisplayLayoutConfig2.b);
            com.google.android.gms.car.display.CarDisplayId carDisplayId = carDisplayLayoutConfig2.a;
            defpackage.inu inuVarF = f(carDisplayId);
            boolean zEquals = uuidFromString.equals(inuVarF.l);
            defpackage.ygw ygwVarA4 = carDisplayLayoutConfig2.a();
            int size4 = ygwVarA4.size();
            int i6 = 0;
            while (i6 < size4) {
                com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig carActivityRegionLayoutConfig2 = (com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA4.get(i6);
                com.google.android.gms.car.display.CarRegionId carRegionId3 = carActivityRegionLayoutConfig2.c;
                defpackage.ygw ygwVar = ygwVarA3;
                if (!this.t.containsKey(carRegionId3)) {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 657)).y("Adding region %s due to layout update.", carRegionId3);
                    aC(carRegionId3, carActivityRegionLayoutConfig2);
                    java.util.Iterator it3 = this.q.iterator();
                    while (it3.hasNext()) {
                        ((defpackage.imi) ((defpackage.izq) it3.next()).a).n().ac(carRegionId3);
                    }
                }
                defpackage.inv invVarG2 = g(carRegionId3);
                if (zEquals && carActivityRegionLayoutConfig2.equals(invVarG2.q.b)) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 804)).y("No changes to CarActivityRegionLayoutConfig, skipping update for %s", carRegionId3);
                    yqmVar = yqmVar2;
                    i = i5;
                    z2 = zEquals;
                } else {
                    defpackage.inv invVarG3 = g(carRegionId3);
                    yqmVar = yqmVar2;
                    defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai(805);
                    defpackage.fbk fbkVar = invVarG3.q;
                    i = i5;
                    z2 = zEquals;
                    yqjVar.R("Updating CarActivityRegionLayoutConfig for %s from %s to %s", carRegionId3, fbkVar.b, carActivityRegionLayoutConfig2);
                    fbkVar.b = carActivityRegionLayoutConfig2;
                    com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams = carActivityRegionLayoutConfig2.d;
                    invVarG3.i = carActivityLayoutParams.f;
                    zdVar.put(carRegionId3, carActivityLayoutParams);
                    if (z && ((innVarE = e(carRegionId3)) == null || !innVarE.H())) {
                        android.content.Intent intent3 = carActivityRegionLayoutConfig2.a;
                        if (intent3.getComponent() != null) {
                            ((defpackage.yqj) yqmVar.l().ai(786)).M("Due to resize, starting %s for %s", intent3, carRegionId3);
                            ac(carRegionId3);
                        }
                    }
                }
                i6++;
                ygwVarA3 = ygwVar;
                size3 = size3;
                yqmVar2 = yqmVar;
                i5 = i;
                zEquals = z2;
            }
            defpackage.ygw ygwVar2 = ygwVarA3;
            defpackage.yqm yqmVar3 = yqmVar2;
            int i7 = size3;
            int i8 = i5;
            defpackage.ygw ygwVarA5 = carDisplayLayoutConfig2.a();
            int size5 = ygwVarA5.size();
            for (int i9 = 0; i9 < size5; i9++) {
                com.google.android.gms.car.display.CarRegionId carRegionId4 = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) ygwVarA5.get(i9)).c;
                defpackage.inn innVar3 = g(carRegionId4).e;
                com.google.android.gms.car.display.CarRegionGroup carRegionGroupA = this.l.a(carRegionId4);
                if (carRegionGroupA != null) {
                    com.google.android.gms.car.display.CarRegionId carRegionId5 = carRegionGroupA.c;
                    if (!carRegionId5.equals(carRegionId4) && (innVar = g(carRegionId5).e) != null && innVar.H() && innVar3 != null && innVar3.H()) {
                        ((defpackage.yqj) yqmVar3.l().ai(794)).M("Resize added region to group with primary activity. Stopping activity: %s, Primary activity: %s", innVar3, innVar);
                        innVar3.y(null);
                    }
                }
            }
            for (defpackage.inn innVar4 : f(carDisplayId).f.v()) {
                com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams2 = (com.google.android.gms.car.CarActivityLayoutParams) zdVar.get(innVar4.z);
                if (carActivityLayoutParams2 != null) {
                    innVar4.A(carActivityLayoutParams2, uuidFromString);
                }
            }
            inuVarF.l = uuidFromString;
            java.util.Iterator it4 = zdVar.entrySet().iterator();
            while (it4.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it4.next();
                com.google.android.gms.car.display.CarRegionId carRegionId6 = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
                defpackage.iny inyVar = g(carRegionId6).j;
                com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams3 = (com.google.android.gms.car.CarActivityLayoutParams) entry.getValue();
                synchronized (inyVar.f) {
                    defpackage.inx inxVar = (defpackage.inx) inyVar.a.get(carRegionId6);
                    if (inxVar != null) {
                        defpackage.iof iofVar = inxVar.b;
                        int i10 = carActivityLayoutParams3.c;
                        int i11 = carActivityLayoutParams3.d;
                        android.graphics.Rect rect = new android.graphics.Rect(i10, i11, carActivityLayoutParams3.a + i10, carActivityLayoutParams3.b + i11);
                        defpackage.ioe ioeVar = new defpackage.ioe(iofVar);
                        ioeVar.c(uuidFromString);
                        ioeVar.f = rect;
                        ioeVar.i(carActivityLayoutParams3.f);
                        ioeVar.e(carActivityLayoutParams3.l);
                        ioeVar.h(carActivityLayoutParams3.j);
                        ioeVar.g(carActivityLayoutParams3.k);
                        ioeVar.k(carActivityLayoutParams3.e);
                        inxVar.b = ioeVar.a();
                    }
                }
            }
            aL(carDisplayLayoutConfig2);
            i5 = i8 + 1;
            ygwVarA3 = ygwVar2;
            size3 = i7;
            yqmVar2 = yqmVar3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void ak(com.google.android.gms.car.display.CarRegionId carRegionId, android.graphics.Rect rect) {
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai(806)).M("updateInsets(%s, %s) called while not connected, ignoring.", carRegionId, rect);
            return;
        }
        defpackage.ysr.aY(this.t.containsKey(carRegionId), "Cannot update region %s which does not exist");
        defpackage.inu inuVarF = f(carRegionId.h);
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (defpackage.inn innVar : inuVarF.f.v()) {
            if (innVar.z.equals(carRegionId)) {
                ygrVar.i(innVar);
            }
        }
        defpackage.ygw ygwVarG = ygrVar.g();
        int i = ((defpackage.ymx) ygwVarG).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.inn) ygwVarG.get(i2)).B(rect);
        }
        g(carRegionId).i = rect;
    }

    public final synchronized boolean al(defpackage.inn innVar) {
        defpackage.yjm yjmVar = f(innVar.z.h).f;
        android.content.ComponentName componentName = innVar.d;
        if (yjmVar.y(componentName, innVar)) {
            return false;
        }
        ((defpackage.yqj) b.l().ai((char) 656)).y("Client not found in active client list, starting new client for %s", componentName.toShortString());
        yjmVar.t(componentName, innVar);
        return true;
    }

    public final synchronized boolean an(int i) {
        for (defpackage.inn innVar : f(com.google.android.gms.car.display.CarDisplayId.a).f.v()) {
            if (innVar.k == i && innVar.H()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean ao(int i) {
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 691)).w("isNewestApp(%d) called while not connected, returning false.", i);
            return false;
        }
        for (defpackage.inn innVar : f(com.google.android.gms.car.display.CarDisplayId.a).f.v()) {
            if (innVar.k == i && innVar.d.equals(g(innVar.z).f)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean ap(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (this.o) {
            return g(carRegionId).p;
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 807)).u("Connection canceled as we are tearing down");
        return true;
    }

    public final synchronized void aq() {
        defpackage.ill.d();
        this.Z = true;
        java.util.Iterator it = this.t.keySet().iterator();
        while (it.hasNext()) {
            aG((com.google.android.gms.car.display.CarRegionId) it.next());
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized void ar(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.inn innVar) {
        defpackage.inv invVarG = g(carRegionId);
        defpackage.inn innVar2 = invVarG.e;
        invVarG.e = innVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized void as(android.content.Intent intent, android.os.Bundle bundle, int i) {
        defpackage.ill.d();
        ba(intent, bundle, null, i);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized boolean at(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        android.os.Bundle bundleA;
        defpackage.qrh qrhVar = new defpackage.qrh();
        qrhVar.e = carRegionId;
        bundleA = qrhVar.a();
        defpackage.ysr.bp(f(carRegionId.h).b, "The display must be started before calling startIntentForRegion for %s on %s", intent.getComponent(), carRegionId);
        return ba(intent, bundleA, null, 1);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized void au(android.content.ComponentName componentName) {
        defpackage.ill.d();
        ((defpackage.yqj) b.l().ai((char) 795)).y("stopCarActivityManager called for %s", componentName.getClassName());
        java.util.Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            for (defpackage.inn innVar : ((defpackage.inu) it.next()).f.c(componentName)) {
                if (innVar.H()) {
                    innVar.y(null);
                    return;
                }
            }
        }
    }

    public final synchronized void av(defpackage.inn innVar, zxm zxmVar) {
        defpackage.yqm yqmVar;
        boolean z;
        int iIntValue;
        android.content.Intent intent;
        defpackage.ill.d();
        defpackage.iof iofVar = innVar.s;
        if (iofVar == null) {
            yqmVar = b;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 714)).u("No StartInfo for destroyed activity, unable to notify listeners");
        } else if (innVar.D()) {
            yqmVar = b;
            ((defpackage.yqj) yqmVar.l().ai((char) 719)).u("Sending activityStop for teardown");
            aJ(innVar.z, iofVar.c);
        } else {
            yqmVar = b;
            ((defpackage.yqj) yqmVar.l().ai((char) 718)).u("No need to send activityStop for teardown");
        }
        if (!this.o) {
            ((defpackage.yqj) yqmVar.l().ai((char) 717)).y("onActivityManagerDestroyed when not connected, finishing %s", innVar);
            innVar.l();
            aN(innVar);
            return;
        }
        defpackage.ioj iojVar = this.p;
        if (iojVar != null) {
            iojVar.d(innVar);
            if (innVar.s != null && (intent = iofVar.c) != null && intent.getBooleanExtra("assistant_activity", false) && this.y) {
                ((defpackage.yqj) yqmVar.l().ai((char) 716)).u("OnActivityManagerDestroyed, restoring keyboard after assistant");
                defpackage.ioj iojVar2 = this.p;
                inz inzVar = this.X;
                iojVar2.c(inzVar.a, inzVar.b, inzVar.c);
                this.y = false;
            }
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = innVar.z;
        defpackage.inv invVarG = g(carRegionId);
        boolean zF = g(carRegionId).j.f(innVar);
        boolean zAZ = aZ(innVar);
        int iB = innVar.b();
        if (zF) {
            be(invVarG);
        }
        defpackage.jkr jkrVar = innVar.y;
        bc(innVar, zAZ);
        if (zxmVar != null) {
            if (iB == 1 && invVarG.e == innVar) {
                jkrVar.aa(carRegionId, null);
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(679)).N("Crashed %s, wasConnecting:%b", innVar, zF);
            java.lang.Object obj = zxmVar.b;
            if (obj != null) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).p((java.lang.Throwable) obj)).ai((char) 689)).y("FATAL onActivityManagerCrash called. Message: %s", ((java.lang.RuntimeException) obj).getMessage());
            }
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).q(defpackage.yqi.MEDIUM)).ai((char) 680)).y("onActivityManagerCrash call stack for %s", innVar);
            if (this.T) {
                throw ((java.lang.RuntimeException) new defpackage.nub(obj).h(new inr(innVar, 0)));
            }
            if (this.S == null) {
                this.S = new java.util.ArrayDeque();
            }
            this.R++;
            this.S.add(zxmVar);
            if (this.R > 5) {
                this.S.remove();
            }
            defpackage.ioi ioiVar = innVar.c;
            java.lang.Object obj2 = ax(carRegionId).first;
            android.content.ComponentName componentName = ioiVar.d;
            if (componentName.equals(obj2)) {
                g(carRegionId).d++;
            }
            if (this.s == null) {
                this.s = new java.util.HashMap();
            }
            android.util.Pair pair = (android.util.Pair) this.s.get(componentName);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (pair == null || jElapsedRealtime - ((java.lang.Long) pair.first).longValue() > 30000) {
                this.s.put(componentName, android.util.Pair.create(java.lang.Long.valueOf(jElapsedRealtime), 1));
            } else {
                this.s.put(componentName, android.util.Pair.create(java.lang.Long.valueOf(jElapsedRealtime), java.lang.Integer.valueOf(((java.lang.Integer) pair.second).intValue() + 1)));
            }
            z = innVar.H() || f(carRegionId.h).a.remove(innVar);
            if (this.o) {
                android.content.ComponentName componentName2 = innVar.d;
                java.util.Map map = c;
                if (map.containsKey(componentName2)) {
                    java.lang.Integer num = (java.lang.Integer) map.get(componentName2);
                    num.getClass();
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                android.content.ComponentName componentName3 = (android.content.ComponentName) ax(carRegionId).first;
                if (zF) {
                    if (componentName2.equals(componentName3)) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 687)).u("Handling crash of connecting client (default), restarting default component or fallback.");
                        aQ(innVar);
                    } else if (iIntValue == 1) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 685)).u("Handling crash of connecting client (content), falling back to default component.");
                        ioiVar.d();
                        aD("Crash", carRegionId);
                    } else if (iIntValue == 2 || iIntValue == 6) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 686)).u("Handling crash of connecting client (rail or notification), retrying");
                        innVar.u();
                        defpackage.iof iofVar2 = innVar.s;
                        ba(iofVar2.c, iofVar2.d, null, innVar.b());
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 684)).u("Handling crash of connecting client (unhandled).");
                    }
                } else if (!z || iIntValue == 5) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 681)).u("Handling background crash");
                    ioiVar.d();
                } else if (componentName2.equals(componentName3)) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 683)).u("Handling crash of running client, restarting default component or fallback");
                    aQ(innVar);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 682)).u("Handling crash of running client, restarting component or fallback");
                    defpackage.inn innVarB = ioiVar.b();
                    defpackage.iof iofVar3 = innVarB.s;
                    android.content.Intent intent2 = iofVar3.c;
                    android.os.Bundle bundle = iofVar3.d;
                    android.util.Pair pair2 = (android.util.Pair) this.s.get(componentName);
                    pair2.getClass();
                    if (((java.lang.Integer) pair2.second).intValue() < 5) {
                        intent2.setComponent(innVarB.s.a);
                        intent2.putExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", true);
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(768)).M("Restarting component with intent %s on %s", intent2, ay(bundle, intent2));
                        if (innVarB.b() != 1) {
                            innVarB.u();
                        } else {
                            innVarB.c.d();
                        }
                        ba(intent2, bundle, null, innVarB.b());
                    } else if (innVar.b() == 1) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(770)).y("Crash loop, fallback to default component. %s", innVarB.d);
                        innVarB.c.d();
                        aD("crashloop", carRegionId);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 769)).u("Crash loop detected in non-content layer");
                    }
                }
            }
        } else {
            z = innVar.H() || f(carRegionId.h).a.remove(innVar);
            if (innVar.G()) {
                innVar.l();
            } else {
                innVar.u();
            }
            if (z) {
                defpackage.inn innVarC = innVar.c.c();
                if (innVarC != null) {
                    defpackage.inn innVar2 = invVarG.e;
                    invVarG.e = innVarC;
                    innVarC.v();
                } else if (iB == 1) {
                    jkrVar.aa(carRegionId, null);
                    aD("No task available", carRegionId);
                }
            }
        }
        aN(innVar);
    }

    public final synchronized android.content.ComponentName b(int i) {
        android.content.ComponentName componentNameC = null;
        for (defpackage.inn innVar : f(com.google.android.gms.car.display.CarDisplayId.a).f.v()) {
            if (innVar.k == i) {
                if (innVar.H()) {
                    return innVar.c();
                }
                if (componentNameC == null) {
                    componentNameC = innVar.c();
                }
            }
        }
        return componentNameC;
    }

    public final android.content.res.Configuration c(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return (android.content.res.Configuration) this.J.a(carDisplayId);
    }

    public final synchronized android.os.Bundle d() {
        android.os.Bundle bundle = this.Y;
        if (bundle == null) {
            return null;
        }
        return ep$.ExternalSyntheticApiModelOutline1.m(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized defpackage.inn e(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.inn innVar = g(carRegionId).e;
        if (innVar != null && innVar.H()) {
            return innVar;
        }
        defpackage.ygw ygwVarB = this.l.b(carRegionId);
        int size = ygwVarB.size();
        for (int i = 0; i < size; i++) {
            defpackage.inn innVar2 = g((com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i)).e;
            if (innVar2 != null && innVar2.H()) {
                return innVar2;
            }
        }
        return innVar;
    }

    final defpackage.inu f(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        java.util.Map map = this.u;
        if (!map.containsKey(carDisplayId)) {
            map.put(carDisplayId, new defpackage.inu());
        }
        return (defpackage.inu) map.get(carDisplayId);
    }

    public final defpackage.inv g(com.google.android.gms.car.display.CarRegionId carRegionId) {
        java.util.Map map = this.t;
        defpackage.ysr.bc(map.containsKey(carRegionId), "Trying to access %s which was not configured", carRegionId);
        return (defpackage.inv) map.get(carRegionId);
    }

    public final synchronized defpackage.jik h(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams, com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (projectionWindowAnimationParams.a <= 0) {
            return null;
        }
        com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).d;
        defpackage.jkr jkrVarJ = j(carRegionId.h);
        return ((defpackage.inh) jkrVarJ).Y.b(defpackage.tna.aQ(this.d, this.B), projectionWindowAnimationParams, jkrVarJ.a(carActivityLayoutParams.a), jkrVarJ.a(carActivityLayoutParams.b));
    }

    public final synchronized defpackage.jiu i(defpackage.jik jikVar, defpackage.jik jikVar2, com.google.android.gms.car.display.CarRegionId carRegionId) {
        com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams;
        carActivityLayoutParams = ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).d;
        return new defpackage.jiu(jikVar, jikVar2, h(carActivityLayoutParams.h, carRegionId), h(carActivityLayoutParams.i, carRegionId));
    }

    public final defpackage.jkr j(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return this.k.q(carDisplayId);
    }

    public final synchronized com.google.android.gms.car.ProjectionWindowDecorationParams k(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).d.g;
    }

    final com.google.android.gms.car.display.CarRegionId l(android.content.Intent intent) {
        if (intent != null && intent.getBooleanExtra("assistant_activity", false)) {
            return aV(intent) ? com.google.android.gms.car.display.CarRegionId.c : com.google.android.gms.car.display.CarRegionId.b;
        }
        return com.google.android.gms.car.display.CarRegionId.a;
    }

    public final synchronized defpackage.ygw m(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return ((com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig) g(carRegionId).q.b).d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void n(defpackage.iof iofVar) {
        if (!this.o) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 658)).y("addPendingClient(%s) called while not connected, ignoring.", iofVar);
            return;
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = iofVar.i;
        g(carRegionId).b = iofVar;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.ygw ygwVarB = this.l.b(carRegionId);
        int size = ygwVarB.size();
        for (int i = 0; i < size; i++) {
            ygrVar.i(g((com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i)));
        }
        defpackage.ygw ygwVarG = ygrVar.g();
        int i2 = ((defpackage.ymx) ygwVarG).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((defpackage.inv) ygwVarG.get(i3)).b = null;
        }
    }

    public final synchronized void o(defpackage.iof iofVar) {
        if (this.o) {
            g(iofVar.i).h.add(iofVar);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 659)).y("addPendingPreWarm(%s) called while not connected, ignoring.", iofVar);
        }
    }

    public final synchronized void p(com.google.android.gms.car.display.CarRegionId carRegionId, ioc iocVar) {
        defpackage.inv invVarG = g(carRegionId);
        ioc iocVar2 = invVarG.o;
        if (iocVar2 != null) {
            defpackage.ysr.bq(iocVar2.equals(iocVar), "You cannot add %s to %s which currently has %s", iocVar, carRegionId, iocVar2);
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 660)).y("Duplicate ResumeThenStopRunnable found: %s. Nothing to add", iocVar2);
        }
        invVarG.o = iocVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void q(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.ygw ygwVarB = this.l.b(carRegionId);
        int size = ygwVarB.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.car.display.CarRegionId carRegionId2 = (com.google.android.gms.car.display.CarRegionId) ygwVarB.get(i);
            ((defpackage.yqj) b.l().ai((char) 665)).M("Clearing any queued connections for regions grouped with %s -- %s", carRegionId, carRegionId2);
            g(carRegionId2).j.a(false);
        }
    }

    public final void r(java.io.PrintWriter printWriter) {
        int i;
        printWriter.print("CarActivityManagerService ");
        printWriter.println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.print("\tState:");
        printWriter.print("connected=");
        printWriter.print(this.o);
        printWriter.print(" imeManager=");
        defpackage.ioj iojVar = this.p;
        printWriter.print(iojVar != null ? iojVar.toString() : "null");
        printWriter.println();
        printWriter.println();
        printWriter.println("Active Clients: ");
        try {
            synchronized (this) {
                try {
                    for (java.util.Map.Entry entry : this.u.entrySet()) {
                        printWriter.print("Display: ");
                        printWriter.println(entry.getKey());
                        printWriter.print("started: ");
                        printWriter.println(((defpackage.inu) entry.getValue()).b);
                        printWriter.print("hasVideoFocus: ");
                        printWriter.println(((defpackage.inu) entry.getValue()).c);
                        printWriter.print("transientLoss: ");
                        printWriter.println(((defpackage.inu) entry.getValue()).d);
                        printWriter.print("contentShownOnPrimaryRegion: ");
                        printWriter.println(((defpackage.inu) entry.getValue()).i);
                        printWriter.print("pendingKeys: ");
                        printWriter.println(((defpackage.inu) entry.getValue()).g);
                        printWriter.print("pendingSearchKeys: ");
                        printWriter.println(((defpackage.inu) entry.getValue()).h);
                        printWriter.print("lastFocusRegion (updated only when display loses focus): ");
                        printWriter.println(((defpackage.inu) entry.getValue()).k);
                        printWriter.println("activeActivityManagers: ");
                        java.util.Iterator it = ((defpackage.inu) entry.getValue()).f.v().iterator();
                        while (it.hasNext()) {
                            ((defpackage.inn) it.next()).j(printWriter);
                        }
                        printWriter.println("clientsToRestore: ");
                        java.util.Iterator it2 = ((defpackage.inu) entry.getValue()).a.iterator();
                        while (it2.hasNext()) {
                            ((defpackage.inn) it2.next()).j(printWriter);
                        }
                    }
                    printWriter.println();
                    for (java.util.Map.Entry entry2 : this.t.entrySet()) {
                        printWriter.print("Region: ");
                        printWriter.println(entry2.getKey());
                        printWriter.print("Pending client: ");
                        printWriter.println(((defpackage.inv) entry2.getValue()).b);
                        printWriter.print("pendingIntentToLaunch: ");
                        printWriter.println(((defpackage.inv) entry2.getValue()).c);
                        printWriter.print("Config: ");
                        printWriter.println(((defpackage.inv) entry2.getValue()).q.b);
                        printWriter.println();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            while (true) {
                defpackage.zd zdVar = this.n;
                if (i >= zdVar.d) {
                    break;
                }
                defpackage.ioi ioiVar = (defpackage.ioi) zdVar.g(i);
                printWriter.print("CarActivityTask{#");
                printWriter.print(ioiVar.b);
                printWriter.print(": mRoot=");
                printWriter.print(ioiVar.d.flattenToShortString());
                printWriter.print(", mActivities=[");
                int i2 = 0;
                while (true) {
                    java.util.List list = ioiVar.e;
                    if (i2 < list.size()) {
                        printWriter.print(((defpackage.inn) list.get(i2)).i);
                        if (i2 < list.size() - 1) {
                            printWriter.print(", ");
                        }
                        i2++;
                    }
                }
                printWriter.println("]}");
                i++;
            }
        } catch (java.util.ConcurrentModificationException unused) {
            printWriter.println();
            printWriter.println("ConcurrentModificationException caught");
        }
        printWriter.println();
        printWriter.println("Tasks: ");
        i = 0;
        printWriter.println();
        printWriter.println("Crash Report");
        printWriter.print("Total Crashes: ");
        printWriter.println(this.R);
        if (this.S != null) {
            printWriter.println("Latest Crashes:");
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.US);
            for (zxm zxmVar : this.S) {
                printWriter.print(simpleDateFormat.format(new java.util.Date(zxmVar.a)));
                printWriter.print(": ");
                java.lang.Object obj = zxmVar.b;
                if (obj == null) {
                    printWriter.println("<no exception>");
                } else {
                    java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) obj;
                    printWriter.println(runtimeException.getMessage());
                    runtimeException.printStackTrace(printWriter);
                }
            }
        }
    }

    final synchronized void s(defpackage.inn innVar) {
        android.content.Intent intent = innVar.t;
        intent.getClass();
        com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo = new com.google.android.gms.car.ActivityLaunchInfo(intent, innVar.z);
        aK(new defpackage.ins(activityLaunchInfo, 1), activityLaunchInfo);
    }

    public final synchronized void t(defpackage.inn innVar) {
        if (!this.o) {
            ((defpackage.yqj) b.l().ai((char) 722)).y("onActivityManagerFinished when not connected, ignoring. %s", innVar);
            return;
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = innVar.z;
        defpackage.inu inuVarF = f(carRegionId.h);
        inuVarF.f.C(innVar.d, innVar);
        inuVarF.a.remove(innVar);
        defpackage.inv invVarG = g(carRegionId);
        if (invVarG.e == innVar) {
            invVarG.e = null;
        }
    }

    public final synchronized void u(defpackage.inn innVar) {
        aZ(innVar);
    }

    public final synchronized void v(defpackage.inn innVar) {
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 724)).y("onActivityManagerResumeFailed for %s", innVar.d.getShortClassName());
        defpackage.ill.d();
        aP(innVar, true);
    }

    public final synchronized void w(defpackage.inn innVar) {
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) b.l().ai((char) 728)).y("onActivityManagerResumed when not connected, finishing %s", innVar);
            innVar.l();
            return;
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = innVar.z;
        com.google.android.gms.car.display.CarDisplayId carDisplayId = carRegionId.h;
        defpackage.inu inuVarF = f(carDisplayId);
        if (!inuVarF.j && innVar.b() == 1) {
            if (this.l.d(carRegionId)) {
                inuVarF.i = true;
            }
            inuVarF.j = true;
            aE(carDisplayId);
        }
        if (inuVarF.c && !inuVarF.h.isEmpty()) {
            aE(carDisplayId);
        }
        defpackage.inv invVarG = g(carRegionId);
        defpackage.inn innVar2 = invVarG.e;
        invVarG.e = innVar;
        boolean zF = g(carRegionId).j.f(innVar);
        defpackage.jkr jkrVar = innVar.y;
        if (innVar.b() != 1) {
            jkrVar.K(innVar.d(), true);
        }
        if (((defpackage.inh) jkrVar).C) {
            inuVarF.a.remove(innVar);
        }
        android.content.ComponentName componentName = innVar.d;
        if (componentName.equals(ax(carRegionId).first)) {
            invVarG.d = 0;
        }
        android.content.Context context = this.d;
        defpackage.ino inoVar = defpackage.ino.l;
        if (inoVar.m && com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId) && !defpackage.ino.f.contains(componentName) && !defpackage.ino.g.equals(componentName) && (!defpackage.acvt.a.fF().h() || !defpackage.ino.h.equals(componentName))) {
            inoVar.m = false;
            defpackage.omv.g(context, "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", defpackage.rss.e.ordinal(), null);
        }
        if (com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId)) {
            defpackage.yhe yheVar = defpackage.ino.b;
            if (yheVar.containsKey(componentName)) {
                defpackage.tgg.a.d((defpackage.tgf) yheVar.get(componentName), 1);
            }
            defpackage.yhe yheVar2 = defpackage.ino.c;
            if (yheVar2.containsKey(componentName)) {
                defpackage.tgg.a.d((defpackage.tgf) yheVar2.get(componentName), 1);
            }
            defpackage.yhe yheVar3 = defpackage.ino.d;
            if (yheVar3.containsKey(componentName)) {
                defpackage.tgg.a.d((defpackage.tgf) yheVar3.get(componentName), 1);
            }
            defpackage.yhe yheVar4 = defpackage.ino.e;
            if (yheVar4.containsKey(componentName)) {
                defpackage.tgg.a.d((defpackage.tgf) yheVar4.get(componentName), 1);
            }
        }
        aH();
        if (zF) {
            be(invVarG);
        }
    }

    public final synchronized void x(defpackage.inn innVar) {
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 729)).y("onActivityManagerResumedInWrongState for %s", innVar.d.getShortClassName());
        defpackage.ill.d();
        aP(innVar, false);
    }

    public final synchronized void y(defpackage.inn innVar) {
        if (innVar.E()) {
            aO(innVar);
        }
    }

    public final void z(defpackage.inn innVar) {
        android.content.Intent intent;
        defpackage.ioj iojVar;
        defpackage.ill.d();
        if (!this.o) {
            ((defpackage.yqj) b.l().ai((char) 733)).y("onActivityManagerStarted when not connected, finishing %s", innVar);
            innVar.l();
            return;
        }
        defpackage.iof iofVar = innVar.s;
        if (iofVar != null && (intent = iofVar.c) != null && intent.getBooleanExtra("assistant_activity", false) && (iojVar = this.p) != null && ((defpackage.iol) iojVar).d == 2) {
            ((defpackage.yqj) b.l().ai((char) 732)).u("onActivityManagerStarted, closing keyboard since assistant triggered");
            this.y = true;
            this.p.e(this.X.c);
        }
        if (innVar.b() != 1) {
            innVar.y.q(innVar.d());
        }
    }
}
