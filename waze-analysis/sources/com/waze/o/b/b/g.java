package com.waze.o.b.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32740a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f32741b;

    /* renamed from: c, reason: collision with root package name */
    int f32742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(k kVar, h.c.e eVar) {
        super(eVar);
        this.f32741b = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32740a = obj;
        this.f32742c |= Integer.MIN_VALUE;
        return k.b(this.f32741b, null, this);
    }
}
