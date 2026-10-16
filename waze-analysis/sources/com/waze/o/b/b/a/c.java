package com.waze.o.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f32690b;

    /* renamed from: c, reason: collision with root package name */
    int f32691c;

    /* renamed from: d, reason: collision with root package name */
    String f32692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f32690b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32689a = obj;
        this.f32691c |= Integer.MIN_VALUE;
        return this.f32690b.c(null, this);
    }
}
