package com.waze.ads.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f13995b;

    /* renamed from: c, reason: collision with root package name */
    int f13996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, h.c.e eVar) {
        super(eVar);
        this.f13995b = bVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f13994a = obj;
        this.f13996c |= Integer.MIN_VALUE;
        return b.b(this.f13995b, null, this);
    }
}
