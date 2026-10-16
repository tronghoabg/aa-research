package com.waze.main_screen.o;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26703a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26704b;

    /* renamed from: c, reason: collision with root package name */
    int f26705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(r rVar, h.c.e eVar) {
        super(eVar);
        this.f26704b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26703a = obj;
        this.f26705c |= Integer.MIN_VALUE;
        return r.d(this.f26704b, this);
    }
}
