package com.waze.g;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f24003b;

    /* renamed from: c, reason: collision with root package name */
    int f24004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar) {
        super(eVar);
        this.f24003b = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24002a = obj;
        this.f24004c |= Integer.MIN_VALUE;
        return this.f24003b.b(this);
    }
}
