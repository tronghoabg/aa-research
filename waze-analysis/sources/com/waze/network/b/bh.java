package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32014a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bi f32015b;

    /* renamed from: c, reason: collision with root package name */
    int f32016c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.network.g.a f32017d;

    /* renamed from: e, reason: collision with root package name */
    String f32018e;

    /* renamed from: f, reason: collision with root package name */
    bi f32019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bi biVar, h.c.e eVar) {
        super(eVar);
        this.f32015b = biVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32014a = obj;
        this.f32016c |= Integer.MIN_VALUE;
        return this.f32015b.a(null, this);
    }
}
