package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13568a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f13569b;

    /* renamed from: c, reason: collision with root package name */
    int f13570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, h.c.e eVar) {
        super(eVar);
        this.f13569b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13568a = obj;
        this.f13570c |= Integer.MIN_VALUE;
        return this.f13569b.a(this);
    }
}
