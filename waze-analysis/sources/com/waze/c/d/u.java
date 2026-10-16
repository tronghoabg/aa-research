package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18392a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18393b;

    /* renamed from: c, reason: collision with root package name */
    int f18394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f18393b = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18392a = obj;
        this.f18394c |= Integer.MIN_VALUE;
        return ae.g(this.f18393b, this);
    }
}
