package com.waze.o.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32710a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f32711b;

    /* renamed from: c, reason: collision with root package name */
    int f32712c;

    /* renamed from: d, reason: collision with root package name */
    String f32713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f32711b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32710a = obj;
        this.f32712c |= Integer.MIN_VALUE;
        return this.f32711b.a(null, this);
    }
}
