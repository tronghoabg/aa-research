package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f22867a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.l f22868b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.mywaze.ah f22869c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22870d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f22871e;

    public u(com.waze.sound.a.c cVar, com.waze.copilot.data.l lVar, com.waze.mywaze.ah ahVar, kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(lVar, "copilotAssetDownloader");
        h.g.b.x.f(ahVar, "userProfileStatsSender");
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(eVar, "logger");
        this.f22867a = cVar;
        this.f22868b = lVar;
        this.f22869c = ahVar;
        this.f22870d = eVar;
        this.f22871e = kotlinx.coroutines.aj.e(abVar);
    }

    public static final /* synthetic */ void d(u uVar, com.waze.copilot.data.ag agVar, com.waze.mywaze.ag agVar2) {
        com.waze.copilot.data.ag agVarA;
        com.waze.sound.a.b bVarC = uVar.f22867a.c();
        String strF = null;
        if (bVarC != null && (agVarA = bVarC.a()) != null) {
            strF = agVarA.f();
        }
        uVar.f22869c.f(strF, agVar.f(), agVar2);
    }

    public final void e(com.waze.copilot.data.ag agVar, boolean z, com.waze.mywaze.ag agVar2) {
        h.g.b.x.f(agVar, "voiceAsset");
        h.g.b.x.f(agVar2, "source");
        kotlinx.coroutines.aj.z(this.f22871e, null, null, new t(this, agVar, agVar2, z, null), 3);
    }
}
