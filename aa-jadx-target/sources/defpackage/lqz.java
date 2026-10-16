package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lqz extends defpackage.lhm implements defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaAutoplayManager");
    static final j$.time.Duration b = j$.time.Duration.ofSeconds(30);
    static final j$.time.Duration c = j$.time.Duration.ofSeconds(2);
    static final j$.time.Duration d = j$.time.Duration.ofSeconds(2);
    static final j$.time.Duration e = j$.time.Duration.ofSeconds(5);
    static final j$.time.Duration f = j$.time.Duration.ofMillis((int) defpackage.actz.b());
    public final defpackage.lqn g;
    public lqs h;
    private final android.content.Context i;
    private final defpackage.eqp k;
    private final defpackage.lqq l;
    private final defpackage.lqm m;
    private defpackage.eqp n;
    private defpackage.eqp o;
    private defpackage.eqt p;
    private defpackage.eqt q;

    public lqz(android.content.Context context) {
        this.i = context;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("media_autoplay_manager", 0);
        this.g = new defpackage.lqn(sharedPreferences);
        this.l = new defpackage.lqq(context, sharedPreferences);
        this.k = defpackage.lhe.b().a(defpackage.mqg.MEDIA);
        this.m = new defpackage.lqm();
    }

    public static defpackage.lqz a() {
        return (defpackage.lqz) defpackage.mkp.a.b(defpackage.lqz.class, new defpackage.lqb(3));
    }

    private static defpackage.eqp f(defpackage.eqp eqpVar, j$.time.Duration duration) {
        return new lql(eqpVar, new defpackage.kqi(15), duration, java.lang.Boolean.FALSE);
    }

    public final void b() {
        defpackage.eqt eqtVar;
        defpackage.eqp eqpVar = this.o;
        if (eqpVar != null && (eqtVar = this.p) != null) {
            eqpVar.k(eqtVar);
            this.o = null;
            this.p = null;
        }
        defpackage.eqt eqtVar2 = this.q;
        if (eqtVar2 != null) {
            this.k.k(eqtVar2);
            this.q = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0215  */
    /* JADX WARN: Code duplicated, block: B:67:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0239  */
    /* JADX WARN: Code duplicated, block: B:69:0x023c  */
    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        defpackage.zbf zbfVar;
        int iB;
        int i;
        int i2;
        int i3;
        lqu lquVar;
        super.d();
        if (defpackage.actz.y()) {
            this.i.unregisterReceiver(this.m);
        }
        defpackage.mnt.b(this.i, "media_autoplay", 3, new defpackage.lsm(this, 1));
        defpackage.mni.a().d(defpackage.mnh.e);
        defpackage.lqq lqqVar = this.l;
        lqqVar.e.removeCallbacksAndMessages(null);
        lqqVar.g = false;
        lqqVar.h = false;
        defpackage.gkc gkcVar = lqqVar.l;
        gkcVar.getClass();
        lqqVar.b("was_last_drive_short_and_eligible", gkcVar.t().compareTo(defpackage.lqq.c) < 0 && lqqVar.i);
        lqqVar.l = null;
        if (defpackage.actz.y() && !lqqVar.k) {
            lqqVar.c(false);
        }
        if (lqqVar.i) {
            java.util.List<defpackage.lqp> list = lqqVar.f;
            defpackage.ysr.aY(!list.isEmpty(), "Caller should check history is nonempty");
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (defpackage.lqp lqpVar : list) {
                arrayMap.put(lqpVar.b, java.lang.Boolean.valueOf(lqpVar.c));
            }
            if (j$.util.Collection.-EL.stream(arrayMap.values()).allMatch(new defpackage.kqi(16))) {
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gp).l());
            }
        }
        lqqVar.f.clear();
        defpackage.eqp eqpVar = this.n;
        eqpVar.getClass();
        eqpVar.k(lqqVar);
        this.n = null;
        b();
        defpackage.lqn lqnVar = this.g;
        defpackage.lqj lqjVar = ((defpackage.lqk) lqnVar.get()).a;
        android.content.ComponentName componentName = ((defpackage.lqk) lqnVar.get()).b;
        lqv lqvVar = this.h;
        if (lqvVar != null) {
            componentName.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            lqv lqvVar2 = lqvVar;
            java.util.List<lqt> list2 = lqvVar2.c;
            for (lqt lqtVar : list2) {
                if (arrayList.isEmpty() || lqtVar.b != ((lqt) defpackage.ysr.an(arrayList)).b) {
                    arrayList.add(lqtVar);
                }
            }
            j$.time.Instant instant = lqvVar2.d;
            if (lqv.d(list2, lqu.h)) {
                zbfVar = defpackage.zbf.MEDIA_AUTOPLAY_STATE_MACHINE_TIMED_OUT;
            } else {
                lqu lquVar2 = lqu.g;
                if (lqv.d(list2, lquVar2)) {
                    if (j$.time.Duration.between(instant, ((lqt) list2.get(lqv.b(list2, lquVar2))).a).compareTo(lqv.a) < 0) {
                        ((defpackage.yqj) a.l().ai((char) 4202)).u("Autoplay lifetime-end monitor: autoplay activated successfully");
                    } else {
                        zbfVar = defpackage.zbf.MEDIA_AUTOPLAY_PLAYBACK_TOO_LONG_AFTER_DISPATCH;
                    }
                } else if (lqv.d(list2, lqu.c)) {
                    zbfVar = defpackage.zbf.MEDIA_AUTOPLAY_NEVER_CHANGED_TO_PLAYING;
                } else if (list2.isEmpty() || !((lqt) defpackage.ysr.an(list2)).c.b()) {
                    zbfVar = defpackage.zbf.MEDIA_AUTOPLAY_NOT_CONNECTED_TO_BROWSE_SERVICE;
                } else {
                    ((defpackage.yqj) a.l().ai((char) 4201)).u("Autoplay lifetime-end monitor: phone call lasted throughout drive");
                }
                lqv.c(arrayList, componentName, lqu.f, defpackage.zbd.gk, 1);
                lqv.c(arrayList, componentName, lqu.e, defpackage.zbd.gl, 1);
                lqu lquVar3 = lqu.c;
                lqv.c(arrayList, componentName, lquVar3, defpackage.zbd.gm, 2);
                iB = lqv.b(list2, lquVar3);
                if (iB > 0 && ((lqt) list2.get(iB - 1)).c.b()) {
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gg);
                    rrvVarH.p(componentName);
                    oimVarU.F(rrvVarH.l());
                }
                i = lqvVar2.e;
                i2 = lqvVar2.f;
                if (i > 0) {
                    defpackage.oim oimVarU2 = defpackage.omf.u();
                    defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gn);
                    rrvVarH2.p(componentName);
                    rrvVarH2.w(i);
                    oimVarU2.F(rrvVarH2.l());
                }
                if (i2 > 0) {
                    defpackage.oim oimVarU3 = defpackage.omf.u();
                    defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.go);
                    rrvVarH3.p(componentName);
                    rrvVarH3.w(i2);
                    oimVarU3.F(rrvVarH3.l());
                }
                for (i3 = 0; i3 < arrayList.size(); i3++) {
                    if (i3 == 0) {
                        lquVar = lqv.b;
                    } else {
                        lquVar = ((lqt) arrayList.get(i3 - 1)).b;
                    }
                    lqt lqtVar2 = (lqt) arrayList.get(i3);
                    defpackage.rrv rrvVarH4 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gj);
                    rrvVarH4.p(componentName);
                    defpackage.abor aborVarF = rrvVarH4.F();
                    int iA = lquVar.a();
                    aborVarF.t();
                    defpackage.zas zasVar = (defpackage.zas) aborVarF.b;
                    defpackage.zas zasVar2 = defpackage.zas.a;
                    zasVar.b |= 2;
                    zasVar.d = iA;
                    int iA2 = lqtVar2.b.a();
                    aborVarF.t();
                    defpackage.zas zasVar3 = (defpackage.zas) aborVarF.b;
                    zasVar3.b |= 1;
                    zasVar3.c = iA2;
                    long epochMilli = lqtVar2.a.toEpochMilli();
                    aborVarF.t();
                    defpackage.zas zasVar4 = (defpackage.zas) aborVarF.b;
                    zasVar4.b |= 8;
                    zasVar4.f = epochMilli;
                    defpackage.omf.u().F(rrvVarH4.l());
                }
            }
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4200)).M("Autoplay lifetime-end monitor: autoplay failed (app=%s) with reason=%s", componentName, zbfVar.name());
            defpackage.oim oimVarU4 = defpackage.omf.u();
            defpackage.rrv rrvVarH5 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gh);
            rrvVarH5.v(zbfVar);
            rrvVarH5.p(componentName);
            oimVarU4.F(rrvVarH5.l());
            lqv.c(arrayList, componentName, lqu.f, defpackage.zbd.gk, 1);
            lqv.c(arrayList, componentName, lqu.e, defpackage.zbd.gl, 1);
            lqu lquVar4 = lqu.c;
            lqv.c(arrayList, componentName, lquVar4, defpackage.zbd.gm, 2);
            iB = lqv.b(list2, lquVar4);
            if (iB > 0) {
                defpackage.oim oimVarU5 = defpackage.omf.u();
                defpackage.rrv rrvVarH6 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gg);
                rrvVarH6.p(componentName);
                oimVarU5.F(rrvVarH6.l());
            }
            i = lqvVar2.e;
            i2 = lqvVar2.f;
            if (i > 0) {
                defpackage.oim oimVarU6 = defpackage.omf.u();
                defpackage.rrv rrvVarH7 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gn);
                rrvVarH7.p(componentName);
                rrvVarH7.w(i);
                oimVarU6.F(rrvVarH7.l());
            }
            if (i2 > 0) {
                defpackage.oim oimVarU7 = defpackage.omf.u();
                defpackage.rrv rrvVarH8 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.go);
                rrvVarH8.p(componentName);
                rrvVarH8.w(i2);
                oimVarU7.F(rrvVarH8.l());
            }
            while (i3 < arrayList.size()) {
                if (i3 == 0) {
                    lquVar = lqv.b;
                } else {
                    lquVar = ((lqt) arrayList.get(i3 - 1)).b;
                }
                lqt lqtVar3 = (lqt) arrayList.get(i3);
                defpackage.rrv rrvVarH9 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gj);
                rrvVarH9.p(componentName);
                defpackage.abor aborVarF2 = rrvVarH9.F();
                int iA3 = lquVar.a();
                aborVarF2.t();
                defpackage.zas zasVar5 = (defpackage.zas) aborVarF2.b;
                defpackage.zas zasVar6 = defpackage.zas.a;
                zasVar5.b |= 2;
                zasVar5.d = iA3;
                int iA4 = lqtVar3.b.a();
                aborVarF2.t();
                defpackage.zas zasVar7 = (defpackage.zas) aborVarF2.b;
                zasVar7.b |= 1;
                zasVar7.c = iA4;
                long epochMilli2 = lqtVar3.a.toEpochMilli();
                aborVarF2.t();
                defpackage.zas zasVar8 = (defpackage.zas) aborVarF2.b;
                zasVar8.b |= 8;
                zasVar8.f = epochMilli2;
                defpackage.omf.u().F(rrvVarH9.l());
            }
        } else if (lqjVar.a()) {
            defpackage.oim oimVarU8 = defpackage.omf.u();
            defpackage.rrv rrvVarH10 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gh);
            rrvVarH10.v(defpackage.zbf.MEDIA_AUTOPLAY_CANNOT_IDENTIFY_TARGET_APP);
            oimVarU8.F(rrvVarH10.l());
        }
        this.h = null;
        lqnVar.a = false;
    }

    public final void e(java.io.PrintWriter printWriter) {
        printWriter.println("## Autoplay Intent");
        printWriter.print("Autoplay trigger decision: ");
        defpackage.lqn lqnVar = this.g;
        printWriter.println(((defpackage.lqk) lqnVar.get()).a);
        printWriter.print("Autoplay trigger target: ");
        printWriter.println(((defpackage.lqk) lqnVar.get()).b);
        printWriter.println();
        lqv lqvVar = this.h;
        if (lqvVar != null) {
            printWriter.println("## Autoplay Trigger History");
            for (lqt lqtVar : lqvVar.c) {
                printWriter.printf("%s: %s signal=%s\n", lqtVar.a.atZone((j$.time.ZoneId) defpackage.ojm.a().a).toLocalDateTime(), lqtVar.b, lqtVar.c);
            }
            printWriter.println();
        }
        defpackage.lqq lqqVar = this.l;
        printWriter.println("## Autoplay Persistence History");
        for (defpackage.lqp lqpVar : lqqVar.f) {
            printWriter.printf("%s: %s = %s\n", lqpVar.a.atZone((j$.time.ZoneId) defpackage.ojm.a().a).toLocalDateTime(), lqpVar.b, java.lang.Boolean.valueOf(lqpVar.c));
        }
        printWriter.println();
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        defpackage.zbd zbdVar;
        super.eQ();
        defpackage.mni.a().b(defpackage.mnh.e, this);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.gearhead.autoplay.ACTION_DISABLE_AUTOPLAY");
        intentFilter.addAction("com.google.android.gearhead.autoplay.ACTION_KEEP_ON_AUTOPLAY");
        if (defpackage.actz.y()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4208)).u("displayDisableAutoplayNotificationEnabled flag is true");
            defpackage.duw.e(this.i, this.m, intentFilter, null, 4);
        }
        defpackage.lqn lqnVar = this.g;
        defpackage.lqj lqjVar = ((defpackage.lqk) lqnVar.get()).a;
        android.content.ComponentName componentName = ((defpackage.lqk) lqnVar.get()).b;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(4207)).M("AutoplayManager#start triggerTarget=%s triggerDecision=%s", componentName, lqjVar);
        int iOrdinal = lqjVar.ordinal();
        int i = 2;
        int i2 = 3;
        int i3 = 1;
        if (iOrdinal == 0) {
            zbdVar = defpackage.zbd.ga;
        } else if (iOrdinal == 1) {
            zbdVar = defpackage.zbd.ge;
        } else if (iOrdinal == 2) {
            zbdVar = defpackage.zbd.gf;
        } else if (iOrdinal == 3) {
            zbdVar = defpackage.zbd.gd;
        } else {
            if (iOrdinal != 4) {
                throw new java.lang.RuntimeException(null, null);
            }
            zbdVar = defpackage.zbd.gc;
        }
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.zbe zbeVar = defpackage.zbe.MEDIA_AUTOPLAY;
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, zbdVar);
        if (componentName != null) {
            rrvVarH.p(componentName);
        }
        defpackage.omf.u().F(rrvVarH.l());
        int i4 = 0;
        if (lqjVar.a()) {
            defpackage.omf.u().F(defpackage.omv.p(defpackage.acbk.E).l());
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.gi);
            if (componentName != null) {
                rrvVarH2.p(componentName);
            }
            defpackage.omf.u().F(rrvVarH2.l());
        }
        if (!defpackage.nuc.a().b()) {
            defpackage.omf.u().F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.gb).l());
            ((defpackage.yqj) yqmVar.l().ai((char) 4206)).u("No internet");
        }
        defpackage.lqq lqqVar = this.l;
        boolean zA = lqjVar.a();
        lqqVar.d.edit().remove("was_any_playback_interval_over_threshold").apply();
        lqqVar.i = zA;
        lqqVar.l = new defpackage.gkc((defpackage.xzo) defpackage.ojm.a().b);
        lqqVar.k = false;
        defpackage.eqp eqpVar = this.k;
        int i5 = 20;
        defpackage.eqp eqpVarC = defpackage.tcu.C(defpackage.tcu.v(defpackage.tcu.C(eqpVar, new defpackage.lnc(i5)), new defpackage.lqi(i3)), new defpackage.lqi(i4));
        defpackage.eqp eqpVarV = defpackage.tcu.v(new defpackage.oes(this.i), new defpackage.oat(i2));
        defpackage.eqp eqpVarE = defpackage.tcu.e(eqpVarC, eqpVarV, defpackage.kpu.c().i(), new defpackage.kvb(8));
        this.n = eqpVarE;
        eqpVarE.eM(this, lqqVar);
        if (!lqjVar.a() || componentName == null) {
            return;
        }
        defpackage.eqp eqpVarF = defpackage.lpg.j().f(componentName);
        defpackage.eqr eqrVar = new defpackage.eqr();
        eqrVar.r(eqpVarF, new lrj(eqrVar, 1));
        j$.time.Duration duration = d;
        defpackage.kqi kqiVar = new defpackage.kqi(14);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.eqp eqpVarD = defpackage.tcu.d(eqrVar, new lql(eqpVarV, kqiVar, duration, bool), new defpackage.kuy(16));
        defpackage.eqp eqpVarV2 = defpackage.tcu.v(eqpVarD, new defpackage.lqi(i));
        this.o = defpackage.tcu.e(defpackage.lmp.a().e() ? defpackage.tcu.v(defpackage.lsd.a().c, new defpackage.llr(componentName, i5)) : new defpackage.eqs(bool), eqpVarD, defpackage.tcu.e(f(eqpVarV2, e), f(defpackage.tcu.v(eqpVarD, new defpackage.lqi(i2)), f), defpackage.tcu.a(f(defpackage.tcu.c, b), f(eqpVarV2, c)), new defpackage.kvb(9)), new defpackage.kvb(7));
        defpackage.eqt lqvVar = new lqv(new ajnd(this));
        if (defpackage.actz.y()) {
            lqqVar.j = lqvVar;
        }
        this.p = lqvVar;
        defpackage.eqp eqpVar2 = this.o;
        if (eqpVar2 != null) {
            eqpVar2.eM(this, lqvVar);
            this.h = lqvVar;
            jui juiVar = new jui(this, componentName, 4);
            this.q = juiVar;
            eqpVar.eM(this, juiVar);
        }
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        e(printWriter);
        defpackage.mnt.a(this.i, "media_autoplay", printWriter);
    }
}
