package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements dq {

    /* renamed from: a, reason: collision with root package name */
    private final dq f29193a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29194b;

    public h(dq dqVar) {
        h.g.b.x.f(dqVar, "original");
        this.f29193a = dqVar;
        this.f29194b = true;
    }

    @Override // com.waze.map.dq
    public final kotlinx.coroutines.b.k a() {
        return kotlinx.coroutines.b.ai.Q(this.f29193a.a(), new by(this, (h.c.e) null, 1));
    }

    public final void b() {
        this.f29194b = false;
    }
}
