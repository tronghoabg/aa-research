package com.waze.nav_connect.b;

import h.g.b.aq;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nav_connect.a.f f30812a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.nav_connect.c.b f30813b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.nav_connect.a f30814c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30815d;

    public n(com.waze.nav_connect.a.f fVar, com.waze.nav_connect.c.b bVar, com.waze.nav_connect.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(fVar, "navConnectRepository");
        h.g.b.x.f(bVar, "statsSender");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f30812a = fVar;
        this.f30813b = bVar;
        this.f30814c = aVar;
        this.f30815d = eVar;
    }

    @Override // com.waze.nav_connect.b.g
    public final j a(kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(abVar, "dispatcher");
        return new w(this.f30812a, this.f30813b, this.f30814c, this.f30815d, abVar);
    }

    @Override // com.waze.nav_connect.b.g
    public final kotlinx.coroutines.b.k b() {
        return ai.y(new m(this.f30812a.b(), new aq(), this));
    }
}
