package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29852a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f29853b;

    /* renamed from: c, reason: collision with root package name */
    int f29854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(an anVar, h.c.e eVar) {
        super(eVar);
        this.f29853b = anVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29852a = obj;
        this.f29854c |= Integer.MIN_VALUE;
        return this.f29853b.a(null, this);
    }
}
