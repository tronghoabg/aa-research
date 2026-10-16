package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38030a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38031b;

    /* renamed from: c, reason: collision with root package name */
    int f38032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38031b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38030a = obj;
        this.f38032c |= Integer.MIN_VALUE;
        return this.f38031b.b(null, null, this);
    }
}
