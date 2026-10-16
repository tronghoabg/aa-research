package com.waze.br.a;

import com.waze.bs.ak;
import com.waze.bs.am;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final b f17279a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.c.j f17280b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.av.b.ah f17281c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.t.a.k f17282d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17283e;

    public aj(b bVar, com.waze.av.c.j jVar, com.waze.av.b.ah ahVar, com.waze.t.a.k kVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bVar, "rpcService");
        h.g.b.x.f(jVar, "searchV2ResponseParser");
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(kVar, "audioLocaleProvider");
        h.g.b.x.f(eVar, "logger");
        this.f17279a = bVar;
        this.f17280b = jVar;
        this.f17281c = ahVar;
        this.f17282d = kVar;
        this.f17283e = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r11 = (com.waze.av.b.h) r11;
        r10 = r1.getPlace().getVenueId();
        h.g.b.x.e(r10, "getVenueId(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        if (r10.length() <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        if (h.g.b.x.n(r9.a().c().c(), r1.getPlace().getVenueId()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (r11 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
    
        if (r12 == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[LOOP:1: B:25:0x0093->B:98:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.t.a.u c(com.waze.br.a.aj r19, com.waze.bs.ab r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.br.a.aj.c(com.waze.br.a.aj, com.waze.bs.ab):com.waze.t.a.u");
    }

    private final com.waze.bs.d e() {
        com.waze.bs.c cVarNewBuilder = com.waze.bs.d.newBuilder();
        String str = (String) this.f17282d.b();
        if (str != null) {
            cVarNewBuilder.a(str);
        }
        com.waze.h.c.a aVarE = com.waze.h.c.a.e(com.waze.h.c.a.f24336a, com.waze.h.c.b.f24342c);
        h.g.b.x.f(aVarE, "<this>");
        com.waze.h.c.d dVarD = aVarE.d();
        com.waze.h.c.d dVar = com.waze.h.c.d.f24349a;
        if (dVarD.ordinal() != 0) {
            throw new h.i();
        }
        com.waze.u.a.f fVar = com.waze.u.a.f.SAMPLE_RATE_16K;
        int iOrdinal = aVarE.b().ordinal();
        if (iOrdinal == 0) {
            throw new RuntimeException("RAW_PCM_16 is not supported");
        }
        if (iOrdinal == 1) {
            throw new RuntimeException("WAV_PCM_16 is not supported");
        }
        if (iOrdinal != 2) {
            throw new h.i();
        }
        com.waze.u.a.d dVar2 = com.waze.u.a.d.OGG_OPUS;
        com.waze.u.a.c cVarNewBuilder2 = com.waze.u.a.g.newBuilder();
        cVarNewBuilder2.b(fVar);
        cVarNewBuilder2.a(dVar2);
        com.waze.u.a.g gVarBuild = cVarNewBuilder2.build();
        h.g.b.x.e(gVarBuild, "build(...)");
        cVarNewBuilder.b(gVarBuild);
        com.waze.bs.d dVarBuild = cVarNewBuilder.build();
        h.g.b.x.e(dVarBuild, "build(...)");
        return dVarBuild;
    }

    @Override // com.waze.br.a.ab
    public final kotlinx.coroutines.b.k a(String str, x xVar) {
        h.g.b.x.f(str, "conversationId");
        h.g.b.x.f(xVar, "chatRequest");
        com.waze.bs.e eVarNewBuilder = com.waze.bs.m.newBuilder();
        h.g.b.x.f(eVarNewBuilder, "builder");
        h.g.b.x.f(str, "value");
        eVarNewBuilder.b(str);
        com.waze.bs.d dVarE = e();
        h.g.b.x.f(dVarE, "value");
        eVarNewBuilder.a(dVarE);
        if (xVar instanceof v) {
            m mVarA = ((v) xVar).a();
            if (mVarA instanceof j) {
                com.waze.bs.g gVarNewBuilder = com.waze.bs.h.newBuilder();
                gVarNewBuilder.a(((j) mVarA).e());
                com.waze.bs.h hVarBuild = gVarNewBuilder.build();
                h.g.b.x.e(hVarBuild, "build(...)");
                com.waze.bs.h hVar = hVarBuild;
                h.g.b.x.f(hVar, "value");
                eVarNewBuilder.c(hVar);
            } else if (mVarA instanceof k) {
                com.waze.bs.k kVarNewBuilder = com.waze.bs.l.newBuilder();
                kVarNewBuilder.a(((k) mVarA).e());
                com.waze.bs.l lVarBuild = kVarNewBuilder.build();
                h.g.b.x.e(lVarBuild, "build(...)");
                com.waze.bs.l lVar = lVarBuild;
                h.g.b.x.f(lVar, "value");
                eVarNewBuilder.e(lVar);
            } else {
                if (!(mVarA instanceof l)) {
                    throw new h.i();
                }
                com.waze.bs.i iVarNewBuilder = com.waze.bs.j.newBuilder();
                iVarNewBuilder.a(((l) mVarA).e());
                com.waze.bs.j jVarBuild = iVarNewBuilder.build();
                h.g.b.x.e(jVarBuild, "build(...)");
                com.waze.bs.j jVar = jVarBuild;
                h.g.b.x.f(jVar, "value");
                eVarNewBuilder.d(jVar);
            }
        } else {
            if (!(xVar instanceof w)) {
                throw new h.i();
            }
            com.waze.u.a.s sVarT = a.a.T(((w) xVar).a());
            h.g.b.x.f(sVarT, "value");
            eVarNewBuilder.f(sVarT);
        }
        b bVar = this.f17279a;
        com.waze.bs.m mVarBuild = eVarNewBuilder.build();
        h.g.b.x.e(mVarBuild, "build(...)");
        return kotlinx.coroutines.b.ai.o(new ae(bVar.a(mVarBuild), this, str), new ai(this, null, 1, null));
    }

    @Override // com.waze.br.a.ab
    public final kotlinx.coroutines.b.k b(com.waze.t.a.h hVar) {
        h.g.b.x.f(hVar, "conversationAgentRequestTrigger");
        com.waze.bs.ac acVarNewBuilder = com.waze.bs.ad.newBuilder();
        h.g.b.x.f(acVarNewBuilder, "builder");
        com.waze.bs.ai aiVarNewBuilder = am.newBuilder();
        h.g.b.x.f(aiVarNewBuilder, "builder");
        if (h.g.b.x.n(hVar, com.waze.t.a.f.f40636a)) {
            ak akVarBuild = ak.newBuilder().build();
            h.g.b.x.e(akVarBuild, "build(...)");
            ak akVar = akVarBuild;
            h.g.b.x.f(akVar, "value");
            aiVarNewBuilder.a(akVar);
        } else {
            if (!(hVar instanceof com.waze.t.a.g)) {
                throw new h.i();
            }
            com.waze.u.a.s sVarT = a.a.T(((com.waze.t.a.g) hVar).a());
            h.g.b.x.f(sVarT, "value");
            aiVarNewBuilder.b(sVarT);
        }
        b bVar = this.f17279a;
        am amVarBuild = aiVarNewBuilder.build();
        h.g.b.x.e(amVarBuild, "build(...)");
        am amVar = amVarBuild;
        h.g.b.x.f(amVar, "value");
        acVarNewBuilder.b(amVar);
        com.waze.bs.d dVarE = e();
        h.g.b.x.f(dVarE, "value");
        acVarNewBuilder.a(dVarE);
        com.waze.bs.ad adVarBuild = acVarNewBuilder.build();
        h.g.b.x.e(adVarBuild, "build(...)");
        com.waze.bs.ad adVar = adVarBuild;
        com.waze.shared_infra.i.e eVar = this.f17283e;
        Objects.toString(adVar);
        eVar.e("request: ".concat(String.valueOf(adVar)));
        return kotlinx.coroutines.b.ai.o(new ah(bVar.b(adVar), this), new ai(this, null, 0));
    }
}
