package com.waze.map.b;

import android.os.Handler;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class eh implements cj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f28248a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.cd f28249b;

    /* renamed from: c, reason: collision with root package name */
    private final bu f28250c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f28251d;

    public eh(com.waze.shared_infra.i.b bVar, com.waze.map.cd cdVar, bu buVar, Handler handler) {
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(cdVar, "defaultViewportResolver");
        h.g.b.x.f(buVar, "statForwarder");
        h.g.b.x.f(handler, "handler");
        this.f28248a = bVar;
        this.f28249b = cdVar;
        this.f28250c = buVar;
        this.f28251d = handler;
    }

    @Override // com.waze.map.b.cj
    public final /* bridge */ /* synthetic */ ed a(com.waze.shared_infra.i.e eVar, ch chVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(chVar, "configuration");
        return new fd(chVar, this.f28248a, this.f28249b, this.f28250c, eVar, this.f28251d);
    }
}
