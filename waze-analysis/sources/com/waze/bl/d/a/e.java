package com.waze.bl.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17058a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f17059b;

    /* renamed from: c, reason: collision with root package name */
    int f17060c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.shared_infra.n.c f17061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f17059b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17058a = obj;
        this.f17060c |= Integer.MIN_VALUE;
        return this.f17059b.a(null, null, this);
    }
}
