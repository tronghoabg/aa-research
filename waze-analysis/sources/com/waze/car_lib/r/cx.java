package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cx extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f21243a;

    /* renamed from: b, reason: collision with root package name */
    Object f21244b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21245c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ de f21246d;

    /* renamed from: e, reason: collision with root package name */
    int f21247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cx(de deVar, h.c.e eVar) {
        super(eVar);
        this.f21246d = deVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21245c = obj;
        this.f21247e |= Integer.MIN_VALUE;
        return de.g(this.f21246d, null, null, null, this);
    }
}
