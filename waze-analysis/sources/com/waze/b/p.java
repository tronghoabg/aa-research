package com.waze.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f16160b;

    /* renamed from: c, reason: collision with root package name */
    int f16161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(r rVar, h.c.e eVar) {
        super(eVar);
        this.f16160b = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16159a = obj;
        this.f16161c |= Integer.MIN_VALUE;
        return this.f16160b.a(null, null, this);
    }
}
