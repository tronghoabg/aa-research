package com.waze.map.canvas;

import com.waze.map.cj;
import com.waze.map.dq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ax implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28567a;

    /* renamed from: b, reason: collision with root package name */
    private final cj f28568b;

    public ax(com.waze.shared_infra.i.e eVar, cj cjVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cjVar, "presenterBuilder");
        this.f28567a = eVar;
        this.f28568b = cjVar;
    }

    @Override // com.waze.map.canvas.v
    public final aw a(bq bqVar, dq dqVar) {
        h.g.b.x.f(bqVar, "viewDataProvider");
        h.g.b.x.f(dqVar, "touchNotifier");
        return new aw(bqVar, this, dqVar);
    }

    public final com.waze.shared_infra.i.e c() {
        return this.f28567a;
    }
}
