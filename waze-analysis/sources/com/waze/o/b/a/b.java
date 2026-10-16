package com.waze.o.b.a;

/* loaded from: classes5.dex */
public final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32650a;

    /* renamed from: b, reason: collision with root package name */
    int f32651b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f32652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f32652c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32650a = obj;
        this.f32651b |= Integer.MIN_VALUE;
        return this.f32652c.emit(null, this);
    }
}
