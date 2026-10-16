package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ba extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18338a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bb f18339b;

    /* renamed from: c, reason: collision with root package name */
    int f18340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bb bbVar, h.c.e eVar) {
        super(eVar);
        this.f18339b = bbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18338a = obj;
        this.f18340c |= Integer.MIN_VALUE;
        return this.f18339b.a(this);
    }
}
