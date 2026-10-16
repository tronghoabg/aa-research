package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hz {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40211a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.coordinators.c f40212b;

    public hz(com.waze.shared_infra.i.e eVar, com.waze.shared_infra.coordinators.c cVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cVar, "protoStorage");
        this.f40211a = eVar;
        this.f40212b = cVar;
    }

    public final com.waze.copilot.data.ag a() {
        com.waze.copilot.an defaultInstance = com.waze.copilot.an.getDefaultInstance();
        h.g.b.x.e(defaultInstance, "getDefaultInstance(...)");
        com.waze.copilot.an anVar = (com.waze.copilot.an) this.f40212b.d(defaultInstance);
        com.waze.copilot.data.ag agVarC = anVar != null ? com.waze.sharedui.profile.c.c(anVar) : null;
        com.waze.shared_infra.i.e eVar = this.f40211a;
        if (agVarC == null) {
            eVar.e("Failed to load voice from cache");
            return agVarC;
        }
        eVar.e("Voice asset loaded from cache");
        return agVarC;
    }

    public final void b(com.waze.copilot.data.ag agVar) {
        com.waze.copilot.aq aqVar;
        h.g.b.x.f(agVar, "voiceAsset");
        this.f40211a.e("Caching voice asset");
        h.g.b.x.f(agVar, "<this>");
        com.waze.copilot.am amVarNewBuilder = com.waze.copilot.an.newBuilder();
        amVarNewBuilder.c(agVar.f());
        amVarNewBuilder.h(agVar.a());
        amVarNewBuilder.f(agVar.i());
        amVarNewBuilder.a(agVar.e());
        amVarNewBuilder.d(agVar.g());
        amVarNewBuilder.e(agVar.h());
        com.waze.copilot.a aVarNewBuilder = com.waze.copilot.b.newBuilder();
        aVarNewBuilder.b(agVar.b().a());
        aVarNewBuilder.a(agVar.b().b());
        amVarNewBuilder.b(aVarNewBuilder.build());
        com.waze.copilot.c cVarNewBuilder = com.waze.copilot.d.newBuilder();
        String strA = agVar.c().a();
        if (strA == null) {
            strA = "";
        }
        cVarNewBuilder.a(strA);
        amVarNewBuilder.g(cVarNewBuilder.build());
        com.waze.copilot.data.ah ahVarD = agVar.d();
        h.g.b.x.f(ahVarD, "<this>");
        com.waze.copilot.data.ah ahVar = com.waze.copilot.data.ah.f22965a;
        int iOrdinal = ahVarD.ordinal();
        if (iOrdinal == 0) {
            aqVar = com.waze.copilot.aq.TTS;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            aqVar = com.waze.copilot.aq.PRE_RECORDED_PROMPT;
        }
        amVarNewBuilder.i(aqVar);
        com.waze.copilot.an anVarBuild = amVarNewBuilder.build();
        h.g.b.x.e(anVarBuild, "build(...)");
        this.f40212b.f(anVarBuild);
    }
}
