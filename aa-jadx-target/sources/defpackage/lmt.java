package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lmt extends defpackage.lhm implements defpackage.ljz {
    public static final /* synthetic */ int h = 0;
    private static final defpackage.yqm i = defpackage.yqm.c("GH.MediaManager");
    public android.content.ComponentName a;
    public boolean b;
    public android.content.ComponentName c;
    public boolean d;
    public boolean g;
    private final java.lang.String k;
    private long m;
    private defpackage.eqp p;
    private defpackage.eqp r;
    private final android.os.Handler l = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.List e = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.Map f = new java.util.HashMap();
    private final defpackage.eqp n = defpackage.ebo.e(defpackage.lhe.b().a(defpackage.mqg.MEDIA));
    private final defpackage.lms o = new defpackage.lms(this);
    private final defpackage.eqt q = new defpackage.kqk(this, 12);
    private final defpackage.eqt s = new defpackage.kqk(this, 13);

    public lmt(android.content.Context context) {
        java.lang.String string = context.getString(2132083926);
        this.k = string;
        defpackage.lkd lkdVarA = defpackage.lke.a();
        lkdVarA.d(string);
        lkdVarA.a();
    }

    @Override // defpackage.ljz
    public final android.content.ComponentName a() {
        return this.a;
    }

    @Override // defpackage.ljz
    public final java.lang.String b() {
        return this.k;
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        android.os.Handler handler = this.l;
        if (handler.hasMessages(0)) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.hg).l());
        }
        handler.removeCallbacksAndMessages(null);
        this.f.clear();
        this.g = false;
        this.e.clear();
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = false;
        defpackage.eqp eqpVar = this.n;
        defpackage.lms lmsVar = this.o;
        eqpVar.k(lmsVar);
        lmsVar.b();
        defpackage.eqp eqpVar2 = this.p;
        if (eqpVar2 != null) {
            eqpVar2.k(this.q);
            this.p = null;
        }
        defpackage.eqp eqpVar3 = this.r;
        if (eqpVar3 != null) {
            eqpVar3.k(this.s);
            this.r = null;
        }
    }

    @Override // defpackage.ljz
    public final void e(ljy ljyVar) {
        this.e.add(ljyVar);
        android.content.ComponentName componentName = this.a;
        if (componentName != null) {
            ljyVar.a(componentName);
            android.content.Intent intent = (android.content.Intent) this.f.get(componentName);
            if (intent != null) {
                ljyVar.b(intent, this.b, componentName);
            }
        }
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        this.n.eM(this, this.o);
        defpackage.ojm.a();
        this.m = android.os.SystemClock.elapsedRealtime();
        defpackage.eqp eqpVarB = defpackage.loo.b();
        this.p = eqpVarB;
        eqpVarB.eM(this, this.q);
        defpackage.eqp eqpVarV = defpackage.tcu.v(defpackage.tcu.C(this.p, new defpackage.llr(defpackage.lpg.j(), 5)), new defpackage.llk(15));
        this.r = eqpVarV;
        eqpVarV.eM(this, this.s);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0121  */
    /* JADX WARN: Code duplicated, block: B:34:0x0137  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x0156  */
    /* JADX WARN: Code duplicated, block: B:50:0x0167  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0199  */
    /* JADX WARN: Code duplicated, block: B:57:0x019f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0212  */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:77:0x022b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0237 A[LOOP:2: B:78:0x0231->B:80:0x0237, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0246 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ljz
    public final void f(android.content.Intent intent) {
        android.content.ComponentName componentNameA;
        android.content.ComponentName componentName;
        boolean z;
        defpackage.zbd zbdVar;
        defpackage.eqp eqpVarA;
        boolean zEquals;
        java.util.Iterator it;
        android.content.Intent intent2;
        if (intent == null) {
            ((defpackage.yqj) ((defpackage.yqj) i.h()).ai((char) 4006)).u("processSearchIntent() with null intent");
            return;
        }
        android.content.ComponentName componentName2 = this.a;
        if (componentName2 != null && (intent2 = (android.content.Intent) this.f.remove(componentName2)) != null) {
            java.util.Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                ((ljy) it2.next()).c(intent2, componentName2);
            }
        }
        defpackage.lsj lsjVarF = defpackage.lsj.f();
        java.lang.String strBv = defpackage.ysr.bv(intent.getStringExtra("query"));
        java.lang.String str = intent.getPackage();
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.projection.gearhead.ignore_playback_action", false);
        android.os.Bundle bundle = (android.os.Bundle) new defpackage.nub(intent.getExtras()).h(new defpackage.joi(7));
        defpackage.yqm yqmVar = defpackage.lsj.a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(4261);
        java.lang.String action = intent.getAction();
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.T("processSearchIntent() query=%s intentAction=%s packageName=%s skipPlayFromSearch=%s extras=%s", strBv, new defpackage.zkf(zkeVar, action), new defpackage.zkf(zkeVar, str), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(booleanExtra)), bundle);
        lsjVarF.d.cancel();
        android.content.ComponentName componentName3 = lsjVarF.b;
        if (android.text.TextUtils.isEmpty(str)) {
            componentNameA = lsjVarF.c;
            if (componentNameA == null) {
                componentName = componentName3;
            }
            if (componentName == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 4262)).u("Cannot identify app to process search intent. Dropping intent");
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_ASSISTANT_SEARCH, defpackage.zbd.gu).l());
                componentName = null;
            } else {
                if (defpackage.adae.p()) {
                    if (!j$.util.Objects.equals(lsjVarF.c, componentName) && defpackage.lnt.d(intent) && lsjVarF.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!booleanExtra && !z) {
                        lsjVarF.d = defpackage.lsj.a(lsjVarF, componentName3, componentName, strBv, bundle);
                    }
                } else if (defpackage.lnt.d(intent)) {
                    android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
                    eqpVarA = defpackage.lot.a(componentName);
                    defpackage.eqs eqsVar = new defpackage.eqs();
                    defpackage.rox.q(eqpVarA, lsjVarF, new xeh(cancellationSignal, eqsVar, componentName, strBv, bundle, 1));
                    if (j$.util.Objects.equals(componentName3, componentName)) {
                        bundle = bundle;
                    } else {
                        bundle = bundle;
                        defpackage.rox.q(new lsh(eqpVarA, 15000L), lsjVarF, new defpackage.lkt(10));
                    }
                    android.content.ComponentName componentName4 = componentName;
                    lsg lsgVar = new lsg(lsjVarF, cancellationSignal, componentName3, componentName4, strBv, bundle);
                    componentName = componentName4;
                    strBv = strBv;
                    defpackage.rox.q(eqsVar, lsjVarF, lsgVar);
                    lsjVarF.d = cancellationSignal;
                } else if (!booleanExtra) {
                    lsjVarF.d = defpackage.lsj.a(lsjVarF, componentName3, componentName, strBv, bundle);
                }
                if (defpackage.jrk.d(intent)) {
                    zbdVar = defpackage.zbd.gt;
                } else {
                    zbdVar = defpackage.zbd.gv;
                }
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, zbdVar);
                rrvVarH.p(componentName);
                oimVarU.F(rrvVarH.l());
                defpackage.eqs eqsVarE = lsjVarF.e(componentName);
                defpackage.ojm.a();
                eqsVarE.m(new lsi(strBv, bundle, j$.time.Instant.now()));
            }
            if (componentName == null) {
                return;
            }
            if (!defpackage.lnt.d(intent)) {
                zEquals = j$.util.Objects.equals(this.a, componentName);
                if (!android.text.TextUtils.isEmpty(intent.getStringExtra("query"))) {
                    this.g = false;
                    this.f.put(componentName, intent);
                    if (zEquals) {
                        it = this.e.iterator();
                        while (it.hasNext()) {
                            ((ljy) it.next()).b(intent, this.b, componentName);
                        }
                        this.g = true;
                        return;
                    }
                } else if (zEquals) {
                    return;
                }
                defpackage.lhc.a().f(defpackage.mqg.MEDIA, componentName);
            }
            if (j$.util.Objects.equals(this.c, componentName) || android.text.TextUtils.isEmpty(intent.getStringExtra("query"))) {
                return;
            }
            this.g = false;
            this.f.put(componentName, intent);
            java.util.Iterator it3 = this.e.iterator();
            while (it3.hasNext()) {
                ((ljy) it3.next()).b(intent, this.d, componentName);
            }
            this.g = true;
            if (defpackage.adae.p()) {
                return;
            }
            if (!this.d) {
                defpackage.oim oimVarU2 = defpackage.omf.u();
                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, defpackage.zbd.gw);
                rrvVarH2.p(componentName);
                oimVarU2.F(rrvVarH2.l());
                return;
            }
            defpackage.mnu mnuVarP = defpackage.lxy.p();
            defpackage.ysr.bk(!defpackage.adae.p(), "method must be used only when flag is disabled");
            android.content.Intent intent3 = new android.content.Intent("MEDIA_SHOW_SEARCH_RESULTS");
            intent3.setComponent(componentName);
            mnuVarP.c(4, intent3);
            return;
        }
        str.getClass();
        componentNameA = defpackage.loo.a(defpackage.kit.b().e(), str);
        componentName = componentNameA;
        if (componentName == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 4262)).u("Cannot identify app to process search intent. Dropping intent");
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_ASSISTANT_SEARCH, defpackage.zbd.gu).l());
            componentName = null;
        } else {
            if (defpackage.adae.p()) {
                if (!j$.util.Objects.equals(lsjVarF.c, componentName)) {
                    z = false;
                } else {
                    z = false;
                }
                if (!booleanExtra) {
                    lsjVarF.d = defpackage.lsj.a(lsjVarF, componentName3, componentName, strBv, bundle);
                }
            } else if (defpackage.lnt.d(intent)) {
                android.os.CancellationSignal cancellationSignal2 = new android.os.CancellationSignal();
                eqpVarA = defpackage.lot.a(componentName);
                defpackage.eqs eqsVar2 = new defpackage.eqs();
                defpackage.rox.q(eqpVarA, lsjVarF, new xeh(cancellationSignal2, eqsVar2, componentName, strBv, bundle, 1));
                if (j$.util.Objects.equals(componentName3, componentName)) {
                    bundle = bundle;
                    defpackage.rox.q(new lsh(eqpVarA, 15000L), lsjVarF, new defpackage.lkt(10));
                } else {
                    bundle = bundle;
                }
                android.content.ComponentName componentName5 = componentName;
                lsg lsgVar2 = new lsg(lsjVarF, cancellationSignal2, componentName3, componentName5, strBv, bundle);
                componentName = componentName5;
                strBv = strBv;
                defpackage.rox.q(eqsVar2, lsjVarF, lsgVar2);
                lsjVarF.d = cancellationSignal2;
            } else if (!booleanExtra) {
                lsjVarF.d = defpackage.lsj.a(lsjVarF, componentName3, componentName, strBv, bundle);
            }
            if (defpackage.jrk.d(intent)) {
                zbdVar = defpackage.zbd.gt;
            } else {
                zbdVar = defpackage.zbd.gv;
            }
            defpackage.oim oimVarU3 = defpackage.omf.u();
            defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.ASSISTANT, zbdVar);
            rrvVarH3.p(componentName);
            oimVarU3.F(rrvVarH3.l());
            defpackage.eqs eqsVarE2 = lsjVarF.e(componentName);
            defpackage.ojm.a();
            eqsVarE2.m(new lsi(strBv, bundle, j$.time.Instant.now()));
        }
        if (componentName == null) {
            return;
        }
        if (!defpackage.lnt.d(intent)) {
            if (j$.util.Objects.equals(this.c, componentName)) {
                return;
            } else {
                return;
            }
        }
        zEquals = j$.util.Objects.equals(this.a, componentName);
        if (!android.text.TextUtils.isEmpty(intent.getStringExtra("query"))) {
            this.g = false;
            this.f.put(componentName, intent);
            if (zEquals) {
                it = this.e.iterator();
                while (it.hasNext()) {
                    ((ljy) it.next()).b(intent, this.b, componentName);
                }
                this.g = true;
                return;
            }
        } else if (zEquals) {
            return;
        }
        defpackage.lhc.a().f(defpackage.mqg.MEDIA, componentName);
    }

    @Override // defpackage.ljz
    public final void g(ljy ljyVar) {
        this.e.remove(ljyVar);
    }

    @Override // defpackage.ljz
    public final boolean h(android.content.ComponentName componentName) {
        defpackage.ojm.a();
        if (android.os.SystemClock.elapsedRealtime() - this.m > 5000) {
            return false;
        }
        defpackage.lqz lqzVarA = defpackage.lqz.a();
        defpackage.lqn lqnVar = lqzVarA.g;
        defpackage.lqj lqjVar = ((defpackage.lqk) lqnVar.get()).a;
        if (!j$.util.Objects.equals(componentName, ((defpackage.lqk) lqnVar.get()).b) || !lqjVar.a()) {
            return false;
        }
        lqv lqvVar = lqzVarA.h;
        if (lqvVar != null) {
            return !lqv.d(lqvVar.c, lqu.g);
        }
        return true;
    }
}
