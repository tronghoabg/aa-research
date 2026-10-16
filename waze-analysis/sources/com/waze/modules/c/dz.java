package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dz implements dx {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ao f30129a;

    /* renamed from: b, reason: collision with root package name */
    private final dw f30130b;

    public dz(com.waze.ao aoVar, dw dwVar) {
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(dwVar, "config");
        this.f30129a = aoVar;
        this.f30130b = dwVar;
    }

    @Override // com.waze.modules.c.dx
    public final boolean a() {
        return this.f30130b.a() && !this.f30129a.e();
    }
}
