package com.waze.modules.navigation;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationServiceNativeManager f30417a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30418b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f30419c;

    public c(NavigationServiceNativeManager navigationServiceNativeManager, h.c.j jVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(navigationServiceNativeManager, "navigationService");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(eVar, "logger");
        this.f30417a = navigationServiceNativeManager;
        this.f30418b = eVar;
        this.f30419c = kotlinx.coroutines.aj.e(jVar);
    }

    @Override // com.waze.modules.navigation.a
    public final kotlinx.coroutines.am a(com.waze.modules.c.ar arVar, j jVar, ak akVar, long j2) {
        h.g.b.x.f(arVar, "route");
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        kotlinx.coroutines.af afVar = this.f30419c;
        h.g.b.o.l(afVar.getCoroutineContext());
        return kotlinx.coroutines.aj.y(afVar, null, null, new b(this, arVar, jVar, akVar, j2, null), 3);
    }
}
