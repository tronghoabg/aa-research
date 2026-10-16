package com.waze.t.b;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40688a;

    /* renamed from: b, reason: collision with root package name */
    private final an f40689b;

    public ap(com.waze.shared_infra.i.e eVar, an anVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(anVar, "config");
        this.f40688a = eVar;
        this.f40689b = anVar;
    }

    @Override // com.waze.t.b.aq
    public final boolean a(ar arVar) {
        h.g.b.x.f(arVar, "history");
        an anVar = this.f40689b;
        if (anVar.b() <= 0) {
            this.f40688a.a("feedback config is disabled (N=" + anVar.b() + ")");
            return false;
        }
        boolean z = anVar.a() % anVar.b() == 0;
        if (!z) {
            this.f40688a.a("feedback should not be shown " + anVar.a() + DomExceptionUtils.SEPARATOR + anVar.b());
        }
        anVar.c(anVar.a() + 1);
        return z;
    }
}
