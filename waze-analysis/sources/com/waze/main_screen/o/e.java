package com.waze.main_screen.o;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26690a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f26691b;

    /* renamed from: c, reason: collision with root package name */
    int f26692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, h.c.e eVar) {
        super(eVar);
        this.f26691b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26690a = obj;
        this.f26692c |= Integer.MIN_VALUE;
        Object objA = this.f26691b.a(this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
