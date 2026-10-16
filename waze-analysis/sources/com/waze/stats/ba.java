package com.waze.stats;

import java.util.Objects;
import l.a.brf;
import l.a.bri;
import l.a.kh;
import l.a.kj;
import l.a.kk;
import l.a.kn;
import l.a.ko;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba implements ax {

    /* renamed from: b, reason: collision with root package name */
    private final r f40568b;

    /* renamed from: c, reason: collision with root package name */
    private final r f40569c;

    /* renamed from: d, reason: collision with root package name */
    private final aw f40570d;

    /* renamed from: e, reason: collision with root package name */
    private final at f40571e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.authentication.l f40572f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40573g;

    /* renamed from: h, reason: collision with root package name */
    private final m f40574h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f40575i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f40576j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f40577k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f40578l;
    private final com.waze.modules.d.f m;

    public ba(r rVar, r rVar2, com.waze.modules.d.f fVar, aw awVar, at atVar, com.waze.authentication.l lVar, com.waze.shared_infra.i.e eVar, m mVar) {
        h.g.b.x.f(rVar, "eventMetadataProvider");
        h.g.b.x.f(rVar2, "unauthenticatedEventMetadataProvider");
        h.g.b.x.f(fVar, "sharedEventMetadataProvider");
        h.g.b.x.f(awVar, "interceptor");
        h.g.b.x.f(atVar, "reporterFactory");
        h.g.b.x.f(lVar, "credentialProvider");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(mVar, "config");
        this.f40568b = rVar;
        this.f40569c = rVar2;
        this.m = fVar;
        this.f40570d = awVar;
        this.f40571e = atVar;
        this.f40572f = lVar;
        this.f40573g = eVar;
        this.f40574h = mVar;
        this.f40575i = h.g.a(new ay(this, 1));
        this.f40576j = h.g.a(new ay(this, 0));
        this.f40577k = h.g.a(new ay(this, 2));
        this.f40578l = h.g.a(new ay(this, 3));
    }

    static final v e(ba baVar) {
        return baVar.f40571e.a(as.f40546c);
    }

    static final v f(ba baVar) {
        return baVar.f40571e.a(as.f40544a);
    }

    static final v g(ba baVar) {
        return baVar.f40571e.a(as.f40547d);
    }

    static final v h(ba baVar) {
        return baVar.f40571e.a(as.f40545b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (j(r5) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object i(com.waze.stats.ba r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.stats.az
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.stats.az r0 = (com.waze.stats.az) r0
            int r1 = r0.f40555c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40555c = r1
            goto L18
        L13:
            com.waze.stats.az r0 = new com.waze.stats.az
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40553a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40555c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            goto L63
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.waze.stats.ba r5 = r0.f40556d
            r2 = r5
            com.waze.stats.ba r2 = (com.waze.stats.ba) r2
            e.b.c.b(r6)
            goto L57
        L3b:
            e.b.c.b(r6)
            com.waze.shared_infra.i.e r6 = r5.f40573g
            java.lang.String r2 = "Sending stats"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.g(r2)
            com.waze.stats.v r6 = r5.k()
            if (r6 == 0) goto L57
            r0.f40556d = r5
            r0.f40555c = r4
            java.lang.Object r6 = r6.e()
            if (r6 == r1) goto L62
        L57:
            r6 = 0
            r0.f40556d = r6
            r0.f40555c = r3
            java.lang.Object r5 = j(r5)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.ba.i(com.waze.stats.ba, h.c.e):java.lang.Object");
    }

    static /* synthetic */ Object j(ba baVar) {
        Object objE;
        v vVarL = baVar.l();
        return (vVarL == null || (objE = vVarL.e()) != h.c.a.a.f48038a) ? h.ab.f48028a : objE;
    }

    private final v k() {
        return (v) this.f40575i.getValue();
    }

    private final v l() {
        return (v) this.f40576j.getValue();
    }

    @Override // com.waze.stats.ax
    public final Object a(h.c.e eVar) {
        return i(this, eVar);
    }

    @Override // com.waze.stats.ax
    public final void b(ClientEngStatsEventName clientEngStatsEventName, l lVar, l lVar2, l lVar3, l lVar4) {
        h.g.b.x.f(clientEngStatsEventName, "eventName");
        if (this.f40574h.a()) {
            kk kkVarNewBuilder = ko.newBuilder();
            h.g.b.x.f(kkVarNewBuilder, "builder");
            String strName = clientEngStatsEventName.name();
            h.g.b.x.f(strName, "value");
            kkVarNewBuilder.a(strName);
            if (lVar != null) {
                kn knVarL = com.waze.sharedui.utils.f.l(lVar);
                h.g.b.x.f(knVarL, "value");
                kkVarNewBuilder.b(knVarL);
            }
            if (lVar2 != null) {
                kn knVarL2 = com.waze.sharedui.utils.f.l(lVar2);
                h.g.b.x.f(knVarL2, "value");
                kkVarNewBuilder.c(knVarL2);
            }
            if (lVar3 != null) {
                kn knVarL3 = com.waze.sharedui.utils.f.l(lVar3);
                h.g.b.x.f(knVarL3, "value");
                kkVarNewBuilder.d(knVarL3);
            }
            if (lVar4 != null) {
                kn knVarL4 = com.waze.sharedui.utils.f.l(lVar4);
                h.g.b.x.f(knVarL4, "value");
                kkVarNewBuilder.e(knVarL4);
            }
            ko koVarBuild = kkVarNewBuilder.build();
            h.g.b.x.e(koVarBuild, "build(...)");
            ko koVar = koVarBuild;
            kh khVarNewBuilder = kj.newBuilder();
            h.g.b.x.f(khVarNewBuilder, "builder");
            h.g.b.x.f(koVar, "value");
            khVarNewBuilder.a(koVar);
            kj kjVarBuild = khVarNewBuilder.build();
            h.g.b.x.e(kjVarBuild, "build(...)");
            com.waze.sharedui.d.a.b bVarQ = h.c.a.h.q(brf.newBuilder());
            bVarQ.ae(kjVarBuild);
            com.waze.sharedui.utils.o.e(this, bVarQ.ad());
        }
    }

    @Override // com.waze.stats.ax
    public final Object c() {
        return j(this);
    }

    @Override // com.waze.stats.ax
    public final void d(com.waze.sharedui.utils.o oVar) {
        Object objA;
        Object objA2;
        h.g.b.x.f(oVar, "data");
        if (oVar instanceof ap) {
            ap apVar = (ap) oVar;
            this.f40570d.c(apVar.Q());
            try {
                ba baVar = this;
                objA2 = this.f40572f.a();
            } catch (Throwable th) {
                objA2 = e.b.c.a(th);
            }
            if (!h.m.e(objA2)) {
                com.waze.shared_infra.i.e eVar = this.f40573g;
                brf brfVarQ = apVar.Q();
                Objects.toString(brfVarQ);
                eVar.g("Not reporting the following stat because user is not authenticated: ".concat(String.valueOf(brfVarQ)));
                return;
            }
            v vVarK = k();
            if (vVarK != null) {
                brf brfVarQ2 = apVar.Q();
                com.waze.n.b bVar = (com.waze.n.b) this.f40568b.a(this.m.a());
                com.waze.n.y yVarNewBuilder = com.waze.n.z.newBuilder();
                yVarNewBuilder.b(brfVarQ2);
                yVarNewBuilder.a(bVar);
                com.waze.n.z zVarBuild = yVarNewBuilder.build();
                h.g.b.x.e(zVarBuild, "build(...)");
                vVarK.c(zVarBuild);
                return;
            }
            return;
        }
        if (oVar instanceof ar) {
            ar arVar = (ar) oVar;
            this.f40570d.d(arVar.Q());
            v vVarL = l();
            if (vVarL != null) {
                bri briVarQ = arVar.Q();
                com.waze.n.v vVar = (com.waze.n.v) this.f40569c.a(this.m.a());
                com.waze.n.al alVarNewBuilder = com.waze.n.am.newBuilder();
                alVarNewBuilder.b(briVarQ);
                alVarNewBuilder.a(vVar);
                com.waze.n.am amVarBuild = alVarNewBuilder.build();
                h.g.b.x.e(amVarBuild, "build(...)");
                vVarL.c(amVarBuild);
                return;
            }
            return;
        }
        if (!(oVar instanceof ao)) {
            if (!(oVar instanceof aq)) {
                throw new h.i();
            }
            v vVar2 = (v) this.f40578l.getValue();
            if (vVar2 != null) {
                l.b.c cVarQ = ((aq) oVar).Q();
                com.waze.n.ah ahVarNewBuilder = com.waze.n.ai.newBuilder();
                ahVarNewBuilder.b(cVarQ);
                com.waze.n.ai aiVarBuild = ahVarNewBuilder.build();
                h.g.b.x.e(aiVarBuild, "build(...)");
                vVar2.c(aiVarBuild);
                return;
            }
            return;
        }
        if (this.f40574h.b()) {
            try {
                ba baVar2 = this;
                objA = this.f40572f.a();
            } catch (Throwable th2) {
                objA = e.b.c.a(th2);
            }
            if (!h.m.e(objA)) {
                com.waze.shared_infra.i.e eVar2 = this.f40573g;
                l.a.s sVarQ = ((ao) oVar).Q();
                Objects.toString(sVarQ);
                eVar2.g("Not reporting the following ad event because user is not authenticated: ".concat(String.valueOf(sVarQ)));
                return;
            }
            v vVar3 = (v) this.f40577k.getValue();
            if (vVar3 != null) {
                l.a.s sVarQ2 = ((ao) oVar).Q();
                com.waze.n.b bVar2 = (com.waze.n.b) this.f40568b.a(this.m.a());
                com.waze.ch.a.a.a aVarNewBuilder = com.waze.ch.a.a.b.newBuilder();
                aVarNewBuilder.b(sVarQ2);
                aVarNewBuilder.a(bVar2);
                com.waze.ch.a.a.b bVarBuild = aVarNewBuilder.build();
                h.g.b.x.e(bVarBuild, "build(...)");
                vVar3.c(bVarBuild);
            }
        }
    }
}
