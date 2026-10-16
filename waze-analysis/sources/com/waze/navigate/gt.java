package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gt extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f31447a;

    /* renamed from: b, reason: collision with root package name */
    Object f31448b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f31449c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gw f31450d;

    /* renamed from: e, reason: collision with root package name */
    int f31451e;

    /* renamed from: f, reason: collision with root package name */
    com.waze.av.b.l f31452f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.places.a.b f31453g;

    /* renamed from: h, reason: collision with root package name */
    com.waze.main_screen.l.b.d f31454h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gt(gw gwVar, h.c.e eVar) {
        super(eVar);
        this.f31450d = gwVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31449c = obj;
        this.f31451e |= Integer.MIN_VALUE;
        return this.f31450d.g(null, null, null, null, null, this);
    }
}
