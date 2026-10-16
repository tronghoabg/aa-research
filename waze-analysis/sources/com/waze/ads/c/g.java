package com.waze.ads.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13960a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f13961b;

    /* renamed from: c, reason: collision with root package name */
    int f13962c;

    /* renamed from: d, reason: collision with root package name */
    String f13963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(m mVar, h.c.e eVar) {
        super(eVar);
        this.f13961b = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13960a = obj;
        this.f13962c |= Integer.MIN_VALUE;
        return this.f13961b.f(null, this);
    }
}
