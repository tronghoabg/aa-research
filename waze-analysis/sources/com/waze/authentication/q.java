package com.waze.authentication;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.r.p f15770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.waze.shared_infra.r.p pVar) {
        super("LoggedInFromAnotherDevice");
        h.g.b.x.f(pVar, "appType");
        this.f15770a = pVar;
    }

    public final com.waze.shared_infra.r.p a() {
        return this.f15770a;
    }
}
