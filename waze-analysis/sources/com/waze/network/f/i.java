package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f32308b;

    /* renamed from: c, reason: collision with root package name */
    int f32309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, h.c.e eVar) {
        super(eVar);
        this.f32308b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32307a = obj;
        this.f32309c |= Integer.MIN_VALUE;
        return this.f32308b.b(this);
    }
}
