package com.waze.main_screen.o;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26693a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f26694b;

    /* renamed from: c, reason: collision with root package name */
    int f26695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f26694b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26693a = obj;
        this.f26695c |= Integer.MIN_VALUE;
        return this.f26694b.e(null, null, this);
    }
}
