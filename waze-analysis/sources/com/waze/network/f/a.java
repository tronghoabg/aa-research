package com.waze.network.f;

/* loaded from: classes6.dex */
public final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32263a;

    /* renamed from: b, reason: collision with root package name */
    int f32264b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f32265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, h.c.e eVar) {
        super(eVar);
        this.f32265c = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32263a = obj;
        this.f32264b |= Integer.MIN_VALUE;
        return this.f32265c.emit(null, this);
    }
}
