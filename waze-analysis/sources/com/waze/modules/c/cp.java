package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29991a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cr f29992b;

    /* renamed from: c, reason: collision with root package name */
    int f29993c;

    /* renamed from: d, reason: collision with root package name */
    cf f29994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cp(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f29992b = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29991a = obj;
        this.f29993c |= Integer.MIN_VALUE;
        return this.f29992b.e(null, this);
    }
}
