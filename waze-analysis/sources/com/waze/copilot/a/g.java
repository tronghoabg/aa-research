package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    private final be f22829a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.b.e f22830b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sound.b.f f22831c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f22832d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22833e;

    /* renamed from: f, reason: collision with root package name */
    private final a f22834f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f22835g;

    public g(be beVar, com.waze.sound.b.e eVar, com.waze.sound.b.f fVar, com.waze.sharedui.profile.b bVar, kotlinx.coroutines.ab abVar, com.waze.shared_infra.i.e eVar2, com.waze.config.a aVar, a aVar2) {
        h.g.b.x.f(beVar, "refreshCopilotAssetsUseCase");
        h.g.b.x.f(eVar, "recordedVoiceSelectionUseCase");
        h.g.b.x.f(fVar, "setRecordedVoiceIdUseCase");
        h.g.b.x.f(bVar, "myProfileManager");
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(aVar, "awaitConfigsSyncedUseCase");
        h.g.b.x.f(aVar2, "config");
        this.f22829a = beVar;
        this.f22830b = eVar;
        this.f22831c = fVar;
        this.f22832d = bVar;
        this.f22833e = eVar2;
        this.f22834f = aVar2;
        this.f22835g = kotlinx.coroutines.aj.e(abVar);
    }

    @Override // com.waze.copilot.a.b
    public final void a() {
        kotlinx.coroutines.aj.z(this.f22835g, null, null, new e(this, (h.c.e) null, 2, (char[]) null), 3);
    }
}
