package com.waze.main_screen.o;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26715b;

    /* renamed from: c, reason: collision with root package name */
    int f26716c;

    /* renamed from: d, reason: collision with root package name */
    String f26717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, h.c.e eVar) {
        super(eVar);
        this.f26715b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26714a = obj;
        this.f26716c |= Integer.MIN_VALUE;
        return this.f26715b.a(null, this);
    }
}
