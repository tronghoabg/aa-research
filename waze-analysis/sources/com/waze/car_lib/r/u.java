package com.waze.car_lib.r;

import android.content.Context;
import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;
import com.waze.config.ConfigValues;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21706a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.bj f21707b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21708c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.b.b.c f21709d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.ai f21710e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sound.m f21711f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.sound.es f21712g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.al f21713h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.reports_v2.c.br f21714i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.reports_v2.c.ch f21715j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.an.d.b f21716k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21717l;
    private final kotlinx.coroutines.b.ch m;
    private final com.waze.car_lib.login.a.a n;

    public u(Context context, com.waze.reports_v2.c.bj bjVar, com.waze.shared_infra.i.e eVar, com.waze.car_lib.b.b.c cVar, com.waze.car_lib.login.a.a aVar, com.waze.car_lib.ai aiVar, com.waze.sound.m mVar, com.waze.sound.es esVar, com.waze.reports_v2.presentation.al alVar, com.waze.reports_v2.c.br brVar, com.waze.reports_v2.c.ch chVar, com.waze.an.d.b bVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(bjVar, "conversationalReportingController");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cVar, "subtypeTransformer");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(aiVar, "sttService");
        h.g.b.x.f(mVar, "ttsService");
        h.g.b.x.f(esVar, "soundManager");
        h.g.b.x.f(alVar, "soundPlayer");
        h.g.b.x.f(brVar, "reportMenuOnboardingController");
        h.g.b.x.f(chVar, "getAndPlayConversationalReportingTtsStringUseCase");
        h.g.b.x.f(bVar, "notificationInsightsService");
        this.f21706a = context;
        this.f21707b = bjVar;
        this.f21708c = eVar;
        this.f21709d = cVar;
        this.n = aVar;
        this.f21710e = aiVar;
        this.f21711f = mVar;
        this.f21712g = esVar;
        this.f21713h = alVar;
        this.f21714i = brVar;
        this.f21715j = chVar;
        this.f21716k = bVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(com.waze.car_lib.b.bi.f19030a);
        this.f21717l = bnVarB;
        this.m = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.car_lib.r.u r5, androidx.car.app.CarContext r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.car_lib.r.n
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.r.n r0 = (com.waze.car_lib.r.n) r0
            int r1 = r0.f21683c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21683c = r1
            goto L18
        L13:
            com.waze.car_lib.r.n r0 = new com.waze.car_lib.r.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21681a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21683c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            com.waze.reports_v2.c.ch r7 = r5.f21715j
            com.waze.reports_v2.c.ce r2 = new com.waze.reports_v2.c.ce
            com.waze.reports_v2.c.cb r4 = n()
            r2.<init>(r4)
            com.waze.reports_v2.c.cf r2 = (com.waze.reports_v2.c.cf) r2
            android.content.Context r6 = (android.content.Context) r6
            r0.f21683c = r3
            java.lang.Object r7 = r7.c(r2, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.waze.sound.f r7 = (com.waze.sound.f) r7
            com.waze.sound.d r6 = com.waze.sound.d.f39735a
            boolean r6 = h.g.b.x.n(r7, r6)
            if (r6 == 0) goto L61
            com.waze.car_lib.b.ay r6 = new com.waze.car_lib.b.ay
            com.waze.car_lib.b.bt r7 = com.waze.car_lib.b.bt.f19068d
            r6.<init>(r7)
            com.waze.ads.c.e r6 = (com.waze.ads.c.e) r6
            r5.l(r6)
            goto L7f
        L61:
            com.waze.sound.e r6 = com.waze.sound.e.f39834a
            boolean r6 = h.g.b.x.n(r7, r6)
            if (r6 == 0) goto L82
            int r6 = com.waze.car_lib.login.a.a.a()
            int r6 = r6 + r3
            long r6 = (long) r6
            com.waze.config.c r0 = com.waze.config.ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_SHOWN_COUNT
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.d(r6)
            com.waze.car_lib.b.ba r6 = com.waze.car_lib.b.ba.f19022a
            com.waze.ads.c.e r6 = (com.waze.ads.c.e) r6
            r5.l(r6)
        L7f:
            h.ab r5 = h.ab.f48028a
            return r5
        L82:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.u.c(com.waze.car_lib.r.u, androidx.car.app.CarContext, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.car_lib.r.u r4, com.waze.car_lib.b.bj r5, androidx.car.app.CarContext r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.car_lib.r.p
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.r.p r0 = (com.waze.car_lib.r.p) r0
            int r1 = r0.f21690c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21690c = r1
            goto L18
        L13:
            com.waze.car_lib.r.p r0 = new com.waze.car_lib.r.p
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f21688a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21690c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            java.lang.String r5 = r5.f()
            r0.f21690c = r3
            java.lang.Object r7 = r4.m(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.waze.sound.f r7 = (com.waze.sound.f) r7
            com.waze.sound.d r5 = com.waze.sound.d.f39735a
            boolean r5 = h.g.b.x.n(r7, r5)
            if (r5 != 0) goto L62
            if (r7 != 0) goto L4c
            goto L62
        L4c:
            com.waze.sound.e r5 = com.waze.sound.e.f39834a
            boolean r5 = h.g.b.x.n(r7, r5)
            if (r5 == 0) goto L5c
            com.waze.car_lib.b.az r5 = com.waze.car_lib.b.az.f19006a
            com.waze.ads.c.e r5 = (com.waze.ads.c.e) r5
            r4.l(r5)
            goto L6e
        L5c:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L62:
            com.waze.car_lib.b.ay r5 = new com.waze.car_lib.b.ay
            com.waze.car_lib.b.bt r6 = com.waze.car_lib.b.bt.f19068d
            r5.<init>(r6)
            com.waze.ads.c.e r5 = (com.waze.ads.c.e) r5
            r4.l(r5)
        L6e:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.u.e(com.waze.car_lib.r.u, com.waze.car_lib.b.bj, androidx.car.app.CarContext, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.car_lib.r.u r4, com.waze.reports_v2.c.bf r5, h.c.e r6) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.u.f(com.waze.car_lib.r.u, com.waze.reports_v2.c.bf, h.c.e):java.lang.Object");
    }

    static final h.ab g(final u uVar, final com.waze.car_lib.b.a.a aVar, final CarContext carContext) {
        final h.g.b.aq aqVar = new h.g.b.aq();
        com.waze.an.a.u uVar2 = new com.waze.an.a.u("ConversationalReportingViewModel.success", com.waze.an.a.ae.f14552h);
        String strB = aVar.b();
        Integer numValueOf = Integer.valueOf(aVar.a());
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_IN_CAR_ALERTER_TIME_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        if (com.waze.an.c.q.b(uVar.f21716k, uVar2, new com.waze.an.a.k(strB, null, numValueOf, new com.waze.an.a.j(h.o.c.j(lB.longValue(), h.o.d.f48273d), new com.waze.car_lib.screens.cp(18), null), h.a.i.h()), new h.g.a.a() { // from class: com.waze.car_lib.r.m
            @Override // h.g.a.a
            public final Object invoke() {
                int i2 = kotlinx.coroutines.av.f51370a;
                kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.plus(kotlinx.coroutines.aj.Q()));
                h.g.b.aq aqVar2 = aqVar;
                aqVar2.f48105a = afVarE;
                kotlinx.coroutines.aj.z((kotlinx.coroutines.af) aqVar2.f48105a, null, null, new bi(uVar, aVar, carContext, (h.c.e) null, 1), 3);
                return h.ab.f48028a;
            }
        }, new com.waze.asks.ad(aqVar, 7), 16)) {
            uVar.f21708c.a("Success scheduled to be shown in insight");
        } else {
            uVar.f21708c.a("Success already there, cannot be added to insight");
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void j(final u uVar, final com.waze.car_lib.b.a.a aVar, final CarContext carContext) {
        h.g.a.a aVar2 = new h.g.a.a() { // from class: com.waze.car_lib.r.l
            @Override // h.g.a.a
            public final Object invoke() {
                return u.g(this.f21674a, aVar, carContext);
            }
        };
        String strD = uVar.f21713h.d(uVar.f21706a, com.waze.reports_v2.presentation.aj.f34794b);
        if (strD != null) {
            uVar.f21712g.c(strD, null, true, true, new com.waze.asks.ad(aVar2, 8));
        } else {
            aVar2.invoke();
        }
    }

    public static final /* synthetic */ void k(u uVar, CarContext carContext) {
        uVar.f21713h.e();
        uVar.f21710e.c(carContext, new com.waze.c.e.a.a(new com.waze.c.e.a.a(uVar, 6), 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r6, androidx.car.app.CarContext r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.car_lib.r.o
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.car_lib.r.o r0 = (com.waze.car_lib.r.o) r0
            int r1 = r0.f21686c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21686c = r1
            goto L18
        L13:
            com.waze.car_lib.r.o r0 = new com.waze.car_lib.r.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f21684a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21686c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.String r6 = r0.f21687d
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            e.b.c.b(r8)
            goto L4e
        L3b:
            e.b.c.b(r8)
            com.waze.sound.m r5 = r5.f21711f
            android.content.Context r7 = (android.content.Context) r7
            r0.f21687d = r6
            r0.f21686c = r4
            java.lang.String r8 = "ConversationalReportingViewModel"
            java.lang.Object r8 = com.waze.sound.fb.f(r5, r7, r8, r0)
            if (r8 == r1) goto L61
        L4e:
            com.waze.sound.m r8 = (com.waze.sound.m) r8
            r5 = 0
            if (r8 == 0) goto L60
            r0.f21687d = r5
            r0.f21686c = r3
            java.lang.Object r8 = r8.c(r6, r4, r0)
            if (r8 == r1) goto L61
        L5d:
            com.waze.sound.f r8 = (com.waze.sound.f) r8
            return r8
        L60:
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.u.m(java.lang.String, androidx.car.app.CarContext, h.c.e):java.lang.Object");
    }

    private static final com.waze.reports_v2.c.cb n() {
        String strB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_PATTERN.b();
        h.g.b.x.e(strB, "getValue(...)");
        String lowerCase = strB.toLowerCase(Locale.ROOT);
        h.g.b.x.e(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        Character chK = h.n.o.K(str, com.waze.car_lib.login.a.a.a());
        if (chK == null) {
            chK = h.n.o.L(str);
        }
        return (chK != null && chK.charValue() == 'a') ? com.waze.reports_v2.c.cb.f34317a : (chK != null && chK.charValue() == 'b') ? com.waze.reports_v2.c.cb.f34318b : (chK != null && chK.charValue() == 'c') ? com.waze.reports_v2.c.cb.f34319c : com.waze.reports_v2.c.cb.f34319c;
    }

    public final kotlinx.coroutines.b.ch i() {
        return this.m;
    }

    public final void l(com.waze.ads.c.e eVar) {
        Object objD;
        Object objD2;
        com.waze.reports_v2.c.ar arVar;
        com.waze.reports_v2.c.aq aqVar;
        h.g.b.x.f(eVar, NotificationCompat.CATEGORY_EVENT);
        if (eVar instanceof com.waze.car_lib.b.aw) {
            com.waze.reports_v2.c.bj bjVar = this.f21707b;
            com.waze.car_lib.b.bs bsVarI = ((com.waze.car_lib.b.aw) eVar).i();
            h.g.b.x.f(bsVarI, "<this>");
            com.waze.car_lib.b.bs bsVar = com.waze.car_lib.b.bs.f19059a;
            com.waze.car_lib.b.bt btVar = com.waze.car_lib.b.bt.f19065a;
            com.waze.reports_v2.c.aq aqVar2 = com.waze.reports_v2.c.aq.f34202a;
            com.waze.reports_v2.c.ar arVar2 = com.waze.reports_v2.c.ar.f34210a;
            com.waze.car_lib.aa aaVar = com.waze.car_lib.aa.f18868a;
            int iOrdinal = bsVarI.ordinal();
            if (iOrdinal == 0) {
                aqVar = com.waze.reports_v2.c.aq.f34208g;
            } else if (iOrdinal == 1) {
                aqVar = com.waze.reports_v2.c.aq.f34205d;
            } else if (iOrdinal == 2) {
                aqVar = com.waze.reports_v2.c.aq.f34202a;
            } else if (iOrdinal == 3) {
                aqVar = com.waze.reports_v2.c.aq.f34206e;
            } else {
                if (iOrdinal != 4) {
                    throw new h.i();
                }
                aqVar = com.waze.reports_v2.c.aq.f34207f;
            }
            bjVar.k(new com.waze.reports_v2.c.as(aqVar));
            return;
        }
        if (eVar instanceof com.waze.car_lib.b.ay) {
            com.waze.reports_v2.c.bj bjVar2 = this.f21707b;
            com.waze.car_lib.b.bt btVarI = ((com.waze.car_lib.b.ay) eVar).i();
            h.g.b.x.f(btVarI, "<this>");
            com.waze.car_lib.b.bs bsVar2 = com.waze.car_lib.b.bs.f19059a;
            com.waze.car_lib.b.bt btVar2 = com.waze.car_lib.b.bt.f19065a;
            com.waze.reports_v2.c.aq aqVar3 = com.waze.reports_v2.c.aq.f34202a;
            com.waze.reports_v2.c.ar arVar3 = com.waze.reports_v2.c.ar.f34210a;
            com.waze.car_lib.aa aaVar2 = com.waze.car_lib.aa.f18868a;
            switch (btVarI.ordinal()) {
                case 0:
                    arVar = com.waze.reports_v2.c.ar.f34215f;
                    break;
                case 1:
                    arVar = com.waze.reports_v2.c.ar.f34216g;
                    break;
                case 2:
                    arVar = com.waze.reports_v2.c.ar.f34214e;
                    break;
                case 3:
                    arVar = com.waze.reports_v2.c.ar.f34217h;
                    break;
                case 4:
                    arVar = com.waze.reports_v2.c.ar.f34220k;
                    break;
                case 5:
                    arVar = com.waze.reports_v2.c.ar.f34219j;
                    break;
                case 6:
                    arVar = com.waze.reports_v2.c.ar.f34221l;
                    break;
                default:
                    throw new h.i();
            }
            bjVar2.k(new com.waze.reports_v2.c.au(arVar));
            return;
        }
        if (eVar instanceof com.waze.car_lib.b.be) {
            this.f21707b.k(new com.waze.reports_v2.c.aw(((com.waze.car_lib.b.be) eVar).i()));
            return;
        }
        if ((eVar instanceof com.waze.car_lib.b.ba) || (eVar instanceof com.waze.car_lib.b.az)) {
            kotlinx.coroutines.b.bn bnVar = this.f21717l;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, com.waze.car_lib.b.bl.f19033a));
            return;
        }
        if (eVar instanceof com.waze.car_lib.b.ax) {
            this.f21707b.k(com.waze.reports_v2.c.av.f34225a);
            return;
        }
        if (eVar instanceof com.waze.car_lib.b.bd) {
            if (this.f21714i.b()) {
                return;
            }
            this.f21707b.k(com.waze.reports_v2.c.av.f34225a);
        } else if (eVar instanceof com.waze.car_lib.b.bb) {
            this.f21707b.k(com.waze.reports_v2.c.at.f34223a);
        } else {
            if (!(eVar instanceof com.waze.car_lib.b.bc)) {
                throw new h.i();
            }
            kotlinx.coroutines.b.bn bnVar2 = this.f21717l;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, com.waze.car_lib.b.bk.f19032a));
        }
    }
}
