package com.waze.ads.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13903a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f13904b;

    /* renamed from: c, reason: collision with root package name */
    int f13905c;

    /* renamed from: d, reason: collision with root package name */
    f f13906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, h.c.e eVar) {
        super(eVar);
        this.f13904b = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13903a = obj;
        this.f13905c |= Integer.MIN_VALUE;
        return this.f13904b.b(null, this);
    }
}
