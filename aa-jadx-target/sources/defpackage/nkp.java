package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkp extends defpackage.ers {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.RailViewModel");
    public final defpackage.qsh b;
    public final defpackage.eqp c;
    public final defpackage.eqp d;
    public final defpackage.eqp e;
    public final defpackage.eqp f;
    public final defpackage.eqs g;
    public final defpackage.eqp i;
    public final defpackage.eqp j;
    public final defpackage.njm k;
    public final defpackage.eqp l;
    public final defpackage.eqp m;
    public final defpackage.eqp n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final defpackage.eqs r;
    private int s;
    private final java.util.Random t;
    private final defpackage.afar u;
    private final defpackage.eqp v;
    private final defpackage.eqp w;
    private final defpackage.eqp x;

    public nkp(defpackage.qsh qshVar) {
        this.b = qshVar;
        this.t = new java.util.Random();
        int i = 3;
        this.u = new defpackage.afay(new defpackage.njw(this, i));
        defpackage.ygw ygwVar = defpackage.oek.a;
        defpackage.eqp eqpVar = ((defpackage.oek) defpackage.mkp.a.i(defpackage.oek.class)).c;
        this.v = eqpVar;
        defpackage.lhq lhqVarA = defpackage.lhq.a.a();
        defpackage.nfx nfxVarA = defpackage.nfx.a.a();
        defpackage.kkw kkwVarA = defpackage.kkw.a.a();
        defpackage.akm akmVar = new defpackage.akm(this, 8);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVarH = defpackage.tcu.H(lhqVarA, nfxVarA, kkwVarA, akmVar);
        this.w = eqpVarH;
        eqpVarH.getClass();
        this.c = defpackage.ebo.f(eqpVarH, new defpackage.tci(2));
        defpackage.dee deeVar = new defpackage.dee(19);
        eqpVar.getClass();
        eqpVarH.getClass();
        this.d = new defpackage.tcj(eqpVar, eqpVarH, deeVar);
        this.e = defpackage.ebo.f(i(), new defpackage.nkn(1));
        int i2 = defpackage.nqz.a;
        this.f = defpackage.nqy.a.a();
        android.content.ComponentName componentName = defpackage.nye.a;
        defpackage.tct tctVar = new defpackage.tct(defpackage.ebo.f(((defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class)).d, new defpackage.nkn(0)), j$.time.Duration.ZERO);
        this.x = tctVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.eqs eqsVar = new defpackage.eqs(bool);
        this.g = eqsVar;
        this.i = defpackage.tcu.a(tctVar, eqsVar);
        defpackage.yqm yqmVar = defpackage.mpj.a;
        defpackage.eqp eqpVarF = defpackage.ebo.f(((defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class)).h, new defpackage.nkn(2));
        this.j = eqpVarF;
        this.k = new defpackage.njm();
        this.l = defpackage.mps.e();
        defpackage.nkn nknVar = new defpackage.nkn(i);
        eqpVarF.getClass();
        defpackage.ebo.f(eqpVarF, nknVar);
        defpackage.nfp.a.a();
        if (qshVar == null) {
            defpackage.yqm yqmVar2 = defpackage.kit.a;
            qshVar = ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).e();
            qshVar.getClass();
        }
        qshVar.getClass();
        defpackage.yqm yqmVar3 = defpackage.kit.a;
        this.m = (((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).r() && defpackage.ebq.n(qshVar)) ? new defpackage.nfq(qshVar) : new defpackage.eqs(null);
        this.n = defpackage.ngk.a.a().c;
        defpackage.yqm yqmVar4 = defpackage.nte.a;
        boolean zD = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().D();
        this.o = zD;
        this.p = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().F() & zD;
        this.q = zD & ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().G(defpackage.nta.m);
        this.r = new defpackage.eqs(bool);
    }

    private static final nsc s() {
        return defpackage.nse.b().a();
    }

    private static final void t(int i) {
        if (i == 2) {
            a.l().u("Closing Assistant due to Dashboard action");
            defpackage.kpu.c().j(defpackage.yxp.RAIL_ICON_CLICKED);
        }
    }

    private final void u(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.net.Uri uri, int i) {
        ((defpackage.yqj) a.f()).u("Robin model notification triggered");
        defpackage.nuz nuzVarB = defpackage.nuz.b();
        nvc nvcVar = new nvc();
        nvcVar.m = str;
        nvcVar.n = "See phone notification for details";
        nvcVar.d = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131231573);
        nvcVar.a = nvf.d;
        nvcVar.x = defpackage.nve.a;
        nvcVar.f = "com.google.android.projection.gearhead";
        nuzVarB.j("UPGRADE_ROBIN_MODEL", i, nvcVar.b());
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268468224);
        android.content.ClipData clipData = wer.a;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
        defpackage.maz.c();
        defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
        dteVar.n(2131231573);
        dteVar.g = activity;
        dteVar.i(str2);
        dteVar.h(str3);
        dteVar.i = 0;
        android.app.Notification notificationA = dteVar.a();
        notificationA.getClass();
        new defpackage.dun(context).b(null, i, notificationA);
        this.s++;
    }

    public final defpackage.eqp a() {
        return this.k.f;
    }

    public final defpackage.eqp b() {
        return this.k.d;
    }

    public final defpackage.eqp c() {
        return ((defpackage.kxi) defpackage.mkp.a.i(defpackage.kxi.class)).h();
    }

    public final defpackage.eqp e() {
        return ((defpackage.kxi) defpackage.mkp.a.i(defpackage.kxi.class)).i();
    }

    public final defpackage.eqp f(final boolean z, final int i, defpackage.nkj nkjVar) {
        nkjVar.getClass();
        final defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.eqs eqsVar = this.r;
        return defpackage.tcu.h(nkjVar.f(), nkjVar.e(), nkjVar.g(), nkjVar.b(), nkjVar.h(eqsVar), nkjVar.i(eqsVar), new defpackage.affk() { // from class: nkm
            /* JADX WARN: Code duplicated, block: B:79:0x0177 A[PHI: r13
  0x0177: PHI (r13v8 nne) = (r13v6 nne), (r13v12 nne) binds: [B:77:0x0174, B:67:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // defpackage.affk
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                java.util.List listAc;
                java.lang.Object next;
                defpackage.nne nneVar;
                java.lang.Object next2;
                defpackage.nne nneVar2 = (defpackage.nne) obj;
                defpackage.nne nneVar3 = (defpackage.nne) obj2;
                defpackage.nne nneVar4 = (defpackage.nne) obj3;
                defpackage.nne nneVar5 = (defpackage.nne) obj4;
                java.util.List list = (java.util.List) obj5;
                defpackage.nne nneVar6 = (defpackage.nne) obj6;
                defpackage.yqm yqmVar = defpackage.nkp.a;
                nneVar2.getClass();
                nneVar3.getClass();
                nneVar4.getClass();
                nneVar5.getClass();
                list.getClass();
                nneVar6.getClass();
                boolean zV = defpackage.acyc.V();
                boolean z2 = z;
                int i2 = i;
                boolean z3 = z2 && i2 <= 2;
                if (zV) {
                    defpackage.afct afctVar = new defpackage.afct(10);
                    if (nneVar2.b != null) {
                        afctVar.add(nneVar2);
                    }
                    if (!z3) {
                        if (nneVar3.b != null) {
                            afctVar.add(nneVar3);
                        }
                        afctVar.add(nneVar4);
                    } else if (nneVar5.b != null) {
                        afctVar.add(nneVar5);
                    }
                    int iMax = java.lang.Math.max(0, i2 - afctVar.b);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj7 : list) {
                        if (((defpackage.nne) obj7).b != null) {
                            arrayList.add(obj7);
                        }
                    }
                    afctVar.addAll(defpackage.afga.aU(defpackage.afga.aX(arrayList, iMax)));
                    listAc = afctVar.f();
                } else {
                    listAc = z3 ? defpackage.afga.ac(nneVar2, nneVar5) : defpackage.afga.ac(nneVar2, nneVar3, nneVar4, nneVar6);
                }
                defpackage.afgv afgvVar2 = afgvVar;
                java.util.List listAX = defpackage.afga.aX(listAc, i2);
                java.util.List<defpackage.nne> list2 = (java.util.List) afgvVar2.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = listAX.iterator();
                while (it.hasNext()) {
                    android.content.ComponentName componentName = ((defpackage.nne) it.next()).b;
                    if (componentName != null) {
                        arrayList2.add(componentName);
                    }
                }
                if (arrayList2.size() == defpackage.afga.bf(arrayList2).size()) {
                    if (list2 != null && list2.size() == listAX.size()) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            defpackage.nne nneVar7 = (defpackage.nne) it2.next();
                            android.content.ComponentName componentName2 = nneVar7 != null ? nneVar7.b : null;
                            if (componentName2 != null) {
                                arrayList3.add(componentName2);
                            }
                        }
                        if (defpackage.afga.f(defpackage.afga.bf(arrayList3), defpackage.afga.bf(arrayList2))) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.afga.aj(list2, 10));
                            for (defpackage.nne nneVar8 : list2) {
                                if ((nneVar8 != null ? nneVar8.b : null) != null) {
                                    java.util.Iterator it3 = listAX.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (!defpackage.afga.f(((defpackage.nne) next2).b, nneVar8.b));
                                    nneVar = (defpackage.nne) next2;
                                    if (nneVar != null) {
                                        nneVar8 = nneVar;
                                    }
                                } else {
                                    java.util.Iterator it4 = listAX.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it4.next();
                                    } while (((defpackage.nne) next).b != null);
                                    nneVar = (defpackage.nne) next;
                                    if (nneVar != null) {
                                        nneVar8 = nneVar;
                                    }
                                }
                                arrayList4.add(nneVar8);
                            }
                            afgvVar2.a = arrayList4;
                            return arrayList4;
                        }
                    }
                    afgvVar2.a = listAX;
                }
                return listAX;
            }
        });
    }

    public final defpackage.eqp h() {
        return defpackage.lhq.a.a();
    }

    public final defpackage.eqp i() {
        defpackage.eqp eqpVarG = ((defpackage.kxc) defpackage.mkp.a.i(defpackage.kxc.class)).g();
        eqpVarG.getClass();
        return eqpVarG;
    }

    public final defpackage.eqp j() {
        defpackage.eqp eqpVarJ = ((defpackage.kxc) defpackage.mkp.a.i(defpackage.kxc.class)).j();
        defpackage.eqp eqpVarF = defpackage.mps.f();
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVarA = defpackage.tcu.a(eqpVarJ, defpackage.ebo.f(eqpVarF, new defpackage.tci(2)));
        defpackage.eqp eqpVar = this.v;
        eqpVar.getClass();
        return defpackage.tcu.a(eqpVarA, defpackage.ebo.f(eqpVar, new defpackage.tci(2)));
    }

    public final defpackage.sax k() {
        return (defpackage.sax) this.u.a();
    }

    public final void l() {
        if (!defpackage.ler.c().fY()) {
            ((defpackage.yqj) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((defpackage.yqj) a.f()).u("executeIfStarted lifetime has started, executing logic");
        android.view.KeyEvent keyEvent = new android.view.KeyEvent(0L, android.os.SystemClock.uptimeMillis(), 0, 4, 0, 0, 0, 0, 4);
        android.view.KeyEvent keyEvent2 = new android.view.KeyEvent(0L, android.os.SystemClock.uptimeMillis(), 1, 4, 0, 0, 0, 0, 4);
        com.google.android.gms.car.display.CarRegionId carRegionIdR = defpackage.nte.c().b().r(defpackage.nta.d);
        k().g(carRegionIdR, keyEvent);
        k().g(carRegionIdR, keyEvent2);
    }

    public final void m(int i) {
        if (!defpackage.ler.c().fY()) {
            ((defpackage.yqj) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((defpackage.yqj) a.f()).u("executeIfStarted lifetime has started, executing logic");
        kkq.a();
        t(i);
        s().i();
    }

    public final void n(int i) {
        if (!defpackage.ler.c().fY()) {
            ((defpackage.yqj) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((defpackage.yqj) a.f()).u("executeIfStarted lifetime has started, executing logic");
        kkq.a();
        t(i);
        s().eN();
    }

    public final void o(int i) {
        if (!defpackage.ler.c().fY()) {
            ((defpackage.yqj) a.g()).u("executeIfStarted lifetime not yet started, not executing logic");
            return;
        }
        ((defpackage.yqj) a.f()).u("executeIfStarted lifetime has started, executing logic");
        kkq.a();
        t(i);
        s().h();
    }

    public final void p(int i, defpackage.kxh kxhVar, android.content.Context context, boolean z) {
        kxhVar.getClass();
        if (!defpackage.acnf.A()) {
            ((defpackage.yqj) a.g()).u("Old robin model detected");
        }
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL, defpackage.zbd.e);
        rrvVarH.A(i);
        oimVarU.F(rrvVarH.l());
        if (i == 2 && kxhVar == defpackage.kxh.b) {
            a.l().u("Closing Assistant due to Assistant action");
            defpackage.kpu.c().j(defpackage.yxp.RAIL_ICON_CLICKED);
        } else {
            a.l().u("Open Assistant due to Assistant action");
            defpackage.kpu.c().k(1);
        }
        if (!z || context == null || defpackage.acnf.A() || !defpackage.afga.f(i().e(), java.lang.Boolean.TRUE) || this.t.nextDouble() >= defpackage.acnf.g() || this.s >= defpackage.acnf.n()) {
            return;
        }
        if (defpackage.acnf.F()) {
            android.net.Uri uri = android.net.Uri.parse("http://goto.google.com/join-gemini-aap-dogfood");
            uri.getClass();
            u(context, "Join Gemini Dogfood for Android Auto", "Join Gemini Dogfood for Android Auto", "go/join-gemini-aap-dogfood", uri, 2131427336);
        } else if (defpackage.acnf.E()) {
            android.net.Uri uri2 = android.net.Uri.parse("http://goto.google.com/upgrade-aap-gemini-model-teamfood");
            uri2.getClass();
            u(context, "Please Upgrade Gemini Model", "Join Gemini Teamfood for latest Gemini Model", "go/upgrade-aap-gemini-model-teamfood", uri2, 2131427335);
        }
    }

    public final boolean q() {
        defpackage.lek.a.a();
        return defpackage.acnf.a.fF().w();
    }

    public final void r(android.content.Context context) {
        defpackage.zbe zbeVar;
        if (defpackage.kgl.i()) {
            defpackage.ngy.g().h(kgm.a);
            if (context == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            a.l().u("Sending a request for a bugreport");
            context.sendBroadcast(com.google.android.apps.auto.components.bugreport.BugreporterReceiver.c("ORIGIN_LONG_PRESS", (java.lang.String) null));
            return;
        }
        defpackage.ngy.g().h(ldn.a);
        a.l().u("Saving app feedback using FeedbackManager");
        defpackage.mqj mqjVar = (defpackage.mqj) this.j.e();
        defpackage.mqg mqgVar = mqjVar != null ? mqjVar.b : defpackage.mqg.OTHER;
        defpackage.lbq lbqVarS = defpackage.jzb.s();
        defpackage.oim oimVarU = defpackage.omf.u();
        int iOrdinal = mqgVar.ordinal();
        if (iOrdinal == 1) {
            zbeVar = defpackage.zbe.MAPS_FACET;
        } else if (iOrdinal == 2) {
            zbeVar = defpackage.zbe.PHONE_FACET;
        } else if (iOrdinal != 3) {
            zbeVar = iOrdinal != 5 ? defpackage.zbe.UNKNOWN_CONTEXT : defpackage.zbe.OVERVIEW_FACET;
        } else {
            zbeVar = defpackage.zbe.MEDIA_FACET;
        }
        java.lang.String strB = oimVarU.b(zbeVar);
        strB.getClass();
        lbqVarS.a(context, strB);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL, defpackage.zbd.eN).l());
    }

    public nkp() {
        this(null);
    }
}
