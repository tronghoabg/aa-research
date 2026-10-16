package com.waze.o.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32681a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f32682b;

    /* renamed from: c, reason: collision with root package name */
    int f32683c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.o.c.b.g f32684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, h.c.e eVar) {
        super(eVar);
        this.f32682b = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32681a = obj;
        this.f32683c |= Integer.MIN_VALUE;
        return this.f32682b.a(null, this);
    }
}
