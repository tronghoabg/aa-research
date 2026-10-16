package com.waze.modules.c;

import i.b.l.qg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class au implements av {

    /* renamed from: a, reason: collision with root package name */
    private final dl f29888a;

    /* renamed from: b, reason: collision with root package name */
    private final qg f29889b;

    /* renamed from: c, reason: collision with root package name */
    private final long f29890c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29891d;

    /* renamed from: e, reason: collision with root package name */
    private final ar f29892e;

    public au(dl dlVar, qg qgVar, long j2, boolean z) {
        h.g.b.x.f(dlVar, "suggestReroute");
        h.g.b.x.f(qgVar, "proto");
        this.f29888a = dlVar;
        this.f29889b = qgVar;
        this.f29890c = j2;
        this.f29891d = z;
        this.f29892e = dlVar.a();
    }

    @Override // com.waze.modules.c.av
    public final ar a() {
        return this.f29892e;
    }

    public final qg b() {
        return this.f29889b;
    }

    @Override // com.waze.modules.c.av
    public final boolean c() {
        return this.f29891d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return h.g.b.x.n(this.f29888a, auVar.f29888a) && h.g.b.x.n(this.f29889b, auVar.f29889b) && this.f29890c == auVar.f29890c && this.f29891d == auVar.f29891d;
    }

    public final int hashCode() {
        return (((((this.f29888a.hashCode() * 31) + this.f29889b.hashCode()) * 31) + a.a.b(this.f29890c)) * 31) + a.a.a(this.f29891d);
    }

    public final String toString() {
        return "SilentReroute(suggestReroute=" + this.f29888a + ", proto=" + this.f29889b + ", routingId=" + this.f29890c + ", hovRouteSelected=" + this.f29891d + ")";
    }
}
