package com.waze.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23267a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f23268b;

    /* renamed from: c, reason: collision with root package name */
    int f23269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, h.c.e eVar) {
        super(eVar);
        this.f23268b = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f23267a = obj;
        this.f23269c |= Integer.MIN_VALUE;
        return this.f23268b.b(this);
    }
}
