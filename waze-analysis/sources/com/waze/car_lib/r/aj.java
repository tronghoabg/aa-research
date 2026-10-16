package com.waze.car_lib.r;

import com.waze.lc;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20947a;

    /* renamed from: b, reason: collision with root package name */
    private final lc f20948b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.b.g f20949c;

    public aj(com.waze.shared_infra.o.a aVar, lc lcVar, com.waze.navigate.b.g gVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(lcVar, "shutdownController");
        h.g.b.x.f(gVar, "statsSender");
        this.f20947a = aVar;
        this.f20948b = lcVar;
        this.f20949c = gVar;
    }

    public final ai a(com.waze.n.ac acVar) {
        h.g.b.x.f(acVar, "state");
        return new ai(this.f20947a, acVar, this.f20948b, this.f20949c);
    }
}
