package com.waze.copilot.a;

import com.waze.ConfigManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq implements com.waze.bi.j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.b.h f22812a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f22813b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.r.y f22814c;

    /* renamed from: d, reason: collision with root package name */
    private final ConfigManager f22815d;

    public bq(com.waze.copilot.data.b.h hVar, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.r.y yVar, ConfigManager configManager) {
        h.g.b.x.f(hVar, "copilotRepository");
        h.g.b.x.f(eVar, "wazeClock");
        h.g.b.x.f(yVar, "userState");
        h.g.b.x.f(configManager, "configManager");
        this.f22812a = hVar;
        this.f22813b = eVar;
        this.f22814c = yVar;
        this.f22815d = configManager;
    }

    public static final /* synthetic */ com.waze.bi.f d(bq bqVar, Object obj) {
        if (h.m.c(obj) != null) {
            return bqVar.g();
        }
        com.waze.copilot.data.a.m mVar = (com.waze.copilot.data.a.m) obj;
        return new com.waze.bi.f(com.waze.bi.k.f16818b, mVar.a(), mVar.b() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.bi.f g() {
        return new com.waze.bi.f(com.waze.bi.k.f16818b, this.f22813b.a(), false);
    }

    @Override // com.waze.bi.j
    public final kotlinx.coroutines.b.k e() {
        return new bp(com.waze.shared_infra.h.b.g(this.f22814c), this);
    }

    @Override // com.waze.bi.j
    public final /* synthetic */ void f() {
    }
}
