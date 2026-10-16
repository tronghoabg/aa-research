package com.waze.c.e.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18446a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f18447b;

    /* renamed from: c, reason: collision with root package name */
    int f18448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, h.c.e eVar) {
        super(eVar);
        this.f18447b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18446a = obj;
        this.f18448c |= Integer.MIN_VALUE;
        return t.f(this.f18447b, this);
    }
}
