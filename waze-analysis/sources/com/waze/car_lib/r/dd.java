package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21361a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21362b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f21363c;

    /* renamed from: d, reason: collision with root package name */
    int f21364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dd(de deVar, h.c.e eVar) {
        super(eVar);
        this.f21363c = deVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21362b = obj;
        this.f21364d |= Integer.MIN_VALUE;
        return de.j(this.f21363c, null, this);
    }
}
