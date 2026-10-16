package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19041a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ br f19042b;

    /* renamed from: c, reason: collision with root package name */
    int f19043c;

    /* renamed from: d, reason: collision with root package name */
    br f19044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bp(br brVar, h.c.e eVar) {
        super(eVar);
        this.f19042b = brVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19041a = obj;
        this.f19043c |= Integer.MIN_VALUE;
        return this.f19042b.b(this);
    }
}
