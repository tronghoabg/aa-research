package com.waze.closure.domain;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ClosureNativeManager f22499b;

    /* renamed from: c, reason: collision with root package name */
    int f22500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ClosureNativeManager closureNativeManager, h.c.e eVar) {
        super(eVar);
        this.f22499b = closureNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22498a = obj;
        this.f22500c |= Integer.MIN_VALUE;
        return this.f22499b.getClosureCandidates(0, this);
    }
}
