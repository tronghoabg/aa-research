package com.waze.app_nav.hub.c;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s implements b {

    /* renamed from: a, reason: collision with root package name */
    private final g f15332a;

    /* renamed from: b, reason: collision with root package name */
    private final b f15333b;

    /* renamed from: c, reason: collision with root package name */
    private final f f15334c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f15335d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f15336e;

    /* renamed from: f, reason: collision with root package name */
    private final q f15337f;

    public s(g gVar, b bVar, f fVar) {
        x.f(gVar, "queue");
        x.f(bVar, "delegate");
        x.f(fVar, "priority");
        this.f15332a = gVar;
        this.f15333b = bVar;
        this.f15334c = fVar;
        bn bnVarB = ck.b(false);
        this.f15335d = bnVarB;
        this.f15336e = ai.F(bVar.a(), bnVarB, new r(null));
        this.f15337f = new q(this);
    }

    @Override // com.waze.app_nav.hub.c.b
    public final kotlinx.coroutines.b.k a() {
        return this.f15336e;
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void b() {
        q qVar = this.f15337f;
        if (this.f15332a.b(qVar)) {
            return;
        }
        qVar.b();
    }

    @Override // com.waze.app_nav.hub.c.b
    public final void c() {
        this.f15332a.a(this.f15337f, this.f15334c);
        this.f15335d.e(true);
    }
}
