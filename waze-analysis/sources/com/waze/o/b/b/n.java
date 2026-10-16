package com.waze.o.b.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f32761a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32762b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f32763c;

    /* renamed from: d, reason: collision with root package name */
    int f32764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, h.c.e eVar) {
        super(eVar);
        this.f32763c = oVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32762b = obj;
        this.f32764d |= Integer.MIN_VALUE;
        return this.f32763c.a(this);
    }
}
