package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ax implements com.waze.config.h {
    @Override // com.waze.config.h
    public final long a(com.waze.config.c cVar) {
        h.g.b.x.f(cVar, "config");
        return ConfigManager.getInstance().getConfigValueLong(cVar);
    }

    @Override // com.waze.config.h
    public final String b(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "config");
        return ConfigManager.getInstance().getConfigValueModifiedValue(fVar.e());
    }

    @Override // com.waze.config.h
    public final String c(com.waze.config.d dVar) {
        h.g.b.x.f(dVar, "config");
        String configValueString = ConfigManager.getInstance().getConfigValueString(dVar);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.config.h
    public final void d(com.waze.config.f fVar, final h.g.a.p pVar) {
        h.g.b.x.f(fVar, "config");
        h.g.b.x.f(pVar, "listener");
        ConfigManager.getInstance().registerConfigUpdate(fVar, new az() { // from class: com.waze.aw
            @Override // com.waze.az
            public final void a(Object obj, boolean z) {
                pVar.invoke(obj, Boolean.valueOf(z));
            }
        });
    }

    @Override // com.waze.config.h
    public final void e(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "block");
        NativeManager.runOnNativeManagerReady(new android.support.v7.app.p(aVar, 16));
    }

    @Override // com.waze.config.h
    public final void f(com.waze.config.b bVar, boolean z) {
        h.g.b.x.f(bVar, "config");
        ConfigManager.getInstance().setConfigValueBool(bVar, z);
    }

    @Override // com.waze.config.h
    public final void g(com.waze.config.f fVar, boolean z) {
        h.g.b.x.f(fVar, "config");
        ConfigManager.getInstance().setConfigValueLockedNTV(fVar.e(), z);
    }

    @Override // com.waze.config.h
    public final void h(com.waze.config.c cVar, long j2) {
        h.g.b.x.f(cVar, "config");
        ConfigManager.getInstance().setConfigValueLong(cVar, j2);
    }

    @Override // com.waze.config.h
    public final void i(com.waze.config.d dVar, String str) {
        h.g.b.x.f(dVar, "config");
        h.g.b.x.f(str, "newValue");
        ConfigManager.getInstance().setConfigValueString(dVar, str);
    }

    @Override // com.waze.config.h
    public final boolean j(com.waze.config.b bVar) {
        h.g.b.x.f(bVar, "config");
        return ConfigManager.getInstance().getConfigValueBool(bVar);
    }

    @Override // com.waze.config.h
    public final boolean k(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "config");
        return ConfigManager.getInstance().isConfigValueLockedNTV(fVar.e());
    }

    @Override // com.waze.config.h
    public final boolean l(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "config");
        return ConfigManager.getInstance().isConfigValueSticky(fVar.e());
    }
}
