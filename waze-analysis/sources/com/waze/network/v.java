package com.waze.network;

/* loaded from: classes6.dex */
public final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32416a;

    /* renamed from: b, reason: collision with root package name */
    int f32417b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f32418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, h.c.e eVar) {
        super(eVar);
        this.f32418c = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32416a = obj;
        this.f32417b |= Integer.MIN_VALUE;
        return this.f32418c.emit(null, this);
    }
}
