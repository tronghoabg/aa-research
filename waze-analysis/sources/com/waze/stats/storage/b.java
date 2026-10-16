package com.waze.stats.storage;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40602a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f40603b;

    /* renamed from: c, reason: collision with root package name */
    int f40604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f40603b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40602a = obj;
        this.f40604c |= Integer.MIN_VALUE;
        return this.f40603b.a(this);
    }
}
