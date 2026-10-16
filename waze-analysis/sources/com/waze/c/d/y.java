package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18403a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18404b;

    /* renamed from: c, reason: collision with root package name */
    int f18405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ae aeVar, h.c.e eVar) {
        super(eVar);
        this.f18404b = aeVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18403a = obj;
        this.f18405c |= Integer.MIN_VALUE;
        return ae.i(this.f18404b, this);
    }
}
