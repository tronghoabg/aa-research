package com.waze.sharedrive.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f38094b;

    /* renamed from: c, reason: collision with root package name */
    int f38095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(p pVar, h.c.e eVar) {
        super(eVar);
        this.f38094b = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38093a = obj;
        this.f38095c |= Integer.MIN_VALUE;
        return this.f38094b.b(null, this);
    }
}
