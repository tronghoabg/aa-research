package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f19641a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bq f19642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlinx.coroutines.af afVar) {
        super(k.f19768a, afVar);
        h.g.b.x.f(afVar, "scope");
        kotlinx.coroutines.b.bm bmVarC = kotlinx.coroutines.b.bu.c(0, 1, kotlinx.coroutines.a.a.f51273c);
        this.f19641a = bmVarC;
        this.f19642b = kotlinx.coroutines.b.ai.S(bmVarC);
    }

    public final kotlinx.coroutines.b.bq a() {
        return this.f19642b;
    }

    public final void b() {
        this.f19641a.c(f.f19574a);
    }

    public final void c() {
        this.f19641a.c(g.f19602a);
    }
}
