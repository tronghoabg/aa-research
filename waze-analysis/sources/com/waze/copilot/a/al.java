package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.b.r f22691a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f22692b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sound.a.a f22693c;

    public al(com.waze.copilot.data.b.r rVar, com.waze.copilot.data.b.a aVar, com.waze.sound.a.a aVar2) {
        h.g.b.x.f(rVar, "moodsRepository");
        h.g.b.x.f(aVar, "carsRepository");
        h.g.b.x.f(aVar2, "voiceRepository");
        this.f22691a = rVar;
        this.f22692b = aVar;
        this.f22693c = aVar2;
    }

    public final com.waze.copilot.data.b.q a(boolean z) {
        com.waze.sound.a.b bVarC;
        com.waze.copilot.data.ag agVarA;
        String strF;
        com.waze.copilot.data.b.a aVar = this.f22692b;
        String strA = this.f22691a.a();
        String strD = aVar.d();
        com.waze.sound.a.a aVar2 = this.f22693c;
        String strB = (!z || (bVarC = aVar2.c()) == null || (agVarA = bVarC.a()) == null || (strF = agVarA.f()) == null) ? aVar2.b() : strF;
        return new com.waze.copilot.data.b.q(strD, strA, strB);
    }
}
