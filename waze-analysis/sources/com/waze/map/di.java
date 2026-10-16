package com.waze.map;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class di implements de {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nightmode.j f28755a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.d f28756b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f28757c;

    public di(com.waze.nightmode.j jVar) {
        h.g.b.x.f(jVar, "nightModeManager");
        this.f28755a = jVar;
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_DISPLAY_MAP_SCHEME;
        h.g.b.x.e(dVar, "CONFIG_VALUE_DISPLAY_MAP_SCHEME");
        this.f28756b = dVar;
        this.f28757c = h.g.a(new df(this, 0));
    }

    static final kotlinx.coroutines.b.k b(di diVar) {
        kotlinx.coroutines.b.k kVarK = diVar.f28756b.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        return kotlinx.coroutines.b.ai.y(new fy(kVarK, 1));
    }

    @Override // com.waze.map.de
    public final kotlinx.coroutines.b.k a() {
        return kotlinx.coroutines.b.ai.q(this.f28755a.a(), (kotlinx.coroutines.b.k) this.f28757c.getValue(), new dg(null));
    }
}
