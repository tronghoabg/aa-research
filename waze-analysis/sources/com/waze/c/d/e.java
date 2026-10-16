package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18346a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f18347b;

    /* renamed from: c, reason: collision with root package name */
    int f18348c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.sharedui.e.c f18349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f18347b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18346a = obj;
        this.f18348c |= Integer.MIN_VALUE;
        return this.f18347b.a(this);
    }
}
