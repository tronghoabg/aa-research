package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27787a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f27788b;

    /* renamed from: c, reason: collision with root package name */
    int f27789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f27788b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27787a = obj;
        this.f27789c |= Integer.MIN_VALUE;
        return this.f27788b.e(null, null, this);
    }
}
