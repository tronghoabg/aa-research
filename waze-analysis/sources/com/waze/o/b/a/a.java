package com.waze.o.b.a;

/* loaded from: classes5.dex */
public final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32647a;

    /* renamed from: b, reason: collision with root package name */
    int f32648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f32649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, h.c.e eVar) {
        super(eVar);
        this.f32649c = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32647a = obj;
        this.f32648b |= Integer.MIN_VALUE;
        return this.f32649c.emit(null, this);
    }
}
