package com.waze.main_screen.o;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f26719b;

    /* renamed from: c, reason: collision with root package name */
    int f26720c;

    /* renamed from: d, reason: collision with root package name */
    String f26721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f26719b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26718a = obj;
        this.f26720c |= Integer.MIN_VALUE;
        return this.f26719b.b(null, this);
    }
}
