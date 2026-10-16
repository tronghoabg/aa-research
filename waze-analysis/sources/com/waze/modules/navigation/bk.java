package com.waze.modules.navigation;

import com.waze.NativeManager;
import com.waze.ResultStruct;
import com.waze.ct;
import com.waze.jh;
import com.waze.kd;
import com.waze.modules.c.ch;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.eh;
import com.waze.navigate.eo;
import com.waze.navigate.gm;
import com.waze.trip_overview.cb;
import com.waze.trip_overview.dp;
import com.waze.trip_overview.dq;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk extends com.waze.shared_infra.coordinators.s implements ag {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30397a;

    /* renamed from: b, reason: collision with root package name */
    private final DriveToNativeManager f30398b;

    /* renamed from: c, reason: collision with root package name */
    private final NativeManager f30399c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.places.a.c f30400d;

    /* renamed from: e, reason: collision with root package name */
    private final eh f30401e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.r.n f30402f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.search.b.a f30403g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.trip_overview.ac f30404h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.sharedui.e.g f30405i;

    /* renamed from: j, reason: collision with root package name */
    private final cb f30406j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f30407k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.trip_overview.bl f30408l;
    private final com.waze.modules.navigation.a.a m;
    private final kd n;
    private final com.waze.shared_infra.o.a o;
    private final dq p;
    private final eo q;
    private final com.waze.shared_infra.i.b r;
    private final com.waze.av.b.o s;
    private final ct t;
    private final gm u;
    private final com.waze.ao v;
    private final com.waze.sharedrive.e.bn w;
    private final com.waze.places.a.b x;
    private final com.waze.main_screen.l.b.d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.waze.shared_infra.i.e eVar, DriveToNativeManager driveToNativeManager, NativeManager nativeManager, com.waze.places.a.c cVar, eh ehVar, com.waze.places.a.b bVar, com.waze.shared_infra.r.n nVar, com.waze.search.b.a aVar, com.waze.trip_overview.ac acVar, com.waze.sharedui.e.g gVar, cb cbVar, ch chVar, com.waze.trip_overview.bl blVar, com.waze.modules.navigation.a.a aVar2, kd kdVar, com.waze.shared_infra.o.a aVar3, dq dqVar, eo eoVar, com.waze.main_screen.l.b.d dVar, com.waze.shared_infra.i.b bVar2, com.waze.av.b.o oVar, ct ctVar, gm gmVar, com.waze.ao aoVar, kotlinx.coroutines.af afVar, com.waze.sharedrive.e.bn bnVar) {
        super(bm.f30410a, afVar);
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(driveToNativeManager, "navigationManager");
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(cVar, "navigationWithUICompat");
        h.g.b.x.f(ehVar, "navigationStartPointRepository");
        h.g.b.x.f(bVar, "genericPlaceRecentsUpdater");
        h.g.b.x.f(nVar, "sessionStatusReceiver");
        h.g.b.x.f(aVar, "venueDataSource");
        h.g.b.x.f(acVar, "tripOverviewController");
        h.g.b.x.f(gVar, "wazeLocationServices");
        h.g.b.x.f(cbVar, "tripOverviewFeatureManager");
        h.g.b.x.f(chVar, "routeCalculator");
        h.g.b.x.f(blVar, "tripOverviewStats");
        h.g.b.x.f(aVar2, "navigationWaypointHelper");
        h.g.b.x.f(kdVar, "popupController");
        h.g.b.x.f(aVar3, "stringProvider");
        h.g.b.x.f(dqVar, "tripOverviewStatsSender");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(dVar, "configuration");
        h.g.b.x.f(bVar2, "exceptionReporter");
        h.g.b.x.f(oVar, "genericPlaceActions");
        h.g.b.x.f(ctVar, "locationPreviewIntentBroadcaster");
        h.g.b.x.f(gmVar, "venueFreshnessStatsSender");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(afVar, "scope");
        this.f30397a = eVar;
        this.f30398b = driveToNativeManager;
        this.f30399c = nativeManager;
        this.f30400d = cVar;
        this.f30401e = ehVar;
        this.x = bVar;
        this.f30402f = nVar;
        this.f30403g = aVar;
        this.f30404h = acVar;
        this.f30405i = gVar;
        this.f30406j = cbVar;
        this.f30407k = chVar;
        this.f30408l = blVar;
        this.m = aVar2;
        this.n = kdVar;
        this.o = aVar3;
        this.p = dqVar;
        this.q = eoVar;
        this.y = dVar;
        this.r = bVar2;
        this.s = oVar;
        this.t = ctVar;
        this.u = gmVar;
        this.v = aoVar;
        this.w = bnVar;
        dVar.b(eVar);
    }

    private final void A(ao aoVar, com.waze.google_assistant.an anVar, h.g.a.l lVar) {
        this.f30397a.e("startNavigationFlow is called: " + aoVar + ", " + anVar);
        as asVarE = aoVar.e();
        as asVar = as.f30317a;
        com.waze.sharedrive.e.bg bgVar = com.waze.sharedrive.e.bg.f38423a;
        com.waze.sharedrive.e.bh bhVar = com.waze.sharedrive.e.bh.f38427a;
        int iOrdinal = asVarE.ordinal();
        boolean zA = true;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zA = false;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                zA = this.f30406j.a(aoVar.a());
            }
        }
        kotlinx.coroutines.aj.z(G(), new be(CoroutineExceptionHandler.f51269c, this), null, new bf(this, aoVar, lVar, zA, anVar, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.modules.navigation.bk r9, com.waze.modules.navigation.ao r10, h.c.e r11) {
        /*
            boolean r0 = r11 instanceof com.waze.modules.navigation.au
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.modules.navigation.au r0 = (com.waze.modules.navigation.au) r0
            int r1 = r0.f30327c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30327c = r1
            goto L18
        L13:
            com.waze.modules.navigation.au r0 = new com.waze.modules.navigation.au
            r0.<init>(r9, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.f30325a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f30327c
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L41
            if (r1 == r8) goto L33
            if (r1 != r7) goto L2b
            e.b.c.b(r11)
            goto L91
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            com.waze.shared_infra.h.c r10 = r6.f30329e
            r1 = r10
            com.waze.shared_infra.h.c r1 = (com.waze.shared_infra.h.c) r1
            com.waze.modules.navigation.ao r1 = r6.f30328d
            r2 = r1
            com.waze.modules.navigation.ao r2 = (com.waze.modules.navigation.ao) r2
            e.b.c.b(r11)
            goto L6d
        L41:
            e.b.c.b(r11)
            com.waze.modules.navigation.ak r11 = r10.b()
            com.waze.av.b.n r11 = r11.a()
            com.waze.av.a.p r11 = r11.e()
            com.waze.shared_infra.h.c r3 = r11.d()
            com.waze.navigate.DriveToNativeManager r11 = r9.f30398b
            com.waze.kd r4 = r9.n
            r1 = r11
            com.waze.bf r1 = (com.waze.bf) r1
            com.waze.navigate.ar r5 = com.waze.navigate.ar.f31000a
            r6.f30328d = r10
            r6.f30329e = r3
            r6.f30327c = r8
            r2 = 1
            java.lang.Object r11 = com.waze.navigate.ax.a(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L6b
            goto L90
        L6b:
            r1 = r10
            r10 = r3
        L6d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L7b
            r9 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L7b:
            com.waze.sharedrive.e.bn r11 = r9.w
            if (r11 == 0) goto L97
            com.waze.modules.navigation.ah r1 = r1.a()
            r2 = 0
            r6.f30328d = r2
            r6.f30329e = r2
            r6.f30327c = r7
            java.lang.Object r11 = r9.v(r11, r10, r1, r6)
            if (r11 != r0) goto L91
        L90:
            return r0
        L91:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
        L97:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.g(com.waze.modules.navigation.bk, com.waze.modules.navigation.ao, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object h(com.waze.modules.navigation.bk r21, com.waze.modules.navigation.ao r22, h.c.e r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.h(com.waze.modules.navigation.bk, com.waze.modules.navigation.ao, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object j(bk bkVar, h.c.e eVar) {
        if (!bkVar.f30399c.isLoggedIn()) {
            kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
            lVar.u();
            bkVar.f30402f.c(new WeakReference(new bh(lVar)));
            Object objJ = lVar.j();
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (objJ == aVar) {
                h.d.b.c(eVar);
            }
            if (objJ == aVar) {
                return objJ;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object k(com.waze.modules.navigation.bk r7, h.g.a.l r8, h.c.e r9) {
        /*
            boolean r0 = r9 instanceof com.waze.modules.navigation.bi
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.modules.navigation.bi r0 = (com.waze.modules.navigation.bi) r0
            int r1 = r0.f30393c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30393c = r1
            goto L18
        L13:
            com.waze.modules.navigation.bi r0 = new com.waze.modules.navigation.bi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f30391a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f30393c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L28
            goto L63
        L28:
            r7 = move-exception
            goto L5f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            e.b.c.b(r9)
            com.waze.modules.navigation.bk r7 = (com.waze.modules.navigation.bk) r7     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L28
            com.waze.config.c r9 = com.waze.config.ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_READINESS_TIMEOUT_SECONDS     // Catch: java.lang.Throwable -> L28
            java.lang.Long r9 = r9.b()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "getValue(...)"
            h.g.b.x.e(r9, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L28
            long r5 = r9.longValue()     // Catch: java.lang.Throwable -> L28
            long r5 = r7.toMillis(r5)     // Catch: java.lang.Throwable -> L28
            com.waze.modules.navigation.bj r7 = new com.waze.modules.navigation.bj     // Catch: java.lang.Throwable -> L28
            r9 = 0
            r7.<init>(r8, r3, r9)     // Catch: java.lang.Throwable -> L28
            h.g.a.p r7 = (h.g.a.p) r7     // Catch: java.lang.Throwable -> L28
            r0.f30393c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = kotlinx.coroutines.aj.G(r5, r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r9 != r1) goto L63
            return r1
        L5f:
            java.lang.Object r9 = e.b.c.a(r7)
        L63:
            boolean r7 = r9 instanceof h.l
            if (r7 == 0) goto L68
            return r3
        L68:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.k(com.waze.modules.navigation.bk, h.g.a.l, h.c.e):java.lang.Object");
    }

    static final h.ab l(bk bkVar, ao aoVar) {
        h.g.b.x.f(aoVar, "newParams");
        bkVar.z(aoVar);
        return h.ab.f48028a;
    }

    static final h.ab m(bk bkVar, ao aoVar) {
        h.g.b.x.f(aoVar, "newParams");
        bkVar.z(aoVar);
        return h.ab.f48028a;
    }

    static /* synthetic */ void s(bk bkVar, ao aoVar, boolean z, boolean z2, String str, int i2) {
        ah ahVarA = (i2 & 2) != 0 ? aoVar.a() : null;
        if ((i2 & 4) != 0) {
            z = bkVar.f30399c.isLoggedIn();
        }
        boolean zA = (i2 & 8) != 0 ? bkVar.f30406j.a(aoVar.a()) : false;
        if ((i2 & 16) != 0) {
            bkVar.q.T();
        }
        if ((i2 & 32) != 0) {
            z2 = aoVar.j() != null;
        }
        if ((i2 & 128) != 0) {
            str = "";
        }
        com.waze.trip_overview.bl blVar = bkVar.f30408l;
        if (!z2) {
            bkVar.f30405i.a();
        }
        blVar.z(ahVarA, z, zA, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object t(com.waze.modules.navigation.bk r4, com.waze.modules.navigation.j r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.modules.navigation.ax
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.modules.navigation.ax r0 = (com.waze.modules.navigation.ax) r0
            int r1 = r0.f30343c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30343c = r1
            goto L18
        L13:
            com.waze.modules.navigation.ax r0 = new com.waze.modules.navigation.ax
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f30341a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f30343c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L53
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            if (r5 != 0) goto L5b
            com.waze.navigate.eh r5 = r4.f30401e
            kotlinx.coroutines.b.ch r5 = r5.getNavigationStartPointState()
            java.lang.Object r5 = r5.d()
            com.waze.places.f r5 = (com.waze.places.f) r5
            if (r5 == 0) goto L48
            com.waze.modules.navigation.an r4 = new com.waze.modules.navigation.an
            r4.<init>(r5)
            return r4
        L48:
            com.waze.sharedui.e.g r4 = r4.f30405i
            r0.f30343c = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
            com.waze.modules.navigation.am r4 = new com.waze.modules.navigation.am
            r4.<init>(r6)
            return r4
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.t(com.waze.modules.navigation.bk, com.waze.modules.navigation.j, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0233, code lost:
    
        if (r23.w(r12, r3) == r4) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object u(com.waze.modules.navigation.bk r23, com.waze.modules.navigation.ao r24, com.waze.google_assistant.an r25, h.g.a.l r26, h.c.e r27) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.u(com.waze.modules.navigation.bk, com.waze.modules.navigation.ao, com.waze.google_assistant.an, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.waze.sharedrive.e.bn r7, com.waze.shared_infra.h.c r8, com.waze.modules.navigation.ah r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.v(com.waze.sharedrive.e.bn, com.waze.shared_infra.h.c, com.waze.modules.navigation.ah, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.waze.modules.navigation.ao r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.modules.navigation.bg
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.modules.navigation.bg r0 = (com.waze.modules.navigation.bg) r0
            int r1 = r0.f30388c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30388c = r1
            goto L18
        L13:
            com.waze.modules.navigation.bg r0 = new com.waze.modules.navigation.bg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f30386a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f30388c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.modules.navigation.ao r5 = r0.f30389d
            r4 = r5
            com.waze.modules.navigation.ao r4 = (com.waze.modules.navigation.ao) r4
            e.b.c.b(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            com.waze.places.a.b r4 = r4.x
            com.waze.modules.navigation.ak r6 = r5.b()
            com.waze.av.b.n r6 = r6.a()
            r0.f30389d = r5
            r0.f30388c = r3
            r2 = 0
            java.lang.Object r6 = r4.a(r6, r2, r0)
            if (r6 == r1) goto L66
        L4c:
            com.waze.av.b.n r6 = (com.waze.av.b.n) r6
            if (r6 == 0) goto L63
            com.waze.modules.navigation.ak r4 = r5.b()
            com.waze.av.b.n r4 = r4.a()
            boolean r4 = r4 instanceof com.waze.av.b.m
            if (r4 == 0) goto L63
            com.waze.modules.navigation.ak r4 = r5.b()
            r4.c(r6)
        L63:
            h.ab r4 = h.ab.f48028a
            return r4
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bk.w(com.waze.modules.navigation.ao, h.c.e):java.lang.Object");
    }

    private final void x(ao aoVar, com.waze.sharedui.b bVar, h.g.a.l lVar) {
        this.f30397a.g("Could not start TOV");
        this.n.e(jh.f24940a);
        if (bVar != null) {
            ResultStruct resultStruct = bVar instanceof ResultStruct ? (ResultStruct) bVar : null;
            com.waze.trip_overview.bl blVar = this.f30408l;
            com.waze.trip_overview.be beVar = com.waze.trip_overview.be.f41066a;
            int code = resultStruct != null ? resultStruct.code : bVar.getCode();
            bVar.getCode();
            String errorCode = bVar.getErrorCode();
            h.g.b.x.e(errorCode, "getErrorCode(...)");
            blVar.y(beVar, code, errorCode, aoVar.a());
            this.p.b(com.waze.sharedui.web.at.i(aoVar.a()), dp.f41413b, String.valueOf(resultStruct != null ? resultStruct.code : bVar.getCode()), bVar.getErrorCode());
        }
        lVar.invoke(aoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        H(new bl(al.f30303c));
    }

    private final void z(ao aoVar) {
        ak akVarB = aoVar.b();
        if (akVarB instanceof ai) {
            kotlinx.coroutines.aj.z(G(), null, null, new bd(aoVar, this, akVarB, aoVar.f() != at.f30323c, aoVar.f() == at.f30322b, null), 3);
        } else {
            if (!(akVarB instanceof aj)) {
                throw new h.i();
            }
            aj ajVar = (aj) akVarB;
            this.f30400d.v(ajVar.d(), ajVar.a());
            H(new bl(al.f30301a));
        }
    }

    @Override // com.waze.modules.navigation.ag
    public final void a(com.waze.av.d.t tVar) {
        h.g.b.x.f(tVar, "startNavigationEvent");
        if (tVar instanceof bq) {
            bq bqVar = (bq) tVar;
            A(bqVar.e(), bqVar.i(), new g(this, 3));
        } else {
            if (!(tVar instanceof br)) {
                throw new h.i();
            }
            A(((br) tVar).e(), null, new com.waze.car_lib.b.n(new g(this, 4), 19));
        }
    }

    public final void o() {
        y();
    }

    public final void p(ao aoVar, h.g.a.l lVar) {
        h.g.b.x.f(aoVar, "params");
        h.g.b.x.f(lVar, "fallback");
        x(aoVar, null, lVar);
        H(new bl(al.f30302b));
    }

    public final void q() {
        H(new bl(al.f30301a));
    }
}
