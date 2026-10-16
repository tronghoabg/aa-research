package com.waze.o.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f32693a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32694b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f32695c;

    /* renamed from: d, reason: collision with root package name */
    int f32696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f32695c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32694b = obj;
        this.f32696d |= Integer.MIN_VALUE;
        return this.f32695c.a(null, this);
    }
}
