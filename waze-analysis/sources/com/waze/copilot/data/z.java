package com.waze.copilot.data;

import com.waze.t.b.bz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.shared_infra.coordinators.c f23085a;

    public /* synthetic */ z(byte[] bArr) {
        this.f23085a = null;
    }

    private final c e() {
        com.waze.copilot.j jVar;
        com.waze.shared_infra.coordinators.c cVar = this.f23085a;
        if (cVar != null) {
            com.waze.copilot.j defaultInstance = com.waze.copilot.j.getDefaultInstance();
            h.g.b.x.e(defaultInstance, "getDefaultInstance(...)");
            jVar = (com.waze.copilot.j) cVar.d(defaultInstance);
        } else {
            jVar = null;
        }
        c cVarI = jVar != null ? bz.i(jVar) : null;
        if (cVarI == null) {
            com.waze.shared_infra.i.h.i("CopilotProtoCache", "failed to load car from cache");
            return cVarI;
        }
        com.waze.shared_infra.i.h.i("CopilotProtoCache", "car asset loaded from cache");
        return cVarI;
    }

    public final c a(com.waze.shared_infra.b.b bVar) {
        h.g.b.x.f(bVar, "cacheFileStorage");
        this.f23085a = new com.waze.shared_infra.coordinators.c(bVar);
        return e();
    }

    public final void b(c cVar) {
        h.g.b.x.f(cVar, "carAsset");
        com.waze.shared_infra.i.h.i("CopilotProtoCache", "caching car asset");
        h.g.b.x.f(cVar, "<this>");
        com.waze.copilot.i iVarNewBuilder = com.waze.copilot.j.newBuilder();
        iVarNewBuilder.b(cVar.a());
        iVarNewBuilder.c(cVar.e());
        com.waze.copilot.a aVarNewBuilder = com.waze.copilot.b.newBuilder();
        aVarNewBuilder.b(cVar.b().a());
        aVarNewBuilder.a(cVar.b().b());
        iVarNewBuilder.d(aVarNewBuilder.build());
        com.waze.copilot.c cVarNewBuilder = com.waze.copilot.d.newBuilder();
        String strA = cVar.c().a();
        if (strA == null) {
            strA = "";
        }
        cVarNewBuilder.a(strA);
        iVarNewBuilder.e(cVarNewBuilder.build());
        if (cVar.d() != null) {
            com.waze.copilot.e eVarNewBuilder = com.waze.copilot.f.newBuilder();
            eVarNewBuilder.e(cVar.d().a());
            eVarNewBuilder.c(cVar.d().e());
            eVarNewBuilder.b(cVar.d().d());
            eVarNewBuilder.a(cVar.d().c());
            com.waze.copilot.g gVarNewBuilder = com.waze.copilot.h.newBuilder();
            ae aeVarB = cVar.d().b();
            gVarNewBuilder.a(aeVarB != null ? aeVarB.a() : 1.0f);
            ae aeVarB2 = cVar.d().b();
            if ((aeVarB2 != null ? aeVarB2.b() : null) != null) {
                gVarNewBuilder.b(cVar.d().b().b().floatValue());
            }
            eVarNewBuilder.d(gVarNewBuilder.build());
            iVarNewBuilder.a(eVarNewBuilder.build());
        }
        com.waze.copilot.j jVarBuild = iVarNewBuilder.build();
        h.g.b.x.e(jVarBuild, "build(...)");
        com.waze.copilot.j jVar = jVarBuild;
        com.waze.shared_infra.coordinators.c cVar2 = this.f23085a;
        if (cVar2 != null) {
            cVar2.f(jVar);
        }
    }

    public final void c() {
        com.waze.shared_infra.i.h.i("CopilotProtoCache", "clearing copilot car cache");
        com.waze.shared_infra.coordinators.c cVar = this.f23085a;
        if (cVar != null) {
            cVar.e();
        }
    }

    public final boolean d(String str) {
        h.g.b.x.f(str, "carName");
        c cVarE = e();
        return h.g.b.x.n(cVarE != null ? cVarE.e() : null, str);
    }

    public z() {
        this(null);
    }
}
